/**
 * Copyright (c) 2014 MapR, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jackhammer.exceptions;

import org.jackhammer.RecordStream;

/**
 * Exception thrown by implementations a {@link RecordStream} is
 * accessed in more than one way.
 */
public class StreamInUseException extends JackhammerException {

  private static final long serialVersionUID = 0x36921a0f97b532ceL;

  public StreamInUseException() {
    super();
  }

  public StreamInUseException(String message, Throwable cause) {
    super(message, cause);
  }

  public StreamInUseException(String message) {
    super(message);
  }

  public StreamInUseException(Throwable cause) {
    super(cause);
  }

}
