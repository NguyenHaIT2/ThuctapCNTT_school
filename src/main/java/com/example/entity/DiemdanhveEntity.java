package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "diemdanhve", schema = "school", catalog = "")
public class DiemdanhveEntity {
    private int id;
    private String ten;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 20)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiemdanhveEntity that = (DiemdanhveEntity) o;
        return id == that.id &&
                Objects.equals(ten, that.ten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ten);
    }
}
