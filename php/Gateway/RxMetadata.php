<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/gateway/gateway.proto

namespace Gateway;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gateway.RxMetadata</code>
 */
class RxMetadata extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string gateway_id = 1 [(.gogoproto.customname) = "GatewayID"];</code>
     */
    protected $gateway_id = '';
    /**
     * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
     *
     * Generated from protobuf field <code>bool gateway_trusted = 2;</code>
     */
    protected $gateway_trusted = false;
    /**
     * Timestamp (uptime of LoRa module) in microseconds with rollover
     *
     * Generated from protobuf field <code>uint32 timestamp = 11;</code>
     */
    protected $timestamp = 0;
    /**
     * Time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 time = 12;</code>
     */
    protected $time = 0;
    /**
     * Encrypted time from the Gateway FPGA
     *
     * Generated from protobuf field <code>bytes encrypted_time = 13;</code>
     */
    protected $encrypted_time = '';
    /**
     * Generated from protobuf field <code>uint32 rf_chain = 21;</code>
     */
    protected $rf_chain = 0;
    /**
     * Generated from protobuf field <code>uint32 channel = 22;</code>
     */
    protected $channel = 0;
    /**
     * Generated from protobuf field <code>repeated .gateway.RxMetadata.Antenna antennas = 30;</code>
     */
    private $antennas;
    /**
     * Frequency in Hz
     *
     * Generated from protobuf field <code>uint64 frequency = 31;</code>
     */
    protected $frequency = 0;
    /**
     * Received signal strength in dBm
     *
     * Generated from protobuf field <code>float rssi = 32 [(.gogoproto.customname) = "RSSI"];</code>
     */
    protected $rssi = 0.0;
    /**
     * Signal-to-noise-ratio in dB
     *
     * Generated from protobuf field <code>float snr = 33 [(.gogoproto.customname) = "SNR"];</code>
     */
    protected $snr = 0.0;
    /**
     * Generated from protobuf field <code>.gateway.LocationMetadata location = 41;</code>
     */
    protected $location = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $gateway_id
     *     @type bool $gateway_trusted
     *           Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
     *     @type int $timestamp
     *           Timestamp (uptime of LoRa module) in microseconds with rollover
     *     @type int|string $time
     *           Time in Unix nanoseconds
     *     @type string $encrypted_time
     *           Encrypted time from the Gateway FPGA
     *     @type int $rf_chain
     *     @type int $channel
     *     @type \Gateway\RxMetadata\Antenna[]|\Google\Protobuf\Internal\RepeatedField $antennas
     *     @type int|string $frequency
     *           Frequency in Hz
     *     @type float $rssi
     *           Received signal strength in dBm
     *     @type float $snr
     *           Signal-to-noise-ratio in dB
     *     @type \Gateway\LocationMetadata $location
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Gateway\Gateway::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string gateway_id = 1 [(.gogoproto.customname) = "GatewayID"];</code>
     * @return string
     */
    public function getGatewayId()
    {
        return $this->gateway_id;
    }

    /**
     * Generated from protobuf field <code>string gateway_id = 1 [(.gogoproto.customname) = "GatewayID"];</code>
     * @param string $var
     * @return $this
     */
    public function setGatewayId($var)
    {
        GPBUtil::checkString($var, True);
        $this->gateway_id = $var;

        return $this;
    }

    /**
     * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
     *
     * Generated from protobuf field <code>bool gateway_trusted = 2;</code>
     * @return bool
     */
    public function getGatewayTrusted()
    {
        return $this->gateway_trusted;
    }

    /**
     * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
     *
     * Generated from protobuf field <code>bool gateway_trusted = 2;</code>
     * @param bool $var
     * @return $this
     */
    public function setGatewayTrusted($var)
    {
        GPBUtil::checkBool($var);
        $this->gateway_trusted = $var;

        return $this;
    }

    /**
     * Timestamp (uptime of LoRa module) in microseconds with rollover
     *
     * Generated from protobuf field <code>uint32 timestamp = 11;</code>
     * @return int
     */
    public function getTimestamp()
    {
        return $this->timestamp;
    }

    /**
     * Timestamp (uptime of LoRa module) in microseconds with rollover
     *
     * Generated from protobuf field <code>uint32 timestamp = 11;</code>
     * @param int $var
     * @return $this
     */
    public function setTimestamp($var)
    {
        GPBUtil::checkUint32($var);
        $this->timestamp = $var;

        return $this;
    }

    /**
     * Time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 time = 12;</code>
     * @return int|string
     */
    public function getTime()
    {
        return $this->time;
    }

    /**
     * Time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 time = 12;</code>
     * @param int|string $var
     * @return $this
     */
    public function setTime($var)
    {
        GPBUtil::checkInt64($var);
        $this->time = $var;

        return $this;
    }

    /**
     * Encrypted time from the Gateway FPGA
     *
     * Generated from protobuf field <code>bytes encrypted_time = 13;</code>
     * @return string
     */
    public function getEncryptedTime()
    {
        return $this->encrypted_time;
    }

    /**
     * Encrypted time from the Gateway FPGA
     *
     * Generated from protobuf field <code>bytes encrypted_time = 13;</code>
     * @param string $var
     * @return $this
     */
    public function setEncryptedTime($var)
    {
        GPBUtil::checkString($var, False);
        $this->encrypted_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 rf_chain = 21;</code>
     * @return int
     */
    public function getRfChain()
    {
        return $this->rf_chain;
    }

    /**
     * Generated from protobuf field <code>uint32 rf_chain = 21;</code>
     * @param int $var
     * @return $this
     */
    public function setRfChain($var)
    {
        GPBUtil::checkUint32($var);
        $this->rf_chain = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 channel = 22;</code>
     * @return int
     */
    public function getChannel()
    {
        return $this->channel;
    }

    /**
     * Generated from protobuf field <code>uint32 channel = 22;</code>
     * @param int $var
     * @return $this
     */
    public function setChannel($var)
    {
        GPBUtil::checkUint32($var);
        $this->channel = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .gateway.RxMetadata.Antenna antennas = 30;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getAntennas()
    {
        return $this->antennas;
    }

    /**
     * Generated from protobuf field <code>repeated .gateway.RxMetadata.Antenna antennas = 30;</code>
     * @param \Gateway\RxMetadata\Antenna[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setAntennas($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gateway\RxMetadata\Antenna::class);
        $this->antennas = $arr;

        return $this;
    }

    /**
     * Frequency in Hz
     *
     * Generated from protobuf field <code>uint64 frequency = 31;</code>
     * @return int|string
     */
    public function getFrequency()
    {
        return $this->frequency;
    }

    /**
     * Frequency in Hz
     *
     * Generated from protobuf field <code>uint64 frequency = 31;</code>
     * @param int|string $var
     * @return $this
     */
    public function setFrequency($var)
    {
        GPBUtil::checkUint64($var);
        $this->frequency = $var;

        return $this;
    }

    /**
     * Received signal strength in dBm
     *
     * Generated from protobuf field <code>float rssi = 32 [(.gogoproto.customname) = "RSSI"];</code>
     * @return float
     */
    public function getRssi()
    {
        return $this->rssi;
    }

    /**
     * Received signal strength in dBm
     *
     * Generated from protobuf field <code>float rssi = 32 [(.gogoproto.customname) = "RSSI"];</code>
     * @param float $var
     * @return $this
     */
    public function setRssi($var)
    {
        GPBUtil::checkFloat($var);
        $this->rssi = $var;

        return $this;
    }

    /**
     * Signal-to-noise-ratio in dB
     *
     * Generated from protobuf field <code>float snr = 33 [(.gogoproto.customname) = "SNR"];</code>
     * @return float
     */
    public function getSnr()
    {
        return $this->snr;
    }

    /**
     * Signal-to-noise-ratio in dB
     *
     * Generated from protobuf field <code>float snr = 33 [(.gogoproto.customname) = "SNR"];</code>
     * @param float $var
     * @return $this
     */
    public function setSnr($var)
    {
        GPBUtil::checkFloat($var);
        $this->snr = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gateway.LocationMetadata location = 41;</code>
     * @return \Gateway\LocationMetadata
     */
    public function getLocation()
    {
        return $this->location;
    }

    /**
     * Generated from protobuf field <code>.gateway.LocationMetadata location = 41;</code>
     * @param \Gateway\LocationMetadata $var
     * @return $this
     */
    public function setLocation($var)
    {
        GPBUtil::checkMessage($var, \Gateway\LocationMetadata::class);
        $this->location = $var;

        return $this;
    }

}

