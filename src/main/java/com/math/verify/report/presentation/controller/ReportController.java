package com.math.verify.report.presentation.controller;

import com.math.verify.report.application.dto.request.CreateReportRequest;
import com.math.verify.report.application.dto.response.CreateReportResponse;
import com.math.verify.report.application.service.ReportService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
@AllArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @PostMapping("/")
    public ResponseEntity<CreateReportResponse> createReport(
        @RequestBody CreateReportRequest createReportRequest
    ) {

        //

        CreateReportResponse response = reportService.createReport(createReportRequest);
        return ResponseEntity.ok(response);
    }

}
