package com.example.service;

import com.example.entity.HocsinhDenEntity;
import com.example.entity.HocsinhEntity;
import com.example.repository.HocsinhDenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HocsinhDenService{
    @Autowired
    HocsinhDenRepository repository;
    public List<HocsinhDenEntity> getAllHocsinhDen() {
        List<HocsinhDenEntity> list = new ArrayList<HocsinhDenEntity>();
        repository.findAll(Sort.by("ngay").descending()).forEach(list::add);

        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhDenEntity>();
        }
    }
    public List<HocsinhDenEntity> getHocsinhDenByMahocsinh(long mahocsinh ) throws Exception{
        List<HocsinhDenEntity> list = new ArrayList<HocsinhDenEntity>();
        repository.findByMahocsinh(mahocsinh).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhDenEntity>();
        }
    }

    public List<HocsinhDenEntity> getHocsinhDenByNgay(Date ngay) throws Exception{
        List<HocsinhDenEntity> list = new ArrayList<HocsinhDenEntity>();
        repository.findByNgay(ngay).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhDenEntity>();
        }
    }
    public List<HocsinhDenEntity> getHocsinhDenByMahocsinhAndNgay(long mahocsinh, Date ngay ) throws Exception{
        List<HocsinhDenEntity> list = new ArrayList<HocsinhDenEntity>();
        repository.findByMahocsinhAndNgay(mahocsinh, ngay).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhDenEntity>();
        }
    }
    public HocsinhDenEntity createOrUpdateHocsinhDen(HocsinhDenEntity entity) throws Exception {
        Optional<HocsinhDenEntity> u  = repository.findById(entity.getId());

        if (u.isPresent())
        {
            HocsinhDenEntity newEntity = u.get();
            newEntity.setMahocsinh(entity.getMahocsinh());
            newEntity.setMaden(entity.getMaden());
            newEntity.setNguoiduadi(entity.getNguoiduadi());
            newEntity.setNgay(entity.getNgay());
            newEntity.setGio(entity.getGio());
            newEntity.setImage(entity.getImage());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteHocsinDenhById(long id) throws Exception {
        Optional<HocsinhDenEntity> u  = repository.findById(id);

        if (u.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No obj record exist for given id");
        }
    }
}
