package com.example.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/23 16:39
 */
@Service
public interface UserRepository extends JpaRepository<User,Long> {
}
