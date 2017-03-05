package asimon.thunderchickens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.logging.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    private final String TAG = "Login Activity";
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play some music...
                Toast.makeText(LoginActivity.this, "helloo", Toast.LENGTH_SHORT).show();
                Log.d("Help", "help");





                Intent intent = new Intent(LoginActivity.this, MainActivity_.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
