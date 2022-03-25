/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.jobscheduler;

import org.opensearch.jobscheduler.spi.ScheduledJobParser;
import org.opensearch.jobscheduler.spi.ScheduledJobRunner;

/**
 * TODO
 */
public class ScheduledJobProvider {
    private String jobType;
    private String jobIndexName;
    private ScheduledJobParser jobParser;
    private ScheduledJobRunner jobRunner;

    /**
     * TODO
     * @return TODO
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * TODO
     * @return TODO
     */
    public String getJobIndexName() {
        return jobIndexName;
    }

    /**
     * TODO
     * @return TODO
     */
    public ScheduledJobParser getJobParser() {
        return jobParser;
    }

    /**
     * TODO
     * @return TODO
     */
    public ScheduledJobRunner getJobRunner() {
        return jobRunner;
    }

    /**
     * TODO
     * @param jobType TODO
     * @param jobIndexName TODO
     * @param jobParser TODO
     * @param jobRunner TODO
     */
    public ScheduledJobProvider(String jobType, String jobIndexName, ScheduledJobParser jobParser, ScheduledJobRunner jobRunner) {
        this.jobType = jobType;
        this.jobIndexName = jobIndexName;
        this.jobParser = jobParser;
        this.jobRunner = jobRunner;
    }

}
