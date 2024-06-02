package com.MyProject.DevelopmentOfVehicleServiceHub.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public enum ServiceStatus {
    SCHEDULED, IN_PROGRESS, COMPLETED, CANCELED
}
