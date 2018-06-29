package com.github.davidji80.springcloud.sleuthtrace1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Trace1Controller {

    private static Logger logger = LoggerFactory.getLogger(Trace1Controller.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        logger.info("===call trace-1===");
        return restTemplate.getForEntity("http://TRACE-2/trace-2", String.class).getBody();

    }
}
