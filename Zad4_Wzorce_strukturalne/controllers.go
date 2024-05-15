package main

import (
	"net/http"

	"github.com/labstack/echo/v4"
)

func getWeather(c echo.Context) error {
	return c.JSON(http.StatusOK, weatherDataList)
}
