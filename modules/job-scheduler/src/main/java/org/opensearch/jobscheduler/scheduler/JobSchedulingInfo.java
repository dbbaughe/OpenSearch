/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.jobscheduler.scheduler;

import org.opensearch.jobscheduler.spi.ScheduledJobParameter;
import org.opensearch.threadpool.Scheduler;

import java.time.Instant;

/**
 * TODO
 */
class JobSchedulingInfo {

    private String indexName;
    private String jobId;
    private ScheduledJobParameter jobParameter;
    private boolean descheduled = false;
    private Instant actualPreviousExecutionTime;
    private Instant expectedPreviousExecutionTime;
    private Instant expectedExecutionTime;
    private Scheduler.ScheduledCancellable scheduledCancellable;

    /**
     * TODO
     * @param indexName TODO
     * @param jobId TODO
     * @param jobParameter TODO
     */
    JobSchedulingInfo(String indexName, String jobId, ScheduledJobParameter jobParameter) {
        this.indexName = indexName;
        this.jobId = jobId;
        this.jobParameter = jobParameter;
    }

    /**
     * TODO
     * @return TODO
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * TODO
     * @return TODO
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * TODO
     * @return TODO
     */
    public ScheduledJobParameter getJobParameter() {
        return jobParameter;
    }

    /**
     * TODO
     * @return TODO
     */
    public boolean isDescheduled() {
        return descheduled;
    }

    /**
     * TODO
     * @return TODO
     */
    public Instant getActualPreviousExecutionTime() {
        return actualPreviousExecutionTime;
    }

    /**
     * TODO
     * @return TODO
     */
    public Instant getExpectedPreviousExecutionTime() {
        return expectedPreviousExecutionTime;
    }

    /**
     * TODO
     * @return TODO
     */
    public Instant getExpectedExecutionTime() {
        return this.expectedExecutionTime;
    }

    /**
     * TODO
     * @return TODO
     */
    public Scheduler.ScheduledCancellable getScheduledCancellable() {
        return scheduledCancellable;
    }

    /**
     * TODO
     * @param descheduled TODO
     */
    public void setDescheduled(boolean descheduled) {
        this.descheduled = descheduled;
    }

    /**
     * TODO
     * @param actualPreviousExecutionTime TODO
     */
    public void setActualPreviousExecutionTime(Instant actualPreviousExecutionTime) {
        this.actualPreviousExecutionTime = actualPreviousExecutionTime;
    }

    /**
     * TODO
     * @param expectedPreviousExecutionTime TODO
     */
    public void setExpectedPreviousExecutionTime(Instant expectedPreviousExecutionTime) {
        this.expectedPreviousExecutionTime = expectedPreviousExecutionTime;
    }

    /**
     * TODO
     * @param expectedExecutionTime TODO
     */
    public void setExpectedExecutionTime(Instant expectedExecutionTime) {
        this.expectedExecutionTime = expectedExecutionTime;
    }

    /**
     * TODO
     * @param scheduledCancellable TODO
     */
    public void setScheduledCancellable(Scheduler.ScheduledCancellable scheduledCancellable) {
        this.scheduledCancellable = scheduledCancellable;
    }

}
