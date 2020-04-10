package com.example.background;

import   androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        tv = findViewById(R.id.tv1);
    }
    public void buttonclicked(View view){

        tv.setText("Colour Changed");
        View someView = findViewById(android.R.id.content);
        View root = someView.getRootView();
        Resources res = getResources();
        final TypedArray myImages = res.obtainTypedArray(R.array.image);
        final Random random = new Random();
        int randomInt = random.nextInt(myImages.length());
        int drawableID = myImages.getResourceId(randomInt, -1);
        root.setBackgroundColor(getResources().getColor(drawableID));

    }
}
