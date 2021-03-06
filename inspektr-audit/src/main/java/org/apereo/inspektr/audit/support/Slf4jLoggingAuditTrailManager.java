/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apereo.inspektr.audit.support;

import org.apereo.inspektr.audit.AuditActionContext;
import org.apereo.inspektr.audit.AuditTrailManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>AuditTrailManager</code> that dumps auditable information to a configured logger.
 * 
 * @author Dmitriy Kopylenko
 * @version $Revision$ $Date$
 * @since 1.0
 * @see AuditTrailManager
 */
public class Slf4jLoggingAuditTrailManager extends AbstractStringAuditTrailManager {
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void record(final AuditActionContext auditActionContext) {

        log.info(toString(auditActionContext));
    }
}
