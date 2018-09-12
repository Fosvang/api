<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/broker/broker.proto

namespace Broker;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>broker.ActivationChallengeRequest</code>
 */
class ActivationChallengeRequest extends \Google\Protobuf\Internal\Message
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

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Broker\Broker::initOnce();
        parent::__construct();
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

}

