package com.example.service;

import com.example.entity.HinhanhEntity;
import com.example.entity.HoatdongtrongngayEntity;
import com.example.entity.HocsinhEntity;
import com.example.repository.HoatdongtrongngayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HoatdongtrongngayService{
    @Autowired
    HoatdongtrongngayRepository repository;
    public List<HoatdongtrongngayEntity> getAllHoatdong() {
        List<HoatdongtrongngayEntity> hoatdonglist = new ArrayList<HoatdongtrongngayEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(hoatdonglist::add);

        if (hoatdonglist.size() > 0) {
            return hoatdonglist;
        } else {
            return new ArrayList<HoatdongtrongngayEntity>();
        }
    }
    public List<HoatdongtrongngayEntity> getHoatdongByTenLike(String ten) {
        List<HoatdongtrongngayEntity> hoatdonglist = new ArrayList<HoatdongtrongngayEntity>();
        repository.findHoatdongByTenLike(ten).forEach(hoatdonglist::add);
        if (hoatdonglist.size() > 0) {
            return hoatdonglist;
        } else {
            return new ArrayList<HoatdongtrongngayEntity>();
        }
    }
    public List<HoatdongtrongngayEntity> getHoatdongByThoigianLike(Date date) {
        List<HoatdongtrongngayEntity> hoatdonglist = new ArrayList<HoatdongtrongngayEntity>();
        repository.findHoatdongByNgay(date).forEach(hoatdonglist::add);
        if (hoatdonglist.size() > 0) {
            return hoatdonglist;
        } else {
            return new ArrayList<HoatdongtrongngayEntity>();
        }
    }
    public HoatdongtrongngayEntity createOrUpdateHoatdong(HoatdongtrongngayEntity entity) throws Exception {
        Optional<HoatdongtrongngayEntity> hoatdong  = repository.findById(entity.getId());

        if (hoatdong.isPresent())
        {
            HoatdongtrongngayEntity newEntity = hoatdong.get();
            newEntity.setNgay(entity.getNgay());
            newEntity.setGio(entity.getGio());
            newEntity.setTen(entity.getTen());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteHoatdongById(long id) throws Exception {
        Optional<HoatdongtrongngayEntity> hoatdong  = repository.findById(id);

        if (hoatdong.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No Hoat dong record exist for given id");
        }
    }
    public long lastID() {
    	List<HoatdongtrongngayEntity> hoatdonglist = new ArrayList<HoatdongtrongngayEntity>();
    	repository.findAll(Sort.by("ten").descending()).forEach(hoatdonglist::add);
    	return repository.count();
    }
}
