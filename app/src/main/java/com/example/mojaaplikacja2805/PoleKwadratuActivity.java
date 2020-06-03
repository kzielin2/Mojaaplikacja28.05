package com.example.mojaaplikacja2805;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PoleKwadratuActivity extends AppCompatActivity {
    EditText bokKwadratu;
    TextView wynikPolaKwadratuText;
    String wybranaFiguraString;
    Button buttonPowrot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_kwadratu_obliczanie);
        bokKwadratu = (EditText) (findViewById(R.id.editTextPoleKwadartu));
        buttonPowrot = (Button) (findViewById(R.id.buttonPowrot));
        wynikPolaKwadratuText = (TextView) (findViewById(R.id.textViewWynikPoleKwadartu));
        wynikPolaKwadratuText.setVisibility(View.INVISIBLE);
        Bundle wybranaFigura = getIntent().getExtras();
        wybranaFiguraString = wybranaFigura.getString("wybrano");
    }

    public double obliczPoleKwadratu(double a) {
        return a * a;
    }

    public double obliczPoleTrojkata(double a, double h) {
        return a * h * 0.5;
    }


    public void klikniecieObliczPoleKwadratu(View view) {
        if (wybranaFiguraString.equals("kwadrat")) {

            if (!((bokKwadratu.getText().toString()).equals(""))){
                double bokKwadratuInt = Double.parseDouble(bokKwadratu.getText().toString());
                double wynikPolaKwadratuInt = obliczPoleKwadratu(bokKwadratuInt);
                bokKwadratu.setText("A teraz sprawdzam czy działa Github");
                wynikPolaKwadratuText.setVisibility(View.VISIBLE);
                wynikPolaKwadratuText.setText("Pole kwadratu o długości boku " + (Double.toString(bokKwadratuInt)) + " to: " + (Double.toString(wynikPolaKwadratuInt)));
            }
            else {
                //wynikPolaKwadratuText.setVisibility(View.VISIBLE);
                //wynikPolaKwadratuText.setText("Nie podano długości boku kwadratu");
                Toast.makeText(getApplicationContext(),"Nie podano długości boku kwadratu",Toast.LENGTH_SHORT).show();
            }





        }
    }

    public void kliknieciePowrot(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}