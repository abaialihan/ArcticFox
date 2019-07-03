package com.example.sweater.repos;

import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserDbRepo extends CrudRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password = ?2")
    User getByLoginAndPass(String username, String password);
}
