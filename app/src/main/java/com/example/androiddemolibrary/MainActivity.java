package com.example.androiddemolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.demomodule.Module;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btnToastMessage = findViewById(R.id.btnToastMessage);

		btnToastMessage.setOnClickListener(view -> {
			Module.toastMessage(getApplicationContext(), "Hi everyone");
			Module.logMessage("Hi again");
		});

		ImageView ivPacassoTest = findViewById(R.id.ivPicassoTest);
		Module.addImageToView("https://static-weekli.net/media/banner/2023/rewe/kw51/rewe-xmas-yackrocks-1200x600-kw51-1.jpg", ivPacassoTest);
	}
}