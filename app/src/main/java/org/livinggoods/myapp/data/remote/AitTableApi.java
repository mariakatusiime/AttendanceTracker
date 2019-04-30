
package org.livinggoods.myapp.data.remote;
import org.livinggoods.myapp.data.model.AirTableResponse;
import org.livinggoods.myapp.data.model.AttendanceRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AitTableApi {

//Kiira branch
    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Kiira?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrders();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Kiira")
    Call<AirTableResponse>sendPost(@Body AttendanceRequest request);

    //Budadiri

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Budadiri?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersBudadiri();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Budadiri")
    Call<AirTableResponse>sendPostBudadiri(@Body AttendanceRequest request);

    //Kakiri

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Kakiri?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersKakiri();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("kakiri")
    Call<AirTableResponse>sendPostKakiri(@Body AttendanceRequest request);

    //Mafubira

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Mafubira?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMafubira();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Mafubira")
    Call<AirTableResponse>sendPostMafubira(@Body AttendanceRequest request);

    //Mbale

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Mbale?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMbale();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Mbale")
    Call<AirTableResponse>sendPostMbale(@Body AttendanceRequest request);

    //Kayunga

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Kayunga?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersKayunga();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Kayunga")
    Call<AirTableResponse>sendPostKayunga(@Body AttendanceRequest request);

    //Mayuge

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Mayuge?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrderMayuge();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Mayuge")
    Call<AirTableResponse>sendPostMayuge(@Body AttendanceRequest request);

    //Iganga

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Iganga?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersIganga();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Iganga")
    Call<AirTableResponse>sendPostIganga(@Body AttendanceRequest request);

    //Kyengera

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Kyengera?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersKyengera();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Kyengera")
    Call<AirTableResponse>sendPostKyengera(@Body AttendanceRequest request);

    //Mukono


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Mukono?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMukono();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Mukono")
    Call<AirTableResponse>sendPostMukono(@Body AttendanceRequest request);

    //Masajja


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Masajja?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMasajja();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Masajja")
    Call<AirTableResponse>sendPostMasajja(@Body AttendanceRequest request);

    //Masaka


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Masaka?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMasaka();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Masaka")
    Call<AirTableResponse>sendPostMasaka(@Body AttendanceRequest request);

    //Kyotera


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Kyotera?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersKyotera();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Kyotera")
    Call<AirTableResponse>sendPostKyotera(@Body AttendanceRequest request);

    //Kalangala


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Kalangala?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersKalangala();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Kalangala")
    Call<AirTableResponse>sendPostKalangala(@Body AttendanceRequest request);

    //Magale


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Magale?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMagale();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Magale")
    Call<AirTableResponse>sendPostMagale(@Body AttendanceRequest request);

    //Lira


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Lira?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersLira();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Lira")
    Call<AirTableResponse>sendPostLira(@Body AttendanceRequest request);

    // Tula


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Tua?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersTula();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Tula")
    Call<AirTableResponse>sendPosttula(@Body AttendanceRequest request);

    //Wobulenzi


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Wobulenzi?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersWobulenzi();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Wobulenzi")
    Call<AirTableResponse>sendPostWobulenzi(@Body AttendanceRequest request);

    //Mityana


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Mityana?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMityana();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Mityana")
    Call<AirTableResponse>sendPostMityana(@Body AttendanceRequest request);

    //Bwaise


    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Bwaise?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersBwaise();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Bwaise")
    Call<AirTableResponse>sendPostBwaise(@Body AttendanceRequest request);

    // Mpigi

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk"})
    @GET("Mpigi?maxRecords=3&view=Grid%20view")
    Call<AirTableResponse> getOrdersMpigi();

    @Headers({"Authorization: Bearer keyOaiiqwELqBdfJk","Content-Type: application/json"})
    @POST("Mpigi")
    Call<AirTableResponse>sendPostMpigi(@Body AttendanceRequest request);



}
