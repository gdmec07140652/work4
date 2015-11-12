package com.example.administrator.work4;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.nio.charset.MalformedInputException;

public class work4 extends Activity {
    private Button but1,but2,but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work4);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        View.OnClickListener showToast1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(work4.this,"直接输出",Toast.LENGTH_LONG).show();
            }
        };
         View.OnClickListener showToast2 = new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 LayoutInflater li = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                 View view = li.inflate(R.layout.toastinfe,null);
                 Toast toast = new Toast(work4.this);
                 toast.setView(view);
                 toast.show();
             }
         };
        View.OnClickListener showToast3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(work4.this,"图文显示",Toast.LENGTH_LONG);
                LinearLayout mlayout = new LinearLayout(work4.this);
                mlayout.setOrientation(LinearLayout.VERTICAL);
                ImageView mImage = new ImageView(work4.this);
                mImage.setImageResource(R.drawable.ic_launcher);
                View toastView = toast.getView();
                mlayout.addView(mImage);
                mlayout.addView(toastView);
                toast.setView(mlayout);
                toast.show();
            }
        };
        but1.setOnClickListener(showToast1);
        but2.setOnClickListener(showToast2);
        but3.setOnClickListener(showToast3);

;    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_work4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
