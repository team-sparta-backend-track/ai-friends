package kr.spartaclub.aifriends.service;

import kr.spartaclub.aifriends.common.exception.BusinessException;
import kr.spartaclub.aifriends.common.exception.ErrorCode;
import kr.spartaclub.aifriends.domain.ChatLog;
import kr.spartaclub.aifriends.domain.Soulmate;
import kr.spartaclub.aifriends.dto.GeminiParsedResponse;
import kr.spartaclub.aifriends.dto.GeminiRequest;
import kr.spartaclub.aifriends.dto.GeminiRequest.Content;
import kr.spartaclub.aifriends.dto.GeminiRequest.Part;
import kr.spartaclub.aifriends.dto.GeminiRequest.SystemInstruction;
import kr.spartaclub.aifriends.dto.GeminiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

import tools.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 구글 Gemini API와의 실제 통신 및 프롬프트 조합, 응답 파싱을 담당하는 외부 인프라스트럭처 서비스입니다.
 * Spring AI 라이브러리 등 추상화 레이어를 쓰지 않고, RestClient를 사용하여 날것(Raw)의 HTTP 요청/응답을 직접 핸들링합니다.
 * 이를 통해 LLM 통신의 밑바닥 동작 원리와 파싱 로직을 명확히 이해할 수 있습니다.
 *
 * <p>Gemini API 사용 가이드 (공식 문서)</p>
 * <ul>
 *   <li>개요 및 시작하기: <a href="https://ai.google.dev/gemini-api/docs">https://ai.google.dev/gemini-api/docs</a></li>
 *   <li>텍스트 생성 (generateContent): <a href="https://ai.google.dev/gemini-api/docs/text-generation">https://ai.google.dev/gemini-api/docs/text-generation</a></li>
 *   <li>REST API 메서드 레퍼런스: <a href="https://ai.google.dev/api">https://ai.google.dev/api</a></li>
 * </ul>
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class GeminiService {

    private final RestClient geminiRestClient;

    public GeminiParsedResponse generateReply(Soulmate soulmate, List<ChatLog> recentLogsAsc, String userMessage, boolean requireAffectionInResponse, boolean forceNoChoices) {
        return null;
    }
}

