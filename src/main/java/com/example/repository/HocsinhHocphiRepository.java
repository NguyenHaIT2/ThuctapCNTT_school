package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface HocsinhHocphiRepository extends JpaRepository<HocsinhHocphiEntity, Long> {
    List<HocsinhHocphiEntity> findByMahocsinh(long mahocsinh);
    List<HocsinhHocphiEntity> findByTinhtrang(int t);
    List<HocsinhHocphiEntity> findByNamAndThang(int nam, int thang);
}