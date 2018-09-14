<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/broker/broker.proto

namespace Broker;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * sent to the Handler
 *
 * Generated from protobuf message <code>broker.DeduplicatedDeviceActivationRequest</code>
 */
class DeduplicatedDeviceActivationRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     */
    private $payload = '';
    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     */
    private $message = null;
    /**
     * Generated from protobuf field <code>bytes dev_eui = 11 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    private $dev_eui = '';
    /**
     * Generated from protobuf field <code>bytes app_eui = 12 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    private $app_eui = '';
    /**
     * Generated from protobuf field <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
     */
    private $app_id = '';
    /**
     * Generated from protobuf field <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
     */
    private $dev_id = '';
    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 21 [(.gogoproto.nullable) = false];</code>
     */
    private $protocol_metadata = null;
    /**
     * Generated from protobuf field <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
     */
    private $gateway_metadata;
    /**
     * Generated from protobuf field <code>.protocol.ActivationMetadata activation_metadata = 23;</code>
     */
    private $activation_metadata = null;
    /**
     * Generated from protobuf field <code>int64 server_time = 24;</code>
     */
    private $server_time = 0;
    /**
     * Generated from protobuf field <code>.broker.DeviceActivationResponse response_template = 31;</code>
     */
    private $response_template = null;
    /**
     * Generated from protobuf field <code>.trace.Trace trace = 41;</code>
     */
    private $trace = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $payload
     *     @type \Protocol\Message $message
     *     @type string $dev_eui
     *     @type string $app_eui
     *     @type string $app_id
     *     @type string $dev_id
     *     @type \Protocol\RxMetadata $protocol_metadata
     *     @type \Gateway\RxMetadata[]|\Google\Protobuf\Internal\RepeatedField $gateway_metadata
     *     @type \Protocol\ActivationMetadata $activation_metadata
     *     @type int|string $server_time
     *     @type \Broker\DeviceActivationResponse $response_template
     *     @type \Trace\Trace $trace
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Broker\Broker::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     * @return string
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     * @return \Protocol\Message
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     * @param \Protocol\Message $var
     * @return $this
     */
    public function setMessage($var)
    {
        GPBUtil::checkMessage($var, \Protocol\Message::class);
        $this->message = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes dev_eui = 11 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     * @return string
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * Generated from protobuf field <code>bytes dev_eui = 11 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_eui = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 12 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     * @return string
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 12 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
     * @return string
     */
    public function getAppId()
    {
        return $this->app_id;
    }

    /**
     * Generated from protobuf field <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
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
     * Generated from protobuf field <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
     * @return string
     */
    public function getDevId()
    {
        return $this->dev_id;
    }

    /**
     * Generated from protobuf field <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevId($var)
    {
        GPBUtil::checkString($var, True);
        $this->dev_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 21 [(.gogoproto.nullable) = false];</code>
     * @return \Protocol\RxMetadata
     */
    public function getProtocolMetadata()
    {
        return $this->protocol_metadata;
    }

    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 21 [(.gogoproto.nullable) = false];</code>
     * @param \Protocol\RxMetadata $var
     * @return $this
     */
    public function setProtocolMetadata($var)
    {
        GPBUtil::checkMessage($var, \Protocol\RxMetadata::class);
        $this->protocol_metadata = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getGatewayMetadata()
    {
        return $this->gateway_metadata;
    }

    /**
     * Generated from protobuf field <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
     * @param \Gateway\RxMetadata[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setGatewayMetadata($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gateway\RxMetadata::class);
        $this->gateway_metadata = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.ActivationMetadata activation_metadata = 23;</code>
     * @return \Protocol\ActivationMetadata
     */
    public function getActivationMetadata()
    {
        return $this->activation_metadata;
    }

    /**
     * Generated from protobuf field <code>.protocol.ActivationMetadata activation_metadata = 23;</code>
     * @param \Protocol\ActivationMetadata $var
     * @return $this
     */
    public function setActivationMetadata($var)
    {
        GPBUtil::checkMessage($var, \Protocol\ActivationMetadata::class);
        $this->activation_metadata = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 server_time = 24;</code>
     * @return int|string
     */
    public function getServerTime()
    {
        return $this->server_time;
    }

    /**
     * Generated from protobuf field <code>int64 server_time = 24;</code>
     * @param int|string $var
     * @return $this
     */
    public function setServerTime($var)
    {
        GPBUtil::checkInt64($var);
        $this->server_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.broker.DeviceActivationResponse response_template = 31;</code>
     * @return \Broker\DeviceActivationResponse
     */
    public function getResponseTemplate()
    {
        return $this->response_template;
    }

    /**
     * Generated from protobuf field <code>.broker.DeviceActivationResponse response_template = 31;</code>
     * @param \Broker\DeviceActivationResponse $var
     * @return $this
     */
    public function setResponseTemplate($var)
    {
        GPBUtil::checkMessage($var, \Broker\DeviceActivationResponse::class);
        $this->response_template = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 41;</code>
     * @return \Trace\Trace
     */
    public function getTrace()
    {
        return $this->trace;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 41;</code>
     * @param \Trace\Trace $var
     * @return $this
     */
    public function setTrace($var)
    {
        GPBUtil::checkMessage($var, \Trace\Trace::class);
        $this->trace = $var;

        return $this;
    }

}

