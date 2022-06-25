package com.chinasofti.travel.Dao;

import com.chinasofti.travel.model.Place;
import com.chinasofti.travel.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//@Mapper
public interface PlaceDao extends JpaRepository<Place,Long> {
//    Place queryById(long id);    //如果时间有剩余，就使用mybatis实现对place实体类的增删查改
//
//    List<Place> queryAll();
//
//    void insert(Place place);
//
//    void update(Place place);
//
//    void deleteById(long id);
}