package com.example.herotruth.rjt_cw_eventbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(MainActivity.this);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            Intent i = new Intent(MainActivity.this, SecondActivity.class);

            startActivity(i);
            }
        });





    }

    public void Subscribe(MyEventClass myEventClass)
    {
        String message = myEventClass.getMyMessage();
        textView.setText(message);
    }
}
