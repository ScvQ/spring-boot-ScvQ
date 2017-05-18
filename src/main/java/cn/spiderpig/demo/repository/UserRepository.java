package cn.spiderpig.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.spiderpig.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
