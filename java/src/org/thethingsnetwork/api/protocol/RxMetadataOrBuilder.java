// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/protocol.proto

package org.thethingsnetwork.api.protocol;

public interface RxMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.RxMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lorawan.Metadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
   * @return Whether the lorawan field is set.
   */
  boolean hasLorawan();
  /**
   * <code>.lorawan.Metadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
   * @return The lorawan.
   */
  org.thethingsnetwork.api.protocol.lorawan.Metadata getLorawan();
  /**
   * <code>.lorawan.Metadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.MetadataOrBuilder getLorawanOrBuilder();

  public org.thethingsnetwork.api.protocol.RxMetadata.ProtocolCase getProtocolCase();
}
