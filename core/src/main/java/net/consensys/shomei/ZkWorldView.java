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

package net.consensys.shomei;

import java.util.Map;
import java.util.Optional;

import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.apache.tuweni.units.bigints.UInt256;
import org.hyperledger.besu.datatypes.Address;
import org.hyperledger.besu.datatypes.Hash;
import org.hyperledger.besu.evm.worldstate.WorldView;

public interface ZkWorldView extends WorldView {

  Optional<Bytes> getCode(Address address, final Hash codeHash);

  UInt256 getStorageValue(Address address, UInt256 key);

  Optional<UInt256> getStorageValueBySlotHash(Address address, Hash slotHash);

  UInt256 getPriorStorageValue(Address address, UInt256 key);

  Map<Bytes32, Bytes> getAllAccountStorage(Address address, Hash rootHash);
}
