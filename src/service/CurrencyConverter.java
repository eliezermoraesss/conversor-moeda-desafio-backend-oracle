package service;

import com.google.gson.Gson;
import dto.ExchangeRateResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private static final String API_KEY = "aeb89aa608d956647133b209";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public double fetchConvertionRate(String from, String to) {
        String url = BASE_URL + from +  "/" + to;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ExchangeRateResponse rateResponse = gson.fromJson(response.body(), ExchangeRateResponse.class);
            if (!"success".equals(rateResponse.result())) {
                throw new RuntimeException("Erro ao buscar taxa de câmbio.");
            }
            return rateResponse.conversion_rate();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro na requisição: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Erro inesperado ao buscar taxa de câmbio.", e);
        }
    }

    public double convert(String from, String to, double amount) {
        double rate = fetchConvertionRate(from, to);
        return amount * rate;
    }
}
