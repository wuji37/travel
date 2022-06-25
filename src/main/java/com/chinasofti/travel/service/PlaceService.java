package com.chinasofti.travel.service;

import com.chinasofti.travel.model.Place;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlaceService {

    public void addPlace(Place place);

    public void deletePlaceById(Long id);

    public Place queryPlaceById(Long id);

    public List<Place> queryAllPlace();

    public void updatePlace(Place place);


//如果使用mybatis框架，则可以使用以下方法进行数据增删改查，目前未实现
//    List<Place> queryAll();
//
//    Place queryById(long id);
//
//    void update(Place place);
//
//    void insert(Place place);
//
//    void deleteById(long id);
}
