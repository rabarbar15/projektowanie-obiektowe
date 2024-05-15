package main

type WeatherData struct {
	Temperature float64 `json:"temperature"`
	Description string  `json:"description"`
}

var weatherDataList []WeatherData
