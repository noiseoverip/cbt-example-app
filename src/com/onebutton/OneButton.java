package com.onebutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class OneButton extends Activity {
	
	private static final String TAG = "OneButton";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one_button);
		
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(v.getContext(), AfterClick.class));				
			}
		});
		
		
	}	
	
	public void sayHello() {
		Log.d(TAG, "HELLO");
	}

}
