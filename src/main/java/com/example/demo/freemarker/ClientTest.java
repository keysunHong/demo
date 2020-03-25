package com.example.demo.freemarker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientTest{
    public static void main(String[] args){
//        User user=new User();
//        user.setUserName("myt");
//        user.setUserPassword("123456");
//        List<Animal> animals = new ArrayList<>();
//        Animal bianmu = new Animal("边牧",20);
//        Animal jinmao = new Animal("金毛",20);
//        animals.add(bianmu);
//        animals.add(jinmao);
//        Map<String,Object> root=new HashMap<>();
//        root.put("user", user);
//        root.put("animals", animals);
//        String templatesPath="D:/works/demo/src/main/resources/templates";
//        String templateFile="/user.ftl";
//        String htmlFile=templatesPath+"/user.html";
//        FreeMarkerUtil.analysisTemplate(templatesPath,templateFile,htmlFile,root);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://am-8vb6m9xg25698zrt164030o.zhangbei.ads.aliyuncs.com:3306/zichan360bi_temp?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&useAffectedRows=true&zeroDateTimeBehavior=convertToNull", "sunweihong", "MK0YmhsDrSpC");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.7.87:3306?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&useAffectedRows=true&zeroDateTimeBehavior=convertToNull", "root", "liRr2KvsDPdg");
            Statement statement = connection.createStatement();
            statement.executeQuery("select 1 from dual");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
