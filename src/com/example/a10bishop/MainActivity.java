package com.example.a10bishop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener {
	private Switch fillingSwitch;
	private RadioGroup fillings;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//CLICK LISTENERS
		fillingSwitch = (Switch) findViewById(R.id.fillingSwitch);
		
		if (fillingSwitch != null) {
			fillingSwitch.setOnCheckedChangeListener(this);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(CompoundButton btnView, boolean isChecked) {
		/*Context context = getApplicationContext();
		CharSequence text = "Hello toast!";
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();*/
		
		fillings = (RadioGroup) findViewById(R.id.fillingOpts);
		
	    if(isChecked) {
	        Animation animation = new AlphaAnimation(0.0f, 1.0f);
	        animation.setFillAfter(true);
	        fillings.startAnimation(animation);
	    } else {
	        Animation animation = new AlphaAnimation(1.0f, 0.0f);
	        animation.setFillAfter(true);
	        fillings.startAnimation(animation);
	    }
	}

}
