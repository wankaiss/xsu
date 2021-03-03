package com.test.application.config;

import org.springframework.boot.actuate.audit.InMemoryAuditEventRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {InMemoryHttpTraceRepository.class, InMemoryAuditEventRepository.class})
public class HttpTraceConfiguration {}
