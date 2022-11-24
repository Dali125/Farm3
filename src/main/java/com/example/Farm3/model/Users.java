package com.example.Farm3.model;

import javax.persistence.*;



@Entity
@Table(schema = "Farm2", name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_role")
    private String user_role;

    @Column(name = "password")
    private String password;


    public Users(){
        super();
    }

    public Users(int id, String namet, String password, String user_role){
        super();
        this.id = id;
        this.name = namet;
        this.password = password;
        this.user_role = user_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
