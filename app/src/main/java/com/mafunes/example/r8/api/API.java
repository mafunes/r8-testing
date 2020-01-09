package com.mafunes.example.r8.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    private static API instance;

    private API() {

    }

    public static synchronized API getInstance() {
        if (instance == null) {
            instance = new API();
        }
        return instance;
    }

    public SomeService getService() {
        final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://private-e7ce66-r8testing.apiary-mock.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        return retrofit.create(SomeService.class);
    }
}
