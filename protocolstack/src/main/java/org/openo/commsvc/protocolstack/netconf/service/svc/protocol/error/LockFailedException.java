/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.commsvc.protocolstack.netconf.service.svc.protocol.error;

/**
 * Failed to obtain a lock abnormality
 * 
 * @author
 */
public class LockFailedException extends Exception {

    private static final long serialVersionUID = 5249050251260401226L;

    /**
     * Constructor
     * <br>
     * 
     * @author
     * @param e
     */
    public LockFailedException(InterruptedException e) {
        super(e);
    }

    /**
     * Constructor
     * 
     * @author
     * @param string
     */
    public LockFailedException(String string) {
        super(string);
    }

}