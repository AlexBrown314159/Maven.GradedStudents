package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void StudentTEST() {

    }

    @Test
    public void firstNameTEST() {

        Student newStudent = new Student();

        // Given
        String firstNameEXP = "Leon";
        newStudent.setFirstName(firstNameEXP);

        // When
        String firstNameACT = newStudent.getFirstName();

        //Then
        Assert.assertEquals(firstNameEXP, firstNameACT);

    }

    @Test
    public void lastNameTEST() {

        Student newStudent = new Student();

        // Given
        String lastNameEXP = "Hunter";
        newStudent.setLastName(lastNameEXP);

        // When
        String lastNameACT = newStudent.getLastName();

        //Then
        Assert.assertEquals(lastNameEXP, lastNameACT);

    }

    @Test
    public void setExamScoresTEST() {

        Student newStudent = new Student();

        Double[] examScores = {100.0, 95.0, 123.0, 96.0};

        newStudent.setExamScores(examScores);

        newStudent.printExamScores();

    }



    @Test
    public void addExamScoreTEST() {

        Student newStudent = new Student();

        Double[] examScores = {100.0, 95.0, 123.0, 96.0};

        newStudent.setExamScores(examScores);

        newStudent.addExamScore(99.9);

        newStudent.printExamScores();

        System.out.println("============================");

        Double mean = newStudent.getAverageExamScore();

        System.out.println("Average = " + mean);
    }



    @Test
    public void toStringTEST() {

        Student newStudent = new Student();

        String nom = "abcdefghijklmnopqrstuvwxyz";

        String name2 = nom.toString();

        System.out.println(name2);
    }



@Test
    public void getAverageExamScore() {

        Double classAverage = 0.0;

        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setExamScores(s1Scores);
        s2.setExamScores(s2Scores);

        Double iTotal = 0.0;
        Integer iCount = 0;

        iTotal = s1.getAverageExamScore();
        iTotal += s2.getAverageExamScore();

        iCount = s1.getNumberOfExamsTaken();
        iCount += s2.getNumberOfExamsTaken();

        classAverage = iTotal / iCount;

        System.out.println(classAverage);

    }











// Given

// When

//Then





}

