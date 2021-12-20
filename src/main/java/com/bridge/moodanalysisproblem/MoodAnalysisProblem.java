package com.bridge.moodanalysisproblem;

public class MoodAnalysisProblem {
    String message;

    public MoodAnalysisProblem(String message) {
        this.message = message;
    }

    public String moodAnalysis() throws MoodAnalysisException {
        try {
            if (this.message.length() == 0) {
                throw new MoodAnalysisException("Invalid mood", MoodAnalysisException.ExceptionType.EMPTY);
            }
            if (this.message.toLowerCase().contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException e) {
            return "happy";
        }
    }
}
