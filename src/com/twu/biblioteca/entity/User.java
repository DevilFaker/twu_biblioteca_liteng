package com.twu.biblioteca.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.twu.biblioteca.entity.Movie;

public class User {
    private String username;
    private String password;
    private List<Movie> checkOutList;

    public User(){
        this.username="";
        this.password="";
        this.checkOutList=new ArrayList<Movie>();
    }

    public User(String username, String password, List<Movie> checkOutList) {
        this.username = username;
        this.password = password;
        this.checkOutList = checkOutList;
    }

    //    private String salt;
//    private String email;
//    private int type;
//    private int status;
//    private String activationCode;
//    private String headerUrl;
//    private Date createTime;
//    private int bookHoldQuantity;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Movie> getCheckOutList() {
        return checkOutList;
    }

    public void setCheckOutList(List<Movie> checkOutList) {
        this.checkOutList = checkOutList;
    }

//    public String getSalt() {
//        return salt;
//    }
//
//    public void setSalt(String salt) {
//        this.salt = salt;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getType() {
//        return type;
//    }
//
//    public void setType(int type) {
//        this.type = type;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public String getActivationCode() {
//        return activationCode;
//    }
//
//    public void setActivationCode(String activationCode) {
//        this.activationCode = activationCode;
//    }
//
//    public String getHeaderUrl() {
//        return headerUrl;
//    }
//
//    public void setHeaderUrl(String headerUrl) {
//        this.headerUrl = headerUrl;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public int getBookHoldQuantity() {
//        return bookHoldQuantity;
//    }
//
//    public void setBookHoldQuantity(int bookHoldQuantity) {
//        this.bookHoldQuantity = bookHoldQuantity;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", salt='" + salt + '\'' +
//                ", email='" + email + '\'' +
//                ", type=" + type +
//                ", status=" + status +
//                ", activationCode='" + activationCode + '\'' +
//                ", headerUrl='" + headerUrl + '\'' +
//                ", createTime=" + createTime +
//                ", bookHoldQuantity=" + bookHoldQuantity +
//                '}';
//    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", checkOutList=" + checkOutList +
                '}';
    }
}
