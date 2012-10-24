package jibe.sdk.demo.viewme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class BirthdayParty extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        TextView textview = new TextView(this);
        textview.setText("This is the Birthday Party list");
        setContentView(textview);
    }
}