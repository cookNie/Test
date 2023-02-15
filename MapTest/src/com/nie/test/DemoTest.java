package com.nie.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class DemoTest {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",23);
        Student s3 = new Student("wangwu",23);
        Student s4 = new Student("zhangsan",23);

        HashMap<Student,String> hm = new HashMap<>();
        hm.put(s1,"beijing");
        hm.put(s2,"shanghai");
        hm.put(s3,"guangzhou");
        hm.put(s4,"beijing");

        Set<Student> keys = hm.keySet();
        for (Student key : keys){
            String value = hm.get(key);
            System.out.println(key +"=" + value);
        }

        System.out.println("------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key +"=" + value);
        }

        System.out.println("------------");

        hm.forEach((key, value)-> System.out.println(key + "=" + value));

    }
}
