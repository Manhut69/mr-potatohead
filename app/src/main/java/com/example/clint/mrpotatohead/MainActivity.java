/*
  A 'mister potato head' application by Clint Nieuwendijk
  The app implements a dress up game by toggling the visibility of pictures of the body parts

 */

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
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    // create arraylist of all the buttons
    List<Integer> buttons = new ArrayList<>(Arrays.asList(R.id.imgGlasses, R.id.imgBrows,
                                                      R.id.imgEyes, R.id.imgShoes, R.id.imgEars,
                                                      R.id.imgMoustache, R.id.imgArms, R.id.imgHat,
                                                      R.id.imgMouth, R.id.imgNose));
    // intitialize all buttons and pictures
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            for(int i = 0; i < 10; i++) {
                ImageView img = findViewById(buttons.get(i));
                if(Objects.requireNonNull(savedInstanceState.getIntegerArrayList("buttons"))
                                                            .get(i) == 1) {
                    img.setVisibility(View.VISIBLE);
                }
                else{
                    img.setVisibility((View.INVISIBLE));
                }
            }
        }
    }

    // save instance when app closes or rotates
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ArrayList<Integer> buttonStates = new ArrayList<>();
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

    // check which button was clicked and toggle visibility on corresponding image
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