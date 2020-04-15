package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList=new ArrayList<User>();

    public UserService(){
        User user1=new User("love","123",new ArrayList<Movie>());
        User user2=new User("war","123",new ArrayList<Movie>());
        userList.add(user1);
        userList.add(user2);
    }

    public int checkUser(String userName,String password){
        for(User user1:userList){
           if( user1.getUsername().equals(userName) && user1.getPassword().equals(password)){
               return 1;
           }else if( user1.getUsername().equals(userName) || user1.getPassword().equals(password)){
               return 2;
           }
        }
        return 0;
    }

    public User getUserByName(String username){
        User temp=new User();
        for(User user:userList){
            if(user.getUsername().equals(username))
                temp=user;
        }
        return temp;
    }
}
