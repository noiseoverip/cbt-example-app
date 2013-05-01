package com.cbttestapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.testapp1.R;

/**
 * Extremely simple Activity that displays two buttons. Once one of them is
 * clicked, another Activity takes place and show a message related the
 * clicked button.
 * 
 * @author SauliusAlisauskas
 * 
 */
public class CbtTestApp1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Intent intent = new Intent(this, AfterClick.class);

		findViewById(R.id.Button01).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						intent.putExtra("message", "From button 1");
						startActivity(intent);

					}
				});

		findViewById(R.id.Button02).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						intent.putExtra("message", "From button 2");
						startActivity(intent);
					}
				});

	}
}
