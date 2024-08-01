package com.track.share.analytics;

import java.util.List;

public interface AnalyticsService {
    AnalyticsDTO createAnalytics(String methodName, String calleByIp);
    AnalyticsDTO getAnalyticsById(String uuid);
    List<AnalyticsDTO> getAllAnalytics();
    void deleteAnalytics(String uuid);
}
