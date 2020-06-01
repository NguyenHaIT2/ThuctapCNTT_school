package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "admin", schema = "school", catalog = "")
public class AdminEntity {
    private long id;
    private String email;
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
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        AdminEntity that = (AdminEntity) o;
        return id == that.id &&
                Objects.equals(email, that.email) &&
                Objects.equals(matkhau, that.matkhau) &&
                Objects.equals(groupid, that.groupid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, matkhau, groupid);
    }
}
