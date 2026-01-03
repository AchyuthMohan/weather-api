package com.weather.controllers;

import com.weather.api.WeatherApi;
import com.weather.model.CurrentWeatherResponse;
import com.weather.model.DailyForecastResponse;
import com.weather.model.HistoricalWeatherResponse;
import com.weather.model.WeatherAlertResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.time.LocalDate;
import java.util.Optional;

@RestController
public class WeatherController implements WeatherApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return WeatherApi.super.getRequest();
    }

    @Override
    public ResponseEntity<WeatherAlertResponse> weatherAlertsGet(Double lat, Double lon) {
        return WeatherApi.super.weatherAlertsGet(lat, lon);
    }

    @Override
    public ResponseEntity<CurrentWeatherResponse> weatherCurrentGet(Double lat, Double lon, String units) {
        return WeatherApi.super.weatherCurrentGet(lat, lon, units);
    }

    @Override
    public ResponseEntity<DailyForecastResponse> weatherForecastDailyGet(Double lat, Double lon, Integer days, String units) {
        return WeatherApi.super.weatherForecastDailyGet(lat, lon, days, units);
    }

    @Override
    public ResponseEntity<HistoricalWeatherResponse> weatherHistoricalGet(Double lat, Double lon, LocalDate startDate, LocalDate endDate, String units) {
        return WeatherApi.super.weatherHistoricalGet(lat, lon, startDate, endDate, units);
    }
}
