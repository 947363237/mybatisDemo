package com.lis.model;


public class Article {
    private Integer id;
    private String title;
    private String content;
    private User user; //多篇文章属于一个用户
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    @Override
    public String toString() {
        return "Article [id=" + id + ", user=[" + user + "], title=" + title + ", content=" + content + "]\t";
    }
}
