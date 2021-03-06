// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto
//
// For information on using the generated types, please see the documenation:
//   https://github.com/apple/swift-protobuf/

// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that your are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Lorawan_DeviceIdentifier {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
  var appEui: Data = SwiftProtobuf.Internal.emptyData

  /// The DevEUI is a unique, 8 byte identifier for the device.
  var devEui: Data = SwiftProtobuf.Internal.emptyData

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Lorawan_Device {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
  var appEui: Data = SwiftProtobuf.Internal.emptyData

  /// The DevEUI is a unique, 8 byte identifier for the device.
  var devEui: Data = SwiftProtobuf.Internal.emptyData

  /// The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
  var appID: String = String()

  /// The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
  var devID: String = String()

  /// The DevAddr is a dynamic, 4 byte session address for the device.
  var devAddr: Data = SwiftProtobuf.Internal.emptyData

  /// The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality.
  /// This key is negotiated during the OTAA join procedure, or statically configured using ABP.
  var nwkSKey: Data = SwiftProtobuf.Internal.emptyData

  /// The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption.
  /// This key is negotiated during the OTAA join procedure, or statically configured using ABP.
  var appSKey: Data = SwiftProtobuf.Internal.emptyData

  /// The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA).
  var appKey: Data = SwiftProtobuf.Internal.emptyData

  /// FCntUp is the uplink frame counter for a device session.
  var fCntUp: UInt32 = 0

  /// FCntDown is the downlink frame counter for a device session.
  var fCntDown: UInt32 = 0

  /// The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier.
  var disableFCntCheck: Bool = false

  /// The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred.
  var uses32BitFCnt: Bool = false

  /// The ActivationContstraints are used to allocate a device address for a device (comma-separated).
  /// There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
  var activationConstraints: String = String()

  /// The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
  var usedDevNonces: [Data] = []

  /// The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
  var usedAppNonces: [Data] = []

  /// When the device was last seen (Unix nanoseconds)
  var lastSeen: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "lorawan"

extension Lorawan_DeviceIdentifier: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DeviceIdentifier"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "app_eui"),
    2: .standard(proto: "dev_eui"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularBytesField(value: &self.appEui)
      case 2: try decoder.decodeSingularBytesField(value: &self.devEui)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.appEui.isEmpty {
      try visitor.visitSingularBytesField(value: self.appEui, fieldNumber: 1)
    }
    if !self.devEui.isEmpty {
      try visitor.visitSingularBytesField(value: self.devEui, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lorawan_DeviceIdentifier, rhs: Lorawan_DeviceIdentifier) -> Bool {
    if lhs.appEui != rhs.appEui {return false}
    if lhs.devEui != rhs.devEui {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Lorawan_Device: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Device"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "app_eui"),
    2: .standard(proto: "dev_eui"),
    3: .standard(proto: "app_id"),
    4: .standard(proto: "dev_id"),
    5: .standard(proto: "dev_addr"),
    6: .standard(proto: "nwk_s_key"),
    7: .standard(proto: "app_s_key"),
    8: .standard(proto: "app_key"),
    9: .standard(proto: "f_cnt_up"),
    10: .standard(proto: "f_cnt_down"),
    11: .standard(proto: "disable_f_cnt_check"),
    12: .standard(proto: "uses32_bit_f_cnt"),
    13: .standard(proto: "activation_constraints"),
    14: .standard(proto: "used_dev_nonces"),
    15: .standard(proto: "used_app_nonces"),
    21: .standard(proto: "last_seen"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularBytesField(value: &self.appEui)
      case 2: try decoder.decodeSingularBytesField(value: &self.devEui)
      case 3: try decoder.decodeSingularStringField(value: &self.appID)
      case 4: try decoder.decodeSingularStringField(value: &self.devID)
      case 5: try decoder.decodeSingularBytesField(value: &self.devAddr)
      case 6: try decoder.decodeSingularBytesField(value: &self.nwkSKey)
      case 7: try decoder.decodeSingularBytesField(value: &self.appSKey)
      case 8: try decoder.decodeSingularBytesField(value: &self.appKey)
      case 9: try decoder.decodeSingularUInt32Field(value: &self.fCntUp)
      case 10: try decoder.decodeSingularUInt32Field(value: &self.fCntDown)
      case 11: try decoder.decodeSingularBoolField(value: &self.disableFCntCheck)
      case 12: try decoder.decodeSingularBoolField(value: &self.uses32BitFCnt)
      case 13: try decoder.decodeSingularStringField(value: &self.activationConstraints)
      case 14: try decoder.decodeRepeatedBytesField(value: &self.usedDevNonces)
      case 15: try decoder.decodeRepeatedBytesField(value: &self.usedAppNonces)
      case 21: try decoder.decodeSingularInt64Field(value: &self.lastSeen)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.appEui.isEmpty {
      try visitor.visitSingularBytesField(value: self.appEui, fieldNumber: 1)
    }
    if !self.devEui.isEmpty {
      try visitor.visitSingularBytesField(value: self.devEui, fieldNumber: 2)
    }
    if !self.appID.isEmpty {
      try visitor.visitSingularStringField(value: self.appID, fieldNumber: 3)
    }
    if !self.devID.isEmpty {
      try visitor.visitSingularStringField(value: self.devID, fieldNumber: 4)
    }
    if !self.devAddr.isEmpty {
      try visitor.visitSingularBytesField(value: self.devAddr, fieldNumber: 5)
    }
    if !self.nwkSKey.isEmpty {
      try visitor.visitSingularBytesField(value: self.nwkSKey, fieldNumber: 6)
    }
    if !self.appSKey.isEmpty {
      try visitor.visitSingularBytesField(value: self.appSKey, fieldNumber: 7)
    }
    if !self.appKey.isEmpty {
      try visitor.visitSingularBytesField(value: self.appKey, fieldNumber: 8)
    }
    if self.fCntUp != 0 {
      try visitor.visitSingularUInt32Field(value: self.fCntUp, fieldNumber: 9)
    }
    if self.fCntDown != 0 {
      try visitor.visitSingularUInt32Field(value: self.fCntDown, fieldNumber: 10)
    }
    if self.disableFCntCheck != false {
      try visitor.visitSingularBoolField(value: self.disableFCntCheck, fieldNumber: 11)
    }
    if self.uses32BitFCnt != false {
      try visitor.visitSingularBoolField(value: self.uses32BitFCnt, fieldNumber: 12)
    }
    if !self.activationConstraints.isEmpty {
      try visitor.visitSingularStringField(value: self.activationConstraints, fieldNumber: 13)
    }
    if !self.usedDevNonces.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.usedDevNonces, fieldNumber: 14)
    }
    if !self.usedAppNonces.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.usedAppNonces, fieldNumber: 15)
    }
    if self.lastSeen != 0 {
      try visitor.visitSingularInt64Field(value: self.lastSeen, fieldNumber: 21)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lorawan_Device, rhs: Lorawan_Device) -> Bool {
    if lhs.appEui != rhs.appEui {return false}
    if lhs.devEui != rhs.devEui {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.devID != rhs.devID {return false}
    if lhs.devAddr != rhs.devAddr {return false}
    if lhs.nwkSKey != rhs.nwkSKey {return false}
    if lhs.appSKey != rhs.appSKey {return false}
    if lhs.appKey != rhs.appKey {return false}
    if lhs.fCntUp != rhs.fCntUp {return false}
    if lhs.fCntDown != rhs.fCntDown {return false}
    if lhs.disableFCntCheck != rhs.disableFCntCheck {return false}
    if lhs.uses32BitFCnt != rhs.uses32BitFCnt {return false}
    if lhs.activationConstraints != rhs.activationConstraints {return false}
    if lhs.usedDevNonces != rhs.usedDevNonces {return false}
    if lhs.usedAppNonces != rhs.usedAppNonces {return false}
    if lhs.lastSeen != rhs.lastSeen {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
