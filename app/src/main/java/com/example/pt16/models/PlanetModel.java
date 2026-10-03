package com.example.pt16.models;

import com.example.pt16.R;

import java.util.ArrayList;
import java.util.List;

public class PlanetModel {
    private String name;
    private int totalMoons;
    private int imgName;

    public PlanetModel(String name, int totalMoons, int imgName) {
        this.name = name;
        this.totalMoons = totalMoons;
        this.imgName = imgName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalMoons() {
        return totalMoons > 1 ? totalMoons + " moons" : totalMoons + " moon";
    }

    public void setTotalMoons(int totalMoons) {
        this.totalMoons = totalMoons;
    }

    public int getImgName() {
        return imgName;
    }

    public void setImgName(int imgName) {
        this.imgName = imgName;
    }

    public  static List<PlanetModel> generateData() {
        List<PlanetModel> planetsArrayList = new ArrayList<>();

        PlanetModel planet3 = new PlanetModel("Earth", 1, R.drawable.earth);
        PlanetModel planet1 = new PlanetModel("Mercury", 0, R.drawable.mercury);
        PlanetModel planet2 = new PlanetModel("Venus", 0, R.drawable.venus);

        PlanetModel planet4 = new PlanetModel("Mars", 2, R.drawable.mars);
        PlanetModel planet5 = new PlanetModel("Jupiter", 79, R.drawable.jupiter);
        PlanetModel planet6 = new PlanetModel("Saturn", 83, R.drawable.saturn);

        PlanetModel planet7 = new PlanetModel("Uranus", 27, R.drawable.uranus);
        PlanetModel planet8 = new PlanetModel("Neptune", 14, R.drawable.neptune);

        planetsArrayList.add(planet1);
        planetsArrayList.add(planet2);
        planetsArrayList.add(planet3);
        planetsArrayList.add(planet4);
        planetsArrayList.add(planet5);
        planetsArrayList.add(planet6);
        planetsArrayList.add(planet7);
        planetsArrayList.add(planet8);

        return planetsArrayList;
    }
}
