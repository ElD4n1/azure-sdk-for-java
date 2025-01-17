// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the partner managed resource. */
@Immutable
public final class PartnerManagedResourceProperties {
    /*
     * The partner managed resource id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The partner managed ILB resource id
     */
    @JsonProperty(value = "internalLoadBalancerId", access = JsonProperty.Access.WRITE_ONLY)
    private String internalLoadBalancerId;

    /*
     * The partner managed SLB resource id
     */
    @JsonProperty(value = "standardLoadBalancerId", access = JsonProperty.Access.WRITE_ONLY)
    private String standardLoadBalancerId;

    /** Creates an instance of PartnerManagedResourceProperties class. */
    public PartnerManagedResourceProperties() {
    }

    /**
     * Get the id property: The partner managed resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the internalLoadBalancerId property: The partner managed ILB resource id.
     *
     * @return the internalLoadBalancerId value.
     */
    public String internalLoadBalancerId() {
        return this.internalLoadBalancerId;
    }

    /**
     * Get the standardLoadBalancerId property: The partner managed SLB resource id.
     *
     * @return the standardLoadBalancerId value.
     */
    public String standardLoadBalancerId() {
        return this.standardLoadBalancerId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
