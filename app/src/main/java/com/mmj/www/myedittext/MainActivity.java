package com.mmj.www.myedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText plaintext = (EditText)findViewById(R.id.plaintext);
        plaintext.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                text = ((EditText)view).getText().toString();
                if((event.getAction()==KeyEvent.ACTION_DOWN)&&
                        (keyCode==KeyEvent.KEYCODE_ENTER)){
                    Toast.makeText(view.getContext(),text,Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });
    }
}
