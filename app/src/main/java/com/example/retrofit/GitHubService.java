package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Anand on 14/10/2016.
 */

public interface GitHubService {
    @GET("users/{user}")
    Call<User> getUser(@Path("user") String user);
}
