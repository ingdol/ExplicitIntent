package com.example.explicitintent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity { //클래스를 상속받아 Activity2 클래스를 생성한다.

    @Override
    public void onCreate(Bundle savedInstanceState){ //onCreate 메소드의 매개변수는 앱의 이전 상태를 전달한다.
        super.onCreate(savedInstanceState); //부모클래스의 onCreate를 호출한다.
        setContentView(R.layout.layout2); //layout2을 뷰로 띄운다.
        Button b = (Button)findViewById(R.id.Button2); //버튼 객체를 연결한다.
        b.setOnClickListener(new View.OnClickListener() { //클릭리스너를 구현한다.
            @Override
            public void onClick(View v) { //클릭하면
                finish(); //종료된다.
            }
        });
    }
}


