package com.example.cientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //apuntem variables
    public EditText editText1; //el que es mostra a la pantalla

    double value1, value2, result; //variables per guardar els valors de les operacions

    int operati, operati2; //operati assigna valor a operacio, operati2 nomes es per rad o graus

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText)findViewById(R.id.editText1);
    }

    public void button0 (View v){
        String sth = editText1.getText().toString(); //agafem valor en pantalla i el guardem
        sth = sth+"0"; //li posem el valor corresponent
        editText1.setText(sth); //el mostrem per pantalla
    }

    //totes les operacions seguents son iguals a l'anterior explicada, nomes pels numeros
    public void button1 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"1";
        editText1.setText(sth);
    }

    public void button2 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"2";
        editText1.setText(sth);
    }

    public void button3 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"3";
        editText1.setText(sth);
    }

    public void button4 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"4";
        editText1.setText(sth);
    }

    public void button5 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"5";
        editText1.setText(sth);
    }

    public void button6 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"6";
        editText1.setText(sth);
    }

    public void button7 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"7";
        editText1.setText(sth);
    }

    public void button8 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"8";
        editText1.setText(sth);
    }

    public void button9 (View v){
        String sth = editText1.getText().toString();
        sth = sth+"9";
        editText1.setText(sth);
    }

    //a partir d'aqui hem acabat amb els numeros i ens posem amb les operacions
    public void sum (View v){
        String op = editText1.getText().toString(); //agafem el valor igual que un numero
        value1 = Double.parseDouble(op); //el transforem a numero
        editText1.setText(""); //borrem el valor de pantalla
        operati=1; //assignem a la operacio suma el valor 1
    }

    public void div (View v){
        String op = editText1.getText().toString(); //agafem el valor igual que un numero
        value1 = Double.parseDouble(op); //el transforem a numero
        editText1.setText(""); //borrem el valor de pantalla
        operati=2; //assignem a la operacio divisio el valor 2
    }

    public void substract (View v){
        String op = editText1.getText().toString(); //agafem el valor igual que un numero
        value1 = Double.parseDouble(op); //el transforem a numero
        editText1.setText(""); //borrem el valor de pantalla
        operati=3; //assignem a la operacio resta el valor 3
    }

    public void multi (View v){
        String op = editText1.getText().toString(); //agafem el valor igual que un numero
        value1 = Double.parseDouble(op); //el transforem a numero
        editText1.setText(""); //borrem el valor de pantalla
        operati=4; //assignem a la operacio multiplicacio el valor 4
    }

    public void cos (View v){
        String op = editText1.getText().toString(); //agafem el valor igual que un numero
        value1 = Double.parseDouble(op); //el transforem a numero
        editText1.setText("cos("+value1+")"); //borrem el valor de pantalla
        operati=5; //assignem a la operacio cosinus el valor 5
    }

    public void sin (View v){
        String op = editText1.getText().toString(); //agafem el valor igual que un numero
        value1 = Double.parseDouble(op); //el transforem a numero
        editText1.setText("sin("+value1+")"); //borrem el valor de pantalla
        operati=6; //assignem a la operacio sin el valor 6
    }

    public void tan (View v){
        String op = editText1.getText().toString(); //agafem el valor igual que un numero
        value1 = Double.parseDouble(op); //el transforem a numero
        editText1.setText("tan("+value1+")"); //borrem el valor de pantalla
        operati=7; //assignem a la operacio tangent el valor 7
    }

    public void rad (View v){
        editText1.setText("");
        operati2 = 8;
    }

    public void degree (View v){
        editText1.setText("");
        operati2 = 9;
    }

    //ja hem acabat les operacions, ara ve el igual
    public void equal (View v){
        String op2 = editText1.getText().toString();
        value2 = Double.parseDouble(op2);
        editText1.setText("");

        if(operati==1) //fa la suma
            result = value1+value2;
        else if(operati ==2) {
            //fa la divisio, pero si divisor es 0 mostra missatge d'error
            if(value2 == 0)
                editText1.setText("NOPE");
            else
                result = value1 / value2;
        }
        else if (operati == 3) //fa la resta
            result = value1-value2;
        else if(operati == 4) //fa el producte
            result = value1*value2;
        else if (operati == 5) {
            //fa el cos pero mira si es amb rad o graus
            if (operati2 == 8) {
                double valRad = Math.toRadians(value1);
                result = (Math.cos(valRad));
            } else if (operati2 == 9) {
                double valDeg = Math.toDegrees(value1);
                result = (Math.cos(valDeg));
            }
        }else if(operati == 6){
            //fa el sin pero mira si es amb rad o graus
            if (operati2 == 8) {
                double valRad = Math.toRadians(value1);
                result = (Math.sin(valRad));
            } else if (operati2 == 9) {
                double valDeg = Math.toDegrees(value1);
                result = (Math.sin(valDeg));
            }
        }else if(operati == 7){
            //fa la tangent pero mira si es amb rad o graus
            if (operati2 == 8) {
                double valRad = Math.toRadians(value1);
                result = (Math.sin(valRad));
            } else if (operati2 == 9) {
                double valDeg = Math.toDegrees(value1);
                result = (Math.sin(valDeg));
            }
        }
        editText1.setText(""+result);
        value1 = result;
    }

    public void neteja (View v){
        editText1.setText("");
        value1 = 0;
        value2 = 0;
        result = 0;
    }

}
