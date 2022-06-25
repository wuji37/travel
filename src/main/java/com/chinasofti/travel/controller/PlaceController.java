package com.chinasofti.travel.controller;

import com.alibaba.fastjson.JSON;
import com.chinasofti.travel.model.Place;
import com.chinasofti.travel.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping(value = "/addPlace",method = RequestMethod.POST)
    public void addPlace(@RequestBody Place place){
        placeService.addPlace(place);
    }

    @RequestMapping("/deletePlaceById")
    public void deletePlaceById(Long id){
        placeService.deletePlaceById(id);
    }

    @RequestMapping("/queryPlaceById")
    public String queryPlaceById(Long id){
        Place place=placeService.queryPlaceById(id);
        return JSON.toJSONString(place);
    }

    @RequestMapping("/queryAllPlace")
    public String queryAllPlace(){
        List<Place> list=placeService.queryAllPlace();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/updatePlace")
    public void updatePlace(@RequestBody
                                Place place){
        placeService.updatePlace(place);
    }
}
