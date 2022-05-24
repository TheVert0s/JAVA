package com.example.FriendProject.domain.friend;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class FriendController {

    @Autowired
    FriendService friendService;

    @GetMapping("/friends")
    public List<Friend> friends()
    {
        return friendService.getAll();
    }
    @GetMapping("/friends/{id}")
    public Friend getFriend(@PathVariable Long id){
        return friendService.getFriendById(id);
    }

    @PostMapping("/friends")
    public void createFriend(@RequestBody Friend friend){
        friendService.createNewFriend(friend);
    }

    @DeleteMapping("/friends/{id}")
    public void deleteFriend(@PathVariable Long id){
        friendService.remove(id);
    }

    @PutMapping("/friends/{id}")
    public void updateFriend(@PathVariable Long id, @RequestBody Friend friend){
        this.friendService.updateFriends(id,friend);
    }
}
