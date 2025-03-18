package com.example.edittext;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    //아이디 etextID
    //비밀번호 etextPW
    //전화번호 etextPH
    //버튼 ebutton
    //텍스트뷰 eTextView
    private EditText etextID;
    private EditText etextPW;
    private EditText etextPH;
    private Button eButton;
    private TextView eTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etextID = (EditText) findViewById(R.id.xeditTextText);
        etextPW = (EditText) findViewById(R.id.xedittextPassword);
        etextPH = (EditText) findViewById(R.id.xedittextPhone);
        eButton = (Button) findViewById(R.id.xeditbutton);
        eTextView = (TextView) findViewById(R.id.xtextView);
    }
    public void onClicked(View view) {
        String strID = etextID.getText().toString();
        String strPW = etextPW.getText().toString();
        String strPH = etextPH.getText().toString();


        eTextView.setText("아이디: " + strID + "\n" +
                "패스워드: " + strPW + "\n" +
                "전화 번호: " + strPH);
}
}