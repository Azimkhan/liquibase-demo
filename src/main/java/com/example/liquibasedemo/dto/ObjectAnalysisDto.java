package com.example.liquibasedemo.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class ObjectAnalysisDto implements Serializable {
    private final Long id;
    private final String status;
    private final String sha2Sum;
    private final String sha1Sum;
    private final String md5Sum;
    private final Instant createTime;

    public ObjectAnalysisDto(Long id, String status, String sha2Sum, String sha1Sum, String md5Sum, Instant createTime) {
        this.id = id;
        this.status = status;
        this.sha2Sum = sha2Sum;
        this.sha1Sum = sha1Sum;
        this.md5Sum = md5Sum;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getSha2Sum() {
        return sha2Sum;
    }

    public String getSha1Sum() {
        return sha1Sum;
    }

    public String getMd5Sum() {
        return md5Sum;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectAnalysisDto entity = (ObjectAnalysisDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.status, entity.status) &&
                Objects.equals(this.sha2Sum, entity.sha2Sum) &&
                Objects.equals(this.sha1Sum, entity.sha1Sum) &&
                Objects.equals(this.md5Sum, entity.md5Sum) &&
                Objects.equals(this.createTime, entity.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, sha2Sum, sha1Sum, md5Sum, createTime);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "status = " + status + ", " +
                "sha2Sum = " + sha2Sum + ", " +
                "sha1Sum = " + sha1Sum + ", " +
                "md5Sum = " + md5Sum + ", " +
                "createTime = " + createTime + ")";
    }
}
