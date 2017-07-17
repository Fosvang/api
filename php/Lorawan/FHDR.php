<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>lorawan.FHDR</code>
 */
class FHDR extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    private $dev_addr = '';
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    private $f_ctrl = null;
    /**
     * <code>uint32 f_cnt = 3;</code>
     */
    private $f_cnt = 0;
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    private $f_opts;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct();
    }

    /**
     * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public function getDevAddr()
    {
        return $this->dev_addr;
    }

    /**
     * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public function setDevAddr($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_addr = $var;
    }

    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public function getFCtrl()
    {
        return $this->f_ctrl;
    }

    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public function setFCtrl(&$var)
    {
        GPBUtil::checkMessage($var, \Lorawan\FCtrl::class);
        $this->f_ctrl = $var;
    }

    /**
     * <code>uint32 f_cnt = 3;</code>
     */
    public function getFCnt()
    {
        return $this->f_cnt;
    }

    /**
     * <code>uint32 f_cnt = 3;</code>
     */
    public function setFCnt($var)
    {
        GPBUtil::checkUint32($var);
        $this->f_cnt = $var;
    }

    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public function getFOpts()
    {
        return $this->f_opts;
    }

    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public function setFOpts(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Lorawan\MACCommand::class);
        $this->f_opts = $arr;
    }

}
