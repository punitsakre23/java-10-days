package com.java.features;

public class Switch {

    public static void main(String[] args) {

        String day = "Wed";

        String time = "";

//        Enhanced Switch
        time = switch (day) {
            case "Sat", "Sun" : yield  "11 am";

            case "Wed" : yield  "10am";

            default : yield  "6am";
        };
        System.out.println(time);

//        Enhanced Switch
        /*
        time = switch (day) {
            case "Sat", "Sun" -> "11 am";

            case "Wed" -> "10am";

            default -> "6am";
        };
        System.out.println(time);
        */

//        Enhanced switch
        /*
        switch (day) {
            case "Sat", "Sun" -> time = "11 am";

            case "Wed" -> time = "10am";

            default -> time = "6am";
        }
        System.out.println(time);
        */

//        Normal Switch
        /*
        switch (day) {

            case "Sat", "Sun":
                time = "11 am";
                break;

            case "Wed":
                time = "10am";
                break;

            default:
                time = "6am";
        }
        System.out.println(time);
        */
    }
}
