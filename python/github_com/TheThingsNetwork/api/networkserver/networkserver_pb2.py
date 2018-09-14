# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()



from github_com.TheThingsNetwork.api import api_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2
from github_com.TheThingsNetwork.api.protocol.lorawan import device_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_device__pb2
from github_com.TheThingsNetwork.api.broker import broker_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2
from github_com.TheThingsNetwork.api.handler import handler_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='github.com/TheThingsNetwork/api/networkserver/networkserver.proto',
  package='networkserver',
  syntax='proto3',
  serialized_options=_b('\n&org.thethingsnetwork.api.networkserverB\022NetworkServerProtoP\001Z-github.com/TheThingsNetwork/api/networkserver\252\002\034TheThingsNetwork.API.Monitor'),
  serialized_pb=_b('\nAgithub.com/TheThingsNetwork/api/networkserver/networkserver.proto\x12\rnetworkserver\x1a-github.com/gogo/protobuf/gogoproto/gogo.proto\x1a)github.com/TheThingsNetwork/api/api.proto\x1a=github.com/TheThingsNetwork/api/protocol/lorawan/device.proto\x1a\x33github.com/TheThingsNetwork/api/broker/broker.proto\x1a\x35github.com/TheThingsNetwork/api/handler/handler.proto\"m\n\x0e\x44\x65vicesRequest\x12L\n\x08\x64\x65v_addr\x18\x01 \x01(\x0c\x42:\xc8\xde\x1f\x00\xda\xde\x1f\x32github.com/TheThingsNetwork/ttn/core/types.DevAddr\x12\r\n\x05\x66_cnt\x18\x02 \x01(\r\"3\n\x0f\x44\x65vicesResponse\x12 \n\x07results\x18\x01 \x03(\x0b\x32\x0f.lorawan.Device\"\x0f\n\rStatusRequest\"\xe8\x01\n\x06Status\x12&\n\x06system\x18\x01 \x01(\x0b\x32\x10.api.SystemStatsB\x04\xc8\xde\x1f\x00\x12,\n\tcomponent\x18\x02 \x01(\x0b\x32\x13.api.ComponentStatsB\x04\xc8\xde\x1f\x00\x12\x1a\n\x06uplink\x18\x0b \x01(\x0b\x32\n.api.Rates\x12\x1c\n\x08\x64ownlink\x18\x0c \x01(\x0b\x32\n.api.Rates\x12\x1f\n\x0b\x61\x63tivations\x18\r \x01(\x0b\x32\n.api.Rates\x12-\n\x13\x64\x65vices_per_address\x18\x15 \x01(\x0b\x32\x10.api.Percentiles2\xab\x03\n\rNetworkServer\x12K\n\nGetDevices\x12\x1d.networkserver.DevicesRequest\x1a\x1e.networkserver.DevicesResponse\x12m\n\x11PrepareActivation\x12+.broker.DeduplicatedDeviceActivationRequest\x1a+.broker.DeduplicatedDeviceActivationRequest\x12P\n\x08\x41\x63tivate\x12!.handler.DeviceActivationResponse\x1a!.handler.DeviceActivationResponse\x12N\n\x06Uplink\x12!.broker.DeduplicatedUplinkMessage\x1a!.broker.DeduplicatedUplinkMessage\x12<\n\x08\x44ownlink\x12\x17.broker.DownlinkMessage\x1a\x17.broker.DownlinkMessage2X\n\x14NetworkServerManager\x12@\n\tGetStatus\x12\x1c.networkserver.StatusRequest\x1a\x15.networkserver.StatusB\x8c\x01\n&org.thethingsnetwork.api.networkserverB\x12NetworkServerProtoP\x01Z-github.com/TheThingsNetwork/api/networkserver\xaa\x02\x1cTheThingsNetwork.API.Monitorb\x06proto3')
  ,
  dependencies=[github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_device__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DESCRIPTOR,])




_DEVICESREQUEST = _descriptor.Descriptor(
  name='DevicesRequest',
  full_name='networkserver.DevicesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dev_addr', full_name='networkserver.DevicesRequest.dev_addr', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\310\336\037\000\332\336\0372github.com/TheThingsNetwork/ttn/core/types.DevAddr'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='f_cnt', full_name='networkserver.DevicesRequest.f_cnt', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=345,
  serialized_end=454,
)


_DEVICESRESPONSE = _descriptor.Descriptor(
  name='DevicesResponse',
  full_name='networkserver.DevicesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='results', full_name='networkserver.DevicesResponse.results', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=456,
  serialized_end=507,
)


_STATUSREQUEST = _descriptor.Descriptor(
  name='StatusRequest',
  full_name='networkserver.StatusRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=509,
  serialized_end=524,
)


