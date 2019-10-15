package com.page.Repository;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.data.jpa.repository.JpaRepository;

import com.page.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

	LocalDate save(String string);

	LocalDate save(LocalDate dateofbirth);

}
