package com.track.share.analytics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analytics")
class AnalyticsController {

	@Autowired
	private AnalyticsService analyticsService;

	@GetMapping("/{uuid}")
	public ResponseEntity<AnalyticsDTO> getAnalyticsById(@PathVariable String uuid) {
		AnalyticsDTO analyticsDTO = analyticsService.getAnalyticsById(uuid);
		return new ResponseEntity<>(analyticsDTO, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<AnalyticsDTO>> getAllAnalytics() {
		List<AnalyticsDTO> analyticsList = analyticsService.getAllAnalytics();
		return new ResponseEntity<>(analyticsList, HttpStatus.OK);
	}

}
