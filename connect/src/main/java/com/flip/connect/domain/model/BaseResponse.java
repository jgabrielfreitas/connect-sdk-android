package com.flip.connect.domain.model;

import com.flip.connect.domain.model.auth.OperationReport;

import java.util.List;

/**
 * Created by ltorres on 19/07/2017.
 */

public class BaseResponse {
    private Boolean success = false;
    private List<OperationReport> operationReport;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<OperationReport> getOperationReport() {
        return operationReport;
    }

    public void setOperationReport(List<OperationReport> operationReport) {
        this.operationReport = operationReport;
    }
}
