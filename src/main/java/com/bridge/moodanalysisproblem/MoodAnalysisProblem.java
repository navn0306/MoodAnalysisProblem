package com.bridge.moodanalysisproblem;

public class MoodAnalysisProblem {
    private String message;

    public MoodAnalysisProblem(String message) {

        this.message = message;
    }

    public String moodAnalysis() throws MoodAnalysisException {
        try {
            if(this.message.length()==0){
                throw new MoodAnalysisException("Invalid mood", MoodAnalysisException.ExceptionType.EMPTY);
            }
            if (this.message.toLowerCase().contains("sad"))
                return "sad";
            return "happy";
        }
        catch (NullPointerException e){
            throw new MoodAnalysisException("Invalid mood", MoodAnalysisException.ExceptionType.NULL);

        }



    }
}
