package com.project.storebooking.user.repository;

import com.project.storebooking.partner.entity.Partner;
import com.project.storebooking.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
