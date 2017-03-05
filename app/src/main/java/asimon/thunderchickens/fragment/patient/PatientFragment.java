package asimon.thunderchickens.fragment.patient;

import android.app.Fragment;
import android.content.Intent;
import android.icu.text.StringPrepParseException;
import android.net.ParseException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.androidannotations.annotations.EFragment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import asimon.thunderchickens.LoginActivity;
import asimon.thunderchickens.MainActivity_;
import asimon.thunderchickens.R;

/**
 * Created by alansimon on 2017-03-04.
 */
@EFragment(R.layout.anotherone)
public class PatientFragment extends Fragment{

    private final String TAG = "Patient Fragment";

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, TAG);

        String url = "http://138.197.133.190/api/users";

        getActivity().setTitle("Residents");


        final ImageView img = (ImageView) getActivity().findViewById(R.id.pic);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img.setImageResource(R.drawable.loisprofile);
            }
        });

    }


}
