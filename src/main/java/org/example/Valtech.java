package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Valtech {
    @Id
    private int eid;
    private int age;
    private String ename;

    public int getId() {
        return eid;
    }

    public void setId(final int eid) {
        this.eid = eid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(final String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "valtech{" +
                "id=" + eid +
                ", age=" + age +
                ", ename='" + ename + '\'' +
                '}';
    }
}