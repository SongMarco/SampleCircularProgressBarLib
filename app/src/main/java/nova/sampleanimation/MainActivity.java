package nova.sampleanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView spaceshipImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spaceshipImage = (ImageView) findViewById(R.id.imageView);
        spaceshipImage.setVisibility(View.INVISIBLE);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spaceshipImage.getVisibility() != View.VISIBLE){
                    Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
                    spaceshipImage.startAnimation(hyperspaceJumpAnimation);
                    spaceshipImage.setVisibility(View.VISIBLE);
                }
                else{
                    Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
                    spaceshipImage.startAnimation(hyperspaceJumpAnimation);
                    spaceshipImage.setVisibility(View.INVISIBLE);
                }

            }
        });



    }
}
