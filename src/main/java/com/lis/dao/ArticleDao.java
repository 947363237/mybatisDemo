package com.lis.dao;

import java.util.List;

import com.lis.model.Article;
import com.lis.model.User;

public interface ArticleDao {
    List<Article> selectAllArticlesImplant();
    
    List<Article> selectAllArticlesRef();
    
    List<Article> selectAllArticlesRefTwo();
    
    void addArticle(Article article);
    
    User getUser(Integer userId);
    
    //这里为了方便，查User的方法放到了ArticleDao, 实际开发应该发到UserDao
    List<User> selectAllUsersImplant();
    
    List<User> selectAllUsersRef();
    
    List<User> selectAllUsersRefTow();
    
    Article getArticle();
}
