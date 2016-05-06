package com.example.myapplicationforexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupUI();
    }

    private void setupUI() {
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
    }

    // Creates a local variable for identifying the class where the log statements comes from.
    private final static String LOG_TAG = MainActivity.class.getSimpleName();

    /**
     * This method is called whe the on screen button is pressed
     *
     * @param view
     */
    public void buttonPressed(View view) {
        // An 'info' log statement.
        Log.i(LOG_TAG, "buttonPressed(View) Called");

        // the 'String' we wish to be displayed
        String stringValue = "Hello World Williams";

        // change the text of the TextView on the screen
        mTextView.setText(stringValue);
        // A 'verbose' log statement.
        Log.v(LOG_TAG, " text changed to: " + stringValue);

        // A 'debug' log statement
        Log.d(LOG_TAG, "buttonPressed(View) finished");
    }
}
