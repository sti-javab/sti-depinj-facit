package sti.depinj.facit.unittest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.depinj.facit.service.FacitService;

public class TestService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-depinj-facit-service.xml");

    FacitService facitService = (FacitService) applicationContext.getBean("facitService");
    
}
