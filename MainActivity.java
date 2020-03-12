package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button ButtonId1, ButtonId2, ButtonId3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonId1 = findViewById(R.id.ButtonId1);
        ButtonId2 = findViewById(R.id.ButtonId2);
        ButtonId3 = findViewById(R.id.ButtonId3);

        ButtonId1.setOnClickListener(this);
        ButtonId2.setOnClickListener(this);
        ButtonId3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ButtonId1)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+880-2-7791045-51 "));
            startActivity(intent);
        } else if(v.getId()==R.id.ButtonId2)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://juniv.edu/"));
             startActivity(intent);
        } else if(v.getId()==R.id.ButtonId3)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 23.877889, 90.266162"));
            startActivity(intent);
        }

    }
}
