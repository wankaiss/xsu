package com.test.application.config;

import org.springframework.boot.actuate.audit.InMemoryAuditEventRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
@Import(value = {InMemoryHttpTraceRepository.class, InMemoryAuditEventRepository.class})
public class HttpTraceConfiguration {

  @Bean
  public CommonsRequestLoggingFilter loggingFilter() {
      CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
      filter.setIncludeQueryString(true);
      filter.setIncludePayload(true);
      filter.setMaxPayloadLength(10000);
      filter.setIncludeClientInfo(true);
    return filter;
  }
}
