package demc.checkpoint3;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question
{
    private String[] mOptions;
    private int mAnswer;
    public MultipleChoiceQuestion(String text, String[] options, int answer)
    {
        super(text);
        mOptions = options;
        mAnswer = answer;

    }
    public boolean checkAnswer(int answer) {return(mAnswer==answer);}

    public boolean isMultipleChoiceQuestion(){return true;}

}

