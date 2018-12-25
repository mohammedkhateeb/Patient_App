package com.example.rahaf.safeheart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Chatting extends AppCompatActivity {
    TextView familyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);
        familyName = (TextView)findViewById(R.id.txtName);
        if(getIntent().hasExtra("name"))
        {
            String name = getIntent().getStringExtra("name");
            familyName.setText(name);
        }
    }
}
