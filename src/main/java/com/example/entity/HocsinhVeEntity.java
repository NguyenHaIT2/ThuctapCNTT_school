package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hocsinh_ve", schema = "school", catalog = "")
public class HocsinhVeEntity {
    private long id;
    private Long mahocsinh;
    private Integer mave;
    private String nguoiduave;
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
    @Column(name = "mave", nullable = true)
    public Integer getMave() {
        return mave;
    }

    public void setMave(Integer mave) {
        this.mave = mave;
    }

    @Basic
    @Column(name = "nguoiduave", nullable = true, length = 50)
    public String getNguoiduave() {
        return nguoiduave;
    }

    public void setNguoiduave(String nguoiduave) {
        this.nguoiduave = nguoiduave;
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
        HocsinhVeEntity that = (HocsinhVeEntity) o;
        return id == that.id &&
                Objects.equals(mahocsinh, that.mahocsinh) &&
                Objects.equals(mave, that.mave) &&
                Objects.equals(nguoiduave, that.nguoiduave) &&
                Objects.equals(ngay, that.ngay) &&
                Objects.equals(gio, that.gio) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mahocsinh, mave, nguoiduave, ngay, gio, image);
    }
}
