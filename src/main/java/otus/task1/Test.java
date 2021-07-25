package otus.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
    private Question[] questions;

    public Test(Question[] questions) {
        this.questions = questions;
        String line;
        String file = "src/main/resources/questions.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (Question question : this.questions) {
                if ((line = reader.readLine()) != null) {
                    String[] row = line.split(",");
                    question.setText(row[0]);
                    question.setCorrectAnswer(row[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void startTest() {
        System.out.println("What's your name and surname?");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Surname: ");
        String surname = scanner.next();
        System.out.println("Hello, " + name + " " + surname + "!");
        System.out.println("Welcome to my test. Good luck!");
        int counter = 1, points = 0;
        for (Question question : questions) {
            System.out.println("Question #" + counter + ". Type the correct answer");
            System.out.println(question.getText());
            String answer = scanner.next();
            if (answer.equals(question.getCorrectAnswer())) {
                ++points;
            }
            System.out.println();
            ++counter;
        }
        System.out.println("Test is over. Number of correct answers: " + points);
        scanner.close();
    }
}
