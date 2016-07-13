/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.lambda.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * AWS Lambda was not able to create an Elastic Network Interface (ENI) in the
 * VPC, specified as part of Lambda function configuration, because the limit
 * for network interfaces has been reached.
 * </p>
 */
public class ENILimitReachedException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String type;

    /**
     * Constructs a new ENILimitReachedException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ENILimitReachedException(String message) {
        super(message);
    }

    /**
     * @param type
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ENILimitReachedException withType(String type) {
        setType(type);
        return this;
    }

}