package com.chinasofti.travel.Dao;

import com.chinasofti.travel.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupDao extends JpaRepository<Group,Long>{

//    List<Group> queryAll();
//
//    Group queryById(long id);
//
//    void insert(Group group);
//
//    void update(Group group);
//
//    void deleteById(long id);
}
