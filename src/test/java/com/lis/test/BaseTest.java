package com.lis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    public static SqlSessionFactory sqlSessionFactory;
    public static SqlSession session;
    
    @Before
    public void before() throws IOException{
        sqlSessionFactory = new SqlSessionFactoryBuilder()
        .build(Resources.getResourceAsReader("Configuration.xml"));
        session = sqlSessionFactory.openSession();
    }
    
    @After
    public void after(){
        session.commit();
        session.close();
    }
    
    public void printList(List list){
        for(Object l:list){
            System.out.println(l);
        }
    }
}
