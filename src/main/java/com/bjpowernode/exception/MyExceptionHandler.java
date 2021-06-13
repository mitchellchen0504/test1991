package com.bjpowernode.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof ArithmeticException){
            modelAndView.addObject("msg", e.getMessage());
            modelAndView.setViewName("arithmeticException");
        } else if(e instanceof IllegalArgumentException){
            modelAndView.addObject("msg", e.getMessage());
            modelAndView.setViewName("illegalArgumentException");
        }
        return modelAndView;
    }
}
