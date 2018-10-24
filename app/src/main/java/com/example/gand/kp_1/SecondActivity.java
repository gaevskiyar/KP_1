package com.example.gand.kp_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static String KEY = "KEY";
    private TextView mTextView;
    private Button mButton;
    private View.OnClickListener mOnButtonLstr = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Bundle bundle = getIntent().getExtras();
        mButton = findViewById(R.id.btSecondActivity);
        mButton.setOnClickListener(mOnButtonLstr);
        mTextView = findViewById(R.id.tvText);
        mTextView.setText(bundle.getString(KEY));
    }


}
