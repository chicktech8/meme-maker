package com.example.hlupico.mememaker;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0f);  /** Step 1 - remove automatic action bar shadow */

        TextView anythingiwant = (TextView) findViewById(R.id.sheep);
        anythingiwant.setText("bloop");

        ImageView ithink = (ImageView) findViewById(R.id.new_meme_button);
        ithink.setImageResource(R.drawable.shut_up_and_take_my_money);
        ImageButton imageButton = (ImageButton) findViewById(R.id.new_meme_button);
        View.OnClickListener imageClickListener = getImageButtonOnClick();
        imageButton.setOnClickListener(imageClickListener);

    }
    private View.OnClickListener getImageButtonOnClick() {
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked the bun!", Toast.LENGTH_SHORT).show();
                //Go to NewMemeActivity
                Intent intent = new Intent(MainActivity.this, newMemeActivity.class);
                startActivity(intent);
            }


        };
        return clickListener;
    }


}
