package ru.startandroid.develop.homeworklessonfirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity implements View.OnClickListener {

    EditText eText2;
    Button btn2;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        eText2 = findViewById(R.id.SecondEdText);
        btn2 = findViewById(R.id.secondActivityButton);
        btn2.setOnClickListener(SecondActivity.this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("NewText",eText2.getText().toString());
        setResult(RESULT_OK, intent);
        finish();

    }


}
