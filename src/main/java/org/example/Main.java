package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);

//        MyBean2 myBean2=context.getBean(MyBean2.class);
//        mybean.hi();
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("ioc-settings.xml");
        MyBean mybean = contex.getBean(MyBean.class);
        Person person = contex.getBean(Person.class);
        System.out.println(person );
        mybean.hi();
        contex.close();

    }
}