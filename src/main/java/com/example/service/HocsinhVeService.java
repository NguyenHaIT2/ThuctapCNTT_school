package com.example.service;

import com.example.entity.HocsinhDenEntity;
import com.example.entity.HocsinhVeEntity;
import com.example.repository.HocsinhVeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HocsinhVeService{
    @Autowired
    HocsinhVeRepository repository;
    public List<HocsinhVeEntity> getAllHocsinhVe() {
        List<HocsinhVeEntity> list = new ArrayList<HocsinhVeEntity>();
        repository.findAll(Sort.by("ngay").descending()).forEach(list::add);

        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhVeEntity>();
        }
    }
    public List<HocsinhVeEntity> getHocsinhVeByMahocsinh(long mahocsinh ) throws Exception{
        List<HocsinhVeEntity> list = new ArrayList<HocsinhVeEntity>();
        repository.findByMahocsinh(mahocsinh).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhVeEntity>();
        }
    }

    public List<HocsinhVeEntity> getHocsinhVeByNgay(Date ngay) throws Exception{
        List<HocsinhVeEntity> list = new ArrayList<HocsinhVeEntity>();
        repository.findByNgay(ngay).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhVeEntity>();
        }
    }
    public List<HocsinhVeEntity> getHocsinhVEByMahocsinhAndNgay(long mahocsinh, Date ngay ) throws Exception{
        List<HocsinhVeEntity> list = new ArrayList<HocsinhVeEntity>();
        repository.findByMahocsinhAndNgay(mahocsinh, ngay).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<HocsinhVeEntity>();
        }
    }
    public HocsinhVeEntity createOrUpdateHocsinhVE(HocsinhVeEntity entity) throws Exception {
        Optional<HocsinhVeEntity> u  = repository.findById(entity.getId());

        if (u.isPresent())
        {
            HocsinhVeEntity newEntity = u.get();
            newEntity.setMahocsinh(entity.getMahocsinh());
            newEntity.setMave(entity.getMave());
            newEntity.setNguoiduave(entity.getNguoiduave());
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

    public void deleteHocsinVeById(long id) throws Exception {
        Optional<HocsinhVeEntity> u  = repository.findById(id);

        if (u.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No obj record exist for given id");
        }
    }
}
