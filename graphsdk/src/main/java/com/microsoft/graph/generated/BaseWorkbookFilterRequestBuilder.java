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
 * The class for the Base Workbook Filter Request Builder.
 */
public class BaseWorkbookFilterRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookFilterRequestBuilder {

    /**
     * The request builder for the WorkbookFilter
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookFilterRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookFilterRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookFilterApplyRequestBuilder getApply(final WorkbookFilterCriteria criteria) {
        return new WorkbookFilterApplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.apply"), getClient(), null, criteria);
    }

    public IWorkbookFilterApplyBottomItemsFilterRequestBuilder getApplyBottomItemsFilter(final Integer count) {
        return new WorkbookFilterApplyBottomItemsFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyBottomItemsFilter"), getClient(), null, count);
    }

    public IWorkbookFilterApplyBottomPercentFilterRequestBuilder getApplyBottomPercentFilter(final Integer percent) {
        return new WorkbookFilterApplyBottomPercentFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyBottomPercentFilter"), getClient(), null, percent);
    }

    public IWorkbookFilterApplyCellColorFilterRequestBuilder getApplyCellColorFilter(final String color) {
        return new WorkbookFilterApplyCellColorFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyCellColorFilter"), getClient(), null, color);
    }

    public IWorkbookFilterApplyCustomFilterRequestBuilder getApplyCustomFilter(final String criteria1, final String criteria2, final String oper) {
        return new WorkbookFilterApplyCustomFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyCustomFilter"), getClient(), null, criteria1, criteria2, oper);
    }

    public IWorkbookFilterApplyDynamicFilterRequestBuilder getApplyDynamicFilter(final String criteria) {
        return new WorkbookFilterApplyDynamicFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyDynamicFilter"), getClient(), null, criteria);
    }

    public IWorkbookFilterApplyFontColorFilterRequestBuilder getApplyFontColorFilter(final String color) {
        return new WorkbookFilterApplyFontColorFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyFontColorFilter"), getClient(), null, color);
    }

    public IWorkbookFilterApplyIconFilterRequestBuilder getApplyIconFilter(final WorkbookIcon icon) {
        return new WorkbookFilterApplyIconFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyIconFilter"), getClient(), null, icon);
    }

    public IWorkbookFilterApplyTopItemsFilterRequestBuilder getApplyTopItemsFilter(final Integer count) {
        return new WorkbookFilterApplyTopItemsFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyTopItemsFilter"), getClient(), null, count);
    }

    public IWorkbookFilterApplyTopPercentFilterRequestBuilder getApplyTopPercentFilter(final Integer percent) {
        return new WorkbookFilterApplyTopPercentFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyTopPercentFilter"), getClient(), null, percent);
    }

    public IWorkbookFilterApplyValuesFilterRequestBuilder getApplyValuesFilter(final com.google.gson.JsonElement values) {
        return new WorkbookFilterApplyValuesFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyValuesFilter"), getClient(), null, values);
    }

    public IWorkbookFilterClearRequestBuilder getClear() {
        return new WorkbookFilterClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }
}