_STATUS = _descriptor.Descriptor(
  name='Status',
  full_name='networkserver.Status',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='system', full_name='networkserver.Status.system', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\310\336\037\000'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='component', full_name='networkserver.Status.component', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\310\336\037\000'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='uplink', full_name='networkserver.Status.uplink', index=2,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='downlink', full_name='networkserver.Status.downlink', index=3,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='activations', full_name='networkserver.Status.activations', index=4,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='devices_per_address', full_name='networkserver.Status.devices_per_address', index=5,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=527,
  serialized_end=759,
)

_DEVICESRESPONSE.fields_by_name['results'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_device__pb2._DEVICE
_STATUS.fields_by_name['system'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._SYSTEMSTATS
_STATUS.fields_by_name['component'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._COMPONENTSTATS
_STATUS.fields_by_name['uplink'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._RATES
_STATUS.fields_by_name['downlink'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._RATES
_STATUS.fields_by_name['activations'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._RATES
_STATUS.fields_by_name['devices_per_address'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._PERCENTILES
DESCRIPTOR.message_types_by_name['DevicesRequest'] = _DEVICESREQUEST
DESCRIPTOR.message_types_by_name['DevicesResponse'] = _DEVICESRESPONSE
DESCRIPTOR.message_types_by_name['StatusRequest'] = _STATUSREQUEST
DESCRIPTOR.message_types_by_name['Status'] = _STATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DevicesRequest = _reflection.GeneratedProtocolMessageType('DevicesRequest', (_message.Message,), dict(
  DESCRIPTOR = _DEVICESREQUEST,
  __module__ = 'github.com.TheThingsNetwork.api.networkserver.networkserver_pb2'
  # @@protoc_insertion_point(class_scope:networkserver.DevicesRequest)
  ))
_sym_db.RegisterMessage(DevicesRequest)

DevicesResponse = _reflection.GeneratedProtocolMessageType('DevicesResponse', (_message.Message,), dict(
  DESCRIPTOR = _DEVICESRESPONSE,
  __module__ = 'github.com.TheThingsNetwork.api.networkserver.networkserver_pb2'
  # @@protoc_insertion_point(class_scope:networkserver.DevicesResponse)
  ))
_sym_db.RegisterMessage(DevicesResponse)

StatusRequest = _reflection.GeneratedProtocolMessageType('StatusRequest', (_message.Message,), dict(
  DESCRIPTOR = _STATUSREQUEST,
  __module__ = 'github.com.TheThingsNetwork.api.networkserver.networkserver_pb2'
  # @@protoc_insertion_point(class_scope:networkserver.StatusRequest)
  ))
_sym_db.RegisterMessage(StatusRequest)

Status = _reflection.GeneratedProtocolMessageType('Status', (_message.Message,), dict(
  DESCRIPTOR = _STATUS,
  __module__ = 'github.com.TheThingsNetwork.api.networkserver.networkserver_pb2'
  # @@protoc_insertion_point(class_scope:networkserver.Status)
  ))
_sym_db.RegisterMessage(Status)


DESCRIPTOR._options = None
_DEVICESREQUEST.fields_by_name['dev_addr']._options = None
_STATUS.fields_by_name['system']._options = None
_STATUS.fields_by_name['component']._options = None

_NETWORKSERVER = _descriptor.ServiceDescriptor(
  name='NetworkServer',
  full_name='networkserver.NetworkServer',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=762,
  serialized_end=1189,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetDevices',
    full_name='networkserver.NetworkServer.GetDevices',
    index=0,
    containing_service=None,
    input_type=_DEVICESREQUEST,
    output_type=_DEVICESRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='PrepareActivation',
    full_name='networkserver.NetworkServer.PrepareActivation',
    index=1,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DEDUPLICATEDDEVICEACTIVATIONREQUEST,
    output_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DEDUPLICATEDDEVICEACTIVATIONREQUEST,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Activate',
    full_name='networkserver.NetworkServer.Activate',
    index=2,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2._DEVICEACTIVATIONRESPONSE,
    output_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2._DEVICEACTIVATIONRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Uplink',
    full_name='networkserver.NetworkServer.Uplink',
    index=3,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DEDUPLICATEDUPLINKMESSAGE,
    output_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DEDUPLICATEDUPLINKMESSAGE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Downlink',
    full_name='networkserver.NetworkServer.Downlink',
    index=4,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DOWNLINKMESSAGE,
    output_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DOWNLINKMESSAGE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_NETWORKSERVER)

DESCRIPTOR.services_by_name['NetworkServer'] = _NETWORKSERVER


_NETWORKSERVERMANAGER = _descriptor.ServiceDescriptor(
  name='NetworkServerManager',
  full_name='networkserver.NetworkServerManager',
  file=DESCRIPTOR,
  index=1,
  serialized_options=None,
  serialized_start=1191,
  serialized_end=1279,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetStatus',
    full_name='networkserver.NetworkServerManager.GetStatus',
    index=0,
    containing_service=None,
    input_type=_STATUSREQUEST,
    output_type=_STATUS,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_NETWORKSERVERMANAGER)

DESCRIPTOR.services_by_name['NetworkServerManager'] = _NETWORKSERVERMANAGER

# @@protoc_insertion_point(module_scope)
