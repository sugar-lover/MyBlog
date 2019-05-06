package com.sugarlover.blog.dao;

import com.sugarlover.blog.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
