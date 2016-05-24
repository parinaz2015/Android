package com.barakhshan.parinaz.toasttest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ourButton;
    private TextView ourMessage;
    private Button mySButton;
    private int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourButton=(Button)findViewById(R.id.button);
        ourMessage=(TextView)findViewById(R.id.textView);
        mySButton=(Button) findViewById(R.id.buttonS);


        //listener for Button
        View.OnClickListener ourOnClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                String result="The Button is tapped "+ counter+ " time";
                if(counter!=1) {
                    result += "s";
                }
                    ourMessage.setText(result);
            }
        };

        //Listener for ButtonS
        View.OnClickListener myListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ourMessage.setText("SButton tapped"+ourMessage.getText());

            }
        };

        mySButton.setOnClickListener(myListener);

        ourButton.setOnClickListener(ourOnClickListener);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            counter=0;
//            Toast toastMessage=Toast.makeText(this,"setting button is tapped",Toast.LENGTH_LONG);
//            toastMessage.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
