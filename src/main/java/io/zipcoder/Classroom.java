package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    Integer maxNumberOfStudents = 30;
    static Student[] students = new Student[30];

    public Classroom() {

        students = new Student[maxNumberOfStudents];

    }


//    public static Integer howManyStudents() {
//        Integer len = students.length;
//        return len;
//    }





    public static void removeStudent(String FN, String LN) {

        for (Integer i = 0; i < students.length; i++) {

            if ((students[i].getFirstName() == FN) && (students[i].getLastName() == LN)) {

                students[i] = null;
            }

        }

        Classroom.removeNullsFromStudents();

    }


    public Student[] getStudents() {

        return students;

    }




        public static void addStudent(Student newStudent) {


        Integer iCount = 0;
        for (Integer i = 0; i < students.length; i++) {
            if (students[i] == null) {
                iCount++;
            }
        }

        Student[] temp = new Student[students.length - iCount + 1];

        iCount = 0;
        for (Integer i = 0; i < students.length; i++) {
            if (students[i] != null) {
                temp[iCount] = students[i];
                iCount++;
            }
        }
        temp[iCount] = newStudent;

        students = temp;


    }




        public static void removeNullsFromStudents() {

            Integer iCount = 0;
            for (Integer i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    iCount++;
                }
            }

            Student[] temp = new Student[students.length - iCount];

            iCount = 0;
            for (Integer i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    temp[iCount] = students[i];
                    iCount++;
                }
            }

            students = temp;

}





    public Classroom(Student[] student) {

    }









    public static Double getStudentAverageExamScore(Student newStudent) {

        Double average = 0.0;
        Double iTotal = 0.0;


        for (Integer i = 0; i < newStudent.examScores.length; i++) {
            iTotal += newStudent.examScores[i];
        }

        average = iTotal / newStudent.examScores.length;


        return average;
    }







    public static Student[] getStudentsByScore(Student[] students) {

        Integer len = Classroom.students.length;
        Double[] tmpTestAverage = new Double[len];

        removeNullsFromStudents();

        for (int i = 0; i < Classroom.students.length; i++) {

            tmpTestAverage[i] = Classroom.getStudentAverageExamScore(Classroom.students[i]);

        }

        Double tmpDB = 0.0;
        Student tmpST = new Student();


        for (int i = 0; i < Classroom.students.length - 1; i++) {

            for (int j = i + 1; j < Classroom.students.length; j++) {

                if (tmpTestAverage[i] < tmpTestAverage[j]) {

                    tmpDB = tmpTestAverage[i];
                    tmpST = Classroom.students[i];

                    tmpTestAverage[i] = tmpTestAverage[j];
                    tmpTestAverage[j] = tmpDB;

                    Classroom.students[i] = Classroom.students[j];
                    Classroom.students[j] = tmpST;

                }



            }



        }


        return students;
    }



}
