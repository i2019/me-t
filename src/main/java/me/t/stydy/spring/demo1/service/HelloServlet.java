package me.t.stydy.spring.demo1.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.t.stydy.spring.demo1.Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
//http://localhost:8484/me-t/HelloServlet
@WebServlet(name="HelloServlet",urlPatterns={"/hello"})
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 2801654413247618244L;
    private Hello hello;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //方法1,使用传统方式去加载beans.xml,每次请求时加载
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        
        //方法2,使用监听器的方式加载beans.xml,在一启动的时候就加载监听器,避免多次加载,提高效率
        //ApplicationContext applicationContext  = (ApplicationContext) this.getServletContext().getAttribute("SpringApplicationContext");
        
        //方法3,使用spring自带的监听器去加载beans.xml
        //ApplicationContext applicationContext  = (ApplicationContext) this.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        //使用webapplicationcontextutils这个工具类可以很方便的获取ApplicationContext,只需要传入servletContext
        ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        
        hello = applicationContext.getBean(Hello.class);
        String sayHi = hello.sayHi();
        System.err.println("sayHi:" + sayHi);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("<h2>" + sayHi + "</h2>");
    }
}