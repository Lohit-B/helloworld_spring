package club.blink.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import club.blink.repository.entity.NameEntity;

public interface NameServiceRepository extends JpaRepository<NameEntity, Long> {

}
