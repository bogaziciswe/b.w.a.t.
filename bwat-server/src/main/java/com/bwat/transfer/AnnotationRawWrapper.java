package com.bwat.transfer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AnnotationRawWrapper {
    public String id;
    @JsonIgnore
    public Date createdAt;
    @JsonIgnore
    public Date updatedAt;
    public Object type;
    public Target target;
    public Object body;

    public AnnotationRawWrapper(AnnotationRaw raw) {
        this.id = raw.getAnnotationId();
        this.createdAt = raw.getCreatedAt();
        this.updatedAt = raw.getUpdatedAt();
        this.type = raw.getType();
        this.target = raw.getTarget();
        this.body = raw.getBody();
    }


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssz")
    @JsonProperty("created")
    public Date getCreatedAt() {
        return createdAt;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssz")
    @JsonProperty("modified")
    public Date getUpdatedAt() {
        return createdAt;
    }

}
