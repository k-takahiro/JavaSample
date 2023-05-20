package com.example.lambda;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Value implements Comparable {
    private int index;
    private String value;

    public Value(int index, String value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString() {
        //return "Value [index=" + index + ", value=" + value + "]";
        return ToStringBuilder.reflectionToString(this);
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Value v = (Value)o;
        //return this.index - v.index; 
        return v.index - this.index;
    }
    
}
