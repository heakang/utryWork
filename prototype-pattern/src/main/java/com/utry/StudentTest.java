package com.utry;

import java.util.ArrayList;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-19-15:42
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setHobbies(new ArrayList());

        Student clone = student.clone();
        System.out.println(clone==student);
        System.out.println(clone.getHobbies()==student.getHobbies());
    }

}
