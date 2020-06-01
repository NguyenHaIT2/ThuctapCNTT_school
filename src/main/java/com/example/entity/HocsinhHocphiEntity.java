package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hocsinh_hocphi", schema = "school", catalog = "")
public class HocsinhHocphiEntity {
    private long id;
    private Long mahocsinh;
    private Integer thang;
    private Integer nam;
    private Integer tinhtrang;
    private Long sotien;

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
    @Column(name = "thang", nullable = true)
    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    @Basic
    @Column(name = "nam", nullable = true)
    public Integer getNam() {
        return nam;
    }

    public void setNam(Integer nam) {
        this.nam = nam;
    }

    @Basic
    @Column(name = "tinhtrang", nullable = true)
    public Integer getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(Integer tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    @Basic
    @Column(name = "sotien", nullable = true)
    public Long getSotien() {
        return sotien;
    }

    public void setSotien(Long sotien) {
        this.sotien = sotien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocsinhHocphiEntity that = (HocsinhHocphiEntity) o;
        return id == that.id &&
                Objects.equals(mahocsinh, that.mahocsinh) &&
                Objects.equals(thang, that.thang) &&
                Objects.equals(nam, that.nam) &&
                Objects.equals(tinhtrang, that.tinhtrang) &&
                Objects.equals(sotien, that.sotien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mahocsinh, thang, nam, tinhtrang, sotien);
    }
}
