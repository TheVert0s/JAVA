package com.example.FriendProject.domain.friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    FriendRepository repository;

    public void createNewFriend(String firstName,String lastName, int age,String description){
        Friend newFriend = new Friend(firstName,lastName,age,description);
        repository.create(newFriend);

    }
    public List<Friend> getAll(){
        return repository.getAll();
    }

    public Friend getFriendById(Long id) {
        return  this.repository.findById(id);
    }

    public void createNewFriend(Friend friend) {
        this.repository.create(friend);
    }

    public void remove(Long id) {
        Friend friend = this.repository.findById(id);
        this.repository.delete(friend);
    }

    public void updateFriends(Long id, Friend friend) {
        Friend existing = this.repository.findById(id);
       if(existing==null)
       {
           this.repository.create(friend);
       }
       else{
           friend.setId(existing.getId());
           this.repository.update(friend);
       }

    }
}
