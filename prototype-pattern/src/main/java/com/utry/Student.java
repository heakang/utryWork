package com.utry;

import java.io.*;
import java.util.List;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-19-15:24
 */
public class Student implements Cloneable,Serializable {
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Student clone(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        Student copy = null;
        try {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            copy = (Student)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return copy;
    }

    /**
     * 作 者 名    :@Author Akang He
     * <p>
     * 开发日期    :2019-03-19-15:23
     */
    public static class utry {
    }
}

