package com.example.service;

import com.example.entity.HinhanhEntity;
import com.example.entity.HoatdongtrongngayEntity;
import com.example.entity.HocsinhEntity;
import com.example.entity.NoidunghoctapEntity;
import com.example.repository.NoidunghoctapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NoidunghoctapService{
    @Autowired
    NoidunghoctapRepository repository;
    public List<NoidunghoctapEntity> getAllNoidung() {
        List<NoidunghoctapEntity> noidunglist = new ArrayList<NoidunghoctapEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(noidunglist::add);

        if (noidunglist.size() > 0) {
            return noidunglist;
        } else {
            return new ArrayList<NoidunghoctapEntity>();
        }
    }
    public NoidunghoctapEntity getNoidungById(long id) throws Exception {
        Optional<NoidunghoctapEntity> noidung  = repository.findById(id);

        if (noidung.isPresent()) {
            return noidung.get();
        } else {
            throw new Exception("No noi dung record exist for given id");
        }
    }
    public List<NoidunghoctapEntity> getNoidungByTenLike(String ten) {
        List<NoidunghoctapEntity> noidunglist = new ArrayList<NoidunghoctapEntity>();
        repository.findNoidunghoctapByTenLike(ten).forEach(noidunglist::add);
        if (noidunglist.size() > 0) {
            return noidunglist;
        } else {
            return new ArrayList<NoidunghoctapEntity>();
        }
    }
    public List<NoidunghoctapEntity> getNoidungByThoigian(int nam, int thang, int tuan) throws Exception{
        List<NoidunghoctapEntity> noidunglist = new ArrayList<NoidunghoctapEntity>();
        repository.findByNamAndThangAndTuan(nam, thang, tuan).forEach(noidunglist::add);
        if (noidunglist.size() > 0) {
            return noidunglist;
        } else {
            return new ArrayList<NoidunghoctapEntity>();
        }
    }
    public NoidunghoctapEntity createOrUpdateNoidung(NoidunghoctapEntity entity) throws Exception {
        Optional<NoidunghoctapEntity> noidung  = repository.findById(entity.getId());

        if (noidung.isPresent())
        {
            NoidunghoctapEntity newEntity = noidung.get();
            newEntity.setTen(entity.getTen());
            newEntity.setNam(entity.getNam());
            newEntity.setThang(entity.getThang());
            newEntity.setTuan(entity.getTuan());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteNoidungById(long id) throws Exception {
        Optional<NoidunghoctapEntity> noidung  = repository.findById(id);

        if (noidung.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No noi dung record exist for given id");
        }
    }
    public long lastID() {
        List<NoidunghoctapEntity> noidunghoctapEntities = new ArrayList<NoidunghoctapEntity>();
        repository.findAll(Sort.by("ten").descending()).forEach(noidunghoctapEntities::add);
        return repository.count();
    }
}
