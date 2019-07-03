package com.example.sweater;

public class ResponseData {

    public int status;
    public String message;
    public Object data;

    public ResponseData(){

    }

    public ResponseData(int status, String message, Object data){
        this.status = status;
        this.message = message;
        this.data = data;
    }


}
