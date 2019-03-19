package com.utry.test;

import java.lang.reflect.Field;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-19-13:05
 * <p>
 */
public class ReflexTest {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.utry.test.TestBean");
        TestBean testBean = (TestBean) clazz.newInstance();
        Field finalName = clazz.getDeclaredField("normalName");
        System.out.println(finalName.get(testBean).toString());
        System.out.println("结束");
    }
}
