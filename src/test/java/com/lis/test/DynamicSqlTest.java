package com.lis.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.lis.dao.UserDao;
import com.lis.model.User;

/**
 *<p> Title: DynamicSqlTest </p>
 *<p> Description: 动态sql查询</p>
 *
 * @author lis
 * @since 2017年3月20日
 */
public class DynamicSqlTest extends BaseTest{
    
    @Test
    public void dynamicIfTest(){
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.dynamicIfTest(new User("李胜", 12, "邵阳"));
        printList(users);
    }
    
    @Test
    public void dynamicChooseTest(){
        UserDao userDao = session.getMapper(UserDao.class);
//        List<User> users = userDao.dynamicChooseTest(new User("李胜", 12, "邵阳"));
        List<User> users = userDao.dynamicChooseTest(new User(null, 12, "邵阳"));
        printList(users);
    }
    
    @Test
    public void dynamicTrimTest(){
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.dynamicTrimTest(new User("李胜", 12, "邵阳"));
        printList(users);
    }
    
    @Test
    public void dynamicWhereTest(){
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.dynamicWhereTest(new User("李胜", 12, "邵阳"));
        printList(users);
    }
    
    @Test
    public void dynamicSetTest(){
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User("lis", 12, "天宫");
        user.setId(5);
        userDao.dynamicSetTest(user);
        System.out.println(userDao.selectUserByID(5));
    }
    
    @Test
    public void dynamicForeachTest(){
        UserDao userDao = session.getMapper(UserDao.class);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(6);
        List<User> users = userDao.dynamicForeachTest(list);
        printList(users);
        
    }
    
    @Test
    public void dynamicForeachArrayTest(){
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.dynamicForeachArrayTest(new int[]{1,5,6});
        printList(users);
    }
    
    @Test
    public void dynamicForeachMapTest(){
        UserDao userDao = session.getMapper(UserDao.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userName", "李");
        map.put("ids", new int[]{1,5,6});
        List<User> users = userDao.dynamicForeachMapTest(map);
        printList(users);
    }
    
    @Test
    public void selectUserBySerial(){
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.selectUserBySerial("李张三",32);
        printList(users);
    }
    
    @Test
    public void selectUserByMap(){
        UserDao userDao = session.getMapper(UserDao.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userName", "李张三");
        map.put("userAge", 32);
        List<User> users = userDao.selectUserByMap(map);
        printList(users);
    }
    
    @Test
    public void selectUserByParam(){
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.selectUserByParam("李张三",32);
        printList(users);
    }
}
