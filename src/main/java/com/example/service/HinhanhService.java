package com.example.service;

import com.example.entity.HinhanhEntity;
import com.example.entity.HocsinhEntity;
import com.example.repository.HinhanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HinhanhService{
    @Autowired
    HinhanhRepository repository;
    public List<HinhanhEntity> getAllHinhanh() {
        List<HinhanhEntity> hinhanhlist = new ArrayList<HinhanhEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(hinhanhlist::add);

        if (hinhanhlist.size() > 0) {
            return hinhanhlist;
        } else {
            return new ArrayList<HinhanhEntity>();
        }
    }
    public HinhanhEntity getHinhanhById(long id) throws Exception {
        Optional<HinhanhEntity> hinhanh  = repository.findById(id);

        if (hinhanh.isPresent()) {
            return hinhanh.get();
        } else {
            throw new Exception("No hinh anh record exist for given id");
        }
    }
    public List<HinhanhEntity> getHinhanhByThoigianLike(Date date) {
        List<HinhanhEntity> hinhanhlist = new ArrayList<HinhanhEntity>();
        repository.findHinhanhByThoigianLike(date).forEach(hinhanhlist::add);
        if (hinhanhlist.size() > 0) {
            return hinhanhlist;
        } else {
            return new ArrayList<HinhanhEntity>();
        }
    }
    public List<HinhanhEntity> getHinhanhByHoatdongLike(long ma) {
        List<HinhanhEntity> hinhanhlist = new ArrayList<HinhanhEntity>();
        repository.findHinhanhByMahoatdong(ma).forEach(hinhanhlist::add);
        if (hinhanhlist.size() > 0) {
            return hinhanhlist;
        } else {
            return new ArrayList<HinhanhEntity>();
        }
    }
    public HinhanhEntity createOrUpdateHinhanh(HinhanhEntity entity) throws Exception {
        Optional<HinhanhEntity> hinhanh  = repository.findById(entity.getId());

        if (hinhanh.isPresent())
        {
            HinhanhEntity newEntity = hinhanh.get();
            newEntity.setImage(entity.getImage());
            newEntity.setThoigian(entity.getThoigian());
            newEntity.setMahoatdong(entity.getMahoatdong());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteHinhanhById(long id) throws Exception {
        Optional<HinhanhEntity> hinhanh  = repository.findById(id);

        if (hinhanh.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No hinh anh record exist for given id");
        }
    }
    public long lastID() {
    	List<HinhanhEntity> hinhanhlist = new ArrayList<HinhanhEntity>();
    	repository.findAll(Sort.by("ten").descending()).forEach(hinhanhlist::add);
    	return repository.count();
    }
}
