package utility;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;


public class CPMSApi {


    public static void callAPI() {

        HttpClient httpClient = HttpClientBuilder.create().build();


        try {
            HttpGet request = new HttpGet("https://oat.cpmsapi.crncc.nihr.ac.uk/api/v1/Study/DetailList");

            request.addHeader("username", "CPMS_API_EDGE_01@gmail.com");
            request.addHeader("password", "Passw0rd12");
            request.addHeader("Content-Type", "application/json");

            HttpResponse response = httpClient.execute(request);

        } catch (Exception e) {

        }
    }
}
