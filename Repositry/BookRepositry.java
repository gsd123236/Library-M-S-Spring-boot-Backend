package mca.dmi.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import mca.dmi.module.Book;

public interface BookRepositry extends JpaRepository<Book,Integer>{

}
