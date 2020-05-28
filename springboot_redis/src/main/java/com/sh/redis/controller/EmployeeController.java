package com.sh.redis.controller;

import com.sh.redis.dto.EmployeeDTO;
import com.sh.redis.entity.Employee;
import com.sh.redis.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2020-05-28 11:41:11
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employee selectOne(Integer id) {
        return this.employeeService.queryById(id);
    }


    @GetMapping("queryEmpList")
    public List<EmployeeDTO> queryEmpList(){
        return employeeService.queryEmpList();

    }

}