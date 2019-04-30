package org.livinggoods.myapp;

import org.livinggoods.myapp.data.remote.AitTableApi;
import org.livinggoods.myapp.data.remote.RetrofitClient;

public class ApiUtils {
    public static final String BASE_URL = "https://api.airtable.com/v0/app8uc5OrPB5fdTcP/";

    public static AitTableApi getAirtableApi(){
        return RetrofitClient.getClient(BASE_URL).create(AitTableApi.class);
    }
}
