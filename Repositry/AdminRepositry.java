package mca.dmi.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mca.dmi.module.Admin;

@Repository
public interface AdminRepositry extends JpaRepository<Admin, Integer> {

}
