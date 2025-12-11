package com.happy2code.jobportal.repository;

import com.happy2code.jobportal.Entity.Users;
import com.happy2code.jobportal.Entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersTypeRepository extends JpaRepository<UsersType,Integer> {

}
