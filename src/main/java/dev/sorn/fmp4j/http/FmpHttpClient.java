package dev.sorn.fmp4j.http;

import java.net.URI;
import java.util.List;
import java.util.Map;

public interface FmpHttpClient {
    <T> T getJson(
        Class<T> clazz,
        URI uri,
        Map<String, String> headers,
        Map<String, Object> queryParams
    );

    <T> List<T> getJsonList(
        Class<T[]> clazz,
        URI uri,
        Map<String, String> headers,
        Map<String, Object> queryParams
    );
}