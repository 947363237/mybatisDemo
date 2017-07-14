package com.lis.test;

import java.util.List;

import org.junit.Test;

import com.lis.dao.ArticleDao;
import com.lis.model.Article;
import com.lis.model.User;

/**
 *<p> Title: RelationTest </p>
 *<p> Description: 关联关系</p>
 *
 * @author lis
 * @since 2017年3月21日
 */
public class RelationTest  extends BaseTest{
    //========================== 多对一 =========================
    @Test 
    public void selectAllArticlesRef(){
        ArticleDao articleDao = (ArticleDao)session.getMapper(ArticleDao.class);
        List<Article> articles = articleDao.selectAllArticlesRef();
        printList(articles);
    }
    
    @Test 
    public void selectAllArticlesImplant(){
        ArticleDao articleDao = (ArticleDao)session.getMapper(ArticleDao.class);
        List<Article> articles = articleDao.selectAllArticlesImplant();
        printList(articles);
    }
    
    @Test 
    public void selectAllArticlesRefTwo(){
        ArticleDao articleDao = (ArticleDao)session.getMapper(ArticleDao.class);
        List<Article> articles = articleDao.selectAllArticlesRefTwo();
        printList(articles);
    }
    
    @Test 
    public void addArticle(){
        ArticleDao articleDao = (ArticleDao)session.getMapper(ArticleDao.class);
        Article article = new Article();
        article.setUser(new User(1));
        article.setTitle("文章3");
        article.setContent("这是第3篇文章");
        articleDao.addArticle(article);
        printList(articleDao.selectAllArticlesImplant());
    }
    
    @Test 
    public void selectAllUsersImplant(){
        ArticleDao articleDao = (ArticleDao)session.getMapper(ArticleDao.class);
        List<User> users = articleDao.selectAllUsersImplant();
        printList(users);
    }
    
    @Test 
    public void selectAllUsersRef(){
        ArticleDao articleDao = (ArticleDao)session.getMapper(ArticleDao.class);
        List<User> users = articleDao.selectAllUsersRef();
        printList(users);
    }
    
    @Test 
    public void selectAllUsersRefTow(){
        ArticleDao articleDao = (ArticleDao)session.getMapper(ArticleDao.class);
        List<User> users = articleDao.selectAllUsersRefTow();
        printList(users);
    }
    
}
