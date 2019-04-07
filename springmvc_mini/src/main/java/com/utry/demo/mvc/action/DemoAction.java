package com.utry.demo.mvc.action;

import com.utry.demo.service.IDemoService;
import com.utry.mvcframework.annotation.UTAutowired;
import com.utry.mvcframework.annotation.UTController;
import com.utry.mvcframework.annotation.UTRequestMapping;
import com.utry.mvcframework.annotation.UTRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//虽然，用法一样，但是没有功能
@UTController
@UTRequestMapping("/demo")
public class DemoAction {

  	@UTAutowired
	private IDemoService demoService;

	@UTRequestMapping("/query.*")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @UTRequestParam("name") String name){
//		String result = demoService.get(name);
		String result = "My name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@UTRequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@UTRequestParam("a") Integer a, @UTRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@UTRequestMapping("/sub")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@UTRequestParam("a") Double a, @UTRequestParam("b") Double b){
		try {
			resp.getWriter().write(a + "-" + b + "=" + (a - b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@UTRequestMapping("/remove")
	public String  remove(@UTRequestParam("id") Integer id){
		return "" + id;
	}

}
