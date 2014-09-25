package com.felight.inspirational_quotes;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class QuotesActivity extends Activity {

	List<String> qoute;
	TextView tvquotes;
	int location = 0;
	TextView tvnumbering;
	static int count = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quotes);
		tvquotes = (TextView) findViewById(R.id.tvquotedisplay);
		tvnumbering = (TextView) findViewById(R.id.tvnumbering);
		tvnumbering.setText(count + "/10");
		quotes();
	}

	public void quotes() {
		qoute = new ArrayList<String>();
		qoute.add("If you want to achieve greatness stop asking for permission.");
		qoute.add("Things work out best for those who make the best of how things work out.");
		qoute.add("To live a creative life, we must lose our fear of being wrong. ");
		qoute.add("Trust because you are willing to accept the risk, not because it's safe or certain.");
		qoute.add("The starting point of all achievement is desire.");
		qoute.add("I've failed over and over and over again in my life and that is why I succeed.");

		tvquotes.setText(qoute.get(location));
	}

	public void locate(View view) {

		try {
			switch (view.getId()) {
			case R.id.btnforward:
				count += 1;
				location += 1;
				tvquotes.setText(qoute.get(location));
				tvnumbering.setText(count + "/10");
				break;
			case R.id.btnbackward:
				count -= 1;
				location -= 1;
				tvquotes.setText(qoute.get(location));
				tvnumbering.setText(count + "/10");
				break;
			case R.id.btnrandom:
				location = (int) ((Math.random() * 10));
				tvquotes.setText(qoute.get(location));

				tvnumbering.setText(location + "/10");
				break;
			}
		} catch (Exception e) {
			location = 0;
			tvnumbering.setText(count + "/10");
			tvquotes.setText(qoute.get(location));

		}

	}

}
