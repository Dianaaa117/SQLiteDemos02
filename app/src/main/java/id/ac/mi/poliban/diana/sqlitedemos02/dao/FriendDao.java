package id.ac.mi.poliban.diana.sqlitedemos02.dao;

import java.util.List;

import id.ac.mi.poliban.diana.sqlitedemos02.Friend;

public interface FriendDao {
    void insert(Friend f);
    void update(Friend f);
    void delete(int id);
    Friend getFriendById(int id);
    List<Friend> getAllFriends();
}
