package org.livinggoods.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import org.livinggoods.myapp.data.model.AirTableResponse;
import org.livinggoods.myapp.data.model.Record;
import org.livinggoods.myapp.data.remote.AitTableApi;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;

    private AitTableApi aitTableApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = (TextView) findViewById(R.id.textview);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.airtable.com/v0/app8uc5OrPB5fdTcP/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        aitTableApi = retrofit.create(AitTableApi.class);


        getOrders();


    }


    private void getOrders() {
        Log.e("STATUS", "GEtting orders");
        Call<AirTableResponse> call = aitTableApi.getOrders();
        call.enqueue(new Callback<AirTableResponse>() {

            @Override
            public void onResponse(Call<AirTableResponse> call, Response<AirTableResponse> response) {
                AirTableResponse airTableResponse = response.body();
                Gson gson = new Gson();
                String gsonString = gson.toJson(airTableResponse);
                Log.e("Response", gsonString);
                //textViewResult.setText(gsonString);

                List<Record> records = airTableResponse.getRecords();

                if (records != null) {
                    for (Record record: records) {
                        String content = "";
                        content += "User details: " + record.getFields().getCHPDetails().getText() + "\n";
                        content += "Arrival time: " + record.getFields().getScanTime() + "\n\n";

                        textViewResult.append(content);
                    }
                }


//               List< Fields> fields = response.body();
//
//                for (Fields field : fields) {
//                    String content = "";
//                    content += "User details: " + field.getUserDetails() + "\n";
//                    content += "Arrival time: " + field.getScanTime() + "\n\n";

//
//                    textViewResult.append(content);
//                }


//                try{
//                    Log.e("Response",response.body().string());
//                    JSONObject json = new JSONObject(response.body().string());
//                    json.getJSONArray("records");
//                }
//                catch(Exception e){
//                    e.printStackTrace();
//                }

//                if (!response.isSuccessful()) {
//                    textViewResult.setText("code:" + response.code());
//                    return;
//                }
//
//                List<Post> orders = response.body();
//
//                for (Post order : orders) {
//                    String content = "";
//                    content += "ID: " + order.getText() + "\n";
//                    content += "ID: " + order.getScan_time() + "\n\n";
//
//
//                    textViewResult.append(content);
//                }

            }


            @Override
            public void onFailure(Call<AirTableResponse> call, Throwable t) {
                Log.e("Error", "Error: " + t.getCause());
                t.printStackTrace();

            }
        });


    }
}