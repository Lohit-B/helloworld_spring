package club.blink.service;

import club.blink.controller.entity.NamePostRequestEntity;
import club.blink.controller.entity.NameResponseEntity;

public abstract class AbstractNameService {
	public abstract NameResponseEntity getName(Long id);
	public abstract NameResponseEntity postName(NamePostRequestEntity request);
}