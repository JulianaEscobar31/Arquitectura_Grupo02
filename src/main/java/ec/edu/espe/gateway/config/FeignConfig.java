package ec.edu.espe.gateway.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Request.Options requestOptions() {
        return new Request.Options(5000, 30000); // 5 segundos de conexión, 30 segundos de lectura
    }
} 