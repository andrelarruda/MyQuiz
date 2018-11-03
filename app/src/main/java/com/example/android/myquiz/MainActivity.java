package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int rightAnswersQuantity = 0;

    RadioGroup question1RadioGroup;
    RadioGroup question2RadioGroup;
    RadioGroup question3RadioGroup;
    RadioGroup question4RadioGroup;
    RadioGroup question5RadioGroup;

    RadioButton rightAnswerForQuestion1;
    RadioButton rightAnswerForQuestion2;
    RadioButton rightAnswerForQuestion3;
    RadioButton rightAnswerForQuestion4;
    RadioButton rightAnswerForQuestion5;

    List<RadioGroup> questions = new LinkedList<RadioGroup>();
    List<RadioButton> rightAnswers = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1RadioGroup = (RadioGroup)findViewById(R.id.q1RadioGroup);
        question2RadioGroup = (RadioGroup)findViewById(R.id.q2RadioGroup);
        question3RadioGroup = (RadioGroup)findViewById(R.id.q3RadioGroup);
        question4RadioGroup = (RadioGroup)findViewById(R.id.q4RadioGroup);
        question5RadioGroup = (RadioGroup)findViewById(R.id.q5RadioGroup);

        rightAnswerForQuestion1 = (RadioButton)findViewById(R.id.question1OptionDRadioButton);
        rightAnswerForQuestion2 = (RadioButton)findViewById(R.id.question2OptionARadioButton);
        rightAnswerForQuestion3 = (RadioButton)findViewById(R.id.question3OptionBRadioButton);
        rightAnswerForQuestion4 = (RadioButton)findViewById(R.id.question4OptionERadioButton);
        rightAnswerForQuestion5 = (RadioButton)findViewById(R.id.question5OptionCRadioButton);

        questions.add(question1RadioGroup);
        questions.add(question2RadioGroup);
        questions.add(question3RadioGroup);
        questions.add(question4RadioGroup);
        questions.add(question5RadioGroup);

        rightAnswers.add(rightAnswerForQuestion1);
        rightAnswers.add(rightAnswerForQuestion2);
        rightAnswers.add(rightAnswerForQuestion3);
        rightAnswers.add(rightAnswerForQuestion4);
        rightAnswers.add(rightAnswerForQuestion5);

    }

    public void submit(View view){

        int quantityQuestions = questions.size();

        for (int i = 0 ; i < quantityQuestions ; i++){
            RadioGroup question = questions.get(i);
            RadioButton rightAnswer = rightAnswers.get(i);

            if (isAnswerRight(question, rightAnswer)){
                rightAnswersQuantity++;
            }
        }

        String text = getString(R.string.successful_questions);
        makeToast(text + " " + rightAnswersQuantity);

        //make rightAnswerQuantity 0
        rightAnswersQuantity = 0;
        reset();

    }

    //reset checked boxes
    public void reset(View view){
        for (int i = 0 ; i < questions.size() ; i++){
            questions.get(i).clearCheck();
        }
        rightAnswersQuantity = 0;

    }

    //reset checked boxes
    public void reset(){
        for (int i = 0 ; i < questions.size() ; i++){
            questions.get(i).clearCheck();
        }
        rightAnswersQuantity = 0;

    }


    public boolean isAnswerRight(RadioGroup question, RadioButton rightAnswer){
        int idAnswerRadioButton = question.getCheckedRadioButtonId();
        RadioButton answerGiven = (RadioButton)findViewById(idAnswerRadioButton);

        return answerGiven.getText() == rightAnswer.getText();

    }

    public String getTextFromAnsweredQuestion(RadioGroup question){
        int idQuestion = question.getCheckedRadioButtonId();
        RadioButton radioButtonCheckedInQuestion =
                (RadioButton)findViewById(idQuestion);

        return radioButtonCheckedInQuestion.getText().toString();

    }

    public void makeToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


}
