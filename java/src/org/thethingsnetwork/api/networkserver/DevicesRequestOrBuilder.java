// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto

package org.thethingsnetwork.api.networkserver;

public interface DevicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:networkserver.DevicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Device address from the uplink message
   * </pre>
   *
   * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
   * @return The devAddr.
   */
  com.google.protobuf.ByteString getDevAddr();

  /**
   * <pre>
   * Frame counter from the uplink message
   * </pre>
   *
   * <code>uint32 f_cnt = 2;</code>
   * @return The fCnt.
   */
  int getFCnt();
}
