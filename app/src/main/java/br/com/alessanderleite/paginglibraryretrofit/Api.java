package br.com.alessanderleite.paginglibraryretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//https://api.stackexchange.com/2.2/answers?page=1&pagesize=50&site=stackoverflow
public interface Api {

    @GET("answers")
    Call<StackApiResponse> getAnswers(
            @Query("page") int page,
            @Query("pagesize") int pagesize,
            @Query("site") String site
    );
}
