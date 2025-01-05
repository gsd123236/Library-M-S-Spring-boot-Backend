package mca.dmi.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mca.dmi.module.Student;


@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer>{

}
