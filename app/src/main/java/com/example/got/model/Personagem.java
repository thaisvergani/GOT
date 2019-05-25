package com.example.got.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Personagem {

    @SerializedName("url")
    private String url;
    @SerializedName("name")
    private String name;
    @SerializedName("gender")
    private String gender;
    @SerializedName("culture")
    private String culture;
    @SerializedName("born")
    private String born;
    @SerializedName("died")
    private String died;
    @SerializedName("titles")
    private List<String> titles = null;
    @SerializedName("aliases")
    private List<String> aliases = null;
    @SerializedName("father")
    private String father;
    @SerializedName("mother")
    private String mother;
    @SerializedName("spouse")
    private String spouse;
    @SerializedName("allegiances")
    private List<Object> allegiances = null;
    @SerializedName("books")
    private List<String> books = null;
    @SerializedName("povBooks")
    private List<Object> povBooks = null;
    @SerializedName("tvSeries")
    private List<String> tvSeries = null;
    @SerializedName("playedBy")
    private List<String> playedBy = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Personagem() {
    }

    /**
     *
     * @param books
     * @param born
     * @param aliases
     * @param url
     * @param father
     * @param mother
     * @param died
     * @param spouse
     * @param tvSeries
     * @param name
     * @param allegiances
     * @param povBooks
     * @param playedBy
     * @param gender
     * @param titles
     * @param culture
     */
    public Personagem(String url, String name, String gender, String culture, String born, String died, List<String> titles, List<String> aliases, String father, String mother, String spouse, List<Object> allegiances, List<String> books, List<Object> povBooks, List<String> tvSeries, List<String> playedBy) {
        super();
        this.url = url;
        this.name = name;
        this.gender = gender;
        this.culture = culture;
        this.born = born;
        this.died = died;
        this.titles = titles;
        this.aliases = aliases;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.allegiances = allegiances;
        this.books = books;
        this.povBooks = povBooks;
        this.tvSeries = tvSeries;
        this.playedBy = playedBy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public List<Object> getAllegiances() {
        return allegiances;
    }

    public void setAllegiances(List<Object> allegiances) {
        this.allegiances = allegiances;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public List<Object> getPovBooks() {
        return povBooks;
    }

    public void setPovBooks(List<Object> povBooks) {
        this.povBooks = povBooks;
    }

    public List<String> getTvSeries() {
        return tvSeries;
    }

    public void setTvSeries(List<String> tvSeries) {
        this.tvSeries = tvSeries;
    }

    public List<String> getPlayedBy() {
        return playedBy;
    }

    public void setPlayedBy(List<String> playedBy) {
        this.playedBy = playedBy;
    }

}
