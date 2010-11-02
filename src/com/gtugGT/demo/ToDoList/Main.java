package com.gtugGT.demo.ToDoList;

import com.gtugGT.demo.ToDoList.R; 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnAdd = (Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);               
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.btnAdd:
				Intent listDataIntent = new Intent(this, Tasks.class);
				EditText et = (EditText)findViewById(R.id.txtTask);
				String inputText = et.getText().toString();
				listDataIntent.putExtra(Intent.EXTRA_TEXT, inputText);
				et.setText("");
				startActivity(listDataIntent);				
		}
	}
}