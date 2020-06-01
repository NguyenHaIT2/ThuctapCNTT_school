package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hocsinh_hinhanh", schema = "school", catalog = "")
public class HocsinhHinhanhEntity {
    private Long mahocsinh;
    private Long mahinhanh;
    private long id;

    @Basic
    @Column(name = "mahocsinh", nullable = true)
    public Long getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(Long mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    @Basic
    @Column(name = "mahinhanh", nullable = true)
    public Long getMahinhanh() {
        return mahinhanh;
    }

    public void setMahinhanh(Long mahinhanh) {
        this.mahinhanh = mahinhanh;
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocsinhHinhanhEntity that = (HocsinhHinhanhEntity) o;
        return id == that.id &&
                Objects.equals(mahocsinh, that.mahocsinh) &&
                Objects.equals(mahinhanh, that.mahinhanh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mahocsinh, mahinhanh, id);
    }
}
