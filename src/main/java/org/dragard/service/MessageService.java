package org.dragard.service;

import org.dragard.dao.MessageRepository;
import org.dragard.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public void save(Message message) {
        repository.save(message);

        System.out.println("Saved in DB: " + message);
    }
}
