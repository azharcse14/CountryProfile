package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bdButton, pakButton, indButton;
    AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdButton = findViewById(R.id.bdBtn);
        pakButton = findViewById(R.id.pakBtn);
        indButton = findViewById(R.id.indBtn);

        bdButton.setOnClickListener(this);
        pakButton.setOnClickListener(this);
        indButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.bdBtn){
            Intent intent = new Intent(MainActivity.this, CountryActivity.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }

        if (v.getId()== R.id.pakBtn){
            Intent intent = new Intent(MainActivity.this, CountryActivity.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }

        if (v.getId()== R.id.indBtn){
            Intent intent = new Intent(MainActivity.this, CountryActivity.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed(){
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle(R.string.exit);
        alertDialogBuilder.setMessage(R.string.qustion);
        alertDialogBuilder.setIcon(R.drawable.ic_explore_black_24dp);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialogBuilder.setCancelable(false);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
