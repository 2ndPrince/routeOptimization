package me.ndPrince.routeOptimization;

public class EndToEndTestUtil {

    public static String normalRequest(){
        return "{\n" +
                "    \"id\": \"1\",\n" +
                "    \"rides\": [\n" +
                "        {\n" +
                "            \"rideId\": \"1\",\n" +
                "            \"pickup\": {\n" +
                "                \"latitude\": -9.9,\n" +
                "                \"longitude\": 0.2\n" +
                "            },\n" +
                "            \"dropOff\": {\n" +
                "                \"latitude\": 0.1,\n" +
                "                \"longitude\": 35.5\n" +
                "            },\n" +
                "            \"capacity\": 5\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
