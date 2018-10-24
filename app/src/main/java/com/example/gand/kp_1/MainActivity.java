package com.example.gand.kp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private Button mButtton;

    private View.OnClickListener mOnShowToastClLstr = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (!TextUtils.isEmpty(mEditText.getText())){
                ShowText(mEditText.getText());
            }
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra(SecondActivity.KEY, mEditText.getText().toString());
            startActivity(intent);
        }
    };

    private void ShowText(Editable text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtton = findViewById(R.id.btShowToast);
        mButtton.setOnClickListener(mOnShowToastClLstr);
        mEditText = findViewById(R.id.etText);

    }
}
