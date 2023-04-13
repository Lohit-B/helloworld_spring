package club.blink.service;

import club.blink.controller.entity.NamePostRequestEntity;
import club.blink.controller.entity.NameResponseEntity;

public interface NameServiceInterface {
	public abstract NameResponseEntity getName(Long id);
	public abstract NameResponseEntity postName(NamePostRequestEntity request);
}
