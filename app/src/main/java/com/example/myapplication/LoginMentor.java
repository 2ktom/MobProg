package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;

public class LoginMentor extends AppCompatActivity{


	private TextView txtSignup;
	private Button btnLogin;
	@Override
	protected void onCreate(
			Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginmentor);

		 txtSignup = findViewById(R.id.txtSignup);
		 btnLogin = findViewById(R.id.loginBtn);

		 txtSignup.setOnClickListener(new View.OnClickListener(){
			 @Override
			 public void onClick(
					 View v){
				 Intent goToSignup = new Intent(LoginMentor.this, joinselection.class);
				 startActivity(goToSignup);
			 }
		 });

		 btnLogin.setOnClickListener(new View.OnClickListener(){
			 @Override
			 public void onClick(
					 View v){
				 Intent goToSignup = new Intent(LoginMentor.this, MainActivity.class);
				 startActivity(goToSignup);
			 }
		 });
	}
}
