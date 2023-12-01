package com.pintobrasil.manutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pintobrasil.manutencao.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
