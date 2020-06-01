package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hinhanh", schema = "school", catalog = "")
public class HinhanhEntity {
    private long id;
    private String image;
    private Date thoigian;
    private Long mahoatdong;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "image", nullable = true, length = 150)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "thoigian", nullable = true)
    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }

    @Basic
    @Column(name = "mahoatdong", nullable = true)
    public Long getMahoatdong() {
        return mahoatdong;
    }

    public void setMahoatdong(Long mahoatdong) {
        this.mahoatdong = mahoatdong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HinhanhEntity that = (HinhanhEntity) o;
        return id == that.id &&
                Objects.equals(image, that.image) &&
                Objects.equals(thoigian, that.thoigian) &&
                Objects.equals(mahoatdong, that.mahoatdong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, image, thoigian, mahoatdong);
    }
}
