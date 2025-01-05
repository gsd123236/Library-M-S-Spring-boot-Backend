package mca.dmi.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mca.dmi.module.Registrartion;


@Repository
public interface RegistrationRepositry extends JpaRepository<Registrartion,Integer> {
	

}
