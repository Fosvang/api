<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/broker/broker.proto

namespace Broker;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * sent to the Router, used as Template
 *
 * Generated from protobuf message <code>broker.DeviceActivationResponse</code>
 */
class DeviceActivationResponse extends \Google\Protobuf\Internal\Message
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
     * Generated from protobuf field <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    private $downlink_option = null;
    /**
     * Generated from protobuf field <code>.trace.Trace trace = 21;</code>
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
     *     @type \Broker\DownlinkOption $downlink_option
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
     * Generated from protobuf field <code>.broker.DownlinkOption downlink_option = 11;</code>
     * @return \Broker\DownlinkOption
     */
    public function getDownlinkOption()
    {
        return $this->downlink_option;
    }

    /**
     * Generated from protobuf field <code>.broker.DownlinkOption downlink_option = 11;</code>
     * @param \Broker\DownlinkOption $var
     * @return $this
     */
    public function setDownlinkOption($var)
    {
        GPBUtil::checkMessage($var, \Broker\DownlinkOption::class);
        $this->downlink_option = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 21;</code>
     * @return \Trace\Trace
     */
    public function getTrace()
    {
        return $this->trace;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 21;</code>
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

