package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class StartController {

    @RequestMapping("/freemarker")
    public String freeMarker(Map<String, Object> map) {
        Student stu1 = new Student();
        stu1.setName("刘备");
        stu1.setAge(18);
        stu1.setBirthday(new Date());
        stu1.setMoney(22225.8F);

        Student stu2 = new Student();
        stu2.setName("孙权");
        stu2.setAge(20);
        stu2.setBirthday(new Date());
        stu2.setMoney(24525.8F);
        stu2.setBestFriend(stu1);

        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        //模板使用的数据
        map.put("students", students);

        HashMap<String, Student> stuMap = new HashMap<>();
        stuMap.put("stu1", stu1);
        stuMap.put("stu2", stu2);
        map.put("stuMap", stuMap);
        //返回模板的位置，基于 resources/templates
        return "test";
    }
}