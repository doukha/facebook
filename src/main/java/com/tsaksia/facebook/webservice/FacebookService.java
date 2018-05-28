package com.tsaksia.facebook.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

/**
 * Created by samyboukhris on 19/05/2018.
 */
@RestController
@RequestMapping("/api")
public class FacebookService {


    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public Integer getBrutResponse() {
        return IntStream.range(1, 10).findFirst().getAsInt();
    }
}