package com.uncledavecode.rest_versions.request_params;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @GetMapping(value = "/endpoint", params = "version=1")
    public String getV1() {
        return "Request Parameter Versioning - V1";
    }

    @GetMapping(value = "/endpoint", params = "version=2")
    public String getV2() {
        return "Request Parameter Versioning - V2";
    }
}
