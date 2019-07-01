package demc.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain
{
    // this is where the app starts
    public static void main(String[] args)
    {
        String[] question3 = new String[]{"(A)GTX series","(B)RTX series","(C)u dont need one"};
        String[] question4 = new String[]{"(A)R.D.J","(B)keanu reeves","(C)no one"};
        Question[] questions = new Question[3];
        questions[0] = new TrueFalseQuestion("Laney is better than BCC?", true);
        questions[1] = new TrueFalseQuestion("Java is an easy to understand language?", false);
        questions[2] = new FillTheBlankQuestion("Which season will the F building be open?", "fall", "Fall 2019", "Maybe never");
        questions[3] = new MultipleChoiceQuestion("which GPU to get in 2019?",question3,0);
        questions[4] = new MultipleChoiceQuestion("who is the in the upcoming game Cyberpunk 2077?",question4,1);

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz! Good luck!");

        while (index < questions.length)
        {
            System.out.println(questions[index].getText());

            if (questions[index].readInputAndCheckAnswer(input))
            {
                System.out.println("You are correct!");
            }
            else
            {
                System.out.println("You are incorrect!");
            }

            index++;
        }
    }
}
