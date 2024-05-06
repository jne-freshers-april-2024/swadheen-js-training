package com.swadheenapi.springboot.reactapp.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningpersonController {

    @GetMapping("v1/person")
    public Personv1 getfirstversionofPerson(){
        return new Personv1("swadheen");
    }
    @GetMapping("v2/person")
    public Personv2 getsecondversionofPerson(){
        return new Personv2(new Name("sumita","sethy"));
    }
    @GetMapping(path = "/person",params = "version=1")
    public Personv1 getfirstversionofPersonrequestparameter(){
        return new Personv1("swadheen");
    }



}
