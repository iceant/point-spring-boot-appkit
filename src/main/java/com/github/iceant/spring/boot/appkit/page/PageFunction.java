package com.github.iceant.spring.boot.appkit.page;

public interface PageFunction {
    <T> Page<T> getPage(PageRequest pageRequest);
}