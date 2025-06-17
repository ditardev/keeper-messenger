package com.micro.messenger.service

import com.micro.messenger.model.dto.ServiceMessageDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class MailService {

    fun sendMail(messageDto: ServiceMessageDto): ResponseEntity<*>? {
        return ResponseEntity.ok(HttpStatus.OK)
    }
}