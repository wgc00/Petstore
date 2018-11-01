package com.wgc.petstore.entity;

import org.apache.ibatis.type.Alias;

import java.util.List;

/*标签类*/
@Alias("tag")
public class Tag {
    private Integer tagId;

    private String tagName;

    //宠物信息
    private List<Pet> pets;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
}