/**
 * 
 */
package com.temperature.temperatureapp.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ftchoumo
 *
 */
@Controller
public class temperatureController {

    @GetMapping("/temperature")
	public String convertingCelsiusValue( Model model) {
    	
		return "temperature";

	}
	/*
	 * @GetMapping("/kelvinTemperature") public String
	 * convertingKelvinValue(@PathParam("k") double k,Model model) {
	 * 
	 * return "my temperature";
	 * 
	 * }
	 * 
	 * @GetMapping("/fahrenheitTemperature") public String
	 * ConvertingfahrenheitValue(@PathParam("f") double f, Model model) {
	 * 
	 * return "my temperature";
	 * 
	 * }
	 * 
	 * @GetMapping("/rankineTemperature") public String
	 * convertingRankineValue(@PathParam("r") double r,Model model) {
	 * 
	 * return "my temperature";
	 * 
	 * }
	 */

}
