package com.coda.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName HelloWorldController
 * @Description TODO
 * @Author wen578351314@gmail.com
 * @Date 2020-09-23 20:36
 * @Version 1.0
 **/
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
	}
}
