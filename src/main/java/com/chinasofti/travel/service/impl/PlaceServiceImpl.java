package com.chinasofti.travel.service.impl;

import com.chinasofti.travel.Dao.PlaceDao;
import com.chinasofti.travel.model.Place;
import com.chinasofti.travel.model.User;
import com.chinasofti.travel.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceDao placeDao;

    @Override
    public void addPlace(Place place) {
        placeDao.save(place);
    }

    @Override
    public void deletePlaceById(Long id) {
        placeDao.deleteById(id);
    }

    @Override
    public Place queryPlaceById(Long id) {
        Optional<Place> place = placeDao.findById(id);
        return place.get();
    }

    @Override
    public List<Place> queryAllPlace() {
        return placeDao.findAll();
    }

    @Override
    public void updatePlace(Place place) {
        Optional<Place> place1=placeDao.findById(place.getId());
        Place place2=place1.get();

        place2.setPlace(place);
        placeDao.save(place2);
    }


//mybatis
//    @Autowired
//    private PlaceDao placeDao;
//
//    @Override
//    public List<Place> queryAll() {
//        return placeDao.queryAll();
//    }
//
//    @Override
//    public Place queryById(long id) {
//        return placeDao.queryById(id);
//    }
//
//    @Override
//    public void update(Place place) {
//        placeDao.update(place);
//    }
//
//    @Override
//    public void insert(Place place) {
//        placeDao.insert(place);
//
//    }
//
//    @Override
//    public void deleteById(long id) {
//        placeDao.deleteById(id);
//    }
}
