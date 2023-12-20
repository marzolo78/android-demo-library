package com.example.androiddemolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demomodule.Module;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btnToastMessage = findViewById(R.id.btnToastMessage);

		btnToastMessage.setOnClickListener(view -> {
			Module.toastMessage(getApplicationContext(), "Hi everyone");
		});
	}
}