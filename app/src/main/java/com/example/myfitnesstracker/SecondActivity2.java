package com.example.myfitnesstracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{

                R.id.bow_pose,R.id.bridge_pose,R.id.chair_pose,R.id.child_pose,R.id.cobler_pose,R.id.cow_pose,R.id.playji_pose,R.id.pauseji_pose,R.id.plank_pose,R.id.crunches_pose,R.id.situp_pose,R.id.rotation_pose,R.id.twist_pose,R.id.windmill_pose,R.id.legup_pose


        };

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.id_privacy){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myfitnesstrackers.blogspot.com/2023/08/my-fitness-trackers-privacy-policy-page.html"));
            startActivity(intent);

            return true;
        }
        if(id == R.id.id_term){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myfitnesstrackers.blogspot.com/2023/08/my-fitness-trackers-terms-and.html"));
            startActivity(intent);

            return true;
        }
        if(id == R.id.id_Rate){

            try {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));


            }catch (Exception ex){

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));

            }
            return true;
        }
        if(id == R.id.id_more){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Leap+Fitness+Group"));
            startActivity(intent);

            return true;
        }
        if(id == R.id.id_share){

            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = "This is the best app for fitness freaks.\n By this app you can transform your body in 60 days.\n This is the free app Download Now.\n" +"https://play.google.com/store/apps/details?id=com.example.myfitnesstracker&hl=en";
            String sharehub = "My Fitness Tracker";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(myIntent,"share using"));
            return true;
        }
        return true;
    }

    public void Imagebuttonclicked(View view) {

        for(int i = 0; i< newArray.length; i++){
            if(view.getId() == newArray[i]) {
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);

            }
        }
    }
}