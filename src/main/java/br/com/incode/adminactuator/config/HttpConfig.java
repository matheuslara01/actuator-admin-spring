package br.com.incode.adminactuator.config;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import de.codecentric.boot.admin.server.web.client.HttpHeadersProvider;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Configuration
public class HttpConfig {
    @Bean
    public HttpHeadersProvider customHttpHeadersProvider() {
        return instance -> {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("Authorization", token());
            return httpHeaders;
        };
    }

    public String token() {
        Date today = new Date();
        Date dateExpiration = new Date(today.getTime() + 86400000L);
        String token = "Bearer " + Jwts.builder()
                .setIssuer("your-issuer")
                .setSubject("{\"id\" : \"999999\"}")
                .setIssuedAt(today).setExpiration(dateExpiration).signWith(SignatureAlgorithm.HS256,
                        Base64.getEncoder().encodeToString("your-secret".getBytes(StandardCharsets.UTF_8)))
                .compact();
        return token;
    }
}
