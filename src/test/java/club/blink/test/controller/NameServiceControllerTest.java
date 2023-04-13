package club.blink.test.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import club.blink.controller.NameServiceController;
import club.blink.controller.entity.NamePostRequestEntity;
import club.blink.controller.entity.NameResponseEntity;
import club.blink.service.NameServiceInterface;

@WebMvcTest(controllers=NameServiceController.class)
public class NameServiceControllerTest {

	@MockBean
	private NameServiceInterface nameServiceImpl;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void returnOkStatus_WhenGetNameWithID() throws Exception {
		Mockito.when(nameServiceImpl.getName(Mockito.anyLong())).thenReturn(new NameResponseEntity());
		mockMvc.perform(MockMvcRequestBuilders.get("/names/1")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	void returnCreatedStatus_WhenPostNameWithObject() throws Exception {
		Mockito.when(nameServiceImpl.postName(Mockito.any(NamePostRequestEntity.class))).thenReturn(new NameResponseEntity());
		NamePostRequestEntity req = new NamePostRequestEntity();
		req.setFirst_name("L");
		req.setLast_name("B");
		mockMvc.perform(
				MockMvcRequestBuilders.post("/names")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(req)))
		.andExpect(MockMvcResultMatchers.status().isCreated());
	}

}
