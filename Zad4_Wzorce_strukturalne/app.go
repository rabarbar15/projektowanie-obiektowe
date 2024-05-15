package main

import (
	"github.com/labstack/echo/v4"
)

func main() {
	e := echo.New()

	var chicagoWeather = WeatherData{
		Temperature: 25.5,
		Description: "Słoneczna pogoda",
	}

	weatherDataList = append(weatherDataList, chicagoWeather)

	e.GET("/weather", getWeather)

	e.Logger.Fatal(e.Start(":1323"))
}
