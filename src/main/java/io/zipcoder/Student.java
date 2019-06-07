package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;

public class Student {

    String myFirstName;
    String myLastName;
    Double[] myExamScores;



    public Student() {
        String myFirstName;
        String myLastName;
        Double[] myExamScores;

    }

    public void setFirstName(String FN) {
        this.myFirstName = FN;
    }

    public String getFirstName() {
        String FN = this.myFirstName;
        return FN;
    }

    public void setLastName(String LN) {
        this.myLastName = LN;
    }

    public String getLastName() {
        String LN = this.myLastName;
        return LN;
    }

    public Integer getNumberOfExamsTaken() {
        Integer iCount = myExamScores.length;
        return iCount;
    }

    public void setExamScores(Double[] examScores) {

        myExamScores = examScores;
    }

    public Double[] getExamScores() {

        return myExamScores;
    }

    public void printExamScores() {

        for (Integer i = 0; i < myExamScores.length; i++) {

            Double ex = myExamScores[i];
            String outPut = String.valueOf(myExamScores[i]);

            System.out.println(outPut);
        }

    }


    public void addExamScore(Double newScore) {

        Integer iCount = 0;
        for (Integer i = 0; i < myExamScores.length; i++) {
            if (myExamScores == null) {
                iCount++;
            }
        }

        Double[] temp = new Double[myExamScores.length - iCount + 1];

        iCount = 0;
        for (Integer i = 0; i < myExamScores.length; i++) {
            if (myExamScores[i] != null) {
                temp[iCount] = myExamScores[i];
                iCount++;
            }
        }
        temp[iCount] = newScore;

        myExamScores = temp;

    }


    public void setExamScore(int i, Double newScore) {

        myExamScores[i] = newScore;

    }


    public Double getAverageExamScore() {

        Double ave = 0.0;

        for (Integer i = 0; i < myExamScores.length; i++) {
            ave += myExamScores[i];
        }

        ave = ave / myExamScores.length;

        return ave;
    }

    @Override
    public String toString() {

        String myName = myFirstName + " " + myLastName;

        System.out.println("to String");

        return myName;
//      this does not work !
    }



}


