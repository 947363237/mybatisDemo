package com.lis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lis.dao.ArticleDao;
import com.lis.dao.UserDao;
import com.lis.model.Article;
import com.lis.model.User;

/**
 *<p> Title: MybatisTest </p>
 *<p> Description: 基本的增删改查</p>
 *
 * @author lis
 * @since 2017年3月20日
 */
public class MybatisTest extends BaseTest{
    @Test
    public void selectOne(){
        /**
         * selectOne("com.lis.dao.UserDao.selectUserByID",1); 对应 <mapper namespace="com.lis.dao.UserDao">
         * 和 <select id="selectUserByID" ...>
         */
        User user = (User)session.selectOne("com.lis.dao.UserDao.selectUserByID",1);
        System.out.println(user);
    }
    
    @Test
    public void selectUserByID(){
        UserDao userDao = (UserDao)session.getMapper(UserDao.class);
        User user = userDao.selectUserByID(1);
        System.out.println(user);
    }

    @Test
    public void selectAllUsers(){
        UserDao userDao = (UserDao)session.getMapper(UserDao.class);
        List<User> user = userDao.selectAllUsers();
        System.out.println("==>>共："+user.size()+" 条记录");
        printList(user);
    }
    
    @Test
    public void selectUsers(){
        UserDao userDao = (UserDao)session.getMapper(UserDao.class);
        List<User> user = userDao.selectUsers("%l%");
        printList(user);
    }
    
    @Test 
    public void addUser(){
        UserDao userDao = (UserDao)session.getMapper(UserDao.class);
        User user = new User("wanger", 80, "罗湖区");
        userDao.addUser(user);
        System.out.print("添加成功：");
        printList(userDao.selectUsers("wan%"));
    } 
    
    @Test
    public void updateUser(){
        UserDao userDao = (UserDao)session.getMapper(UserDao.class);
        User user = userDao.selectUserByID(1);
        user.setUserName("李胜");
        user.setUserAge(12);
        user.setUserAddress("邵阳");
        userDao.updateUser(user); //执行修改
        System.out.print("修改成功：");
        System.out.println(userDao.selectUserByID(1));
    }
    
}
