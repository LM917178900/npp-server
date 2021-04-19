package com.leinovo.npp.controller;

import com.leinovo.npp.model.Xxx;
import com.leinovo.npp.service.IXxxService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class XxxControler {

    @Resource
    private IXxxService xxxService;

    @PostMapping("/test/add")
    public String add(@RequestBody Xxx xxx){

        xxxService.addXxx(xxx);

        String xx = "this id is :" + xxx.getId();
        System.out.println(xxx);
        return xx;
    }
}
