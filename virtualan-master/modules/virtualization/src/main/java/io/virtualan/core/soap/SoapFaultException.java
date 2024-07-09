/*
 * Copyright 2020 Virtualan Contributors (https://virtualan.io)
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

package io.virtualan.core.soap;

/**
 * This is Soap Virtual Service .
 *
 * @author  Elan Thangamani
 *
 **/

public class SoapFaultException extends RuntimeException {
  public SoapFaultException(String msg) {
    super(msg);
  }

  public SoapFaultException(String msg, Throwable ex) {
    super(msg, ex);
  }

  public SoapFaultException(Throwable ex) {
    super("Could not access fault: " + ex.getMessage(), ex);
  }
}