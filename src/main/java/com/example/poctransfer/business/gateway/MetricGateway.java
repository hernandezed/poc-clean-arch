package com.example.poctransfer.business.gateway;

import java.util.Map;

public interface MetricGateway {
    void incrementCounter(String counterName, Map<String, String> tags);
}
