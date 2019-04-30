package org.livinggoods.myapp.Branches;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.livinggoods.myapp.ApiUtils;
import org.livinggoods.myapp.Scanner.Main5Activity;
import org.livinggoods.myapp.R;
import org.livinggoods.myapp.data.model.AirTableResponse;
import org.livinggoods.myapp.data.model.AttendanceFields;
import org.livinggoods.myapp.data.model.AttendanceRequest;
import org.livinggoods.myapp.data.model.CHPDetails;
import org.livinggoods.myapp.data.remote.AitTableApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Budadiri extends AppCompatActivity {

    private AitTableApi mAitTableApi;
    private EditText userdetails;
    String value;

    public Button sendbtn,Scanbtn;
    private TextView mResponseTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        userdetails = (EditText) findViewById(R.id.userdata);
        sendbtn = (Button) findViewById(R.id.send);
        Scanbtn = (Button)findViewById(R.id.scanbtn);
        mResponseTv = (TextView) findViewById(R.id.tv_response);

        value = getIntent().getStringExtra("value");
        userdetails.setText(value);
        mAitTableApi = ApiUtils.getAirtableApi();


//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.airtable.com/v0/app8uc5OrPB5fdTcP/")
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();

//        airTableApi = retrofit.create(AirTableApiBudadiri.class);

        Scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Budadiri.this,Main5Activity.class);
                startActivity(intent);
            }
        });

        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                if ( value!= ""){
                    sendPostBudadiri(value);
                }
            }
        });


    }

    private void sendPostBudadiri (String value){

        AttendanceRequest request = new AttendanceRequest();
        CHPDetails details = new CHPDetails();
        details.setText(value);
        AttendanceFields fields = new AttendanceFields();
        fields.setCHPDetails(details);


        request.setFields(fields);
        Call<AirTableResponse> call = mAitTableApi.sendPostBudadiri(request);

        call.enqueue(new Callback<AirTableResponse>() {
            @Override
            public void onResponse(Call<AirTableResponse> call, Response<AirTableResponse> response) {

                showResponse(response.body().toString());
                Log.i( "post submitted to Api","Message" + response.body().toString());
            }

            @Override
            public void onFailure(Call<AirTableResponse> call, Throwable t) {

                Log.e("Error", "Error: " + t.getCause());
                t.printStackTrace();
            }
        });
    }
    public void showResponse(String response) {
        if(mResponseTv.getVisibility() == View.GONE) {
            mResponseTv.setVisibility(View.VISIBLE);
        }
        mResponseTv.setText(String.format(" %s recorded successfully", value));
    }

}
