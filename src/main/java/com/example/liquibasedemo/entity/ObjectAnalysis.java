package com.example.liquibasedemo.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "object_analysis")
public class ObjectAnalysis {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "sha2_sum", nullable = false, length = 64)
    private String sha2Sum;

    @Column(name = "sha1_sum", nullable = false, length = 48)
    private String sha1Sum;

    @Column(name = "md5_sum", nullable = false, length = 32)
    private String md5Sum;

    @Column(name = "create_time")
    private Instant createTime;

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public String getMd5Sum() {
        return md5Sum;
    }

    public void setMd5Sum(String md5Sum) {
        this.md5Sum = md5Sum;
    }

    public String getSha1Sum() {
        return sha1Sum;
    }

    public void setSha1Sum(String sha1Sum) {
        this.sha1Sum = sha1Sum;
    }

    public String getSha2Sum() {
        return sha2Sum;
    }

    public void setSha2Sum(String sha2Sum) {
        this.sha2Sum = sha2Sum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}