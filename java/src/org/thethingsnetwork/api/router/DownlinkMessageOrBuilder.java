// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/router/router.proto

package org.thethingsnetwork.api.router;

public interface DownlinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:router.DownlinkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes payload = 1;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>.protocol.Message message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   * @return The message.
   */
  org.thethingsnetwork.api.protocol.Message getMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  org.thethingsnetwork.api.protocol.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>.protocol.TxConfiguration protocol_configuration = 11 [(.gogoproto.nullable) = false];</code>
   * @return Whether the protocolConfiguration field is set.
   */
  boolean hasProtocolConfiguration();
  /**
   * <code>.protocol.TxConfiguration protocol_configuration = 11 [(.gogoproto.nullable) = false];</code>
   * @return The protocolConfiguration.
   */
  org.thethingsnetwork.api.protocol.TxConfiguration getProtocolConfiguration();
  /**
   * <code>.protocol.TxConfiguration protocol_configuration = 11 [(.gogoproto.nullable) = false];</code>
   */
  org.thethingsnetwork.api.protocol.TxConfigurationOrBuilder getProtocolConfigurationOrBuilder();

  /**
   * <code>.gateway.TxConfiguration gateway_configuration = 12 [(.gogoproto.nullable) = false];</code>
   * @return Whether the gatewayConfiguration field is set.
   */
  boolean hasGatewayConfiguration();
  /**
   * <code>.gateway.TxConfiguration gateway_configuration = 12 [(.gogoproto.nullable) = false];</code>
   * @return The gatewayConfiguration.
   */
  org.thethingsnetwork.api.gateway.TxConfiguration getGatewayConfiguration();
  /**
   * <code>.gateway.TxConfiguration gateway_configuration = 12 [(.gogoproto.nullable) = false];</code>
   */
  org.thethingsnetwork.api.gateway.TxConfigurationOrBuilder getGatewayConfigurationOrBuilder();

  /**
   * <code>.trace.Trace trace = 21;</code>
   * @return Whether the trace field is set.
   */
  boolean hasTrace();
  /**
   * <code>.trace.Trace trace = 21;</code>
   * @return The trace.
   */
  org.thethingsnetwork.api.trace.Trace getTrace();
  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  org.thethingsnetwork.api.trace.TraceOrBuilder getTraceOrBuilder();
}
