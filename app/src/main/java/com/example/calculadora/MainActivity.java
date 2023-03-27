package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText txtet;
    private EditText txtet2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtet = findViewById(R.id.et);
        txtet2 = findViewById(R.id.et2);
        resultado = findViewById(R.id.resultado);
    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(txtet.getText().toString());
        int valor2 = Integer.parseInt(txtet2.getText().toString());

        resultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view) {
        int valor1 = Integer.parseInt(txtet.getText().toString());
        int valor2 = Integer.parseInt(txtet2.getText().toString());

        resultado.setText(String.valueOf(valor1 + valor2));
    }

    public void multiplicar(View view) {
        int valor1 = Integer.parseInt(txtet.getText().toString());
        int valor2 = Integer.parseInt(txtet2.getText().toString());

        resultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view) {
        int valor1 = Integer.parseInt(txtet.getText().toString());
        int valor2 = Integer.parseInt(txtet2.getText().toString());

        resultado.setText(String.valueOf(valor1 / valor2));
    }
}