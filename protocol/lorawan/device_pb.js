// source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
goog.object.extend(proto, google_protobuf_empty_pb);

goog.object.extend(proto, github_com_gogo_protobuf_gogoproto_gogo_pb);
goog.exportSymbol('proto.lorawan.Device', null, global);
goog.exportSymbol('proto.lorawan.DeviceIdentifier', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.lorawan.DeviceIdentifier = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lorawan.DeviceIdentifier, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lorawan.DeviceIdentifier.displayName = 'proto.lorawan.DeviceIdentifier';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.lorawan.Device = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.lorawan.Device.repeatedFields_, null);
};
goog.inherits(proto.lorawan.Device, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lorawan.Device.displayName = 'proto.lorawan.Device';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.lorawan.DeviceIdentifier.prototype.toObject = function(opt_includeInstance) {
  return proto.lorawan.DeviceIdentifier.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lorawan.DeviceIdentifier} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.DeviceIdentifier.toObject = function(includeInstance, msg) {
  var f, obj = {
    appEui: msg.getAppEui_asB64(),
    devEui: msg.getDevEui_asB64()
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.lorawan.DeviceIdentifier}
 */
proto.lorawan.DeviceIdentifier.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lorawan.DeviceIdentifier;
  return proto.lorawan.DeviceIdentifier.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lorawan.DeviceIdentifier} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lorawan.DeviceIdentifier}
 */
proto.lorawan.DeviceIdentifier.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAppEui(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDevEui(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.lorawan.DeviceIdentifier.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lorawan.DeviceIdentifier.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lorawan.DeviceIdentifier} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.DeviceIdentifier.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppEui_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getDevEui_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional bytes app_eui = 1;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.DeviceIdentifier.prototype.getAppEui = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes app_eui = 1;
 * This is a type-conversion wrapper around `getAppEui()`
 * @return {string}
 */
proto.lorawan.DeviceIdentifier.prototype.getAppEui_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAppEui()));
};


/**
 * optional bytes app_eui = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAppEui()`
 * @return {!Uint8Array}
 */
proto.lorawan.DeviceIdentifier.prototype.getAppEui_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAppEui()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.DeviceIdentifier} returns this
 */
proto.lorawan.DeviceIdentifier.prototype.setAppEui = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes dev_eui = 2;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.DeviceIdentifier.prototype.getDevEui = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes dev_eui = 2;
 * This is a type-conversion wrapper around `getDevEui()`
 * @return {string}
 */
proto.lorawan.DeviceIdentifier.prototype.getDevEui_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDevEui()));
};


/**
 * optional bytes dev_eui = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDevEui()`
 * @return {!Uint8Array}
 */
proto.lorawan.DeviceIdentifier.prototype.getDevEui_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDevEui()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.DeviceIdentifier} returns this
 */
proto.lorawan.DeviceIdentifier.prototype.setDevEui = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.lorawan.Device.repeatedFields_ = [14,15];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.lorawan.Device.prototype.toObject = function(opt_includeInstance) {
  return proto.lorawan.Device.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lorawan.Device} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.Device.toObject = function(includeInstance, msg) {
  var f, obj = {
    appEui: msg.getAppEui_asB64(),
    devEui: msg.getDevEui_asB64(),
    appId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    devId: jspb.Message.getFieldWithDefault(msg, 4, ""),
    devAddr: msg.getDevAddr_asB64(),
    nwkSKey: msg.getNwkSKey_asB64(),
    appSKey: msg.getAppSKey_asB64(),
    appKey: msg.getAppKey_asB64(),
    fCntUp: jspb.Message.getFieldWithDefault(msg, 9, 0),
    fCntDown: jspb.Message.getFieldWithDefault(msg, 10, 0),
    disableFCntCheck: jspb.Message.getBooleanFieldWithDefault(msg, 11, false),
    uses32BitFCnt: jspb.Message.getBooleanFieldWithDefault(msg, 12, false),
    activationConstraints: jspb.Message.getFieldWithDefault(msg, 13, ""),
    usedDevNoncesList: msg.getUsedDevNoncesList_asB64(),
    usedAppNoncesList: msg.getUsedAppNoncesList_asB64(),
    lastSeen: jspb.Message.getFieldWithDefault(msg, 21, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.lorawan.Device}
 */
proto.lorawan.Device.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lorawan.Device;
  return proto.lorawan.Device.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lorawan.Device} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lorawan.Device}
 */
