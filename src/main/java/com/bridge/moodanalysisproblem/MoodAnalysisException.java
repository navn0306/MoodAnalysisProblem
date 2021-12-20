package com.bridge.moodanalysisproblem;


public class MoodAnalysisException extends Exception {

    public ExceptionType exceptionType;
    public String message;
    public enum ExceptionType{
        EMPTY,NULL;
    }

    public MoodAnalysisException(String message,ExceptionType exceptionType){
        this.message = message;
        this.exceptionType = exceptionType;
    }

    public MoodAnalysisException(String message) {
        this.message = message;
    }
}