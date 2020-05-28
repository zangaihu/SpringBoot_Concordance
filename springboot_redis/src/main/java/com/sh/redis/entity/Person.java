package com.sh.redis.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Person implements Serializable {

  private static final long serialVersionUID = -8985545025228238754L;

  private String id;
  private String firstname;
  private String lastname;
  private Address address;

  public Person(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}