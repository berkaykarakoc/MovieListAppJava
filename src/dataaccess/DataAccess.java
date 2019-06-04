package dataaccess;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import business.MovieList;

public class DataAccess {

    public DataAccess() {

    }

    public MovieList retrieveMovieListFromLocal() {
        Gson gson = new Gson();
        MovieList movieList = new MovieList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("json/MovieList.json"));

            movieList = gson.fromJson(br, MovieList.class);

        } catch(IOException e) {
            e.printStackTrace();
        }
        return movieList;
    }

    public void storeMovieListOnLocal(MovieList list) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String json = gson.toJson(list);

        try {
            FileWriter writer = new FileWriter("json/MovieList.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
