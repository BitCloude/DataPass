package com.appers.ayvaz.datapass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataGather2 extends AppCompatActivity {
    EditText editText1;
    Button button1;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_gather2);
        Intent intent = getIntent();
        data = intent.getStringExtra("Data");
        button1 = (Button) findViewById(R.id.button4);
        editText1 = (EditText) findViewById(R.id.editText3);
        editText1.setText(data);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Data", editText1.getText().toString());
                startActivity(intent);
            }
        });

    }
}
