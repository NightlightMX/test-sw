/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circulo.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 *
 * @author jpadilla
 */
@RestController
@Api(value = "DemoSwagger", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/demo")
public class Swagger {
     
    @RequestMapping(method = GET)
    @ApiOperation("Ejecuta un Hola mundo :3")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK XD", response = Swagger.class)})
    public String list() {
        return "Hola mundo swagger";
    }
    
    @RequestMapping(value = "/{id}", method = GET)
    @ApiOperation("Test de metodo GET con parametro")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = Swagger.class)})
    public String get(@PathVariable String id) {
        if ("1".equals(id)) {
            return "Llego un uno";
        } else {
            return "No me llego un uno";
        }
    }
    
    @RequestMapping(value = "/{id}", method = PUT)
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @RequestMapping(value = "/{id}", method = POST)
    public ResponseEntity<?> post(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @RequestMapping(value = "/{id}", method = DELETE)
    public ResponseEntity<Object> delete(@PathVariable String id) {
        return null;
    }
    
}
