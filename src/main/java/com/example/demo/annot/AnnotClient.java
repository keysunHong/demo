package com.example.demo.annot;

import java.lang.reflect.Field;

public class AnnotClient {
    public static void main(String[] args) {
        //获取Student的Class对象
        Student s = new Student();
        s.setAge(100);
        s.setName("test");
        Class stuClass = null;
        try {
            stuClass = s.getClass();
            Field[] fields = stuClass.getDeclaredFields();
            for(Field field: fields){
                field.setAccessible(true);
                System.out.println(field.getName());
                Object o = field.get(s);
                if(field.isAnnotationPresent(Range.class)){
                    Range annotation = field.getAnnotation(Range.class);
                    System.out.println(annotation.min()+":"+annotation.max());
                    int value = (int)o;
                    if(value<annotation.min() || value>annotation.max()){
                        System.out.println(value+annotation.message());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
