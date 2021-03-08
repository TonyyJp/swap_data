package com.example.swap_data.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "图表")
@RestController
@RequestMapping("/api")
public class ChartController {

    @ApiOperation(value = "历史订单量", notes = "")
    @GetMapping(value="/historyOrderTotal")
    public int historyOrderTotal()
    {
        return 100;
    }
}
