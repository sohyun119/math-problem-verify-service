package com.math.verify.report.application.service;

import com.math.verify.report.application.dto.request.CreateReportRequest;
import com.math.verify.report.application.dto.response.CreateReportResponse;
import com.math.verify.report.application.utils.ReportStatus;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public CreateReportResponse createReport(CreateReportRequest createReportRequest) {

        UUID reportId = UUID.randomUUID();

        // 파일 처리


        return CreateReportResponse.of(reportId, ReportStatus.PENDING);
    }

}
