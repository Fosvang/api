// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

public interface JoinRequestPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lorawan.JoinRequestPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
   * @return The appEui.
   */
  com.google.protobuf.ByteString getAppEui();

  /**
   * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
   * @return The devEui.
   */
  com.google.protobuf.ByteString getDevEui();

  /**
   * <code>bytes dev_nonce = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
   * @return The devNonce.
   */
  com.google.protobuf.ByteString getDevNonce();
}
