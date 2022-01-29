public class Student{
private String name;
private double average;
private double testScore1; // 25%
private double testScore2; // 25%
private double finalExamScore; // 50%

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getTestScore1() {
    return testScore1;
}

public void setTestScore1(double testScore1) {
    this.testScore1 = testScore1;
}


public double getTestScore2() {
    return testScore2;
}

public void setTestScore2(double testScore2) {
    this.testScore2 = testScore2;
}

public double getFinalExamScore() {
    return finalExamScore;
}

public void setFinalExamScore(double finalExamScore) {
    this.finalExamScore = finalExamScore;
}   

public double getAverage() {
    return average;
}   

public double calculateEntireAverage() {
    average = (testScore1*0.25 + testScore2*0.25 + finalExamScore*0.5);
    
    return average;
}   
}