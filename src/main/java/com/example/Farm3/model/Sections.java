package com.example.Farm3.model;


import javax.persistence.*;
@Entity
@Table(schema = "Farm2", name = "section")
public class Sections {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @Column(name = "croptype")
    private String croptype;



    public Sections(){

    }

    public Sections(int id, String croptype){
        super();
        this.id = id;
        this.croptype = croptype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCroptype() {
        return croptype;
    }

    public void setCroptype(String croptype) {
        this.croptype = croptype;
    }
}
