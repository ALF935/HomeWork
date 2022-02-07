package Quest;

import java.util.Scanner;

public class Game {
    private Question[] questions;
    private int counter;

    public Game(Question[] questions) {
        this.questions = questions;
    }

    void doPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Let's play!");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getValue());
            Answer[] options = questions[i].getAnswers();
            for (int j = 0; j < options.length; j++) {
                System.out.println(options[j].getValue());
            }
            System.out.println("Enter the answer!");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(questions[i].getCorrect().toLowerCase())) {
                counter = counter + 1;
                }
            }
            if (counter > 2) {
                System.out.println("Congratulations! - You won!");
            }
            if (counter < 3){
                System.out.println(counter + " out of " + questions.length);
                System.out.println("Sorry, not your day!");
            }
    }
}

