package com.example.service;

import com.example.entity.BinhluanEntity;
import com.example.entity.HocsinhEntity;
import com.example.entity.NoidunghoctapEntity;
import com.example.repository.BinhluanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BinhluanService{
    @Autowired
    BinhluanRepository repository;
    public List<BinhluanEntity> getAllBinhluan() {
        List<BinhluanEntity> binhluanlist = new ArrayList<BinhluanEntity>();
        repository.findAll(Sort.by("ngay").descending()).forEach(binhluanlist::add);

        if (binhluanlist.size() > 0) {
            return binhluanlist;
        } else {
            return new ArrayList<BinhluanEntity>();
        }
    }
    public BinhluanEntity getBinhluanById(long id) throws Exception {
        Optional<BinhluanEntity> binhluan  = repository.findById(id);

        if (binhluan.isPresent()) {
            return binhluan.get();
        } else {
            throw new Exception("No binh luan record exist for given id");
        }
    }
    public List<BinhluanEntity> getBinhluanByPhuhuynhHinhanh(long mahinhanh, long maphuhuynh) throws Exception{
        List<BinhluanEntity> binhluanlist = new ArrayList<BinhluanEntity>();
        repository.findByMahinhanhAndMaphuhuynh(mahinhanh, maphuhuynh).forEach(binhluanlist::add);
        if (binhluanlist.size() > 0) {
            return binhluanlist;
        } else {
            return new ArrayList<BinhluanEntity>();
        }
    }
}
