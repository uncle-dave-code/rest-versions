package com.uncledavecode.rest_versions.request_header;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeaderController {

    @GetMapping(value = "/endpoint", headers = "X-API-VERSION=1")
    public String getV1() {
        return "Request Header Versioning - V1";
    }

    @GetMapping(value = "/endpoint", headers = "X-API-VERSION=2")
    public String getV2() {
        return "Request Header Versioning - V2";
    }
}
