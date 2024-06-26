/*
 * Copyright ConsenSys Software Inc., 2023
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package net.consensys.shomei.services.storage.rocksdb.configuration;

/** The RocksDb factory configuration. */
public class RocksDBFactoryConfiguration {

  public static final RocksDBFactoryConfiguration DEFAULT_ROCKSDB_CONFIG =
      new RocksDBFactoryConfiguration(
          RocksDBCLIOptions.DEFAULT_MAX_OPEN_FILES,
          RocksDBCLIOptions.DEFAULT_MAX_BACKGROUND_COMPACTIONS,
          RocksDBCLIOptions.DEFAULT_BACKGROUND_THREAD_COUNT,
          RocksDBCLIOptions.DEFAULT_CACHE_CAPACITY);

  private final int maxOpenFiles;
  private final int maxBackgroundCompactions;
  private final int backgroundThreadCount;
  private final long cacheCapacity;

  /**
   * Instantiates a new RocksDb factory configuration.
   *
   * @param maxOpenFiles the max open files
   * @param maxBackgroundCompactions the max background compactions
   * @param backgroundThreadCount the background thread count
   * @param cacheCapacity the cache capacity
   */
  public RocksDBFactoryConfiguration(
      final int maxOpenFiles,
      final int maxBackgroundCompactions,
      final int backgroundThreadCount,
      final long cacheCapacity) {
    this.maxBackgroundCompactions = maxBackgroundCompactions;
    this.backgroundThreadCount = backgroundThreadCount;
    this.maxOpenFiles = maxOpenFiles;
    this.cacheCapacity = cacheCapacity;
  }

  /**
   * Gets max open files.
   *
   * @return the max open files
   */
  public int getMaxOpenFiles() {
    return maxOpenFiles;
  }

  /**
   * Gets max background compactions.
   *
   * @return the max background compactions
   */
  public int getMaxBackgroundCompactions() {
    return maxBackgroundCompactions;
  }

  /**
   * Gets background thread count.
   *
   * @return the background thread count
   */
  public int getBackgroundThreadCount() {
    return backgroundThreadCount;
  }

  /**
   * Gets cache capacity.
   *
   * @return the cache capacity
   */
  public long getCacheCapacity() {
    return cacheCapacity;
  }
}
