package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "phuhuynh", schema = "school", catalog = "")
public class PhuhuynhEntity {
    private long id;
    private String ten;
    private String email;
    private String sdt;
    private String matkhau;
    private Integer groupid;

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
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "sdt", nullable = true, length = 45)
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "matkhau", nullable = true, length = 45)
    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Basic
    @Column(name = "groupid", nullable = true)
    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhuhuynhEntity that = (PhuhuynhEntity) o;
        return id == that.id &&
                Objects.equals(ten, that.ten) &&
                Objects.equals(email, that.email) &&
                Objects.equals(sdt, that.sdt) &&
                Objects.equals(matkhau, that.matkhau) &&
                Objects.equals(groupid, that.groupid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ten, email, sdt, matkhau, groupid);
    }
}
