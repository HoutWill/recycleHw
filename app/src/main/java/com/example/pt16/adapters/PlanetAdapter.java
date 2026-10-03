package com.example.pt16.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pt16.R;
import com.example.pt16.models.PlanetModel;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    private List<PlanetModel> data;

    public PlanetAdapter(List<PlanetModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_planet, parent, false);

        return new PlanetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        holder.setData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class PlanetViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgView;
        private TextView tvTitle;
        private TextView tvTotalMoons;

        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imgPlanet);
            tvTitle = itemView.findViewById(R.id.title);
            tvTotalMoons = itemView.findViewById(R.id.totalMoon);
        }

        public void setData(PlanetModel item) {
            imgView.setImageResource(item.getImgName());
            tvTitle.setText(item.getName());
            tvTotalMoons.setText(item.getTotalMoons());
        }
    }
}
