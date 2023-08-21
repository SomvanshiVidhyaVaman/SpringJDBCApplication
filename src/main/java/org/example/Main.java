package org.example;

import org.example.dao.JDBCInsertDao;
import org.example.domain.JDBCInsert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        JDBCInsertDao jdbcInsertDao = applicationContext.getBean("JDBCInsertDao", JDBCInsertDao.class);
        JDBCInsert jdbcInsert = new JDBCInsert();
        jdbcInsert.setInsertId(1);
        jdbcInsert.setTitel("First Application");
        jdbcInsert.setDescripction("This is my jdbc insert application");
        jdbcInsert.setDuration(20);
        jdbcInsert.setStatus("Test");
        System.out.println(jdbcInsertDao.insertProjects(jdbcInsert));


    }

}