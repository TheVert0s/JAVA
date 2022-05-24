package com.example.FriendProject.domain.friend;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository

public class FriendRepository {

    @PersistenceContext
    private EntityManager fr;

    @Transactional
    public void create(Friend friend){

        fr.persist(friend);
    }

    @Transactional
    public void update(Friend friend){
        fr.merge(friend);
    }
    @Transactional
    public Friend findById(long friendId){
        return fr.find(Friend.class,friendId);
    }
    public List<Friend> getAll(){
        return fr.createQuery("Select friend from Friend friend", Friend.class).getResultList();
    }

    public void delete(Friend friend){
        fr.remove(friend);
    }
}