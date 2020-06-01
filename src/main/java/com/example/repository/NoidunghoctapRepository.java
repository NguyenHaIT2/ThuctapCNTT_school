package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface NoidunghoctapRepository extends JpaRepository<NoidunghoctapEntity, Long> {
    @Query("SELECT u FROM NoidunghoctapEntity u WHERE u.ten like concat(concat('%', :ten), '%')")
    List<NoidunghoctapEntity> findNoidunghoctapByTenLike(@Param("ten") String ten);

    List<NoidunghoctapEntity> findByNamAndThangAndTuan(int nam, int thang, int tuan);
}