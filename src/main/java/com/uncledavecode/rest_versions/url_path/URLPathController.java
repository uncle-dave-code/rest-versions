package com.uncledavecode.rest_versions.url_path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLPathController {

    @GetMapping("/v1/endpoint")
    public String getV1() {
        return "URL Path Versioning - V1";
    }

    @GetMapping("/v2/endpoint")
    public String getV2() {
        return "URL Path Versioning - V2";
    }
}
