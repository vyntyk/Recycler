package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager layoutManager;
    PostsAdapter postsAdapter;
    List < Get > postsList = new ArrayList <>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        postsAdapter = new PostsAdapter(postsList);
        recyclerView.setAdapter(postsAdapter);

        fetchGet();
    }

    private void fetchGet() {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getGet().enqueue(new Callback < List < Get > >() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call < List < Get > > call, Response < List < Get > > response) {
                if (response.isSuccessful() && response.body() != null) {
                    postsList.addAll(response.body());
                    postsAdapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call < List < Get > > call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}