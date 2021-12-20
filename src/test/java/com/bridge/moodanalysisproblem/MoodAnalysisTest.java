package com.bridge.moodanalysisproblem;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {

    @Test
    public void givenMessageWhenContainsSadItShouldReturnSadMood() throws MoodAnalysisException {
        MoodAnalysisProblem moodAnalyser = new MoodAnalysisProblem("I am in sad mood");
        String actualResult = moodAnalyser.moodAnalysis();
        String expectedMood = "sad";
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenContainsHappyItShouldReturnHappyMood() throws MoodAnalysisException {
        MoodAnalysisProblem moodAnalyser = new MoodAnalysisProblem("I am in happy mood");
        String actualResult = moodAnalyser.moodAnalysis();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenContainsAnyMoodItShouldReturnAnyMood() throws MoodAnalysisException {
        MoodAnalysisProblem moodAnalyser = new MoodAnalysisProblem("I am in any mood");
        String actualResult = moodAnalyser.moodAnalysis();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenNullItShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalysisProblem moodAnalyser = new MoodAnalysisProblem(null);
        String actualResult;
        try {
            actualResult = moodAnalyser.moodAnalysis();
        } catch (MoodAnalysisException e) {
            String expectedMood = "happy";
            Assert.assertEquals(expectedMood, e.message);
        }
    }

    @Test
    public void givenMessageWhenEmptyShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalysisProblem moodAnalyser = new MoodAnalysisProblem("");
        String actualResult;
        try {
            actualResult = moodAnalyser.moodAnalysis();
        } catch (MoodAnalysisException e) {
            MoodAnalysisException.ExceptionType expectedMood = MoodAnalysisException.ExceptionType.EMPTY;
            System.out.println(e);
            Assert.assertEquals(expectedMood, e.exceptionType);
        }
    }
}
