package com.pintobrasil.manutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pintobrasil.manutencao.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
