package com.example.jpa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/23 14:40
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    private long userId;
    private String username;
    private String userpwd;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}
