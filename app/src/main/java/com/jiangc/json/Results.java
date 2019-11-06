package com.jiangc.json;

import java.util.List;

public class Results {
    private String name;
    private String number;
    private List<RtmpInfo> rtmpinfo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<RtmpInfo> getrtmpinfo() {
        return rtmpinfo;
    }

    public void setrtmpinfo(List<RtmpInfo> rtmpinfo) {
        this.rtmpinfo = rtmpinfo;
    }


    @Override
    public String toString() {
        return "Results [name = " + name + ", number = " + number + ", rtmpInfo = " + rtmpinfo + "]";
    }
}
