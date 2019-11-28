package com.example.examenpart2deleonmairenadaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    calculos calc;
    static Double historial;
    static Integer historyInt;
    private String historia;
    private TextView View;
    private TextView numeros;
    private Integer num1;
    private Double num2;
    private Integer numm;
    private String texto;
    private Double resultado;
    private Integer tipo;
    private Integer numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = new calculos();
        historial=0.0;
        historyInt=0;
        texto="";
        historia="0";
        resultado=0.0;
        num1=0;
    }

    public void sumar(View view){
        num1=historyInt+num1;
        resultado=(double)num1;
        historyInt=0;
        tipo=1;
    }

    public void restar(View view){
        num1=historyInt-num1;
        resultado=(double)num1;
        historyInt=0;
        tipo=2;
    }

    public void multiplicar(View view){
        if(num1==0){
            num1=historyInt*1;
            resultado=(double)num1;
        }else{
            num1=historyInt*num1;
            resultado=(double)num1;
        }
        historyInt=0;
        tipo=3;
    }

    public void dividir(View view){
        if(num1==0){
            num1=historyInt/1;
            resultado=(double)num1;
        }else{
            num1=historyInt/num1;
            resultado=(double)num1;
        }
        historyInt=0;
        tipo=4;
    }

    public void punto(View view){
        //numeros = findViewById(R.id.numeros);
        //numm=1;
        //if(historyInt!=0) {
         //   texto = String.valueOf(historyInt + ".");
         //   numeros.setText(texto);
          //  historyInt = Integer.parseInt(texto);
        //}
    }

    public void igual(View view){
        numeros = findViewById(R.id.numeros);
        if(tipo==1){
            resultado+=historyInt;
            numeros.setText(String.valueOf(resultado));
        }else if(tipo==2){
            resultado=resultado-historyInt;
            numeros.setText(String.valueOf(resultado));
        }else if(tipo==3){
            resultado=resultado*historyInt;
            numeros.setText(String.valueOf(resultado));
        }else if(tipo==4){
            resultado=resultado/historyInt;
            numeros.setText(String.valueOf(resultado));
        }
        historial=0.0;
        historyInt=0;
        texto="";
        historia="0";
        resultado=0.0;
        num1=0;
    }

    public void reset(View view){
        historial=0.0;
        historyInt=0;
        texto="";
        historia="0";
        resultado=0.0;
        numeros = findViewById(R.id.numeros);
        numeros.setText(historia);
    }

    public void num1(View view){
        numeros = findViewById(R.id.numeros);
        numm=1;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
         }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }

    public void num2(View view){
        numeros = findViewById(R.id.numeros);
        numm=2;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num3(View view){
        numeros = findViewById(R.id.numeros);
        numm=3;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num4(View view){
        numeros = findViewById(R.id.numeros);
        numm=4;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num5(View view){
        numeros = findViewById(R.id.numeros);
        numm=5;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num6(View view){
        numeros = findViewById(R.id.numeros);
        numm=6;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num7(View view){
        numeros = findViewById(R.id.numeros);
        numm=7;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num8(View view){
        numeros = findViewById(R.id.numeros);
        numm=8;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num9(View view){
        numeros = findViewById(R.id.numeros);
        numm=9;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
    public void num0(View view){
        numeros = findViewById(R.id.numeros);
        numm=0;
        if(historyInt==0){
            numeros.setText(String.valueOf(numm));
            historyInt=numm;
        }else{
            texto=String.valueOf(historyInt+""+numm);
            numeros.setText(texto);
            historyInt=Integer.parseInt(texto);
        }
    }
}
