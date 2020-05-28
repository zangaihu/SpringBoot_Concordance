package com.sh.redis.entity;

import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2020-05-28 11:41:11
 */
@NoArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = -76111234810504192L;
    
    private Integer id;
    
    private String lastName;
    
    private String email;
    
    private Integer gender;
    
    private Object birth;
    
    private Integer dId;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Object getBirth() {
        return birth;
    }

    public void setBirth(Object birth) {
        this.birth = birth;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

}