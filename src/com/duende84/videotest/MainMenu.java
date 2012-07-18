package com.duende84.videotest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity {

	public final static String video = "com.duende84.videotest.MENSAJE";
	Button btn_videoViewDemo1;
	Button btn_videoViewDemo2;
	Button btn_MediaPlayerDemo1;
	Button btn_MediaPlayerDemo2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_videoViewDemo1 = (Button) findViewById(R.id.btn_videoViewDemo1);
		btn_videoViewDemo2 = (Button) findViewById(R.id.btn_videoViewDemo2);
		btn_MediaPlayerDemo1 = (Button) findViewById(R.id.btn_MediaPlayerDemo1);
		btn_MediaPlayerDemo2 = (Button) findViewById(R.id.btn_MediaPlayerDemo2);

		
		
		 btn_videoViewDemo1.setOnClickListener(new View.OnClickListener() {
		 
			@Override
			public void onClick(View v) {
				Log.i("DUENDE", "Entro 1");
				Intent Navigation1 = new Intent(MainMenu.this,
						streamplayer.class);
				Navigation1.putExtra("video", 1);
				startActivity(Navigation1);
			}
		});
		

		btn_videoViewDemo2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.i("DUENDE", "Entro 2");
				Intent Navigation1 = new Intent(MainMenu.this,
						streamplayer.class);
				Navigation1.putExtra("video", 2);
				startActivity(Navigation1);
			}
		});

		btn_MediaPlayerDemo1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.i("DUENDE", "Entro 3");
				Intent Navigation1 = new Intent(MainMenu.this,
						MediaPlayerDemo_Video.class);
				Navigation1.putExtra("video", 1);
				startActivity(Navigation1);
			}
		});

		btn_MediaPlayerDemo2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.i("DUENDE", "Entro 4");
				Intent Navigation1 = new Intent(MainMenu.this,
						MediaPlayerDemo_Video.class);
				Navigation1.putExtra("video", 2);
				startActivity(Navigation1);
			}
		});
		
	}
	
}