package com.mafunes.example.r8.api;

import com.mafunes.example.r8.dto.SomeObject;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SomeService {
    @GET("get")
    Call<SomeObject> get();
}
