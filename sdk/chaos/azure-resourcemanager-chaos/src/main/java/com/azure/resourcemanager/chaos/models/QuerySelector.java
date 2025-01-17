// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Model that represents a query selector. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Query")
@Fluent
public final class QuerySelector extends Selector {
    /*
     * Azure Resource Graph (ARG) Query Language query for target resources.
     */
    @JsonProperty(value = "queryString", required = true)
    private String queryString;

    /*
     * Subscription id list to scope resource query.
     */
    @JsonProperty(value = "subscriptionIds", required = true)
    private List<String> subscriptionIds;

    /** Creates an instance of QuerySelector class. */
    public QuerySelector() {
    }

    /**
     * Get the queryString property: Azure Resource Graph (ARG) Query Language query for target resources.
     *
     * @return the queryString value.
     */
    public String queryString() {
        return this.queryString;
    }

    /**
     * Set the queryString property: Azure Resource Graph (ARG) Query Language query for target resources.
     *
     * @param queryString the queryString value to set.
     * @return the QuerySelector object itself.
     */
    public QuerySelector withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * Get the subscriptionIds property: Subscription id list to scope resource query.
     *
     * @return the subscriptionIds value.
     */
    public List<String> subscriptionIds() {
        return this.subscriptionIds;
    }

    /**
     * Set the subscriptionIds property: Subscription id list to scope resource query.
     *
     * @param subscriptionIds the subscriptionIds value to set.
     * @return the QuerySelector object itself.
     */
    public QuerySelector withSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QuerySelector withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QuerySelector withFilter(Filter filter) {
        super.withFilter(filter);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (queryString() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property queryString in model QuerySelector"));
        }
        if (subscriptionIds() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property subscriptionIds in model QuerySelector"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QuerySelector.class);
}
