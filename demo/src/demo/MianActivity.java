package demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;
import android.widget.Toast;


public class MianActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(getIntent()!=null){
			String action=getIntent().getAction();
			Toast.makeText(getApplicationContext(), action, 0).show();
		}
		TextView tv=new TextView(this);
		tv.setText("demo");
		setContentView(tv);
	}
}
