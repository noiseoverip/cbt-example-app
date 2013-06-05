package com.cbttestapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.testapp1.R;

/**
 * Extremely simple Activity that displays two buttons. Once one of them is
 * clicked, another Activity takes place and show a message related the clicked
 * button.
 * 
 * @author SauliusAlisauskas
 * 
 */
public class CbtTestApp1 extends Activity {
	private static final int numberOfButtonPairs = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1.0f);
		LayoutParams buttonPairContainerParams = new LinearLayout.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 0);
		
		for (int i = 0; i < numberOfButtonPairs; i++) {
			LinearLayout linearLayout = new LinearLayout(this);
			linearLayout.setOrientation(LinearLayout.HORIZONTAL);
			linearLayout.setLayoutParams(buttonPairContainerParams);
			
			Button button1 = new Button(this);
			button1.setLayoutParams(buttonLayoutParams);
			String text1 = "button" + (i*2 + 1);
			button1.setText(text1);
			button1.setContentDescription(text1);
			button1.setOnClickListener(new ButtonClickListener(text1, this));
			
			Button button2 = new Button(this);
			button2.setLayoutParams(buttonLayoutParams);
			String text2 = "button" + (i*2 + 2);
			button2.setText(text2);
			button2.setContentDescription(text2);
			button2.setOnClickListener(new ButtonClickListener(text2, this));
			
			linearLayout.addView(button1);
			linearLayout.addView(button2);
			
			((LinearLayout)this.findViewById(R.id.container)).addView(linearLayout);
		}
	}
	
	class ButtonClickListener implements View.OnClickListener {
		private String text;		
		
		public ButtonClickListener(String text, Activity activity) {
			this.text = text;
		}
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(v.getContext(), AfterClick.class);
			intent.putExtra("message", text);
			startActivity(intent);			
		}
		
	}
}
