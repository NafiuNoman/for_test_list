package com.example.editlistnew;

import java.io.Serializable;

public class StudentModel implements Serializable {

    String name;
    String Fname;
    String Mname;
    String id;

    public StudentModel(String name, String fname, String mname, String id) {
        this.name = name;
        Fname = fname;
        Mname = mname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
