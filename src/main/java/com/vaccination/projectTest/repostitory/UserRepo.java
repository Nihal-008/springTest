package com.vaccination.projectTest.repostitory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccination.projectTest.modelM.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
