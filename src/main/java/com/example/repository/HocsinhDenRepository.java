package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public
interface HocsinhDenRepository extends JpaRepository<HocsinhDenEntity, Long> {
    List<HocsinhDenEntity> findByMahocsinh(long mahocsinh);
    List<HocsinhDenEntity> findByNgay(Date ngay);
    List<HocsinhDenEntity> findByMahocsinhAndNgay(long mahocsinh, Date ngay) ;
}
