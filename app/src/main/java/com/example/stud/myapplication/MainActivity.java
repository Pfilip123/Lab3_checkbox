package com.example.stud.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        RadioButton rbOpcja1;
        RadioButton rbOpcja2;
        Spinner spinner;
        String wartosc = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbOpcja1 = findViewById(R.id.rbOpcja1);
        rbOpcja1 = findViewById(R.id.rbOpcja2);
         spinner = findViewById(R.id.spinner);

        View.OnClickListener Listner = new View.OnClickListener(){

            @Override
            public void onClick (View view){
             RadioButton radio = (RadioButton)


                RadioButton.radio = (RadioButton) view;
                  Toast.makeText(  MainActivity.this, text: "przycisk Kliknięto" , radio.getText(), Toast.LENGTH_SHORT).show();
                  if (view.getId() == R.id.rbOpcja1){}
                  else if (view.getId() == R.id.rbOpcja2){};


            }

        };
        rbOpcja1.setOnClickListener(Listner);
        rbOpcja2.setOnClickListener(Listner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter. createFromResource ( this ,
                R.array. planety , android.R.layout. simple_spinner_item );

        adapter.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item );
        spinner.setAdapter(adapter);
        spinner.setSelection(2);

        spinner.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

            String[] planety = getResources().getStringArray(R.array.planety);
            {Toast.makeText(context:MainActivity.this,planety[i],Toast.LENGTH_SHORT).show();

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };


        }
    }
}
