/**
 * 
 */
package com.temperature.temperatureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ftchoumo
 *
 */
@RestController
public class temperatureController {

    @GetMapping("/temperature")
	public String temperaturevalue() {
    	
		return "my temperature";

	}

}
