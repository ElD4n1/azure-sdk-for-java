// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger for an exception action on exceeding queue length. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("queue-length")
@Fluent
public final class QueueLengthExceptionTrigger extends ExceptionTrigger {
    /**
     * Creates an instance of PassThroughQueueSelectorAttachment class.
     *
     * @param threshold The threshold of number of jobs ahead in the queue to for this trigger to fire
     */
    public QueueLengthExceptionTrigger(int threshold) {
        this.threshold = threshold;
    }
    /*
     * Threshold of number of jobs ahead in the queue to for this trigger to fire.
     */
    @JsonProperty(value = "threshold", required = true)
    private final int threshold;

    /**
     * Get the threshold property: Threshold of number of jobs ahead in the queue to for this trigger to fire.
     *
     * @return the threshold value.
     */
    public int getThreshold() {
        return this.threshold;
    }
}
