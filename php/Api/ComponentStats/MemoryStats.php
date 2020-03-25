<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/api.proto

namespace Api\ComponentStats;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>api.ComponentStats.MemoryStats</code>
 */
class MemoryStats extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint64 memory = 1;</code>
     */
    protected $memory = 0;
    /**
     * Generated from protobuf field <code>uint64 swap = 2;</code>
     */
    protected $swap = 0;
    /**
     * Generated from protobuf field <code>uint64 heap = 10;</code>
     */
    protected $heap = 0;
    /**
     * Generated from protobuf field <code>uint64 stack = 11;</code>
     */
    protected $stack = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $memory
     *     @type int|string $swap
     *     @type int|string $heap
     *     @type int|string $stack
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Api::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint64 memory = 1;</code>
     * @return int|string
     */
    public function getMemory()
    {
        return $this->memory;
    }

    /**
     * Generated from protobuf field <code>uint64 memory = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setMemory($var)
    {
        GPBUtil::checkUint64($var);
        $this->memory = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 swap = 2;</code>
     * @return int|string
     */
    public function getSwap()
    {
        return $this->swap;
    }

    /**
     * Generated from protobuf field <code>uint64 swap = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setSwap($var)
    {
        GPBUtil::checkUint64($var);
        $this->swap = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 heap = 10;</code>
     * @return int|string
     */
    public function getHeap()
    {
        return $this->heap;
    }

    /**
     * Generated from protobuf field <code>uint64 heap = 10;</code>
     * @param int|string $var
     * @return $this
     */
    public function setHeap($var)
    {
        GPBUtil::checkUint64($var);
        $this->heap = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 stack = 11;</code>
     * @return int|string
     */
    public function getStack()
    {
        return $this->stack;
    }

    /**
     * Generated from protobuf field <code>uint64 stack = 11;</code>
     * @param int|string $var
     * @return $this
     */
    public function setStack($var)
    {
        GPBUtil::checkUint64($var);
        $this->stack = $var;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(MemoryStats::class, \Api\ComponentStats_MemoryStats::class);

