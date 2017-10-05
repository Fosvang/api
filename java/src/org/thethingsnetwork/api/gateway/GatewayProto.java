// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/gateway/gateway.proto

package org.thethingsnetwork.api.gateway;

public final class GatewayProto {
  private GatewayProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gateway_LocationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gateway_LocationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gateway_RxMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gateway_RxMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gateway_RxMetadata_Antenna_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gateway_RxMetadata_Antenna_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gateway_TxConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gateway_TxConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gateway_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gateway_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gateway_Status_OSMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gateway_Status_OSMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5github.com/TheThingsNetwork/api/gatewa" +
      "y/gateway.proto\022\007gateway\032-github.com/gog" +
      "o/protobuf/gogoproto/gogo.proto\"\371\001\n\020Loca" +
      "tionMetadata\022\014\n\004time\030\001 \001(\003\022\020\n\010latitude\030\002" +
      " \001(\002\022\021\n\tlongitude\030\003 \001(\002\022\020\n\010altitude\030\004 \001(" +
      "\005\022\020\n\010accuracy\030\005 \001(\005\0228\n\006source\030\006 \001(\0162(.ga" +
      "teway.LocationMetadata.LocationSource\"T\n" +
      "\016LocationSource\022\013\n\007UNKNOWN\020\000\022\007\n\003GPS\020\001\022\n\n" +
      "\006CONFIG\020\002\022\014\n\010REGISTRY\020\003\022\022\n\016IP_GEOLOCATIO" +
      "N\020\004\"\305\004\n\nRxMetadata\022!\n\ngateway_id\030\001 \001(\tB\r",
      "\342\336\037\tGatewayID\022\027\n\017gateway_trusted\030\002 \001(\010\022\021" +
      "\n\ttimestamp\030\013 \001(\r\022\014\n\004time\030\014 \001(\003\022\026\n\016encry" +
      "pted_time\030\r \001(\014\022\020\n\010rf_chain\030\025 \001(\r\022\017\n\007cha" +
      "nnel\030\026 \001(\r\022-\n\010antennas\030\036 \003(\0132\033.gateway.R" +
      "xMetadata.Antenna\022\021\n\tfrequency\030\037 \001(\004\022\026\n\004" +
      "rssi\030  \001(\002B\010\342\336\037\004RSSI\022\024\n\003snr\030! \001(\002B\007\342\336\037\003S" +
      "NR\022+\n\010location\030) \001(\0132\031.gateway.LocationM" +
      "etadata\032\201\002\n\007Antenna\022\017\n\007antenna\030\001 \001(\r\022\017\n\007" +
      "channel\030\002 \001(\r\022\026\n\004rssi\030\003 \001(\002B\010\342\336\037\004RSSI\022%\n" +
      "\014channel_rssi\030\005 \001(\002B\017\342\336\037\013ChannelRSSI\022:\n\027",
      "rssi_standard_deviation\030\006 \001(\002B\031\342\336\037\025RSSIS" +
      "tandardDeviation\022\030\n\020frequency_offset\030\007 \001" +
      "(\003\022\024\n\003snr\030\004 \001(\002B\007\342\336\037\003SNR\022\026\n\016encrypted_ti" +
      "me\030\n \001(\014\022\021\n\tfine_time\030\013 \001(\003\"\225\001\n\017TxConfig" +
      "uration\022\021\n\ttimestamp\030\013 \001(\r\022\020\n\010rf_chain\030\025" +
      " \001(\r\022\021\n\tfrequency\030\026 \001(\004\022\r\n\005power\030\027 \001(\005\022\036" +
      "\n\026polarization_inversion\030\037 \001(\010\022\033\n\023freque" +
      "ncy_deviation\030  \001(\r\"\303\005\n\006Status\022\021\n\ttimest" +
      "amp\030\001 \001(\r\022\014\n\004time\030\002 \001(\003\022\027\n\017gateway_trust" +
      "ed\030\003 \001(\010\022\021\n\tboot_time\030\004 \001(\003\022\022\n\002ip\030\013 \003(\tB",
      "\006\342\336\037\002IP\022\020\n\010platform\030\014 \001(\t\022\025\n\rcontact_ema" +
      "il\030\r \001(\t\022\023\n\013description\030\016 \001(\t\022\026\n\016frequen" +
      "cy_plan\030\017 \001(\t\022\016\n\006bridge\030\020 \001(\t\022\016\n\006router\030" +
      "\021 \001(\t\022\026\n\004fpga\030\022 \001(\rB\010\342\336\037\004FPGA\022\024\n\003dsp\030\023 \001" +
      "(\rB\007\342\336\037\003DSP\022\024\n\003hal\030\024 \001(\tB\007\342\336\037\003HAL\022+\n\010loc" +
      "ation\030\025 \001(\0132\031.gateway.LocationMetadata\022\024" +
      "\n\003rtt\030\037 \001(\rB\007\342\336\037\003RTT\022\r\n\005rx_in\030) \001(\r\022\r\n\005r" +
      "x_ok\030* \001(\r\022\r\n\005tx_in\030+ \001(\r\022\r\n\005tx_ok\030, \001(\r" +
      "\022\r\n\005lm_ok\030- \001(\r\022\r\n\005lm_st\030. \001(\r\022\r\n\005lm_nw\030" +
      "/ \001(\r\022\027\n\005l_pps\0300 \001(\rB\010\342\336\037\004LPPS\022-\n\002os\0303 \001",
      "(\0132\031.gateway.Status.OSMetricsB\006\342\336\037\002OS\022\020\n" +
      "\010messages\0304 \003(\t\032\227\001\n\tOSMetrics\022\016\n\006load_1\030" +
      "\001 \001(\002\022\016\n\006load_5\030\002 \001(\002\022\017\n\007load_15\030\003 \001(\002\022)" +
      "\n\016cpu_percentage\030\013 \001(\002B\021\342\336\037\rCPUPercentag" +
      "e\022\031\n\021memory_percentage\030\025 \001(\002\022\023\n\013temperat" +
      "ure\030\037 \001(\002Bz\n org.thethingsnetwork.api.ga" +
      "tewayB\014GatewayProtoP\001Z\'github.com/TheThi" +
      "ngsNetwork/api/gateway\252\002\034TheThingsNetwor" +
      "k.API.Gatewayb\006proto3"
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
          com.google.protobuf.GoGoProtos.getDescriptor(),
        }, assigner);
    internal_static_gateway_LocationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gateway_LocationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gateway_LocationMetadata_descriptor,
        new java.lang.String[] { "Time", "Latitude", "Longitude", "Altitude", "Accuracy", "Source", });
    internal_static_gateway_RxMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gateway_RxMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gateway_RxMetadata_descriptor,
        new java.lang.String[] { "GatewayId", "GatewayTrusted", "Timestamp", "Time", "EncryptedTime", "RfChain", "Channel", "Antennas", "Frequency", "Rssi", "Snr", "Location", });
    internal_static_gateway_RxMetadata_Antenna_descriptor =
      internal_static_gateway_RxMetadata_descriptor.getNestedTypes().get(0);
    internal_static_gateway_RxMetadata_Antenna_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gateway_RxMetadata_Antenna_descriptor,
        new java.lang.String[] { "Antenna", "Channel", "Rssi", "ChannelRssi", "RssiStandardDeviation", "FrequencyOffset", "Snr", "EncryptedTime", "FineTime", });
    internal_static_gateway_TxConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_gateway_TxConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gateway_TxConfiguration_descriptor,
        new java.lang.String[] { "Timestamp", "RfChain", "Frequency", "Power", "PolarizationInversion", "FrequencyDeviation", });
    internal_static_gateway_Status_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_gateway_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gateway_Status_descriptor,
        new java.lang.String[] { "Timestamp", "Time", "GatewayTrusted", "BootTime", "Ip", "Platform", "ContactEmail", "Description", "FrequencyPlan", "Bridge", "Router", "Fpga", "Dsp", "Hal", "Location", "Rtt", "RxIn", "RxOk", "TxIn", "TxOk", "LmOk", "LmSt", "LmNw", "LPps", "Os", "Messages", });
    internal_static_gateway_Status_OSMetrics_descriptor =
      internal_static_gateway_Status_descriptor.getNestedTypes().get(0);
    internal_static_gateway_Status_OSMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gateway_Status_OSMetrics_descriptor,
        new java.lang.String[] { "Load1", "Load5", "Load15", "CpuPercentage", "MemoryPercentage", "Temperature", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customname);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
