package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    EditText campo1,campo2;
    TextView resultado;

    int numero1, numero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.campo1);
        campo2 = findViewById(R.id.campo2);
        resultado = findViewById(R.id.resultado);


    }
    public void onClick(View view){
        numero1=Integer.parseInt(campo1.getText().toString());
        numero2=Integer.parseInt(campo2.getText().toString());

        switch (view.getId()){
            case R.id.btnsuma: sumar();
            break;
            case R.id.btnresta: restar();
            break;
            case R.id.btnmultiplicacion:multiplicacion();
            break;
            case R.id.btndivicion: division();
        }

    }
    private void sumar(){
        int suma = numero1+numero2;
        resultado.setText(getString(R.string.resultado1)+suma);
    }
    private void restar(){
        int resta = numero1-numero2;
        resultado.setText(getString(R.string.resultado1)+resta);
    }
    private void multiplicacion(){
        int multi = numero1*numero2;
        resultado.setText(getString(R.string.resultado1)+multi);
    }
    private void division(){
        int div = numero1/numero2;
        resultado.setText(getString(R.string.resultado1)+div);
    }
}
