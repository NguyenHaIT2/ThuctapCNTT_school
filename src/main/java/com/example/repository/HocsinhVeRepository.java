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
interface HocsinhVeRepository extends JpaRepository<HocsinhVeEntity, Long> {
    List<HocsinhVeEntity> findByMahocsinh(long mahocsinh);
    List<HocsinhVeEntity> findByNgay(Date ngay);
    List<HocsinhVeEntity> findByMahocsinhAndNgay(long mahocsinh, Date ngay) ;
}
