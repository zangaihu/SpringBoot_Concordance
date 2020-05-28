package com.sh.redis.entity;

import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2020-05-28 11:41:11
 */
@NoArgsConstructor
public class Department implements Serializable {
    private static final long serialVersionUID = 184846837762937835L;
    
    private Integer id;
    
    private String departmentName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}