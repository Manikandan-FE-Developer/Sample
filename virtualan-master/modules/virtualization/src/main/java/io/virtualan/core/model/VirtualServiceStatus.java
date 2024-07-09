/*
 * Copyright 2018 Virtualan Contributors (https://virtualan.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.virtualan.core.model;


import java.util.Map;
import lombok.Data;

/**
 * Virtual Service status.
 *
 * @author Elan Thangamani
 *
 **/
@Data
public class VirtualServiceStatus {

    private String code;

    private String message;
    private Map<Integer, ResponseParam> responseParam;

    private VirtualServiceRequest virtualServiceRequest;
    private VirtualServiceMessageRequest virtualServiceMessageRequest;

    public VirtualServiceStatus() {
    }

    public VirtualServiceStatus(String code) {
        this.code = code;
    }

    public VirtualServiceStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
