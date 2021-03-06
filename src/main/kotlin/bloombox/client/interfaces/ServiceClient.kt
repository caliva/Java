/*
 * Copyright 2017, Bloombox, LLC.
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

package bloombox.client.interfaces

import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit


/**
 * Specifies the interface that a service RPC client must comply with, to make it usable and testable by the greater
 * API client system.
 */
internal interface ServiceClient {
  /**
   * Host to send RPCs to.
   */
  val host: String

  /**
   * Port to send RPCs to.
   */
  val port: Int

  /**
   * API key to specify.
   */
  val apiKey: String

  /**
   * Setting to control logging.
   */
  val enableLogging: Boolean

  /**
   * Executor for followup and RPC client activities.
   */
  val executor: Executor

  /**
   * Utility function to close any existing client connection.
   */
  fun close(soft: Boolean, block: Boolean, timeout: Pair<Long, TimeUnit>)
}
