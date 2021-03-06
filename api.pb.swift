// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/api.proto
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

struct Api_Percentiles {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var percentile1: Float = 0

  var percentile5: Float = 0

  var percentile10: Float = 0

  var percentile25: Float = 0

  var percentile50: Float = 0

  var percentile75: Float = 0

  var percentile90: Float = 0

  var percentile95: Float = 0

  var percentile99: Float = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Api_Rates {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var rate1: Float = 0

  var rate5: Float = 0

  var rate15: Float = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Api_SystemStats {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var load: Api_SystemStats.Loadstats {
    get {return _storage._load ?? Api_SystemStats.Loadstats()}
    set {_uniqueStorage()._load = newValue}
  }
  /// Returns true if `load` has been explicitly set.
  var hasLoad: Bool {return _storage._load != nil}
  /// Clears the value of `load`. Subsequent reads from it will return its default value.
  mutating func clearLoad() {_uniqueStorage()._load = nil}

  var cpu: Api_SystemStats.CPUStats {
    get {return _storage._cpu ?? Api_SystemStats.CPUStats()}
    set {_uniqueStorage()._cpu = newValue}
  }
  /// Returns true if `cpu` has been explicitly set.
  var hasCpu: Bool {return _storage._cpu != nil}
  /// Clears the value of `cpu`. Subsequent reads from it will return its default value.
  mutating func clearCpu() {_uniqueStorage()._cpu = nil}

  var memory: Api_SystemStats.MemoryStats {
    get {return _storage._memory ?? Api_SystemStats.MemoryStats()}
    set {_uniqueStorage()._memory = newValue}
  }
  /// Returns true if `memory` has been explicitly set.
  var hasMemory: Bool {return _storage._memory != nil}
  /// Clears the value of `memory`. Subsequent reads from it will return its default value.
  mutating func clearMemory() {_uniqueStorage()._memory = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  struct Loadstats {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    var load1: Float = 0

    var load5: Float = 0

    var load15: Float = 0

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}
  }

  struct CPUStats {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    var user: Float = 0

    var system: Float = 0

    var idle: Float = 0

    var percentage: Float = 0

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}
  }

  struct MemoryStats {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    var total: UInt64 = 0

    var available: UInt64 = 0

    var used: UInt64 = 0

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}
  }

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

struct Api_ComponentStats {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var uptime: UInt64 {
    get {return _storage._uptime}
    set {_uniqueStorage()._uptime = newValue}
  }

  var cpu: Api_ComponentStats.CPUStats {
    get {return _storage._cpu ?? Api_ComponentStats.CPUStats()}
    set {_uniqueStorage()._cpu = newValue}
  }
  /// Returns true if `cpu` has been explicitly set.
  var hasCpu: Bool {return _storage._cpu != nil}
  /// Clears the value of `cpu`. Subsequent reads from it will return its default value.
  mutating func clearCpu() {_uniqueStorage()._cpu = nil}

  var memory: Api_ComponentStats.MemoryStats {
    get {return _storage._memory ?? Api_ComponentStats.MemoryStats()}
    set {_uniqueStorage()._memory = newValue}
  }
  /// Returns true if `memory` has been explicitly set.
  var hasMemory: Bool {return _storage._memory != nil}
  /// Clears the value of `memory`. Subsequent reads from it will return its default value.
  mutating func clearMemory() {_uniqueStorage()._memory = nil}

  var goroutines: UInt64 {
    get {return _storage._goroutines}
    set {_uniqueStorage()._goroutines = newValue}
  }

