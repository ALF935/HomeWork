package Quest;

public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[3];
        String quest1 = "The capital of The USA?";
        Answer[] answers  = new Answer[3];
        answers[0] = new Answer("Moscow");
        answers[1] = new Answer("Berlin");
        answers[2] = new Answer("Washington");
        questions[0] = new Question(quest1,answers,"Washington");

        String quest2 = "What is the national flower of Japan?";
        Answer[] answers2  = new Answer[3];
        answers2[0] = new Answer("Rose");
        answers2[1] = new Answer("Sakura");
        answers2[2] = new Answer("Chamomile");
        questions[1] = new Question(quest2,answers2,"Sakura");

        String quest3 = "What is the currency of Denmark?";
        Answer[] answers3  = new Answer[3];
        answers3[0] = new Answer("Crown");
        answers3[1] = new Answer("Ruble");
        answers3[2] = new Answer("Friendship");
        questions[2] = new Question(quest3,answers3,"Crown");

        Game game = new Game(questions);
        game.doPlay();
    }
}

