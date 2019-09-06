package com.greenfox.turists.models;

import javax.persistence.*;

@Entity
@Table(name = "attractions")
public class Attraction {

    @Id
    @GeneratedValue

    private long id;
    @Column(name = "attr_name")
    String name;
    String city;
    int price;
    double longitude;
    double latitude;
    String category;
    int duration;
    @Column(name = "recommended_age")
    int recommendedAge;


    public Attraction() {
    }

    public Attraction(String name, String city, int price, double longitude, double latitude, String category, int duration, int recommendedAge) {
        this.name = name;
        this.city = city;
        this.price = price;
        this.longitude = longitude;
        this.latitude = latitude;
        this.category = category;
        this.duration = duration;
        this.recommendedAge = recommendedAge;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }
}
