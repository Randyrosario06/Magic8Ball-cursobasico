package com.example.randylaptop.magic8ball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner spin = findViewById(R.id.spiner);
        Button but = findViewById(R.id.btn);
        final EditText tx = findViewById(R.id.et1);

        //Spinner contenido
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.sexo, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MagicActivity.class);
                intent.putExtra("nombre",tx.getText().toString());
                intent.putExtra("gen",spin.getSelectedItem().toString());
                startActivity(intent);
            }
        });


    }


}
