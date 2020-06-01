package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hocsinh_den", schema = "school", catalog = "")
public class HocsinhDenEntity {
    private long id;
    private Long mahocsinh;
    private Integer maden;
    private String nguoiduadi;
    private Date ngay;
    private String gio;
    private String image;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mahocsinh", nullable = true)
    public Long getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(Long mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    @Basic
    @Column(name = "maden", nullable = true)
    public Integer getMaden() {
        return maden;
    }

    public void setMaden(Integer maden) {
        this.maden = maden;
    }

    @Basic
    @Column(name = "nguoiduadi", nullable = true, length = 100)
    public String getNguoiduadi() {
        return nguoiduadi;
    }

    public void setNguoiduadi(String nguoiduadi) {
        this.nguoiduadi = nguoiduadi;
    }

    @Basic
    @Column(name = "ngay", nullable = true)
    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Basic
    @Column(name = "gio", nullable = true, length = 45)
    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    @Basic
    @Column(name = "image", nullable = true, length = 150)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocsinhDenEntity that = (HocsinhDenEntity) o;
        return id == that.id &&
                Objects.equals(mahocsinh, that.mahocsinh) &&
                Objects.equals(maden, that.maden) &&
                Objects.equals(nguoiduadi, that.nguoiduadi) &&
                Objects.equals(ngay, that.ngay) &&
                Objects.equals(gio, that.gio) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mahocsinh, maden, nguoiduadi, ngay, gio, image);
    }
}
