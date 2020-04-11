package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Track {

    String id;
    String title;
    String singer;
    //Test variable generate getters and setters and add toString method
    String year;


    public Track() {
        this.id = RandomUtils.getId();
    }

    public Track(String title, String singer, String year) {
        this();
        this.setSinger(singer);
        this.setTitle(title);
        this.setYear(year);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    @Override
    public String toString() {
        return "Track [id="+id+", title=" + title + ", singer=" + singer +", year="+year+"]";
    }

}