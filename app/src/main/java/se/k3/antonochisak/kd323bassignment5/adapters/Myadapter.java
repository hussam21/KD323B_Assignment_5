package se.k3.antonochisak.kd323bassignment5.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import se.k3.antonochisak.kd323bassignment5.models.movie.Movie;

/**
 * Created by Hussam on 4/28/2015.
 */
public class Myadapter extends BaseAdapter {

    ArrayList<Movie> mMovies;
    LayoutInflater mLayoutInflater;
    private int mItemWidth, mItemHeight, mMargin;

    public Myadapter(ArrayList<Movie> mMovies, LayoutInflater mLayoutInflater) {
        this.mMovies = mMovies;
        this.mLayoutInflater = mLayoutInflater;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
