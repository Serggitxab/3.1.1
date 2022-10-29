package ru.zarya.boottest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.zarya.boottest.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}