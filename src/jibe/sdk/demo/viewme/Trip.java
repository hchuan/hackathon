package jibe.sdk.demo.viewme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class Trip extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        TextView textview = new TextView(this);
        textview.setText("This is the Trip list");
        setContentView(textview);
    }
}