package com.example.repository;

import com.example.entity.BinhluanEntity;
import com.example.entity.HocsinhEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface BinhluanRepository extends JpaRepository<BinhluanEntity, Long> {
    List<BinhluanEntity> findByMahinhanhAndMaphuhuynh(long mahinhanh, long maphuhuynh);
}
