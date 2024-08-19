package com.firstapp.demo;
import org.springframework.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController

public class controller {
  @RequestMapping("m")
  public String myMethod(){
    return "<h1>Coding Wallah sir</h1>";
  }
  @GetMapping("/get")
  public String doGet(){
    return "Hello G, I am you get mapping";
  }
  @PostMapping("/post")
  public String doPost(){
    return "Hello G, I am your post mapping";
  }
  @PutMapping("/put")
  public String doPut(){
    return "Hello G, I am your put mapping ";
  }
  @DeleteMapping("/del")
  public String doDel(){
    return "Hello G, I am your delete mapping ";
  }
  @GetMapping("process-form")
  public static String getData(@RequestParam int num1, @RequestParam int num2){
    return num1+num2 + "";
  }

} 
