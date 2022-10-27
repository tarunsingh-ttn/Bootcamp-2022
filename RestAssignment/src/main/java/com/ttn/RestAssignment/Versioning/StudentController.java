package com.ttn.RestAssignment.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/studentv1")
    public StudentV1 studentV1(){
        return new StudentV1("ayush",6574);
    }
    @GetMapping("/studentv2")
    public StudentV2 studentV2(){
        return new StudentV2("ayush",6574,"baghpath","F");
    }


    @GetMapping(value = "/studentv1/param",params = "v1")
    public StudentV1 studentV1Requestparam(){
        return new StudentV1("ayush",6574);
    }
    @GetMapping(value = "/studentv2/param",params = "v2")
    public StudentV2 studentV2Requestparam(){
        return new StudentV2("ayush",6574,"baghpath","F");
    }

    @GetMapping(value = "/studentv1/header",headers = "X-API-VERSION=1")
    public StudentV1 studentV1HeaderVersioning(){
        return new StudentV1("ayush",6574);
    }
    @GetMapping(value = "/studentv2/header",headers = "X-API-VERSION=2")
    public StudentV2 studentV2HeaderVersioning(){
        return new StudentV2("ayush",6574,"baghpath","F");
    }
    @GetMapping(value = "/studentv1/acceptHeader",headers = "X-API-VERSION=1")
    public StudentV1 studentV1AcceptHeaderVersioning(){
        return new StudentV1("ayush",6574);
    }
    @GetMapping(value = "/studentv2/acceptHeader",headers = "X-API-VERSION=2")
    public StudentV2 studentV2AcceptHeaderVersioning(){
        return new StudentV2("ayush",6574,"baghpath","F");
    }
}
