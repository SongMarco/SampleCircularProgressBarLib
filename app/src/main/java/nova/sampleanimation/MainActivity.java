package nova.sampleanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView spaceshipImage = (ImageView) findViewById(R.id.imageView);
                Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.space);
                spaceshipImage.startAnimation(hyperspaceJumpAnimation);
            }
        });



    }
}