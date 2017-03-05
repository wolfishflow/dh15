package asimon.thunderchickens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by alansimon on 2017-03-04.
 */

public class MainActivity extends AppCompatActivity {

    private final String TAG = "Main Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
