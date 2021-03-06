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
 * The class for the Base Workbook Named Item Request.
 */
public class BaseWorkbookNamedItemRequest extends BaseRequest implements IBaseWorkbookNamedItemRequest {

    /**
     * The request for the WorkbookNamedItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookNamedItemRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookNamedItem from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookNamedItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookNamedItem from the service
     * @return The WorkbookNamedItem from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookNamedItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookNamedItem with a source
     * @param sourceWorkbookNamedItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookNamedItem sourceWorkbookNamedItem, final ICallback<WorkbookNamedItem> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookNamedItem);
    }

    /**
     * Patches this WorkbookNamedItem with a source
     * @param sourceWorkbookNamedItem The source object with updates
     * @return The updated WorkbookNamedItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookNamedItem patch(final WorkbookNamedItem sourceWorkbookNamedItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookNamedItem);
    }

    /**
     * Creates a WorkbookNamedItem with a new object
     * @param newWorkbookNamedItem The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookNamedItem newWorkbookNamedItem, final ICallback<WorkbookNamedItem> callback) {
        send(HttpMethod.POST, callback, newWorkbookNamedItem);
    }

    /**
     * Creates a WorkbookNamedItem with a new object
     * @param newWorkbookNamedItem The new object to create
     * @return The created WorkbookNamedItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookNamedItem post(final WorkbookNamedItem newWorkbookNamedItem) throws ClientException {
        return send(HttpMethod.POST, newWorkbookNamedItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookNamedItemRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookNamedItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookNamedItemRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookNamedItemRequest)this;
     }

}