  var gcCpuFraction: Float {
    get {return _storage._gcCpuFraction}
    set {_uniqueStorage()._gcCpuFraction = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  struct CPUStats {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    var user: Float = 0

    var system: Float = 0

    var idle: Float = 0

    var percentage: Float = 0

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}
  }

  struct MemoryStats {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    var memory: UInt64 = 0

    var swap: UInt64 = 0

    var heap: UInt64 = 0

    var stack: UInt64 = 0

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}
  }

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "api"

extension Api_Percentiles: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Percentiles"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "percentile1"),
    2: .same(proto: "percentile5"),
    3: .same(proto: "percentile10"),
    4: .same(proto: "percentile25"),
    5: .same(proto: "percentile50"),
    6: .same(proto: "percentile75"),
    7: .same(proto: "percentile90"),
    8: .same(proto: "percentile95"),
    9: .same(proto: "percentile99"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularFloatField(value: &self.percentile1)
      case 2: try decoder.decodeSingularFloatField(value: &self.percentile5)
      case 3: try decoder.decodeSingularFloatField(value: &self.percentile10)
      case 4: try decoder.decodeSingularFloatField(value: &self.percentile25)
      case 5: try decoder.decodeSingularFloatField(value: &self.percentile50)
      case 6: try decoder.decodeSingularFloatField(value: &self.percentile75)
      case 7: try decoder.decodeSingularFloatField(value: &self.percentile90)
      case 8: try decoder.decodeSingularFloatField(value: &self.percentile95)
      case 9: try decoder.decodeSingularFloatField(value: &self.percentile99)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.percentile1 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile1, fieldNumber: 1)
    }
    if self.percentile5 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile5, fieldNumber: 2)
    }
    if self.percentile10 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile10, fieldNumber: 3)
    }
    if self.percentile25 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile25, fieldNumber: 4)
    }
    if self.percentile50 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile50, fieldNumber: 5)
    }
    if self.percentile75 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile75, fieldNumber: 6)
    }
    if self.percentile90 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile90, fieldNumber: 7)
    }
    if self.percentile95 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile95, fieldNumber: 8)
    }
    if self.percentile99 != 0 {
      try visitor.visitSingularFloatField(value: self.percentile99, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_Percentiles, rhs: Api_Percentiles) -> Bool {
    if lhs.percentile1 != rhs.percentile1 {return false}
    if lhs.percentile5 != rhs.percentile5 {return false}
    if lhs.percentile10 != rhs.percentile10 {return false}
    if lhs.percentile25 != rhs.percentile25 {return false}
    if lhs.percentile50 != rhs.percentile50 {return false}
    if lhs.percentile75 != rhs.percentile75 {return false}
    if lhs.percentile90 != rhs.percentile90 {return false}
    if lhs.percentile95 != rhs.percentile95 {return false}
    if lhs.percentile99 != rhs.percentile99 {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_Rates: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Rates"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "rate1"),
    2: .same(proto: "rate5"),
    3: .same(proto: "rate15"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularFloatField(value: &self.rate1)
      case 2: try decoder.decodeSingularFloatField(value: &self.rate5)
      case 3: try decoder.decodeSingularFloatField(value: &self.rate15)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.rate1 != 0 {
      try visitor.visitSingularFloatField(value: self.rate1, fieldNumber: 1)
    }
    if self.rate5 != 0 {
      try visitor.visitSingularFloatField(value: self.rate5, fieldNumber: 2)
    }
    if self.rate15 != 0 {
      try visitor.visitSingularFloatField(value: self.rate15, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_Rates, rhs: Api_Rates) -> Bool {
    if lhs.rate1 != rhs.rate1 {return false}
    if lhs.rate5 != rhs.rate5 {return false}
    if lhs.rate15 != rhs.rate15 {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_SystemStats: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SystemStats"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "load"),
    2: .same(proto: "cpu"),
    3: .same(proto: "memory"),
  ]

  fileprivate class _StorageClass {
    var _load: Api_SystemStats.Loadstats? = nil
    var _cpu: Api_SystemStats.CPUStats? = nil
    var _memory: Api_SystemStats.MemoryStats? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _load = source._load
      _cpu = source._cpu
      _memory = source._memory
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._load)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._cpu)
        case 3: try decoder.decodeSingularMessageField(value: &_storage._memory)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._load {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if let v = _storage._cpu {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if let v = _storage._memory {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_SystemStats, rhs: Api_SystemStats) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._load != rhs_storage._load {return false}
        if _storage._cpu != rhs_storage._cpu {return false}
        if _storage._memory != rhs_storage._memory {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_SystemStats.Loadstats: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Api_SystemStats.protoMessageName + ".Loadstats"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "load1"),
    2: .same(proto: "load5"),
    3: .same(proto: "load15"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularFloatField(value: &self.load1)
      case 2: try decoder.decodeSingularFloatField(value: &self.load5)
      case 3: try decoder.decodeSingularFloatField(value: &self.load15)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.load1 != 0 {
      try visitor.visitSingularFloatField(value: self.load1, fieldNumber: 1)
    }
    if self.load5 != 0 {
      try visitor.visitSingularFloatField(value: self.load5, fieldNumber: 2)
    }
    if self.load15 != 0 {
      try visitor.visitSingularFloatField(value: self.load15, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_SystemStats.Loadstats, rhs: Api_SystemStats.Loadstats) -> Bool {
    if lhs.load1 != rhs.load1 {return false}
    if lhs.load5 != rhs.load5 {return false}
    if lhs.load15 != rhs.load15 {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_SystemStats.CPUStats: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Api_SystemStats.protoMessageName + ".CPUStats"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "user"),
    2: .same(proto: "system"),
    3: .same(proto: "idle"),
    4: .same(proto: "percentage"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularFloatField(value: &self.user)
      case 2: try decoder.decodeSingularFloatField(value: &self.system)
      case 3: try decoder.decodeSingularFloatField(value: &self.idle)
      case 4: try decoder.decodeSingularFloatField(value: &self.percentage)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.user != 0 {
      try visitor.visitSingularFloatField(value: self.user, fieldNumber: 1)
    }
    if self.system != 0 {
      try visitor.visitSingularFloatField(value: self.system, fieldNumber: 2)
    }
    if self.idle != 0 {
      try visitor.visitSingularFloatField(value: self.idle, fieldNumber: 3)
    }
    if self.percentage != 0 {
      try visitor.visitSingularFloatField(value: self.percentage, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_SystemStats.CPUStats, rhs: Api_SystemStats.CPUStats) -> Bool {
    if lhs.user != rhs.user {return false}
    if lhs.system != rhs.system {return false}
    if lhs.idle != rhs.idle {return false}
    if lhs.percentage != rhs.percentage {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_SystemStats.MemoryStats: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Api_SystemStats.protoMessageName + ".MemoryStats"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "total"),
    2: .same(proto: "available"),
    3: .same(proto: "used"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularUInt64Field(value: &self.total)
      case 2: try decoder.decodeSingularUInt64Field(value: &self.available)
      case 3: try decoder.decodeSingularUInt64Field(value: &self.used)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.total != 0 {
      try visitor.visitSingularUInt64Field(value: self.total, fieldNumber: 1)
    }
    if self.available != 0 {
      try visitor.visitSingularUInt64Field(value: self.available, fieldNumber: 2)
    }
    if self.used != 0 {
      try visitor.visitSingularUInt64Field(value: self.used, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_SystemStats.MemoryStats, rhs: Api_SystemStats.MemoryStats) -> Bool {
    if lhs.total != rhs.total {return false}
    if lhs.available != rhs.available {return false}
    if lhs.used != rhs.used {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_ComponentStats: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ComponentStats"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "uptime"),
    2: .same(proto: "cpu"),
    3: .same(proto: "memory"),
    4: .same(proto: "goroutines"),
    5: .standard(proto: "gc_cpu_fraction"),
  ]

  fileprivate class _StorageClass {
    var _uptime: UInt64 = 0
    var _cpu: Api_ComponentStats.CPUStats? = nil
    var _memory: Api_ComponentStats.MemoryStats? = nil
    var _goroutines: UInt64 = 0
    var _gcCpuFraction: Float = 0

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _uptime = source._uptime
      _cpu = source._cpu
      _memory = source._memory
      _goroutines = source._goroutines
      _gcCpuFraction = source._gcCpuFraction
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularUInt64Field(value: &_storage._uptime)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._cpu)
        case 3: try decoder.decodeSingularMessageField(value: &_storage._memory)
        case 4: try decoder.decodeSingularUInt64Field(value: &_storage._goroutines)
        case 5: try decoder.decodeSingularFloatField(value: &_storage._gcCpuFraction)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if _storage._uptime != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._uptime, fieldNumber: 1)
      }
      if let v = _storage._cpu {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if let v = _storage._memory {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      }
      if _storage._goroutines != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._goroutines, fieldNumber: 4)
      }
      if _storage._gcCpuFraction != 0 {
        try visitor.visitSingularFloatField(value: _storage._gcCpuFraction, fieldNumber: 5)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_ComponentStats, rhs: Api_ComponentStats) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._uptime != rhs_storage._uptime {return false}
        if _storage._cpu != rhs_storage._cpu {return false}
        if _storage._memory != rhs_storage._memory {return false}
        if _storage._goroutines != rhs_storage._goroutines {return false}
        if _storage._gcCpuFraction != rhs_storage._gcCpuFraction {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_ComponentStats.CPUStats: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Api_ComponentStats.protoMessageName + ".CPUStats"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "user"),
    2: .same(proto: "system"),
    3: .same(proto: "idle"),
    4: .same(proto: "percentage"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularFloatField(value: &self.user)
      case 2: try decoder.decodeSingularFloatField(value: &self.system)
      case 3: try decoder.decodeSingularFloatField(value: &self.idle)
      case 4: try decoder.decodeSingularFloatField(value: &self.percentage)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.user != 0 {
      try visitor.visitSingularFloatField(value: self.user, fieldNumber: 1)
    }
    if self.system != 0 {
      try visitor.visitSingularFloatField(value: self.system, fieldNumber: 2)
    }
    if self.idle != 0 {
      try visitor.visitSingularFloatField(value: self.idle, fieldNumber: 3)
    }
    if self.percentage != 0 {
      try visitor.visitSingularFloatField(value: self.percentage, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_ComponentStats.CPUStats, rhs: Api_ComponentStats.CPUStats) -> Bool {
    if lhs.user != rhs.user {return false}
    if lhs.system != rhs.system {return false}
    if lhs.idle != rhs.idle {return false}
    if lhs.percentage != rhs.percentage {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Api_ComponentStats.MemoryStats: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Api_ComponentStats.protoMessageName + ".MemoryStats"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "memory"),
    2: .same(proto: "swap"),
    10: .same(proto: "heap"),
    11: .same(proto: "stack"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularUInt64Field(value: &self.memory)
      case 2: try decoder.decodeSingularUInt64Field(value: &self.swap)
      case 10: try decoder.decodeSingularUInt64Field(value: &self.heap)
      case 11: try decoder.decodeSingularUInt64Field(value: &self.stack)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.memory != 0 {
      try visitor.visitSingularUInt64Field(value: self.memory, fieldNumber: 1)
    }
    if self.swap != 0 {
      try visitor.visitSingularUInt64Field(value: self.swap, fieldNumber: 2)
    }
    if self.heap != 0 {
      try visitor.visitSingularUInt64Field(value: self.heap, fieldNumber: 10)
    }
    if self.stack != 0 {
      try visitor.visitSingularUInt64Field(value: self.stack, fieldNumber: 11)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Api_ComponentStats.MemoryStats, rhs: Api_ComponentStats.MemoryStats) -> Bool {
    if lhs.memory != rhs.memory {return false}
    if lhs.swap != rhs.swap {return false}
    if lhs.heap != rhs.heap {return false}
    if lhs.stack != rhs.stack {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
