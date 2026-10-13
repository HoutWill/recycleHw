package com.example.pt16.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pt16.R;
import com.example.pt16.models.MovieModel;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<MovieModel> data;

    public MovieAdapter(List<MovieModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.setData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgMovie;
        private TextView tvRating;
        private TextView tvBadge;
        private TextView tvTitle;
        private TextView tvYear;
        private TextView tvDuration;
        private TextView tvAgeRating;
        private TextView tvGenreType;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMovie = itemView.findViewById(R.id.imgMovie);
            tvRating = itemView.findViewById(R.id.tvRating);
            tvBadge = itemView.findViewById(R.id.tvBadge);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvYear = itemView.findViewById(R.id.tvYear);
            tvDuration = itemView.findViewById(R.id.tvDuration);
            tvAgeRating = itemView.findViewById(R.id.tvAgeRating);
            tvGenreType = itemView.findViewById(R.id.tvGenreType);
        }

        public void setData(MovieModel item) {
            Context context = itemView.getContext();
            imgMovie.setImageResource(item.getImgResId());
            tvRating.setText(item.getRating());
            tvBadge.setText(item.getBadge());

            if ("Free".equalsIgnoreCase(item.getBadge())) {
                tvBadge.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_badge_free));
            } else {
                tvBadge.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_badge_premium));
            }

            tvTitle.setText(item.getTitle());
            tvYear.setText(item.getYear());
            tvDuration.setText(item.getDuration());
            tvAgeRating.setText(item.getAgeRating());
            tvGenreType.setText(item.getGenre() + " | " + item.getMediaType());
        }
    }
}
