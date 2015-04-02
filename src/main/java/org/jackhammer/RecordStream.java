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
package org.jackhammer;

import java.util.Iterator;

/**
 * A stream of records.
 *
 * Implements Iterable<Record> but only one call is allows to iterator()
 * or readerIterator(). Only one of these iterators can be retrieved
 * from the stream.
 */
public interface RecordStream<T extends Record> extends AutoCloseable, Iterable<T> {

  public void streamTo(RecordListener l);

  /**
   * Returns an iterator over a set of {@code Record}.
   */
  Iterator<T> iterator();

  /**
   * Returns an {@code Iterable} over a set of {@code RecordReader}.
   */
  Iterable<RecordReader> recordReaders();

}
