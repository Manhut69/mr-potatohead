package com.example.clint.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(android.view.View v) {
        CheckBox checkbox = (CheckBox) v;
        Log.d(checkbox.getText().toString(), "Clicked");

        boolean checked = checkbox.isChecked();

        switch(checkbox.getId()) {
            case R.id.Hat:
                ImageView imgHat = (ImageView) findViewById(R.id.imgHat);
                if (checked) {
                    imgHat.setVisibility(v.VISIBLE);
                }
                else {
                    imgHat.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Eyes:
                ImageView imgEyes = (ImageView) findViewById(R.id.imgEyes);
                if (checked) {
                    imgEyes.setVisibility(v.VISIBLE);
                }
                else {
                    imgEyes.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Ears:
                ImageView imgEars = (ImageView) findViewById(R.id.imgEars);
                if (checked) {
                    imgEars.setVisibility(v.VISIBLE);
                }
                else {
                    imgEars.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Brows:
                ImageView imgBrows = (ImageView) findViewById(R.id.imgBrows);
                if (checked) {
                    imgBrows.setVisibility(v.VISIBLE);
                }
                else {
                    imgBrows.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Glasses:
                ImageView imgGlasses = (ImageView) findViewById(R.id.imgGlasses);
                if (checked) {
                    imgGlasses.setVisibility(v.VISIBLE);
                }
                else {
                    imgGlasses.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Arms:
                ImageView imgArms = (ImageView) findViewById(R.id.imgArms);
                if (checked) {
                    imgArms.setVisibility(v.VISIBLE);
                }
                else {
                    imgArms.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Moustache:
                ImageView imgMoustache = (ImageView) findViewById(R.id.imgMoustache);
                if (checked) {
                    imgMoustache.setVisibility(v.VISIBLE);
                }
                else {
                    imgMoustache.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Mouth:
                ImageView imgMouth = (ImageView) findViewById(R.id.imgMouth);
                if (checked) {
                    imgMouth.setVisibility(v.VISIBLE);
                }
                else {
                    imgMouth.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Shoes:
                ImageView imgShoes = (ImageView) findViewById(R.id.imgShoes);
                if (checked) {
                    imgShoes.setVisibility(v.VISIBLE);
                }
                else {
                    imgShoes.setVisibility(v.INVISIBLE);
                }
                break;
            case R.id.Nose:
                ImageView imgNose = (ImageView) findViewById(R.id.imgNose);
                if (checked) {
                    imgNose.setVisibility(v.VISIBLE);
                }
                else {
                    imgNose.setVisibility(v.INVISIBLE);
                }
                break;

        }


    }


}