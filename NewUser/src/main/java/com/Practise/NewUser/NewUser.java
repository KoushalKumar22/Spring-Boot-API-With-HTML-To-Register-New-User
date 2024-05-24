package com.Practise.NewUser;

import jakarta.persistence.*;

@Entity
@Table(name = "NewUser")
public class NewUser {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name = "ID")
    int id;
    @Column(name = "Name")
    String name;
    @Column(name = "Password")
    String pass;

    @Column(name = "Phone No")
    Long phone;
    @Column(name = "Age")
    int age;

    @Column(name = "email")
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NewUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
