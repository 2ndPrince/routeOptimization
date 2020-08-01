package me.ndPrince.routeOptimization;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MappingService {

//    @Value("${hereMaps.apiKey}")
    private String apiKey = "4KAQaOlqjIvZe8R2dLAX1m66XzE2WD4slRdOU3PSMGo";

    public void calculateMatrix(){
        RestTemplate restTemplate = new RestTemplate();
        String endpointURI = "https://matrix.route.ls.hereapi.com/routing/7.2/calculatematrix.json";
        String location1 = "start0=52.5139%2C13.3576&destination0=52.5139%2C13.3576";
        String location2 = "start1=52.5547%2C13.4578&destination1=52.5547%2C13.4578";
        String mode = "&mode=fastest%3Bcar";

        String query = endpointURI + "?" + location1 + "&" + location2 + "&apiKey=" + apiKey + mode;

        String result = restTemplate.getForObject(query, String.class);
        System.out.println(result);
    }
}