proto.lorawan.Device.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAppEui(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDevEui(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAppId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDevId(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDevAddr(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNwkSKey(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAppSKey(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAppKey(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setFCntUp(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setFCntDown(value);
      break;
    case 11:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setDisableFCntCheck(value);
      break;
    case 12:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setUses32BitFCnt(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setActivationConstraints(value);
      break;
    case 14:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addUsedDevNonces(value);
      break;
    case 15:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addUsedAppNonces(value);
      break;
    case 21:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setLastSeen(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.lorawan.Device.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lorawan.Device.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lorawan.Device} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.Device.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppEui_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getDevEui_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getAppId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDevId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDevAddr_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getNwkSKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getAppSKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getAppKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      8,
      f
    );
  }
  f = message.getFCntUp();
  if (f !== 0) {
    writer.writeUint32(
      9,
      f
    );
  }
  f = message.getFCntDown();
  if (f !== 0) {
    writer.writeUint32(
      10,
      f
    );
  }
  f = message.getDisableFCntCheck();
  if (f) {
    writer.writeBool(
      11,
      f
    );
  }
  f = message.getUses32BitFCnt();
  if (f) {
    writer.writeBool(
      12,
      f
    );
  }
  f = message.getActivationConstraints();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getUsedDevNoncesList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      14,
      f
    );
  }
  f = message.getUsedAppNoncesList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      15,
      f
    );
  }
  f = message.getLastSeen();
  if (f !== 0) {
    writer.writeInt64(
      21,
      f
    );
  }
};


/**
 * optional bytes app_eui = 1;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.Device.prototype.getAppEui = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes app_eui = 1;
 * This is a type-conversion wrapper around `getAppEui()`
 * @return {string}
 */
proto.lorawan.Device.prototype.getAppEui_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAppEui()));
};


/**
 * optional bytes app_eui = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAppEui()`
 * @return {!Uint8Array}
 */
proto.lorawan.Device.prototype.getAppEui_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAppEui()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setAppEui = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes dev_eui = 2;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.Device.prototype.getDevEui = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes dev_eui = 2;
 * This is a type-conversion wrapper around `getDevEui()`
 * @return {string}
 */
proto.lorawan.Device.prototype.getDevEui_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDevEui()));
};


/**
 * optional bytes dev_eui = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDevEui()`
 * @return {!Uint8Array}
 */
proto.lorawan.Device.prototype.getDevEui_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDevEui()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setDevEui = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional string app_id = 3;
 * @return {string}
 */
proto.lorawan.Device.prototype.getAppId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setAppId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string dev_id = 4;
 * @return {string}
 */
proto.lorawan.Device.prototype.getDevId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setDevId = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional bytes dev_addr = 5;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.Device.prototype.getDevAddr = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes dev_addr = 5;
 * This is a type-conversion wrapper around `getDevAddr()`
 * @return {string}
 */
proto.lorawan.Device.prototype.getDevAddr_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDevAddr()));
};


/**
 * optional bytes dev_addr = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDevAddr()`
 * @return {!Uint8Array}
 */
proto.lorawan.Device.prototype.getDevAddr_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDevAddr()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setDevAddr = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional bytes nwk_s_key = 6;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.Device.prototype.getNwkSKey = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes nwk_s_key = 6;
 * This is a type-conversion wrapper around `getNwkSKey()`
 * @return {string}
 */
proto.lorawan.Device.prototype.getNwkSKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNwkSKey()));
};


/**
 * optional bytes nwk_s_key = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNwkSKey()`
 * @return {!Uint8Array}
 */
proto.lorawan.Device.prototype.getNwkSKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNwkSKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setNwkSKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * optional bytes app_s_key = 7;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.Device.prototype.getAppSKey = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes app_s_key = 7;
 * This is a type-conversion wrapper around `getAppSKey()`
 * @return {string}
 */
proto.lorawan.Device.prototype.getAppSKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAppSKey()));
};


/**
 * optional bytes app_s_key = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAppSKey()`
 * @return {!Uint8Array}
 */
