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
interface HinhanhRepository extends JpaRepository<HinhanhEntity, Long> {
    @Query("SELECT ha FROM HinhanhEntity ha WHERE ha.thoigian = ?1")
    List<HinhanhEntity> findHinhanhByThoigianLike(Date date);

    @Query("SELECT ha FROM HinhanhEntity ha WHERE ha.mahoatdong = ?1")
    List<HinhanhEntity> findHinhanhByMahoatdong(@Param("mahoatdong") long mahoatdong);

}
