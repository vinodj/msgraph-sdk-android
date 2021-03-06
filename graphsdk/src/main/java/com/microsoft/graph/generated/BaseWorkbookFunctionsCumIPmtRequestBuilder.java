// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Cum IPmt Request Builder.
 */
public class BaseWorkbookFunctionsCumIPmtRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCumIPmt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsCumIPmtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement startPeriod, final com.google.gson.JsonElement endPeriod, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("rate", rate);
        mBodyParams.put("nper", nper);
        mBodyParams.put("pv", pv);
        mBodyParams.put("startPeriod", startPeriod);
        mBodyParams.put("endPeriod", endPeriod);
        mBodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsCumIPmtRequest
     *
     * @return The IWorkbookFunctionsCumIPmtRequest instance
     */
    public IWorkbookFunctionsCumIPmtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCumIPmtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsCumIPmtRequest instance
     */
    public IWorkbookFunctionsCumIPmtRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsCumIPmtRequest request = new WorkbookFunctionsCumIPmtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("nper")) {
            request.mBody.nper = getParameter("nper");
        }

        if (hasParameter("pv")) {
            request.mBody.pv = getParameter("pv");
        }

        if (hasParameter("startPeriod")) {
            request.mBody.startPeriod = getParameter("startPeriod");
        }

        if (hasParameter("endPeriod")) {
            request.mBody.endPeriod = getParameter("endPeriod");
        }

        if (hasParameter("type")) {
            request.mBody.type = getParameter("type");
        }

        return request;
    }
}
