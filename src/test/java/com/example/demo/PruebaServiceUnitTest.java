package com.example.demo;

import com.example.demo.service.PruebaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaServiceUnitTest extends DemoApplicationTests{

    @Autowired
    PruebaService pruebaService;

    @Test
    public void sumaTest(){
        assertEquals(7.0,pruebaService.suma(2.0,5.0));
    }
}
