package com.example.service;

import com.example.entity.HocsinhEntity;
import com.example.entity.LopEntity;
import com.example.repository.LopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LopService{
    @Autowired
    LopRepository repository;
    public List<LopEntity> getAllLop() {
        List<LopEntity> loplist = new ArrayList<LopEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(loplist::add);

        if (loplist.size() > 0) {
            return loplist;
        } else {
            return new ArrayList<LopEntity>();
        }
    }
    public LopEntity getLopById(long id) throws Exception {
        Optional<LopEntity> lop  = repository.findById(id);

        if (lop.isPresent()) {
            return lop.get();
        } else {
            throw new Exception("No lop record exist for given id");
        }
    }
    public List<LopEntity> getLopByTenLike(String ten) {
        List<LopEntity> loplist = new ArrayList<LopEntity>();
        repository.findLopEntitiesByTen(ten).forEach(loplist::add);
        if (loplist.size() > 0) {
            return loplist;
        } else {
            return new ArrayList<LopEntity>();
        }
    }

    public List<LopEntity> getLopByGiaovienLike(long ma) {
        List<LopEntity> loplist = new ArrayList<LopEntity>();
        repository.findLopByMagiaovien(ma).forEach(loplist::add);
        if (loplist.size() > 0) {
            return loplist;
        } else {
            return new ArrayList<LopEntity>();
        }
    }
    public LopEntity createOrUpdateLop(LopEntity entity) throws Exception {
        Optional<LopEntity> lop  = repository.findById(entity.getId());

        if (lop.isPresent())
        {
            LopEntity newEntity = lop.get();
            newEntity.setTen(entity.getTen());
            newEntity.setMagiaovien(entity.getMagiaovien());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteLopById(long id) throws Exception {
        Optional<LopEntity> lop  = repository.findById(id);

        if (lop.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No lop record exist for given id");
        }
    }
}
