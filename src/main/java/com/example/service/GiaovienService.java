package com.example.service;

import com.example.entity.GiaovienEntity;
import com.example.entity.HocsinhEntity;
import com.example.repository.GiaovienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GiaovienService{
    @Autowired
    GiaovienRepository repository;
    public List<GiaovienEntity> getAllGiaovien() {
        List<GiaovienEntity> giaovienlist = new ArrayList<GiaovienEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(giaovienlist::add);

        if (giaovienlist.size() > 0) {
            return giaovienlist;
        } else {
            return new ArrayList<GiaovienEntity>();
        }
    }
    public List<GiaovienEntity> getGiaovienByTenLike(String ten) {
        List<GiaovienEntity> giaovienlist = new ArrayList<GiaovienEntity>();
//        repository.findGiaovienEntitiesByTen(ten).forEach(giaovienlist::add);
        giaovienlist = repository.findGiaovienEntitiesByTen(ten);
        if (giaovienlist.size() > 0) {
            return giaovienlist;
        } else {
            return new ArrayList<GiaovienEntity>();
        }
    }
    public GiaovienEntity getGiaovienById(long id) throws Exception {
        Optional<GiaovienEntity> giaovien = repository.findById(id);

        if (giaovien.isPresent()) {
            return giaovien.get();
        } else {
            throw new Exception("No Congty record exist for given id");
        }
    }
    public GiaovienEntity createOrUpdateGiaovien(GiaovienEntity entity) throws Exception {
        Optional<GiaovienEntity> giaovien  = repository.findById(entity.getId());

        if (giaovien.isPresent())
        {
            GiaovienEntity newEntity = giaovien.get();
            newEntity.setTen(entity.getTen());
            newEntity.setEmail(entity.getEmail());
            newEntity.setMatkhau(entity.getMatkhau());
            newEntity.setGroupid(entity.getGroupid());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteGiaovienById(long id) throws Exception {
        Optional<GiaovienEntity> giaovien  = repository.findById(id);

        if (giaovien.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No Congty record exist for given id");
        }
    }
}
