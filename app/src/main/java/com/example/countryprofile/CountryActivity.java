package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.txtView);

        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName){
        if (countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.ic_explore_black_24dp);
            textView.setText(R.string.details);
        }
        if (countryName.equals("pakistan")){
            imageView.setImageResource(R.drawable.ic_explore_black_24dp);
            textView.setText(R.string.details);
        }
        if (countryName.equals("india")){
            imageView.setImageResource(R.drawable.ic_explore_black_24dp);
            textView.setText(R.string.details);
        }
    }
}
