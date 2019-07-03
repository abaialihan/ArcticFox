package com.example.sweater.controller.restcontroller;

import com.example.sweater.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageRestController {

    @Autowired
    private EntityManager entityManager;

    @RequestMapping("/message")
    @Transactional
    public Iterable<Object> getMessage() {
        List<Object> messages = entityManager.createQuery("SELECT m FROM Message m").getResultList();
        return messages;
    }


}
