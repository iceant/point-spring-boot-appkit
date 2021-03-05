package com.github.iceant.spring.boot.appkit.converter;

public interface IConverter<A, B> {
    public B convertFromAToB(A a, B def);
}