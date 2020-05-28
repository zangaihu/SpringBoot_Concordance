package com.sh.redis.dto;

import com.sh.redis.entity.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created By Sunhu At 2020/5/28 11:35
 *
 * @author Sun
 */
@Data
@NoArgsConstructor
public class EmployeeDTO extends Employee implements Serializable {


    private String departName;
}
