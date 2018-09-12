<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>lorawan.ActivationMetadata</code>
 */
class ActivationMetadata extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    private $app_eui = '';
    /**
     * Generated from protobuf field <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    private $dev_eui = '';
    /**
     * Generated from protobuf field <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    private $dev_addr = '';
    /**
     * Generated from protobuf field <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    private $nwk_s_key = '';
    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 11 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     */
    private $rx1_dr_offset = 0;
    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 12 [(.gogoproto.customname) = "Rx2DR"];</code>
     */
    private $rx2_dr = 0;
    /**
     * Generated from protobuf field <code>uint32 rx_delay = 13;</code>
     */
    private $rx_delay = 0;
    /**
     * Generated from protobuf field <code>.lorawan.CFList cf_list = 14 [(.gogoproto.customname) = "CFList"];</code>
     */
    private $cf_list = null;
    /**
     * Generated from protobuf field <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    private $frequency_plan = 0;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     * @return string
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
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
     * Generated from protobuf field <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     * @return string
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * Generated from protobuf field <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
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
     * Generated from protobuf field <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     * @return string
     */
    public function getDevAddr()
    {
        return $this->dev_addr;
    }

    /**
     * Generated from protobuf field <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevAddr($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_addr = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     * @return string
     */
    public function getNwkSKey()
    {
        return $this->nwk_s_key;
    }

    /**
     * Generated from protobuf field <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     * @param string $var
     * @return $this
     */
    public function setNwkSKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->nwk_s_key = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 11 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     * @return int
     */
    public function getRx1DrOffset()
    {
        return $this->rx1_dr_offset;
    }

    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 11 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     * @param int $var
     * @return $this
     */
    public function setRx1DrOffset($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx1_dr_offset = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 12 [(.gogoproto.customname) = "Rx2DR"];</code>
     * @return int
     */
    public function getRx2Dr()
    {
        return $this->rx2_dr;
    }

    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 12 [(.gogoproto.customname) = "Rx2DR"];</code>
     * @param int $var
     * @return $this
     */
    public function setRx2Dr($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx2_dr = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 rx_delay = 13;</code>
     * @return int
     */
    public function getRxDelay()
    {
        return $this->rx_delay;
    }

    /**
     * Generated from protobuf field <code>uint32 rx_delay = 13;</code>
     * @param int $var
     * @return $this
     */
    public function setRxDelay($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx_delay = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.CFList cf_list = 14 [(.gogoproto.customname) = "CFList"];</code>
     * @return \Lorawan\CFList
     */
    public function getCfList()
    {
        return $this->cf_list;
    }

    /**
     * Generated from protobuf field <code>.lorawan.CFList cf_list = 14 [(.gogoproto.customname) = "CFList"];</code>
     * @param \Lorawan\CFList $var
     * @return $this
     */
    public function setCfList($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\CFList::class);
        $this->cf_list = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     * @return int
     */
    public function getFrequencyPlan()
    {
        return $this->frequency_plan;
    }

    /**
     * Generated from protobuf field <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     * @param int $var
     * @return $this
     */
    public function setFrequencyPlan($var)
    {
        GPBUtil::checkEnum($var, \Lorawan\FrequencyPlan::class);
        $this->frequency_plan = $var;

        return $this;
    }

}

