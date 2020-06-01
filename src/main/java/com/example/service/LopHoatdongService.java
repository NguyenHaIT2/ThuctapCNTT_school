package com.example.service;

import com.example.entity.HocsinhHinhanhEntity;
import com.example.entity.LopHoatdongEntity;
import com.example.repository.LopHoatdongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LopHoatdongService{
    @Autowired
    LopHoatdongRepository repository;
    public List<LopHoatdongEntity> getAllLopHoatdong() {
        List<LopHoatdongEntity> list = new ArrayList<LopHoatdongEntity>();
        repository.findAll(Sort.by("mahoatdong").descending()).forEach(list::add);

        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<LopHoatdongEntity>();
        }
    }
    public List<LopHoatdongEntity> getLopHoatdongByMalop(long malop ) throws Exception{
        List<LopHoatdongEntity> list = new ArrayList<LopHoatdongEntity>();
        repository.findByMalop(malop).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<LopHoatdongEntity>();
        }
    }
    
}
