package io.zipcoder;

import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;

public class Student {

    String firstName;
    String lastName;
    Double[] examScores;


    public Student() {

    }

    public void setFirstName(String FN) {
        firstName = FN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String LN) {
        lastName = LN;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getNumberOfExamsTaken() {
        Integer iCount = examScores.length;
        return examScores.length;
    }

    public void setExamScores(Double[] ExamScores) {

        examScores = ExamScores;
    }

    public Double[] getExamScores() {
        return examScores;
    }

    public void printExamScores() {

        for (Integer i = 0; i < examScores.length; i++) {

            Double ex = examScores[i];
            String outPut = String.valueOf(examScores[i]);

            System.out.println(outPut);
        }

    }


    public void addExamScore(Double newScore) {

       ArrayList<Double> tmp = new ArrayList<Double>(Arrays.asList(examScores));

       tmp.add(newScore);

       examScores = tmp.toArray(examScores);

    }


    public void setExamScore(int i, Double newScore) {

        examScores[i] = newScore;

    }


    public Double getAverageExamScore() {

        Double ave = 0.0;

        for (Integer i = 0; i < examScores.length; i++) {
            ave += examScores[i];
        }

        ave = ave / examScores.length;

        return ave;
    }

    @Override
    public String toString() {

        String myName = firstName + " " + lastName;

        System.out.println("to String");

        return myName;
//      this does not work !
    }


}


