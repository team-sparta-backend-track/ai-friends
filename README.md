# AI Friends

2026년 3월 **스파르타 내일배움캠프 백엔드 3기** 부트캠프 학생들의 **S2S(Server to Server) 학습**을 위한 라이브코딩 특강용 소스코드 자료입니다.

---

## 브랜치 안내

| 브랜치 | 설명 |
|--------|------|
| **main** | 학습용 소스코드. `Service` 클래스 및 `RestClientConfig` 파일이 **비어 있는** 상태로 제공됩니다. |
| **study** | 수업 종료 후 **완성 코드**가 올라올 예정입니다. |

> ⚠️ **main 브랜치**에서는 Service·RestClientConfig 등 핵심 구현이 비어 있으므로 **앱이 정상 실행되지 않습니다.**  
> 수업 중 라이브코딩으로 채워 나가며 학습하고, 수업 종료 후 **study 브랜치**에서 완성 코드를 확인할 수 있습니다.

---

## .env 설정 가이드

앱 실행 전에 **프로젝트 루트**에 `.env` 파일을 만들고 아래 항목을 채워 주세요.

1. **`.env.example` 복사**
   - 저장소에 포함된 `.env.example` 파일을 복사하여 **이름을 `.env`로 저장**합니다.
   - `.env`는 `.gitignore`에 포함되어 있어 Git에 커밋되지 않습니다.

2. **필수 환경 변수**

   | 변수명 | 설명 | 예시 |
   |--------|------|------|
   | `GEMINI_API_KEY` | Google Gemini API 키 (AI 채팅용). [Google AI Studio](https://aistudio.google.com/app/apikey)에서 발급 | `AIza...` |
   | `GEMINI_MODEL` | 사용할 Gemini 모델명 | `gemini-2.5-flash-lite` 또는 `gemini-2.5-pro` 등 |
  

3. **`.env` 예시**

   ```env
   # Google Gemini API 키 (필수, AI 채팅용)
   # https://aistudio.google.com/app/apikey
   GEMINI_API_KEY=여기에_발급받은_API_키_입력

   # 사용할 Gemini 모델 (예: gemini-2.5-flash-lite)
   GEMINI_MODEL=gemini-2.5-flash-lite

   ```

   위 값들은 `application.yml`에서 `${GEMINI_API_KEY}`, `${GEMINI_MODEL}`로 참조됩니다.  
   `.env`는 앱 구동 시 `DotenvInitializer`를 통해 로드되며, 파일이 없으면 해당 변수가 비어 있어 오류가 발생할 수 있습니다.

---
