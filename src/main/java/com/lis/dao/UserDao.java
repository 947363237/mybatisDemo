package com.lis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lis.model.User;

public interface UserDao {
    User selectUserByID(int id);
    
    List<User> selectUsers(String username);
    
    List<User> selectAllUsers();
    
    void addUser(User user);
    
    void updateUser(User user);
    
    void deleteUser(int id);
    
    //================动态sql查询================
    List<User> dynamicIfTest(User user);
    
    List<User> dynamicChooseTest(User user);
    
    List<User> dynamicTrimTest(User user);
    
    List<User> dynamicWhereTest(User user);
    
    List<User> dynamicForeachTest(List<Integer> ids);
    
    List<User> dynamicForeachArrayTest(int[] ids);  
    
    List<User> dynamicForeachMapTest(Map<String, Object> params); 
    
    void dynamicSetTest(User user);
    
    //================参数传递================
    List<User> selectUserBySerial(String userName,int userAge);
    
    List<User> selectUserByMap(Map<String, Object> paramMap);
    
    List<User> selectUserByParam(@Param("userName") String name,
        @Param("userAge") int age);
}
