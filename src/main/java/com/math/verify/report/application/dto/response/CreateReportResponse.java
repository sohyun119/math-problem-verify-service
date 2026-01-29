package com.math.verify.report.application.dto.response;

import com.math.verify.report.application.utils.ReportStatus;
import java.util.UUID;


public class CreateReportResponse {

    private UUID reportId; //
    private ReportStatus status;

    private CreateReportResponse(UUID reportId, ReportStatus status) {
        this.reportId = reportId;
        this.status = status;
    }

    public static CreateReportResponse of(UUID reportId, ReportStatus status) {
        return new CreateReportResponse(reportId, status);
    }
}
