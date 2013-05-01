package com.cbttestapp1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.testapp1.R;

public class AfterClick extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_after_click);
		String message = "no extras provided";
		if (getIntent().getExtras() != null) {
			message = getIntent().getExtras().getString("message");			
		}
		((TextView)findViewById(R.id.message)).setText(message);
	}
}
