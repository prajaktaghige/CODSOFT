package CodSoft;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApplication {

    private ArrayList<QuizQuestion> questions;
    private int score;

    public QuizApplication() {
        questions = new ArrayList<>();
        score = 0;

        // Add new quiz questions
        questions.add(new QuizQuestion("What is the largest planet in our solar system?", 
            new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 2));
        questions.add(new QuizQuestion("What is the chemical symbol for water?", 
            new String[]{"O2", "H2O", "CO2", "NaCl"}, 1));
        questions.add(new QuizQuestion("What is the smallest prime number?", 
            new String[]{"0", "1", "2", "3"}, 2));
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (QuizQuestion question : questions) {
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            QuestionTimer timer = new QuestionTimer(10); // 10 seconds timer

            int userAnswer = -1;
            while (!timer.isTimeUp() && userAnswer == -1) {
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt() - 1;
                }
            }

            timer.stopTimer();

            if (userAnswer == question.getCorrectAnswerIndex()) {
                System.out.println("Correct!");
                score++;
            } else if (timer.isTimeUp()) {
                System.out.println("Time's up! The correct answer was " + options[question.getCorrectAnswerIndex()]);
            } else {
                System.out.println("Incorrect! The correct answer was " + options[question.getCorrectAnswerIndex()]);
            }
        }

        displayResults();
        scanner.close();
    }

    public void displayResults() {
        System.out.println("Quiz Over!");
        System.out.println("Your score: " + score + "/" + questions.size());
    }

    public static void main(String[] args) {
        QuizApplication quizApp = new QuizApplication();
        quizApp.startQuiz();
    }
}
