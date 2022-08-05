package co.develhope.Deploy2.controllers;


import co.develhope.Deploy2.services.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */

@RestController
public class SumController {

    @Autowired
    SumService sumService;

    @GetMapping
    public int getSum(){
        return sumService.sum();
    }
}
