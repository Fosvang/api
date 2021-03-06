<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/handler/handler.proto

namespace Handler;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>handler.DeviceList</code>
 */
class DeviceList extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .handler.Device devices = 1;</code>
     */
    private $devices;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Handler\Device[]|\Google\Protobuf\Internal\RepeatedField $devices
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Handler\Handler::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .handler.Device devices = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getDevices()
    {
        return $this->devices;
    }

    /**
     * Generated from protobuf field <code>repeated .handler.Device devices = 1;</code>
     * @param \Handler\Device[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setDevices($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Handler\Device::class);
        $this->devices = $arr;

        return $this;
    }

}

