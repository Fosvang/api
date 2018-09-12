<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/gateway/gateway.proto

namespace Gateway;

/**
 * Protobuf enum <code>Gateway\LocationMetadata\LocationSource</code>
 */
class LocationMetadata_LocationSource
{
    /**
     * The source of the location is not known or not set
     *
     * Generated from protobuf enum <code>UNKNOWN = 0;</code>
     */
    const UNKNOWN = 0;
    /**
     * The location is determined by GPS
     *
     * Generated from protobuf enum <code>GPS = 1;</code>
     */
    const GPS = 1;
    /**
     * The location is fixed by configuration
     *
     * Generated from protobuf enum <code>CONFIG = 2;</code>
     */
    const CONFIG = 2;
    /**
     * The location is set in and updated from a registry
     *
     * Generated from protobuf enum <code>REGISTRY = 3;</code>
     */
    const REGISTRY = 3;
    /**
     * The location is estimated with IP Geolocation
     *
     * Generated from protobuf enum <code>IP_GEOLOCATION = 4;</code>
     */
    const IP_GEOLOCATION = 4;
}

