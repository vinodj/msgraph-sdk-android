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
 * The class for the Base Workbook Filter Apply Bottom Items Filter Request Builder.
 */
public class BaseWorkbookFilterApplyBottomItemsFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyBottomItemsFilter
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFilterApplyBottomItemsFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final Integer count) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("count", count);
    }

    /**
     * Creates the IWorkbookFilterApplyBottomItemsFilterRequest
     *
     * @return The IWorkbookFilterApplyBottomItemsFilterRequest instance
     */
    public IWorkbookFilterApplyBottomItemsFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyBottomItemsFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFilterApplyBottomItemsFilterRequest instance
     */
    public IWorkbookFilterApplyBottomItemsFilterRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFilterApplyBottomItemsFilterRequest request = new WorkbookFilterApplyBottomItemsFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("count")) {
            request.mBody.count = getParameter("count");
        }

        return request;
    }
}
