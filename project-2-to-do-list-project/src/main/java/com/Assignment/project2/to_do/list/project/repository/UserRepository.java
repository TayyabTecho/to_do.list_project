package com.Assignment.project2.to_do.list.project.repository;


import com.Assignment.project2.to_do.list.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
