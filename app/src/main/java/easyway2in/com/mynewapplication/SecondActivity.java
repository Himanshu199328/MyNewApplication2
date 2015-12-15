package easyway2in.com.mynewapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public final static String MESSAGE_KEY="easyway2in.com.mynewapplication.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView textView=  new TextView(this);
        textView.setTextSize(45);
        textView.setText(message);
        setContentView(textView);///
        ////Intent intent = getIntent();
        ///String message = =intent.get/StringExtra(Message_key);
        ///TextView textview = new TextView(this);
        ///textView.setTextSize(45);
        ///textView.setText(message);
        ///setContentView(textview);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
