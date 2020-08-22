package com.design.prototype;

import java.util.Date;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 22:06
 */
public class Video implements Cloneable {
    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        //实现深克隆
        Video video = (Video) clone;
        //将这个对象的属性也进行克隆
        video.createTime = (Date) video.createTime.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }
}
