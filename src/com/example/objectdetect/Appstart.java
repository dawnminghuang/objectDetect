package com.example.objectdetect;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Appstart extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		// ͨ��һ��ʱ����ƺ���Timer����ʵ��һ�������һ�������ת��
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				startActivity(new Intent(Appstart.this, Appsource.class));
				finish();

			}
		}, 3000);// ����ͣ��ʱ��Ϊ1000=1s��
	}
}