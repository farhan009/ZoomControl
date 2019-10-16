package com.example.zoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView_id);
        zoomControls = findViewById(R.id.zoomControl_id);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX(x+1);
                imageView.setScaleY(y+1);

                Toast toast = Toast.makeText(MainActivity.this, "Zoom In", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0,0);
                toast.show();
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX(x-1);
                imageView.setScaleY(y-1);

                Toast toast = Toast.makeText(MainActivity.this, "Zoom Out", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0,0);
                toast.show();
            }
        });
    }
}
