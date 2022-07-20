package io.covprov.CoronavirusTracker.models;

public class LocationStats {

    private String state;
    private int difffromprevday;

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    private String country;
    private int latestTotalCases;


    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }


    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }

    public int getDifffromprevday() {
        return difffromprevday;
    }

    public void setDifffromprevday(int difffromprevday) {
        this.difffromprevday = difffromprevday;
    }
}
