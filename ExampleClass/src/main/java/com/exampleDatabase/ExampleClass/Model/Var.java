package com.exampleDatabase.ExampleClass.Model;

public class Var {
    Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    String Name;
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Var{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
