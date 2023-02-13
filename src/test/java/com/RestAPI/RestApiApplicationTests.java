package com.RestAPI;

import static org.junit.Assert.assertNotNull;

import java.io.ObjectInputStream.GetField;

import javax.servlet.ServletContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import com.RestAPI.Controller.StudentController;
import com.RestAPI.Model.Student;
import com.RestAPI.Service.StudentService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest

class RestApiApplicationTests {

	@Autowired
	
    private MockMvc mockMvc;
	@InjectMocks
    private StudentService service;

    @Mock
    private StudentController controller;
    
    @Mock
    ServletContext servletContext;

    @Test
	public void contextLoads() {
	}

    @Test
    public void firstTestCase() throws Exception {
    	
    	Student s=new Student(1, "shubham", "sakhare","clg", "address");
   // Student student	=service.getData(1);
    
    
    MockHttpServletRequest request = ((RequestBuilder) s).buildRequest(servletContext);
    assertNotNull(request);
	
   // RequestBuilder request = ("/example/1");
    
    //RequestBuilder request = ("/example/1");
 //mockMvc.perform(request);
    	
    }

    
    @Test
	public void testEmployee() throws Exception {
//		mockMvc.perform(get("/employee")).andExpect(status().isOk())
//				.andExpect(content().contentType("application/json;charset=UTF-8"))
//				.andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))
//				.andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));
//
//		     
    	
    	
	}
    
    


	
}
