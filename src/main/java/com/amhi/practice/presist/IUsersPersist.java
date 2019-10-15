package com.amhi.practice.presist;

import com.amhi.practice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IUsersPersist extends JpaRepository<Users, Long> {
    Users  findByName(String userName);

}
