package com.lis.model;

import java.util.List;

public class User {
    private Integer id;
    private String userName;
    private int userAge;
    private String userAddress;
    private List<Article> articles;
    
    public User() {
    }
    
    public User(Integer id) {
        this.id = id;
    }
    
    public User(String userName, int userAge, String userAddress) {
        super();
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", userAge=" + userAge + ", userAddress=" + userAddress + ", articles="+ articles + "]";
    }
}
