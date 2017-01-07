package com.app.popularmovies.util;

/**
 * Created by Hitesh on 26-Dec-15.
 */
public interface Constants {

    public String REQUEST_BASE_URL_Popular = "https://api.themoviedb.org/3/movie/popular";
    public String REQUEST_BASE_URL_Rated = "https://api.themoviedb.org/3/movie/top_rated";
    public String TRAILER_REVIEWS_BASE_URL = "http://api.themoviedb.org/3/movie";
    public String YOU_TUBE_IMAGE_BASE_URL = "http://i3.ytimg.com/vi/";
    public String YOU_TUBE_BASE_URL = "http://www.youtube.com/watch?v=";
    public String API_KEY = "5e796a75143fae639f7eb2716670fc0e";

    public String IMAGE_PATH_BASE_URL = "http://image.tmdb.org/t/p/w185/";
    public String BACKDROP_IMAGE_PATH_BASE_URL = "http://image.tmdb.org/t/p/w342/";
    public int MOST_POPULAR_REQUEST = 1;
    public int TOP_RATED_REQUEST = 2;
    public int VIDEO_TRAILER_REQUEST = 3;
    public int MOVIE_REVIEWS_REQUEST = 4;

    public String FRAGMENT_TYPE_FAVORITE = "FAVORITE";



//    public String REQUEST_TYPE = "POPULAR MOVIE";
//    public String PAGE_NUMBER = "PAGE_NUMBER";

}
