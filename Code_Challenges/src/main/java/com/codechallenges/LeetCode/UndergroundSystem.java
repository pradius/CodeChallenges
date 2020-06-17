package com.codechallenges.LeetCode;

import java.text.DecimalFormat;
import java.util.*;

public class UndergroundSystem {

    HashMap<Integer, String[]> checkIns; // Integer for ID, String[0] = Station Name, String[1] = time
    List<Checkouts> checkouts;
    public UndergroundSystem() {
        checkIns = new HashMap<Integer, String[]>();
        checkouts = new ArrayList<>();
    }

    public void checkIn(int id, String stationName, int t) {
        String[] checkIn = new String[2];
        checkIn[0] = stationName;
        checkIn[1] = Integer.toString(t);
        checkIns.put(id, checkIn);
    }

    public void checkOut(int id, String stationName, int t) {
        checkouts.add(new Checkouts(checkIns.get(id)[0], stationName,Integer.parseInt(checkIns.get(id)[1]) , t));
        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        DecimalFormat df = new DecimalFormat("###.#####");
        double avg = 0.0;
        int trips = 0;
        for(Checkouts c : checkouts){
            if(c.getStartStation().equals(startStation) && c.getEndStation().equals(endStation)){
                avg +=  c.getAvgTime();
                trips++;
            }
        }
        return Double.parseDouble(df.format(avg/trips));
    }

    public List<String> getAllCheckIns() {
        List<String> output = new ArrayList<>();

        for (Map.Entry info : checkIns.entrySet()) {
            String[] arr = (String[]) info.getValue();
            output.add(info.getKey() + ": Station: " + arr[0] + " Time: " + arr[1]);
        }
        return output;
    }

    private class Checkouts{
        String startStation;
        String endStation;
        int timeIn;
        int timeOut;

        public Checkouts(String startStation, String endStation, int timeIn, int timeOut){
            this.startStation = startStation;
            this.endStation = endStation;
            this.timeIn = timeIn;
            this.timeOut = timeOut;
        }

        public double getAvgTime(){
            return timeOut - timeIn;
        }

        public String getStartStation(){
            return startStation;
        }
        public String getEndStation(){
            return endStation;
        }
    }
}



/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */