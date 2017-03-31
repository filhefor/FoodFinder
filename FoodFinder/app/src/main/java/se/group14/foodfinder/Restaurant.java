package se.group14.foodfinder;

/**
 * Created by filipheidfors on 2017-03-31.
 */

public class Restaurant {
    private String name;
    private String address;
    private String phone;
    private double rating;
    private double latitude;
    private double longitude;
    private String website;
    private int price;
    private String category;
    private String hours;

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getRating() {
        return rating;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getWebsite() {
        return website;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getHours() {
        return hours;
    }

    public String getName() {
        return name;

    }

    public Restaurant(String name, String address, String phone, double rating, double latitude, double longitude, String website, int price, String category, String hours) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rating = rating;
        this.latitude = latitude;
        this.longitude = longitude;
        this.website = website;
        this.price = price;
        this.category = category;
        this.hours = hours;

    }
}