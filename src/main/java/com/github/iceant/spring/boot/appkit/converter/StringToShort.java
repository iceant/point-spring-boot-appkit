package com.github.iceant.spring.boot.appkit.converter;

public class StringToShort implements IConverter<String, Short>{
    @Override
    public Short convertFromAToB(String s, Short def) {
        if(s==null) return def;
        try{
            return Short.valueOf(s);
        }catch (Exception err){}
        return def;
    }
}