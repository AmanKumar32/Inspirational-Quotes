package com.felight.inspirational_quotes;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
		tvnumbering.setText(count + "/25");
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
		qoute.add("There are two ways of constructing a software design: One way is to make it so simple that there are obviously no deficiencies, and the other way is to make it so complicated that there are no obvious deficiencies. The first method is far more difficult. ");
		qoute.add("If debugging is the process of removing software bugs, then programming must be the process of putting them in. ");
		qoute.add("Measuring programming progress by lines of code is like measuring aircraft building progress by weight. ");
		qoute.add("Nine people can’t make a baby in a month.” (regarding the addition of more programmers to get a project completed faster ");
		qoute.add("Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it. ");
		qoute.add("Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live. ");
		qoute.add("C makes it easy to shoot yourself in the foot; C++ makes it harder, but when you do, it blows away your whole leg. ");
		qoute.add("When debugging, novices insert corrective code; experts remove defective code. ");
		qoute.add("Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. ");
		qoute.add("Most good programmers do programming not because they expect to get paid or get adulation by the public, but because it is fun to program. ");
		qoute.add("Programming today is a race between software engineers striving to build bigger and better idiot-proof programs, and the Universe trying to produce bigger and better idiots. So far, the Universe is winning. ");
		qoute.add("Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ");
		qoute.add("Good code is its own best documentation. As you’re about to add a comment, ask yourself, ‘How can I improve the code so that this comment isn’t needed? ");
		qoute.add("The problem with using C++ … is that there’s already a strong tendency in the language to require you to know everything before you can do anything. ");
		qoute.add("People think that computer science is the art of geniuses but the actual reality is the opposite, just many people doing things that build on each other, like a wall of mini stones. ");
		qoute.add("One of my most productive days was throwing away 1000 lines of code. ");
		qoute.add("Most software today is very much like an Egyptian pyramid with millions of bricks piled on top of each other, with no structural integrity, but just done by brute force and thousands of slaves.  ");
		qoute.add("Before software can be reusable it first has to be usable.  ");
		qoute.add("Programming is like sex. One mistake and you have to support it for the rest of your life.  ");
		qoute.add("If builders built buildings the way programmers wrote programs, then the first woodpecker that came along wound destroy civilization.  ");

		tvquotes.setText(qoute.get(location));
	}

	public void locate(View view) {

		try {
			switch (view.getId()) {
			case R.id.btnforward:
				count += 1;
				location += 1;
				tvquotes.setText(qoute.get(location));
				tvnumbering.setText(count + "/25");
				break;
			case R.id.btnbackward:
				count -= 1;
				location -= 1;
				tvquotes.setText(qoute.get(location));
				tvnumbering.setText(count + "/25");
				break;
			case R.id.btnrandom:
				location = (int) ((Math.random() * 25));
				tvquotes.setText(qoute.get(location));
				count = location;

				tvnumbering.setText(location + "/25");
				break;
			}
		} catch (Exception e) {
			location = 25;
			// if (location == 0) {
			// Toast.makeText(getBaseContext(), "First Quote",
			// Toast.LENGTH_SHORT);
			// }
			tvnumbering.setText(count + "/25");
			tvquotes.setText(qoute.get(location));

		}

	}

}
