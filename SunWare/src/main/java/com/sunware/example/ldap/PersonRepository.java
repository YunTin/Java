package com.sunware.example.ldap;

import com.sunware.example.entity.Person;
import org.springframework.data.repository.CrudRepository;

import javax.naming.Name;

public interface PersonRepository extends CrudRepository<Person,Name> {
}
