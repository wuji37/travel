package com.chinasofti.travel.Dao;

import com.chinasofti.travel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
}
