package com.meilisearch.sdk.model;

import com.meilisearch.sdk.TaskError;
import java.util.Date;
import lombok.Getter;

/**
 * Data structure of Meilisearch response for a asynchronous operation
 *
 * <p>https://docs.meilisearch.com/reference/api/tasks.html
 */
@Getter
public class TaskInfo {
    protected String status = "";
    protected int taskUid = 0;
    protected String indexUid = "";
    protected String type = null;
    protected String duration = "";
    protected Date enqueuedAt = null;
    protected Date startedAt = null;
    protected Date finishedAt = null;
    protected TaskError error = null;
    protected TaskDetails details = null;

    public TaskInfo() {}
}