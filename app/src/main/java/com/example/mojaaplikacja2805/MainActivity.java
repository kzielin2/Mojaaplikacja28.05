package com.example.mojaaplikacja2805;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView kwadratObrazek;
    TextView kwadrat1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kwadratObrazek = (ImageView) findViewById(R.id.imageViewKwdarta);
        kwadrat1 = (TextView) findViewById(R.id.textViewKwadrat);

    }
    public void kwadratTekstKliknięcie(View view){
      //  kwadrat1.setText("o kliknąłęś na mnie");
    }
   public void kwadratKlikniecie(View view){
       Intent intent= new Intent(getApplicationContext(),PoleKwadratuActivity.class) ;
       intent.putExtra("wybrano","kwadrat");
       Toast.makeText(getApplicationContext(),"Kliknąłęś na kwadrat",Toast.LENGTH_SHORT).show();
       startActivity(intent);

    }

}
