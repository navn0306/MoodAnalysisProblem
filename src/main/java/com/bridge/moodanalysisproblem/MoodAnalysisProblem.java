package com.bridge.moodanalysisproblem;

public class MoodAnalysisProblem {
    String message;

    public MoodAnalysisProblem(String message) {
        this.message = message;
    }

    public String moodAnalysis() throws MoodAnalysisException {
        try {
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
