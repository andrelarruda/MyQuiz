package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
    }

    public void enviar(View view){
        int idRespostaPergunta1 = pergunta1RadioGroup.getCheckedRadioButtonId();
        RadioButton radioButtonResposta1 = (RadioButton)findViewById(idRespostaPergunta1);
        RadioButton respostaCerta1RadioButton = (RadioButton)findViewById(idRespostaCertaPergunta1);

        Log.i("MainActivity", "Resposta pergunta 1: " + ("carro"=="carro"));
    }



}
