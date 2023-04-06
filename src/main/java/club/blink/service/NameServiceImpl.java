package club.blink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import club.blink.controller.entity.NamePostRequestEntity;
import club.blink.controller.entity.NameResponseEntity;
import club.blink.database.InterfaceBasicCrud;
import club.blink.database.entity.NameEntity;

@Service
@Qualifier("nameServiceImpl")
public class NameServiceImpl extends AbstractNameService {

	@Autowired
	@Qualifier("nameEntityDatabaseCrud")
	private InterfaceBasicCrud nameEntityCrud;
	

	@Override
	public NameResponseEntity getName(String id) {
		NameEntity ne = (NameEntity) nameEntityCrud.get(id);
		NameResponseEntity resp = new NameResponseEntity();
		resp.setId(ne.getId());
		resp.setFirst_name(ne.getFirstName());
		resp.setLast_name(ne.getLastName());
		System.out.println(resp.getFirst_name());
		return resp;
	}

	@Override
	public NameResponseEntity postName(NamePostRequestEntity request) {
		NameEntity neRequest = new NameEntity();
		neRequest.setFirstName(request.getFirst_name());
		neRequest.setLastName(request.getLast_name());
		NameEntity ne = (NameEntity) nameEntityCrud.post(neRequest);
		NameResponseEntity resp = new NameResponseEntity();
		resp.setId(ne.getId());
		return resp;
	}

}
