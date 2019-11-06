package com.jiangc.json;

import java.util.List;

public class InfoBean {
        private String name;
        private String number;
        private List<Results> results;

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

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "InfoBean [name= " + name + ", number= " + number + " ]";
    }
}
