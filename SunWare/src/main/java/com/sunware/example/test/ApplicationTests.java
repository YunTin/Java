package com.sunware.example.test;

import com.sunware.example.entity.Person;
import com.sunware.example.ldap.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void findAll() throws Exception{
        personRepository.findAll().forEach(p -> {
            Person person = new Person();
            person.setUid("uid:1");
            person.setSuerName("AAA");
            person.setCommonName("aaa");
            person.setUserPassword("123456");
            personRepository.save(person);
            System.err.println("hello: "+ person );
        });
    }

}
