package com.example.randylaptop.magic8ball;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MagicActivity extends AppCompatActivity {

    private TextView tv2;
    private Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic);


        TextView tv = findViewById(R.id.tvm);
        RelativeLayout layout = findViewById(R.id.T);
        String valor = getIntent().getStringExtra("nombre");
        String color = getIntent().getStringExtra("gen");
        Button bt = findViewById(R.id.btn);
        tv2 = findViewById(R.id.tvm2);
        r = new Random();
        final String respuestas[] = {"Definitivamente", "Por Supuesto!", "Si", "NO!",
                "Claro :)", "No creo que quieras saberlo", "Concentrate mas y pregunta de nuevo", "Problamente", "Lo dudo",
                "Okey gracias", "Para que responderte lo que ya sabes?", "Si lo quieres solo hazlo"};

        if (color.equals("F")) {
            layout.setBackgroundColor(Color.parseColor("#ff33ca"));
            tv.setText("Bienvenida " + valor + "!");
        }
        if (color.equals("M")) {
            layout.setBackgroundColor(Color.parseColor("#058bca"));
            tv.setText("Bienvenido " + valor +"!");
        }

        if (color.equals("Otro")) {
            layout.setBackgroundColor(Color.parseColor("#c3d305"));
            tv.setText("Bienvenid@ "+valor+ "!");
        }

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String random = respuestas[r.nextInt(respuestas.length)];
                tv2.setText(random);
            }
        });


    }

}
