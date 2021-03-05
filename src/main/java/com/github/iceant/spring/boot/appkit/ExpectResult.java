package com.github.iceant.spring.boot.appkit;

public class ExpectResult<T>{
    T value;
    Throwable error;
    String message;

    ////////////////////////////////////////////////////////////////////////////////
    ////
    public static <T> ExpectResult<T> make(T value){
        return new ExpectResult<T>().setValue(value);
    }

    public static <T> ExpectResult<T> make(Throwable error){
        return new ExpectResult<T>().setValue(null).setError(error).setMessage(error.getMessage());
    }

    public static <T> ExpectResult<T> make(Throwable error, String message){
        return new ExpectResult<T>().setValue(null).setError(error).setMessage(message);
    }

    public static <T> ExpectResult<T> make(String message){
        return new ExpectResult<T>().setValue(null).setError(new RuntimeException(message)).setMessage(message);
    }


    ////////////////////////////////////////////////////////////////////////////////
    ////
    public Boolean hasError(){
        return error!=null;
    }

    public Boolean hasException(Class<? extends Throwable> exception){
        if(error==null) return false;
        if(exception==null) return false;
        return exception.isAssignableFrom(error.getClass());
    }

    ////////////////////////////////////////////////////////////////////////////////
    ////


    public String getMessage() {
        return message;
    }

    public ExpectResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getValue() {
        return value;
    }

    public ExpectResult<T> setValue(T value) {
        this.value = value;
        return this;
    }

    public Throwable getError() {
        return error;
    }

    public ExpectResult<T> setError(Throwable error) {
        this.error = error;
        return this;
    }
}
