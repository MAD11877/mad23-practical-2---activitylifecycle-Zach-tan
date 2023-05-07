package sg.edu.np.mad.madprac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final String TITLE = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume(){
        super.onResume();
        User myUser = new User();
        Button followButton = findViewById(R.id.followButton);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myUser.followed == false){
                    myUser.followed = true;
                    followButton.setText("Unfollow");
                }
                else{
                    myUser.followed = false;
                    followButton.setText("Follow");
                }
                Log.v(TITLE, "Button A is pressed");
            }
        });

    }
}