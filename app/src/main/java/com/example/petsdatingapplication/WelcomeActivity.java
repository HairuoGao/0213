<<<<<<< HEAD
package com.example.petsdatingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void register(View view){
            Intent intent=new Intent(WelcomeActivity.this,RegisterActivity.class);
            startActivity(intent);
    }

    public void login(View view){
        Intent intent=new Intent(WelcomeActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}
=======
package com.example.petsdatingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void register(View view){
            Intent intent=new Intent(WelcomeActivity.this,RegisterActivity.class);
            startActivity(intent);
    }

    public void login(View view){
        Intent intent=new Intent(WelcomeActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}
>>>>>>> fa9b5e380bdd0e95d3cee1f6c858c22ae92ad7c1
