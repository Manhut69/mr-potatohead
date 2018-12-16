package com.example.clint.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            List<Integer> buttons = new ArrayList<>(Arrays.asList(R.id.imgGlasses, R.id.imgBrows, R.id.imgEyes, R.id.imgShoes, R.id.imgEars, R.id.imgMoustache, R.id.imgArms, R.id.imgHat, R.id.imgMouth, R.id.imgNose));
            for(int i = 0; i < 10; i++) {
                ImageView img = findViewById(buttons.get(i));
                if(savedInstanceState.getIntegerArrayList("buttons").get(i) == 1) {
                    img.setVisibility(View.VISIBLE);
                }
                else{
                    img.setVisibility((View.INVISIBLE));
                }
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ArrayList<Integer> buttonStates = new ArrayList<>();
        List<Integer> buttons = new ArrayList<>(Arrays.asList(R.id.Glasses, R.id.Brows, R.id.Eyes, R.id.Shoes, R.id.Ears, R.id.Moustache, R.id.Arms, R.id.Hat, R.id.Mouth, R.id.Nose));
        for(int i = 0; i < 10; i++) {
            CheckBox box = findViewById(buttons.get(i));
            if(box.isChecked()) {
                buttonStates.add(1);
            }
            else {
                buttonStates.add(0);
            }
        outState.putIntegerArrayList("buttons", buttonStates);
        }
    }

    public void checkClicked(android.view.View v) {
        CheckBox checkbox = (CheckBox) v;
        Log.d(checkbox.getText().toString(), "Clicked");

        boolean checked = checkbox.isChecked();

        switch(checkbox.getId()) {
            case R.id.Hat:
                ImageView imgHat = findViewById(R.id.imgHat);
                if (checked) {
                    imgHat.setVisibility(View.VISIBLE);
                }
                else {
                    imgHat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Eyes:
                ImageView imgEyes = findViewById(R.id.imgEyes);
                if (checked) {
                    imgEyes.setVisibility(View.VISIBLE);
                }
                else {
                    imgEyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Ears:
                ImageView imgEars = findViewById(R.id.imgEars);
                if (checked) {
                    imgEars.setVisibility(View.VISIBLE);
                }
                else {
                    imgEars.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Brows:
                ImageView imgBrows = findViewById(R.id.imgBrows);
                if (checked) {
                    imgBrows.setVisibility(View.VISIBLE);
                }
                else {
                    imgBrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Glasses:
                ImageView imgGlasses = findViewById(R.id.imgGlasses);
                if (checked) {
                    imgGlasses.setVisibility(View.VISIBLE);
                }
                else {
                    imgGlasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Arms:
                ImageView imgArms = findViewById(R.id.imgArms);
                if (checked) {
                    imgArms.setVisibility(View.VISIBLE);
                }
                else {
                    imgArms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Moustache:
                ImageView imgMoustache = findViewById(R.id.imgMoustache);
                if (checked) {
                    imgMoustache.setVisibility(View.VISIBLE);
                }
                else {
                    imgMoustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Mouth:
                ImageView imgMouth = findViewById(R.id.imgMouth);
                if (checked) {
                    imgMouth.setVisibility(View.VISIBLE);
                }
                else {
                    imgMouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Shoes:
                ImageView imgShoes = findViewById(R.id.imgShoes);
                if (checked) {
                    imgShoes.setVisibility(View.VISIBLE);
                }
                else {
                    imgShoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.Nose:
                ImageView imgNose = findViewById(R.id.imgNose);
                if (checked) {
                    imgNose.setVisibility(View.VISIBLE);
                }
                else {
                    imgNose.setVisibility(View.INVISIBLE);
                }
                break;

        }


    }


}