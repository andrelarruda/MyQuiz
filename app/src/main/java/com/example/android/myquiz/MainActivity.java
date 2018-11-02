package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup pergunta1RadioGroup;
    int idRespostaCertaPergunta1;

    RadioGroup pergunta2RadioGroup;
    int idRespostaCertaPergunta2;

    RadioGroup pergunta3RadioGroup;
    int idRespostaCertaPergunta3;

    RadioGroup pergunta4RadioGroup;
    int idRespostaCertaPergunta4;

    RadioGroup pergunta5RadioGroup;
    int idRespostaCertaPergunta5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //encontra os ids das respostas corretas de cada questão
        pergunta1RadioGroup = (RadioGroup)findViewById(R.id.pergunta1RadioGroup);
        idRespostaCertaPergunta1 = R.id.p1AlternativaDRadioButton;

        pergunta2RadioGroup = (RadioGroup)findViewById(R.id.pergunta2RadioGroup);
        idRespostaCertaPergunta1 = R.id.p2AlternativaARadioButton;

        pergunta3RadioGroup = (RadioGroup)findViewById(R.id.pergunta3RadioGroup);
        idRespostaCertaPergunta1 = R.id.p3AlternativaBRadioButton;

        pergunta4RadioGroup = (RadioGroup)findViewById(R.id.pergunta4RadioGroup);
        idRespostaCertaPergunta1 = R.id.p4AlternativaDRadioButton;

        pergunta5RadioGroup = (RadioGroup)findViewById(R.id.pergunta5RadioGroup);
        idRespostaCertaPergunta1 = R.id.p5AlternativaCRadioButton;
    }

    public void enviar(View view){
        int idRespostaPergunta1 = pergunta1RadioGroup.getCheckedRadioButtonId();
        RadioButton radioButtonResposta1 = (RadioButton)findViewById(idRespostaPergunta1);
        RadioButton respostaCerta1RadioButton = (RadioButton)findViewById(idRespostaCertaPergunta1);

        Log.i("MainActivity", "Resposta pergunta 1: " + ("carro"=="carro"));
    }



}
