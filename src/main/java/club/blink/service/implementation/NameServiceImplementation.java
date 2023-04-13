package club.blink.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.blink.controller.entity.NamePostRequestEntity;
import club.blink.controller.entity.NameResponseEntity;
import club.blink.repository.NameServiceRepository;
import club.blink.repository.entity.NameEntity;
import club.blink.service.NameServiceInterface;

@Service("nameServiceImpl")
public class NameServiceImplementation implements NameServiceInterface {
	
	@Autowired
	private NameServiceRepository nameServiceRepository;

	public NameServiceImplementation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public NameResponseEntity getName(Long id) {
		Optional<NameEntity> ne = nameServiceRepository.findById(id);
		if(!ne.isPresent()) {
			return null;
		}
		NameResponseEntity resp = new NameResponseEntity();
		ne.ifPresent((name)->{
			resp.setFirst_name(name.getFirstName());
			resp.setLast_name(name.getLastName());
			resp.setId(String.valueOf(name.getId()));
		});
		return resp;
	}

	@Override
	public NameResponseEntity postName(NamePostRequestEntity request) {
		NameEntity ne = new NameEntity();
		ne.setFirstName(request.getFirst_name());
		ne.setLastName(request.getLast_name());
		NameEntity createdEntity = nameServiceRepository.saveAndFlush(ne);
		NameResponseEntity resp = new NameResponseEntity();
		resp.setId(String.valueOf(createdEntity.getId()));
		return resp;
	}

}
