package com.univ;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.*;
import static org.mockito.BDDMockito.*;
import com.univ.entity.Staff;
import com.univ.repository.StaffRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class UniversityCourseApplicationTests {
	
	@MockBean
	StaffRepository srepo;
	
	@Test
	void contextLoads() {
	}
	
	//adding staff details test
	@Test
	public void testinsertStaff() {
		Staff s=new Staff();
		
		s.setId(155L);
		s.setStaffname("Ram");
		s.setCourse("CIVIL");
		
		when(srepo.save(s)).thenReturn(s);
		assertThat(srepo.save(s)).isEqualTo(s);
		
		
	}
	
	
	
	//view all staff
	@Test
	public void getAllStaff() {
		List<Staff> staff=new ArrayList();
		staff.add(new Staff());
		given(srepo.findAll()).willReturn(staff);
		List<Staff> expected = srepo.findAll();
		assertEquals(expected, staff);
		verify(srepo).findAll();
		
	}
	

	
	//delete staff using id
	@Test
	public void deleteStaffbyId() {
		Staff staff= new Staff();
		staff.setId(114L);
		staff.setStaffname("Sammu");
		staff.setCourse("commerce");
		when(srepo.findById(staff.getId())).thenReturn(Optional.of(staff));
		srepo.deleteById(staff.getId());
		verify(srepo).deleteById(staff.getId());
	}
	
	//check if repo is empty
	@Test
	public void find_no_staff_if_repo_is_empty() {
		Iterable<Staff> staff = srepo.findAll();

		assertThat(staff).isEmpty();
	}
	
	@Test
    public void testDeleteStaff() {
        Staff staff = new Staff(303L, "aishu", "MECH");
        srepo.save(staff);
        srepo.delete(staff);
    }
	

	
}
