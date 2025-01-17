// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ChaosManagementClient class. */
public interface ChaosManagementClient {
    /**
     * Gets GUID that represents an Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the CapabilitiesClient object to access its operations.
     *
     * @return the CapabilitiesClient object.
     */
    CapabilitiesClient getCapabilities();

    /**
     * Gets the CapabilityTypesClient object to access its operations.
     *
     * @return the CapabilityTypesClient object.
     */
    CapabilityTypesClient getCapabilityTypes();

    /**
     * Gets the ExperimentsClient object to access its operations.
     *
     * @return the ExperimentsClient object.
     */
    ExperimentsClient getExperiments();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the TargetTypesClient object to access its operations.
     *
     * @return the TargetTypesClient object.
     */
    TargetTypesClient getTargetTypes();

    /**
     * Gets the TargetsClient object to access its operations.
     *
     * @return the TargetsClient object.
     */
    TargetsClient getTargets();
}
