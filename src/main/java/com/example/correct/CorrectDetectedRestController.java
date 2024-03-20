package com.example.correct;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    value = "/detected",
    produces = {APPLICATION_JSON_VALUE})
public class CorrectDetectedRestController {

  @RequestMapping(method = RequestMethod.GET, path = "/getMappingAnnotationRequestParam")
  public String getMappingAnnotationRequestParam(@RequestParam(name = "name") String name) {
    return String.format("{ \"testdata\": \"%s\" }", name);
  }

  @RequestMapping(
      method = RequestMethod.GET,
      path = "/getMappingAnnotationPathVariable/{name}/test")
  public String getMappingAnnotationPathVariable(@PathVariable(name = "name") String name) {
    return String.format("{ \"testdata\": \"%s\" }", name);
  }
}
