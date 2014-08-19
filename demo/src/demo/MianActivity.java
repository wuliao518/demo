package demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;


public class MianActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv=new TextView(this);
		tv.setText("demo");
		setContentView(tv);
	}
}
