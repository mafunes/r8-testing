package com.mafunes.example.r8;

import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.mafunes.example.r8.api.API;
import com.mafunes.example.r8.dto.SomeObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final Call<SomeObject> getCall = API.getInstance().getService().get();
                getCall.enqueue(new Callback<SomeObject>() {
                    @Override
                    public void onResponse(@NonNull final Call<SomeObject> call,
                        @NonNull final Response<SomeObject> response) {
                        Toast.makeText(MainActivity.this,
                            "it is working fine:" + response.body().getOtherObject().getValue(),
                            Toast.LENGTH_LONG)
                            .show();
                    }

                    @Override
                    public void onFailure(@NonNull final Call<SomeObject> call,
                        @NonNull final Throwable t) {
                    }
                });
            }
        };
        findViewById(R.id.my_button).setOnClickListener(listener);
    }
}
