package com.example.incorrect;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@JsonRestController("/notdetected")
public class IncorrectDetectedRestController {

  @GET("/getMappingAnnotationRequestParam")
  public String getMappingAnnotationRequestParam(@RequestParam(name = "name") String name) {
    return String.format("{ \"testdata\": \"%s\" }", name);
  }

  @GET("/getMappingAnnotationPathVariable/{name}/test")
  public String getMappingAnnotationPathVariable(@PathVariable(name = "name") String name) {
    return String.format("{ \"testdata\": \"%s\" }", name);
  }
}
