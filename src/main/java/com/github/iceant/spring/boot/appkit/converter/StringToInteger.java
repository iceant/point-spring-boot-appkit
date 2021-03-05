package com.github.iceant.spring.boot.appkit.converter;

public class StringToInteger implements IConverter<String, Integer>{
    @Override
    public Integer convertFromAToB(String s, Integer def) {
        if(s==null) return def;
        try{
            return Integer.valueOf(s);
        }catch (Exception err){}
        return def;
    }
}