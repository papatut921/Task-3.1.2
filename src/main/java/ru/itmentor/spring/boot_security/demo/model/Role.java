package ru.itmentor.spring.boot_security.demo.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="role")
public class Role implements GrantedAuthority {
    @Id
    private int id;
    private String roleName;

    public Role(){
    }

    public Role(int id, String name){
        this.id = id;
        this.roleName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return roleName;
    }

    public void setName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return this.roleName;
    }

    @Override
    public String getAuthority() {
        return getName();
    }
}
