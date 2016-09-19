package com.demo;

import com.jfinal.core.Controller;	

public class blogController extends Controller {
	
	public void index(){
		renderText("test!");
	}
}
