package com.example.apple.butterknife;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.image)
    ImageView img;

    @BindView(R.id.input)
    EditText inputName;

    @BindColor(R.color.colorPrimaryDark)
    int colorTitle;

    int resourceId=R.mipmap.ic_launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Butterknife binds the view
        ButterKnife.bind(this);

        //Using butterknife to add color
        ButterKnife.Action<TextView> APPLY_COLOR= new ButterKnife.Action<TextView>() {
            @Override
            public void apply(@NonNull TextView view, int index) {
                view.setTextColor(colorTitle);
            }
        };
        ButterKnife.apply(title,APPLY_COLOR);
    }



    // click event with source view params
    @OnClick(R.id.button)
    public void onButtonClick(View view) {
        Toast.makeText(getApplicationContext(), "You have entered: " + inputName.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }


    // click event without params
    @OnClick(R.id.button)
    public void onButtonClick() {
        Toast.makeText(getApplicationContext(), "You have entered: " + inputName.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }


    // click event with specific type param
    @OnClick(R.id.button)
    public void onButtonClick(Button button) {
        Toast.makeText(getApplicationContext(), "You have entered: " + inputName.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }


    //Using Glide to insert images into The view
    /*Glide.
            with(this.MainActivity).
            load(resourceId).into(img);
            */
}
