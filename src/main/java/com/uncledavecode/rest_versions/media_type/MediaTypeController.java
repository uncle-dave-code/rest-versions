package com.uncledavecode.rest_versions.media_type;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaTypeController {

    @GetMapping(value = "/mt/endpoint", produces = "application/vnd.uncledavecode.app-v1+json")
    public String getV1() {
        return "Media Type Versioning - V1";
    }

    @GetMapping(value = "/mt/endpoint", produces = "application/vnd.uncledavecode.app-v2+json")
    public String getV2() {
        return "Media Type Versioning - V2";
    }
}
