package com.zap.contadigital.rabbit_consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MessageExample {

    @Id
    @Column(name = "messageId", unique = true)
    private String messageId;
    @Column(name = "log")
    private String log;
    @Column(name = "messageDate")
    private Date messageDate;
    @Column(name = "HttpResponse")
    private String HttpResponse;
}
