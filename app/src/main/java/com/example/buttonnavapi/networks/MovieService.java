package com.example.buttonnavapi.networks;

import com.example.buttonnavapi.models.movie.MovieDetail;
import com.example.buttonnavapi.models.movie.NowPlayingResult;
import com.example.buttonnavapi.models.tv.TvResult;
import com.example.buttonnavapi.models.tv.TvShowDetail;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MovieService {
    @GET("movie/now_playing")
    Call<NowPlayingResult> nowPlayingMovies(@QueryMap Map<String, String> options);

    @GET("movie/{movie_id}")
    Call<MovieDetail> movieDetail(@Path("movie_id") int movieId, @QueryMap Map<String, String> options);

    @GET("tv/airing_today")
    Call<TvResult> tvAiringToday(@QueryMap Map<String, String> options);

    @GET("tv/{tv_id}")
    Call<TvShowDetail> tvDetail(@Path ("tv_id") int movieId, @QueryMap Map<String, String> options);
}
