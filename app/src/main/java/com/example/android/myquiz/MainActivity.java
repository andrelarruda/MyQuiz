package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int rightAnswersQuantity = 0;

    RadioGroup pergunta1RadioGroup;
    RadioGroup pergunta2RadioGroup;
    RadioGroup pergunta3RadioGroup;
    RadioGroup pergunta4RadioGroup;
    RadioGroup pergunta5RadioGroup;

    RadioButton respostaCertaPergunta1;
    RadioButton respostaCertaPergunta2;
    RadioButton respostaCertaPergunta3;
    RadioButton respostaCertaPergunta4;
    RadioButton respostaCertaPergunta5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pergunta1RadioGroup = (RadioGroup)findViewById(R.id.pergunta1RadioGroup);
        pergunta2RadioGroup = (RadioGroup)findViewById(R.id.pergunta2RadioGroup);
        pergunta3RadioGroup = (RadioGroup)findViewById(R.id.pergunta3RadioGroup);
        pergunta4RadioGroup = (RadioGroup)findViewById(R.id.pergunta4RadioGroup);
        pergunta5RadioGroup = (RadioGroup)findViewById(R.id.pergunta5RadioGroup);

        respostaCertaPergunta1 = (RadioButton)findViewById(R.id.p1AlternativaDRadioButton);
        respostaCertaPergunta2 = (RadioButton)findViewById(R.id.p1AlternativaARadioButton);
        respostaCertaPergunta3 = (RadioButton)findViewById(R.id.p1AlternativaBRadioButton);
        respostaCertaPergunta4 = (RadioButton)findViewById(R.id.p1AlternativaERadioButton);
        respostaCertaPergunta5 = (RadioButton)findViewById(R.id.p1AlternativaCRadioButton);

    }

    public void enviar(View view){
        RadioButton respostaCertaRadioButon = (RadioButton)findViewById(R.id.p1AlternativaDRadioButton);
        Log.i("MainActivity", "A resposta está certa? " + isAnswerRight(pergunta1RadioGroup, respostaCertaRadioButon));
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
