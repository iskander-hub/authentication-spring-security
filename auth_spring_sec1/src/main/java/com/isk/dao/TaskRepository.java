package com.isk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isk.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
