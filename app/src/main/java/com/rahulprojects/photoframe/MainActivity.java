package com.rahulprojects.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button previousButton,nextButton;
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        previousButton=findViewById(R.id.previousButton);
        nextButton=findViewById(R.id.nextButton);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextImage();
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousImage();
            }
        });

    }



    private void nextImage() {
        if(i==1){
            imageView.setImageResource(R.drawable.one);
            i++;
        }
        else if(i==2){
            imageView.setImageResource(R.drawable.two);
            i++;
        }
        else if(i==3){
            imageView.setImageResource(R.drawable.three);
            i++;
        }
        else if(i==4){
            imageView.setImageResource(R.drawable.four);
            i++;
        }
        else if(i==5){
            imageView.setImageResource(R.drawable.five);
            i++;
        }
        else if(i==6){
            imageView.setImageResource(R.drawable.six);
            i++;
        }
        else if(i>6){
            Toast.makeText(this,"End !",Toast.LENGTH_SHORT).show();
            i=6;
        }
    }

    private void previousImage() {
        if(i==6){
            imageView.setImageResource(R.drawable.five);
            i--;
        }
        else if(i==5){
            imageView.setImageResource(R.drawable.four);
            i--;
        }
        else if(i==4){
            imageView.setImageResource(R.drawable.three);
            i--;
        }
        else if(i==3){
            imageView.setImageResource(R.drawable.two);
            i--;
        }
        else if(i==2){
            imageView.setImageResource(R.drawable.one);
            i--;
        }
        else if(i==1){
            imageView.setImageResource(R.drawable.scenary);
            i--;
        }
        else if(i<1){
            Toast.makeText(this,"Beginning !",Toast.LENGTH_SHORT).show();
            i=1;
        }

    }


}