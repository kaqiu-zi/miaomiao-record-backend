package org.miaomiao.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * iindex controller
 *
 * @author Kaqiuzi
 * @version 1.0, 2023/9/16
 * @since 1.0.0
 */
@RestController
@RequiredArgsConstructor
public class IndexController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/")
    public String hi() {
        return "hello world";
    }
}
