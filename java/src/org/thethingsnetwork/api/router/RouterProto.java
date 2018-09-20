// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/router/router.proto

package org.thethingsnetwork.api.router;

public final class RouterProto {
  private RouterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_SubscribeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_SubscribeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_UplinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_UplinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_DownlinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_DownlinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_DeviceActivationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_DeviceActivationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_DeviceActivationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_DeviceActivationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_GatewayStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_GatewayStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_GatewayStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_GatewayStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_StatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_StatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_router_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_router_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3github.com/TheThingsNetwork/api/router" +
      "/router.proto\022\006router\032\033google/protobuf/e" +
      "mpty.proto\032-github.com/gogo/protobuf/gog" +
      "oproto/gogo.proto\032)github.com/TheThingsN" +
      "etwork/api/api.proto\0327github.com/TheThin" +
      "gsNetwork/api/protocol/protocol.proto\0325g" +
      "ithub.com/TheThingsNetwork/api/gateway/g" +
      "ateway.proto\0321github.com/TheThingsNetwor" +
      "k/api/trace/trace.proto\"\022\n\020SubscribeRequ" +
      "est\"\315\001\n\rUplinkMessage\022\017\n\007payload\030\001 \001(\014\022\"" +
      "\n\007message\030\002 \001(\0132\021.protocol.Message\0225\n\021pr" +
      "otocol_metadata\030\013 \001(\0132\024.protocol.RxMetad" +
      "ataB\004\310\336\037\000\0223\n\020gateway_metadata\030\014 \001(\0132\023.ga" +
      "teway.RxMetadataB\004\310\336\037\000\022\033\n\005trace\030\025 \001(\0132\014." +
      "trace.Trace\"\343\001\n\017DownlinkMessage\022\017\n\007paylo" +
      "ad\030\001 \001(\014\022\"\n\007message\030\002 \001(\0132\021.protocol.Mes" +
      "sage\022?\n\026protocol_configuration\030\013 \001(\0132\031.p" +
      "rotocol.TxConfigurationB\004\310\336\037\000\022=\n\025gateway" +
      "_configuration\030\014 \001(\0132\030.gateway.TxConfigu" +
      "rationB\004\310\336\037\000\022\033\n\005trace\030\025 \001(\0132\014.trace.Trac" +
      "e\"\276\003\n\027DeviceActivationRequest\022\017\n\007payload" +
      "\030\001 \001(\014\022\"\n\007message\030\002 \001(\0132\021.protocol.Messa" +
      "ge\022T\n\007dev_eui\030\013 \001(\014BC\342\336\037\006DevEUI\310\336\037\000\332\336\0371g" +
      "ithub.com/TheThingsNetwork/ttn/core/type" +
      "s.DevEUI\022T\n\007app_eui\030\014 \001(\014BC\342\336\037\006AppEUI\310\336\037" +
      "\000\332\336\0371github.com/TheThingsNetwork/ttn/cor" +
      "e/types.AppEUI\0225\n\021protocol_metadata\030\025 \001(" +
      "\0132\024.protocol.RxMetadataB\004\310\336\037\000\0223\n\020gateway" +
      "_metadata\030\026 \001(\0132\023.gateway.RxMetadataB\004\310\336" +
      "\037\000\0229\n\023activation_metadata\030\027 \001(\0132\034.protoc" +
      "ol.ActivationMetadata\022\033\n\005trace\030\037 \001(\0132\014.t" +
      "race.Trace\"\032\n\030DeviceActivationResponse\"9" +
      "\n\024GatewayStatusRequest\022!\n\ngateway_id\030\001 \001" +
      "(\tB\r\342\336\037\tGatewayID\"Q\n\025GatewayStatusRespon" +
      "se\022\021\n\tlast_seen\030\001 \001(\003\022%\n\006status\030\002 \001(\0132\017." +
      "gateway.StatusB\004\310\336\037\000\"\017\n\rStatusRequest\"\210\002" +
      "\n\006Status\022 \n\006system\030\001 \001(\0132\020.api.SystemSta" +
      "ts\022&\n\tcomponent\030\002 \001(\0132\023.api.ComponentSta" +
      "ts\022\"\n\016gateway_status\030\013 \001(\0132\n.api.Rates\022\032" +
      "\n\006uplink\030\014 \001(\0132\n.api.Rates\022\034\n\010downlink\030\r" +
      " \001(\0132\n.api.Rates\022\037\n\013activations\030\016 \001(\0132\n." +
      "api.Rates\022\032\n\022connected_gateways\030\025 \001(\r\022\031\n" +
      "\021connected_brokers\030\026 \001(\r2\220\002\n\006Router\022:\n\rG" +
      "atewayStatus\022\017.gateway.Status\032\026.google.p" +
      "rotobuf.Empty(\001\0229\n\006Uplink\022\025.router.Uplin" +
      "kMessage\032\026.google.protobuf.Empty(\001\022@\n\tSu" +
      "bscribe\022\030.router.SubscribeRequest\032\027.rout" +
      "er.DownlinkMessage0\001\022M\n\010Activate\022\037.route" +
      "r.DeviceActivationRequest\032 .router.Devic" +
      "eActivationResponse2\221\001\n\rRouterManager\022L\n" +
      "\rGatewayStatus\022\034.router.GatewayStatusReq" +
      "uest\032\035.router.GatewayStatusResponse\0222\n\tG" +
      "etStatus\022\025.router.StatusRequest\032\016.router" +
      ".StatusBv\n\037org.thethingsnetwork.api.rout" +
      "erB\013RouterProtoP\001Z&github.com/TheThingsN" +
      "etwork/api/router\252\002\033TheThingsNetwork.API" +
      ".Routerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          org.thethingsnetwork.api.APIProto.getDescriptor(),
          org.thethingsnetwork.api.protocol.ProtocolProto.getDescriptor(),
          org.thethingsnetwork.api.gateway.GatewayProto.getDescriptor(),
          org.thethingsnetwork.api.trace.TraceProto.getDescriptor(),
        }, assigner);
    internal_static_router_SubscribeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_router_SubscribeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_SubscribeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_router_UplinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_router_UplinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_UplinkMessage_descriptor,
        new java.lang.String[] { "Payload", "Message", "ProtocolMetadata", "GatewayMetadata", "Trace", });
    internal_static_router_DownlinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_router_DownlinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_DownlinkMessage_descriptor,
        new java.lang.String[] { "Payload", "Message", "ProtocolConfiguration", "GatewayConfiguration", "Trace", });
    internal_static_router_DeviceActivationRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_router_DeviceActivationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_DeviceActivationRequest_descriptor,
        new java.lang.String[] { "Payload", "Message", "DevEui", "AppEui", "ProtocolMetadata", "GatewayMetadata", "ActivationMetadata", "Trace", });
    internal_static_router_DeviceActivationResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_router_DeviceActivationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_DeviceActivationResponse_descriptor,
        new java.lang.String[] { });
    internal_static_router_GatewayStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_router_GatewayStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_GatewayStatusRequest_descriptor,
        new java.lang.String[] { "GatewayId", });
    internal_static_router_GatewayStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_router_GatewayStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_GatewayStatusResponse_descriptor,
        new java.lang.String[] { "LastSeen", "Status", });
    internal_static_router_StatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_router_StatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_StatusRequest_descriptor,
        new java.lang.String[] { });
    internal_static_router_Status_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_router_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_router_Status_descriptor,
        new java.lang.String[] { "System", "Component", "GatewayStatus", "Uplink", "Downlink", "Activations", "ConnectedGateways", "ConnectedBrokers", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    org.thethingsnetwork.api.APIProto.getDescriptor();
    org.thethingsnetwork.api.protocol.ProtocolProto.getDescriptor();
    org.thethingsnetwork.api.gateway.GatewayProto.getDescriptor();
    org.thethingsnetwork.api.trace.TraceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
