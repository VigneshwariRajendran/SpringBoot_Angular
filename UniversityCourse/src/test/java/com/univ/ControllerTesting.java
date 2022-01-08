package com.univ;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.univ.controller.StaffController;
import com.univ.entity.Staff;
import com.univ.repository.StaffRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(StaffController.class)
public class ControllerTesting {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StaffRepository srepo;
	
//	@Test
//	public void listAllStaff_whenGetMethod() {
//		Staff staff= new Staff();
//		staff.setCourse("CSE");
//		staff.setId(808L);
//		staff.setStaffname("Bhavi");
//		List<Staff> allStaff = Arrays.asList(staff);
//		given(srepo.findAll()).willReturn(allStaff);
//	}

	

	
	
}
//@Test
//public void listAllUsers_whenGetMethod()
//throws Exception {
//User user = new User();
//user.setName(“Test name”);
//List<User> allUsers = Arrays.asList(user);
//given(listUserService
//.listAllUsers())
//.willReturn(allUsers);
//mvc.perform(get(“/users”)
//.contentType(MediaType.APPLICATION_JSON))
//.andExpect(status().isOk())
//.andExpect(jsonPath(“$”, hasSize(1)))
//.andExpect(jsonPath(“$[0].name”, is(user.getName())));
//}
//}