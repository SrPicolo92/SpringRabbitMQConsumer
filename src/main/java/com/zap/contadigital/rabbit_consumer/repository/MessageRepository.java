package com.zap.contadigital.rabbit_consumer.repository;

import com.zap.contadigital.rabbit_consumer.model.MessageExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageExample, String> {
}
