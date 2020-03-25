<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/handler/handler.proto

namespace Handler;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The Application settings
 *
 * Generated from protobuf message <code>handler.Application</code>
 */
class Application extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    protected $app_id = '';
    /**
     * The payload format indicates how payload is formatted.
     *
     * Generated from protobuf field <code>string payload_format = 6;</code>
     */
    protected $payload_format = '';
    /**
     * The decoder is a JavaScript function that decodes a byte array to an object.
     * This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string decoder = 2;</code>
     */
    protected $decoder = '';
    /**
     * The converter is a JavaScript function that can be used to convert values
     * in the object returned from the decoder. This can for example be useful to
     * convert a voltage to a temperature. This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string converter = 3;</code>
     */
    protected $converter = '';
    /**
     * The validator is a JavaScript function that checks the validity of the
     * object returned by the decoder or converter. If validation fails, the
     * message is dropped. This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string validator = 4;</code>
     */
    protected $validator = '';
    /**
     * The encoder is a JavaScript function that encodes an object to a byte array.
     * This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string encoder = 5;</code>
     */
    protected $encoder = '';
    /**
     * The "register on join" access key should only be set if devices need to be registered on join
     *
     * Generated from protobuf field <code>string register_on_join_access_key = 7;</code>
     */
    protected $register_on_join_access_key = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $app_id
     *     @type string $payload_format
     *           The payload format indicates how payload is formatted.
     *     @type string $decoder
     *           The decoder is a JavaScript function that decodes a byte array to an object.
     *           This function is used when the payload format is set to custom.
     *     @type string $converter
     *           The converter is a JavaScript function that can be used to convert values
     *           in the object returned from the decoder. This can for example be useful to
     *           convert a voltage to a temperature. This function is used when the payload format is set to custom.
     *     @type string $validator
     *           The validator is a JavaScript function that checks the validity of the
     *           object returned by the decoder or converter. If validation fails, the
     *           message is dropped. This function is used when the payload format is set to custom.
     *     @type string $encoder
     *           The encoder is a JavaScript function that encodes an object to a byte array.
     *           This function is used when the payload format is set to custom.
     *     @type string $register_on_join_access_key
     *           The "register on join" access key should only be set if devices need to be registered on join
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Handler\Handler::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     * @return string
     */
    public function getAppId()
    {
        return $this->app_id;
    }

    /**
     * Generated from protobuf field <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppId($var)
    {
        GPBUtil::checkString($var, True);
        $this->app_id = $var;

        return $this;
    }

    /**
     * The payload format indicates how payload is formatted.
     *
     * Generated from protobuf field <code>string payload_format = 6;</code>
     * @return string
     */
    public function getPayloadFormat()
    {
        return $this->payload_format;
    }

    /**
     * The payload format indicates how payload is formatted.
     *
     * Generated from protobuf field <code>string payload_format = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setPayloadFormat($var)
    {
        GPBUtil::checkString($var, True);
        $this->payload_format = $var;

        return $this;
    }

    /**
     * The decoder is a JavaScript function that decodes a byte array to an object.
     * This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string decoder = 2;</code>
     * @return string
     */
    public function getDecoder()
    {
        return $this->decoder;
    }

    /**
     * The decoder is a JavaScript function that decodes a byte array to an object.
     * This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string decoder = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setDecoder($var)
    {
        GPBUtil::checkString($var, True);
        $this->decoder = $var;

        return $this;
    }

    /**
     * The converter is a JavaScript function that can be used to convert values
     * in the object returned from the decoder. This can for example be useful to
     * convert a voltage to a temperature. This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string converter = 3;</code>
     * @return string
     */
    public function getConverter()
    {
        return $this->converter;
    }

    /**
     * The converter is a JavaScript function that can be used to convert values
     * in the object returned from the decoder. This can for example be useful to
     * convert a voltage to a temperature. This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string converter = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setConverter($var)
    {
        GPBUtil::checkString($var, True);
        $this->converter = $var;

        return $this;
    }

    /**
     * The validator is a JavaScript function that checks the validity of the
     * object returned by the decoder or converter. If validation fails, the
     * message is dropped. This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string validator = 4;</code>
     * @return string
     */
    public function getValidator()
    {
        return $this->validator;
    }

    /**
     * The validator is a JavaScript function that checks the validity of the
     * object returned by the decoder or converter. If validation fails, the
     * message is dropped. This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string validator = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setValidator($var)
    {
        GPBUtil::checkString($var, True);
        $this->validator = $var;

        return $this;
    }

    /**
     * The encoder is a JavaScript function that encodes an object to a byte array.
     * This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string encoder = 5;</code>
     * @return string
     */
    public function getEncoder()
    {
        return $this->encoder;
    }

    /**
     * The encoder is a JavaScript function that encodes an object to a byte array.
     * This function is used when the payload format is set to custom.
     *
     * Generated from protobuf field <code>string encoder = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setEncoder($var)
    {
        GPBUtil::checkString($var, True);
        $this->encoder = $var;

        return $this;
    }

    /**
     * The "register on join" access key should only be set if devices need to be registered on join
     *
     * Generated from protobuf field <code>string register_on_join_access_key = 7;</code>
     * @return string
     */
    public function getRegisterOnJoinAccessKey()
    {
        return $this->register_on_join_access_key;
    }

    /**
     * The "register on join" access key should only be set if devices need to be registered on join
     *
     * Generated from protobuf field <code>string register_on_join_access_key = 7;</code>
     * @param string $var
     * @return $this
     */
    public function setRegisterOnJoinAccessKey($var)
    {
        GPBUtil::checkString($var, True);
        $this->register_on_join_access_key = $var;

        return $this;
    }

}

