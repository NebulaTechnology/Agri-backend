package com.nebula.repo;

import com.nebula.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {
    List<User> findByUserNameAndPassword(String userName, String password);
}
