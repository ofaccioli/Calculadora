package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView resultadoTv,contaTv;
    MaterialButton buttonC;
    MaterialButton buttonDivisao, buttonMultiplicar, buttonSomar, buttonSubtrair, buttonResultado, buttonMod, buttonPorcento;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonAc, buttonPonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoTv = findViewById(R.id.resultado_tv);
        contaTv = findViewById(R.id.conta_tv);

        assignId(buttonC,R.id.button_c);
        assignId(buttonDivisao,R.id.button_div);
        assignId(buttonMultiplicar,R.id.button_multiplica);
        assignId(buttonSomar,R.id.button_soma);
        assignId(buttonSubtrair,R.id.button_subtrai);
        assignId(buttonResultado,R.id.button_resultado);
        assignId(buttonMod,R.id.button_mod);
        assignId(buttonPorcento,R.id.button_percent);
        assignId(button0,R.id.button_zero);
        assignId(button1,R.id.button_um);
        assignId(button2,R.id.button_dois);
        assignId(button3,R.id.button_tres);
        assignId(button4,R.id.button_quatro);
        assignId(button5,R.id.button_cinco);
        assignId(button6,R.id.button_seis);
        assignId(button7,R.id.button_sete);
        assignId(button8,R.id.button_oito);
        assignId(button9,R.id.button_nove);
        assignId(buttonAc,R.id.button_ac);
        assignId(buttonPonto,R.id.button_ponto);;


    }

    void assignId(MaterialButton btn, int id){

        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    public void onClick(View view){

        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        //contaTv.setText(buttonText);





    }

}