proto.lorawan.Device.prototype.getAppSKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAppSKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setAppSKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional bytes app_key = 8;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.Device.prototype.getAppKey = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * optional bytes app_key = 8;
 * This is a type-conversion wrapper around `getAppKey()`
 * @return {string}
 */
proto.lorawan.Device.prototype.getAppKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAppKey()));
};


/**
 * optional bytes app_key = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAppKey()`
 * @return {!Uint8Array}
 */
proto.lorawan.Device.prototype.getAppKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAppKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setAppKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 8, value);
};


/**
 * optional uint32 f_cnt_up = 9;
 * @return {number}
 */
proto.lorawan.Device.prototype.getFCntUp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setFCntUp = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional uint32 f_cnt_down = 10;
 * @return {number}
 */
proto.lorawan.Device.prototype.getFCntDown = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setFCntDown = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional bool disable_f_cnt_check = 11;
 * @return {boolean}
 */
proto.lorawan.Device.prototype.getDisableFCntCheck = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 11, false));
};


/**
 * @param {boolean} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setDisableFCntCheck = function(value) {
  return jspb.Message.setProto3BooleanField(this, 11, value);
};


/**
 * optional bool uses32_bit_f_cnt = 12;
 * @return {boolean}
 */
proto.lorawan.Device.prototype.getUses32BitFCnt = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 12, false));
};


/**
 * @param {boolean} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setUses32BitFCnt = function(value) {
  return jspb.Message.setProto3BooleanField(this, 12, value);
};


/**
 * optional string activation_constraints = 13;
 * @return {string}
 */
proto.lorawan.Device.prototype.getActivationConstraints = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setActivationConstraints = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * repeated bytes used_dev_nonces = 14;
 * @return {!(Array<!Uint8Array>|Array<string>)}
 */
proto.lorawan.Device.prototype.getUsedDevNoncesList = function() {
  return /** @type {!(Array<!Uint8Array>|Array<string>)} */ (jspb.Message.getRepeatedField(this, 14));
};


/**
 * repeated bytes used_dev_nonces = 14;
 * This is a type-conversion wrapper around `getUsedDevNoncesList()`
 * @return {!Array<string>}
 */
proto.lorawan.Device.prototype.getUsedDevNoncesList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getUsedDevNoncesList()));
};


/**
 * repeated bytes used_dev_nonces = 14;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getUsedDevNoncesList()`
 * @return {!Array<!Uint8Array>}
 */
proto.lorawan.Device.prototype.getUsedDevNoncesList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getUsedDevNoncesList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setUsedDevNoncesList = function(value) {
  return jspb.Message.setField(this, 14, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.addUsedDevNonces = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 14, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.clearUsedDevNoncesList = function() {
  return this.setUsedDevNoncesList([]);
};


/**
 * repeated bytes used_app_nonces = 15;
 * @return {!(Array<!Uint8Array>|Array<string>)}
 */
proto.lorawan.Device.prototype.getUsedAppNoncesList = function() {
  return /** @type {!(Array<!Uint8Array>|Array<string>)} */ (jspb.Message.getRepeatedField(this, 15));
};


/**
 * repeated bytes used_app_nonces = 15;
 * This is a type-conversion wrapper around `getUsedAppNoncesList()`
 * @return {!Array<string>}
 */
proto.lorawan.Device.prototype.getUsedAppNoncesList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getUsedAppNoncesList()));
};


/**
 * repeated bytes used_app_nonces = 15;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getUsedAppNoncesList()`
 * @return {!Array<!Uint8Array>}
 */
proto.lorawan.Device.prototype.getUsedAppNoncesList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getUsedAppNoncesList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setUsedAppNoncesList = function(value) {
  return jspb.Message.setField(this, 15, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.addUsedAppNonces = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 15, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.clearUsedAppNoncesList = function() {
  return this.setUsedAppNoncesList([]);
};


/**
 * optional int64 last_seen = 21;
 * @return {number}
 */
proto.lorawan.Device.prototype.getLastSeen = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 21, 0));
};


/**
 * @param {number} value
 * @return {!proto.lorawan.Device} returns this
 */
proto.lorawan.Device.prototype.setLastSeen = function(value) {
  return jspb.Message.setProto3IntField(this, 21, value);
};


goog.object.extend(exports, proto.lorawan);
