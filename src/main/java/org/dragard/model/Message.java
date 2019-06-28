package org.dragard.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@ToString
@Getter
@Entity
public class Message {

    @Id
    private String id;

    @Setter
    @Column
    private String message;

    public Message() {
        this.id = UUID.randomUUID().toString();
    }

    public Message(String message) {
        this();
        this.message = message;
    }
}
