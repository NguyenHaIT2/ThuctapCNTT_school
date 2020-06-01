package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "noidunghoctap", schema = "school", catalog = "")
public class NoidunghoctapEntity {
    private long id;
    private String ten;
    private Integer nam;
    private Integer thang;
    private Integer tuan;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 200)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
    @Column(name = "thang", nullable = true)
    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    @Basic
    @Column(name = "tuan", nullable = true)
    public Integer getTuan() {
        return tuan;
    }

    public void setTuan(Integer tuan) {
        this.tuan = tuan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoidunghoctapEntity that = (NoidunghoctapEntity) o;
        return id == that.id &&
                Objects.equals(ten, that.ten) &&
                Objects.equals(nam, that.nam) &&
                Objects.equals(thang, that.thang) &&
                Objects.equals(tuan, that.tuan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ten, nam, thang, tuan);
    }
}
