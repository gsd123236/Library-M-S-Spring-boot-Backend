package mca.dmi.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mca.dmi.module.user;
@Repository
public interface UserRepositry extends JpaRepository<user,Integer> {

}
