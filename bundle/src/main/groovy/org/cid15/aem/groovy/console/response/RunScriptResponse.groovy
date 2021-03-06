package org.cid15.aem.groovy.console.response

import org.cid15.aem.groovy.console.api.JobProperties

/**
 * Response for script executions.
 */
interface RunScriptResponse {

    /**
     * Get the date of script execution.
     *
     * @return execution date
     */
    Calendar getDate()

    String getScript()

    String getData()

    String getResult()

    String getOutput()

    String getExceptionStackTrace()

    String getRunningTime()

    String getUserId()

    String getJobId()

    JobProperties getJobProperties()

    String getMediaType()

    String getOutputFileName()
}
