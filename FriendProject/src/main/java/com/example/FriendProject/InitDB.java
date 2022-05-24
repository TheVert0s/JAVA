package com.example.FriendProject;

import com.example.FriendProject.domain.friend.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDB  implements CommandLineRunner {

    @Autowired
    FriendService friendService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Friend data");

        friendService.createNewFriend("Kacper", "Majcher", 40,"Super przyjaciel");

        System.out.println("Friend count: " + friendService.getAll().size());
    }
}
