package com.interstellar.controller;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.interstellar.buisness.DistanceCalculator;
import com.interstellar.domain.CalculateForm;
import com.interstellar.domain.Planet;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/distance")
public class CalculateDistance {

	@Autowired
	DistanceCalculator distanceCalculator;
	
	LinkedList<Planet> minDistance = null;
                
        @RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE })
        public LinkedList<Planet> shortestDistance(@RequestBody CalculateForm calculateForm){
            minDistance = distanceCalculator.distanceCalculate(calculateForm.getPlanetOrigin(),
				calculateForm.getPlanetDestination());
            return minDistance;
        }
        
        
}

