// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotConnectorInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of IoT Connectors. */
@Fluent
public final class IotConnectorCollection {
    /*
     * The link used to get the next page of IoT Connectors.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of IoT Connectors.
     */
    @JsonProperty(value = "value")
    private List<IotConnectorInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of IoT Connectors.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of IoT Connectors.
     *
     * @param nextLink the nextLink value to set.
     * @return the IotConnectorCollection object itself.
     */
    public IotConnectorCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of IoT Connectors.
     *
     * @return the value value.
     */
    public List<IotConnectorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of IoT Connectors.
     *
     * @param value the value value to set.
     * @return the IotConnectorCollection object itself.
     */
    public IotConnectorCollection withValue(List<IotConnectorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}