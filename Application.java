public class Application {

public static void main(String[] args) {

    Student student1 = new Student();

    student1.setName("Bob");
    student1.setTestScore1(80);
    student1.setTestScore2(60);
    student1.setFinalExamScore(90);

    student1.calculateEntireAverage();
    System.out.println(student1.calculateEntireAverage() + "%");

}
}