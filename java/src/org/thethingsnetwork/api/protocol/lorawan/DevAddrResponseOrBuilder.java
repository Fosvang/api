// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/device_address.proto

package org.thethingsnetwork.api.protocol.lorawan;

public interface DevAddrResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lorawan.DevAddrResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
   * @return The devAddr.
   */
  com.google.protobuf.ByteString getDevAddr();
}
