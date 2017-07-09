package com.example.bilal.firstlaba;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
   private static final String TAG="mad a";
    private EditText name;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnlog);
        name = (EditText) findViewById(R.id.editname);
        pass = (EditText) findViewById(R.id.editpass);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                        String username= name.getText().toString();
        String password=pass.getText().toString();

        if (username.equals("bilal")&& password.equals("454"))
        {
            Intent intent=new Intent(MainActivity.this, Home.class);
            startActivity(intent);
        }
                if (username.equals(""))
                {

                   // SmartyToast.makeText(getApplicationContext(),"Your message",SmartyToast.LENGTH_SHORT,SmartyToast.DONE);
                   Toast.makeText(MainActivity.this, "Please Enter UserName", Toast.LENGTH_SHORT).show();

                }
                if (password.equals("")){

                    Toast.makeText(MainActivity.this,"please enter your password",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "please enter your username and password is empty", Toast.LENGTH_LONG).show();
                }

                Toast.makeText(getApplicationContext(), "please enter your username and password is empty", Toast.LENGTH_LONG);
            }
        });
    }

}
