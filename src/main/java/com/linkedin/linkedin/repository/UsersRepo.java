package com.linkedin.linkedin.repository;

import com.linkedin.linkedin.module.UserModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<UserModule, Integer> {
     UserModule findByUseremail(String useremail);
}
