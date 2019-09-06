package com.serving.demo.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

//    @RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
//    @ResponseBody
//    public String getFoosBySimplePath(){
//        return "Get some Foos";
//    }
//
//    @RequestMapping(value = "/ex/foos", method = POST)
//    @ResponseBody
//    public String postFoosBySimplePath(){
//        return "Get some Foos";
//    }

    @RequestMapping(value = "/ex/foos", headers = "key=val", method = GET)
    @ResponseBody
    public String getFoosWithHeader() {
        return "Get some Foos with Header";
    }

    @RequestMapping(
            value = "/ex/foos",
            headers = {"key1=val1", "key2=val2"}, method = GET)
    @ResponseBody
    public String getFoosWithHeaders() {
        return "Get some Foos with Header";
    }

    @RequestMapping(
            value = "/ex/foos",
            method = GET,
            headers = "Accept=application/json")
    @ResponseBody
    public String getFoosAsJsonFromBrowser() {
        return "Get some Foos with Header Old";
    }
//
//    @RequestMapping(value = "/ex/foos/{id}", method = GET)
//    @ResponseBody
//    public String getFoosBySimplePathWithPathVariable(
//            @PathVariable("id") long id) {
//        return "Get a specific Foo with id=" + id;
//    }

//    @RequestMapping(value = "/ex/foos/{id}", method = GET)
//    @ResponseBody
//    public String getFoosBySimplePathWithPathVariable(
//            @PathVariable String id) {
//        return "Get a specific Foo with id=" + id;
//    }

    @RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariables
            (@PathVariable long fooid, @PathVariable long barid) {
        return "Get a specific Bar with id=" + barid +
                " from a Foo with id=" + fooid;
    }

    @RequestMapping(value = "/ex/bars/{numericId:[\\d]+}", method = GET)
    @ResponseBody
    public String getBarsBySimplePathWithPathVariable(
            @PathVariable long numericId) {
        return "Get a specific Bar with id=" + numericId;
    }

//    @RequestMapping(value = "/ex/bars", method = GET)
//    @ResponseBody
//    public String getBarBySimplePathWithRequestParam(
//            @RequestParam("id") long id) {
//        return "Get a specific Bar with id=" + id;
//    }

//    @RequestMapping(value = "/ex/bars", params = "id", method = GET)
//    @ResponseBody
//    public String getBarBySimplePathWithExplicitRequestParam(
//            @RequestParam("id") long id) {
//        return "Get a specific Bar with id=" + id;
//    }

    @RequestMapping(
            value = "/ex/bars",
            params = {"id", "second"},
            method = GET)
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParams(
            @RequestParam("id") long id) {
        return "Narrow Get a specific Bar with id=" + id;
    }

    @RequestMapping(
            value = {"/ex/advanced/bars", "/ex/advanced/foos"},
            method = GET)
    @ResponseBody
    public String getFoosOrBarsByPath() {
        return "Advanced - Get some Foos or Bars";
    }

//    @RequestMapping(
//            value = "/ex/foos/multipl",
//            method = {RequestMethod.PUT, RequestMethod.POST}
//    )
//    @ResponseBody
//    public String putAndPostFoos() {
//        return "Advanced - PUT and POST within single method";
//    }

//    @RequestMapping(value = "*", method = RequestMethod.GET)
//    @ResponseBody
//    public String getFallback() {
//        return "Fallback for GET Requests";
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<?> getBazz(@PathVariable String id){
//        return new ResponseEntity<>(new Bazz(id, "Bazz"+id), HttpStatus.OK);
//    }
//

    private class Bazz {
        public Bazz(String id, String s) {
        }
    }

    @PostMapping
    public ResponseEntity<?> newBazz(@RequestParam("name") String name) {
        return new ResponseEntity<>(new Bazz("5", name), HttpStatus.OK);
    }

    @GetMapping("/get")
    public @ResponseBody
    ResponseEntity<String> get() {
        return new ResponseEntity<String>("GET Response", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public @ResponseBody
    ResponseEntity<String>
    getById(@PathVariable String id) {
        return new ResponseEntity<String>("GET Response : "
                + id, HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody
    ResponseEntity<String> post() {
        return new ResponseEntity<String>("POST Response", HttpStatus.OK);
    }

//    @PutMapping("/put")
//    public @ResponseBody ResponseEntity<String> put() {
//    return new ResponseEntity<String>("PUT Response", HttpStatus.OK);
//    }

    @DeleteMapping("/delete")
    public @ResponseBody ResponseEntity<String> delete() {
        return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
    }

    @PatchMapping("/patch")
    public @ResponseBody ResponseEntity<String> patch() {
        return new ResponseEntity<String>("PATCH Response", HttpStatus.OK);
    }


//
//    @GetMapping("/customHeader")
//    ResponseEntity<String> customHeader() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Custom-Header", "foo");
//
//        return new ResponseEntity<>(
//                "Custom header set", headers, HttpStatus.OK);
//    }

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/customHeader")
    ResponseEntity<String> customHeader() {
        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Custom header set");
    }

}

