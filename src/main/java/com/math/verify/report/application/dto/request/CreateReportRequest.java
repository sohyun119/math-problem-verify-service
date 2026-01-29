package com.math.verify.report.application.dto.request;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

@Getter
public class CreateReportRequest {

    private MultipartFile hwpFile;
    private MultipartFile pdfFile;

}
