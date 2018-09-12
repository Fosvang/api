# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/protocol.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()



from github_com.TheThingsNetwork.api.protocol.lorawan import lorawan_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_lorawan__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='github.com/TheThingsNetwork/api/protocol/protocol.proto',
  package='protocol',
  syntax='proto3',
  serialized_pb=_b('\n7github.com/TheThingsNetwork/api/protocol/protocol.proto\x12\x08protocol\x1a-github.com/gogo/protobuf/gogoproto/gogo.proto\x1a>github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto\"G\n\x07Message\x12\x30\n\x07lorawan\x18\x01 \x01(\x0b\x32\x10.lorawan.MessageB\x0b\xe2\xde\x1f\x07LoRaWANH\x00\x42\n\n\x08protocol\"K\n\nRxMetadata\x12\x31\n\x07lorawan\x18\x01 \x01(\x0b\x32\x11.lorawan.MetadataB\x0b\xe2\xde\x1f\x07LoRaWANH\x00\x42\n\n\x08protocol\"W\n\x0fTxConfiguration\x12\x38\n\x07lorawan\x18\x01 \x01(\x0b\x32\x18.lorawan.TxConfigurationB\x0b\xe2\xde\x1f\x07LoRaWANH\x00\x42\n\n\x08protocol\"]\n\x12\x41\x63tivationMetadata\x12;\n\x07lorawan\x18\x01 \x01(\x0b\x32\x1b.lorawan.ActivationMetadataB\x0b\xe2\xde\x1f\x07LoRaWANH\x00\x42\n\n\x08protocolB~\n!org.thethingsnetwork.api.protocolB\rProtocolProtoP\x01Z(github.com/TheThingsNetwork/api/protocol\xaa\x02\x1dTheThingsNetwork.API.Protocolb\x06proto3')
  ,
  dependencies=[github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_lorawan__pb2.DESCRIPTOR,])




_MESSAGE = _descriptor.Descriptor(
  name='Message',
  full_name='protocol.Message',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lorawan', full_name='protocol.Message.lorawan', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=_descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN')), file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='protocol', full_name='protocol.Message.protocol',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=180,
  serialized_end=251,
)


_RXMETADATA = _descriptor.Descriptor(
  name='RxMetadata',
  full_name='protocol.RxMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lorawan', full_name='protocol.RxMetadata.lorawan', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=_descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN')), file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='protocol', full_name='protocol.RxMetadata.protocol',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=253,
  serialized_end=328,
)


_TXCONFIGURATION = _descriptor.Descriptor(
  name='TxConfiguration',
  full_name='protocol.TxConfiguration',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lorawan', full_name='protocol.TxConfiguration.lorawan', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=_descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN')), file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='protocol', full_name='protocol.TxConfiguration.protocol',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=330,
  serialized_end=417,
)


_ACTIVATIONMETADATA = _descriptor.Descriptor(
  name='ActivationMetadata',
  full_name='protocol.ActivationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lorawan', full_name='protocol.ActivationMetadata.lorawan', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=_descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN')), file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='protocol', full_name='protocol.ActivationMetadata.protocol',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=419,
  serialized_end=512,
)

_MESSAGE.fields_by_name['lorawan'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_lorawan__pb2._MESSAGE
_MESSAGE.oneofs_by_name['protocol'].fields.append(
  _MESSAGE.fields_by_name['lorawan'])
_MESSAGE.fields_by_name['lorawan'].containing_oneof = _MESSAGE.oneofs_by_name['protocol']
_RXMETADATA.fields_by_name['lorawan'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_lorawan__pb2._METADATA
_RXMETADATA.oneofs_by_name['protocol'].fields.append(
  _RXMETADATA.fields_by_name['lorawan'])
_RXMETADATA.fields_by_name['lorawan'].containing_oneof = _RXMETADATA.oneofs_by_name['protocol']
_TXCONFIGURATION.fields_by_name['lorawan'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_lorawan__pb2._TXCONFIGURATION
_TXCONFIGURATION.oneofs_by_name['protocol'].fields.append(
  _TXCONFIGURATION.fields_by_name['lorawan'])
_TXCONFIGURATION.fields_by_name['lorawan'].containing_oneof = _TXCONFIGURATION.oneofs_by_name['protocol']
_ACTIVATIONMETADATA.fields_by_name['lorawan'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_lorawan_dot_lorawan__pb2._ACTIVATIONMETADATA
_ACTIVATIONMETADATA.oneofs_by_name['protocol'].fields.append(
  _ACTIVATIONMETADATA.fields_by_name['lorawan'])
_ACTIVATIONMETADATA.fields_by_name['lorawan'].containing_oneof = _ACTIVATIONMETADATA.oneofs_by_name['protocol']
DESCRIPTOR.message_types_by_name['Message'] = _MESSAGE
DESCRIPTOR.message_types_by_name['RxMetadata'] = _RXMETADATA
DESCRIPTOR.message_types_by_name['TxConfiguration'] = _TXCONFIGURATION
DESCRIPTOR.message_types_by_name['ActivationMetadata'] = _ACTIVATIONMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Message = _reflection.GeneratedProtocolMessageType('Message', (_message.Message,), dict(
  DESCRIPTOR = _MESSAGE,
  __module__ = 'github.com.TheThingsNetwork.api.protocol.protocol_pb2'
  # @@protoc_insertion_point(class_scope:protocol.Message)
  ))
_sym_db.RegisterMessage(Message)

RxMetadata = _reflection.GeneratedProtocolMessageType('RxMetadata', (_message.Message,), dict(
  DESCRIPTOR = _RXMETADATA,
  __module__ = 'github.com.TheThingsNetwork.api.protocol.protocol_pb2'
  # @@protoc_insertion_point(class_scope:protocol.RxMetadata)
  ))
_sym_db.RegisterMessage(RxMetadata)

TxConfiguration = _reflection.GeneratedProtocolMessageType('TxConfiguration', (_message.Message,), dict(
  DESCRIPTOR = _TXCONFIGURATION,
  __module__ = 'github.com.TheThingsNetwork.api.protocol.protocol_pb2'
  # @@protoc_insertion_point(class_scope:protocol.TxConfiguration)
  ))
_sym_db.RegisterMessage(TxConfiguration)

ActivationMetadata = _reflection.GeneratedProtocolMessageType('ActivationMetadata', (_message.Message,), dict(
  DESCRIPTOR = _ACTIVATIONMETADATA,
  __module__ = 'github.com.TheThingsNetwork.api.protocol.protocol_pb2'
  # @@protoc_insertion_point(class_scope:protocol.ActivationMetadata)
  ))
_sym_db.RegisterMessage(ActivationMetadata)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n!org.thethingsnetwork.api.protocolB\rProtocolProtoP\001Z(github.com/TheThingsNetwork/api/protocol\252\002\035TheThingsNetwork.API.Protocol'))
_MESSAGE.fields_by_name['lorawan'].has_options = True
_MESSAGE.fields_by_name['lorawan']._options = _descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN'))
_RXMETADATA.fields_by_name['lorawan'].has_options = True
_RXMETADATA.fields_by_name['lorawan']._options = _descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN'))
_TXCONFIGURATION.fields_by_name['lorawan'].has_options = True
_TXCONFIGURATION.fields_by_name['lorawan']._options = _descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN'))
_ACTIVATIONMETADATA.fields_by_name['lorawan'].has_options = True
_ACTIVATIONMETADATA.fields_by_name['lorawan']._options = _descriptor._ParseOptions(descriptor_pb2.FieldOptions(), _b('\342\336\037\007LoRaWAN'))
# @@protoc_insertion_point(module_scope)
