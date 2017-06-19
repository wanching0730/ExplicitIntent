package com.example.android.basic1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showName = (Button) findViewById(R.id.show);
        showName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameField = (EditText) findViewById(R.id.name);
                String name = nameField.getText().toString();

                Intent intent = new Intent(MainActivity.this, ShowNameActivity.class);
                intent.putExtra("User input", name);
                startActivity(intent);

            }

    });
    }
}
