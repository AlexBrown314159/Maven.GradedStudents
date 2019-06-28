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

        // Given
        Double[] exp = {100.0, 95.0, 123.0, 96.0};
        newStudent.setExamScores(exp);

        // When
        Double[] act = newStudent.getExamScores();

        //Then
        Assert.assertEquals(exp.length, act.length);
        Assert.assertArrayEquals(exp, act);

    }



    @Test
    public void addExamScoreTEST() {

        Student newStudent = new Student();

        Double[] examScores = {100.0, 95.0, 123.0, 96.0};

        newStudent.setExamScores(examScores);

        newStudent.addExamScore(99.9);

        Double[] exp = {100.0, 95.0, 123.0, 96.0, 99.9};
        Double[] act = newStudent.getExamScores();

        //Then
        Assert.assertEquals(exp.length, act.length);
        Assert.assertArrayEquals(exp, act);

    }



    @Test
    public void toStringTEST() {

        Student newStudent = new Student();

        String nom = "abcdefghijklmnopqrstuvwxyz";

        String name2 = nom.toString();

        System.out.println(name2);
    }



@Test
    public void getClassAverageExamScore() {

        Double act = 0.0;

        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0, 101.1, 98.1, 88.9, 99.9};

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setExamScores(s1Scores);
        s2.setExamScores(s2Scores);

        Double iTotal = 0.0;
        Integer iCount = 0;

        iTotal = s1.getAverageExamScore() * s1.getNumberOfExamsTaken();
        iTotal += s2.getAverageExamScore() * s2.getNumberOfExamsTaken();

        iCount = s1.getNumberOfExamsTaken();
        iCount += s2.getNumberOfExamsTaken();

        act = iTotal / iCount;

        Double exp = 111.0;

        Assert.assertEquals(exp, act);
    }



    @Test
    public void removeStudentTEST() {

        for (Integer i = 0; i < Classroom.students.length; i++) {

            Classroom.students[i] = null;

            Classroom.removeNullsFromStudents();
        }

        Student s1 = new Student();
        s1.setFirstName("Joe");
        s1.setLastName("Washington");
        Classroom.addStudent(s1);

        Student s2 = new Student();
        s2.setFirstName("George");
        s2.setLastName("Biden");
        Classroom.addStudent(s2);

        Student s3 = new Student();
        s3.setFirstName("Jim");
        s3.setLastName("Wilson");
        Classroom.addStudent(s3);

        Student s4 = new Student();
        s4.setFirstName("Joe");
        s4.setLastName("Smith");
        Classroom.addStudent(s4);

        Student s5 = new Student();
        s5.setFirstName("Joe");
        s5.setLastName("Dirt");
        Classroom.addStudent(s5);

        int exp = Classroom.students.length - 1;

        Classroom.removeStudent(s3.getFirstName(), s3.getLastName());

        int act = Classroom.students.length;

        Assert.assertEquals(exp, act);

    }



    @Test
    public void getStudentsByScoreTEST() {

        Double[] s1Scores = {100.0, 150.0, 80.0, 90.0};
        Double[] s2Scores = {225.0, 25.0, 100.0, 80.0};
        Double[] s3Scores = {100.0, 150.0, 90.0, 100.0};
        Double[] s4Scores = {225.0, 25.0, 60.0, 90.0};
        Double[] s5Scores = {100.0, 130.0, 70.0, 80.0};

        Student s1 = new Student();
        s1.setFirstName("Joe");
        s1.setLastName("Washington");
        s1.setExamScores(s1Scores);
        Classroom.addStudent(s1);

        Student s2 = new Student();
        s2.setFirstName("George");
        s2.setLastName("Biden");
        s2.setExamScores(s2Scores);
        Classroom.addStudent(s2);

        Student s3 = new Student();
        s3.setFirstName("Jim");
        s3.setLastName("Wilson");
        s3.setExamScores(s3Scores);
        Classroom.addStudent(s3);

        Student s4 = new Student();
        s4.setFirstName("Joe");
        s4.setLastName("Smith");
        s4.setExamScores(s4Scores);
        Classroom.addStudent(s4);

        Student s5 = new Student();
        s5.setFirstName("Jim");
        s5.setLastName("Dirt");
        s5.setExamScores(s5Scores);
        Classroom.addStudent(s5);

        Student[] expected = Classroom.students;

        Student[] actual = Classroom.getStudentsByScore(Classroom.students);

//        for (int i = 0; i < Classroom.students.length; i++) {
//
//            System.out.println(Classroom.students[i].firstName + " " + Classroom.students[i].getLastName());
//
//        }

        Assert.assertArrayEquals(expected, actual);

    }






}

