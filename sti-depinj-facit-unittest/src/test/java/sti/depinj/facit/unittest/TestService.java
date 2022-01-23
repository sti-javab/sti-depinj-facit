package sti.depinj.facit.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.depinj.facit.service.FacitService;

import java.util.List;

public class TestService {

    private static final String NASIR_TEDROS = "Nasir Tedros";

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-depinj-facit-service.xml");

    FacitService facitService = (FacitService) applicationContext.getBean("facitService");

    @Test
    public void testServiceDependencyInjection(){
        List<String> studentNames = facitService.getStudents();
        Assert.assertEquals(NASIR_TEDROS, studentNames.get(0));
    }
}
