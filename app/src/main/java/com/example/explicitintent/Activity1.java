package com.example.explicitintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity { //클래스를 상속받아 Activity1 클래스를 생성한다.

    @Override
    public void onCreate(Bundle savedInstanceState){ //onCreate 메소드의 매개변수는 앱의 이전 상태를 전달한다.
        super.onCreate(savedInstanceState); //부모클래스의 onCreate를 호출한다.
        setContentView(R.layout.layout1); //layout1을 뷰로 띄운다.
        Button b = (Button)findViewById(R.id.Button1); //버튼 객체를 연결한다.
        b.setOnClickListener(new View.OnClickListener() { //클릭리스너를 구현한다.
            @Override
            public void onClick(View v) { //클릭하면
                Intent intent = new Intent(Activity1.this, Activity2.class);
                //Activity2를 시작한다. 명시적인 인텐트 객체 생성
                startActivity(intent); //인텐트 시작한다.
            }
        });
    }
}
