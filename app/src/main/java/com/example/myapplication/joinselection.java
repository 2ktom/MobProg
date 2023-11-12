package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class joinselection extends AppCompatActivity{

	private ImageButton mentor, mentee;

	@Override
	protected void onCreate(
			Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_joinselection);

		mentor = findViewById(R.id.imgMentor);
		mentee = findViewById(R.id.imgMentee);

		mentor.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(
					View v){
				Intent goToMain = new Intent(joinselection.this, MainActivity.class);
				startActivity(goToMain);
			}
		});

		mentee.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(
					View v){
				Intent goToMain = new Intent(joinselection.this, MainActivity.class);
				startActivity(goToMain);
			}
		});
	}
}