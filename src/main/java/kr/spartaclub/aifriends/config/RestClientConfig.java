package kr.spartaclub.aifriends.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

/**
 * 외부 API 연동을 위한 RestClient 빈 정의.
 * Gemini API 및 Practice API(JSONPlaceholder, Bored API) 호출용 클라이언트를 제공합니다.
 */
@Configuration
public class RestClientConfig {

    @Bean("jsonPlaceholderRestClient")
    public RestClient jsonPlaceholderRestClient() {
        return RestClient.builder()
                .build();
    }

    @Bean("boredRestClient")
    public RestClient boredRestClient() {
        return RestClient.builder()
                .build();
    }

    @Bean("geminiRestClient")
    public RestClient geminiRestClient() {
        return RestClient.builder()
                .build();
    }
}
