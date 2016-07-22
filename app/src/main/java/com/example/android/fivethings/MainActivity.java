package com.example.android.fivethings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void yes(View view) {
        String priceMessage = createexplanation();
        displayMessage(priceMessage);

    }

    public void no(View view) {
            Toast.makeText(this, "Pleas Think One More Time(TT)", Toast.LENGTH_SHORT).show();
        }

    private String createexplanation() {
        String priceMessage = "Tteokbokki \n     Price - 20 HKD per person";
        priceMessage += "\n\n\nHanbok is traditional dress in korea.";
        priceMessage += "\n\n\nKorea is located East Asia. Nearby China, Japan ";
        priceMessage += "\n\n\nWeather : Korea has 4 seasons like Spring, Summer, Fall, Winter ";
        priceMessage += "\n\n\nKorea traditional alcohol";
        return priceMessage;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.eaplanation_text_viwe);
        orderSummaryTextView.setText(message);
    }
}