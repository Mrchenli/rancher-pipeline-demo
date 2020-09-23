package com.coda.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author wen578351314@gmail.com
 * @Date 2020-09-23 15:51
 * @Version 1.0
 **/
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "Hello World" + new Date();
	}
}
