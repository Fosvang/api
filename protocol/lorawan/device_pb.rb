# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto

require 'google/protobuf'

require 'google/protobuf/empty_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("github.com/TheThingsNetwork/api/protocol/lorawan/device.proto", :syntax => :proto3) do
    add_message "lorawan.DeviceIdentifier" do
      optional :app_eui, :bytes, 1
      optional :dev_eui, :bytes, 2
    end
    add_message "lorawan.Device" do
      optional :app_eui, :bytes, 1
      optional :dev_eui, :bytes, 2
      optional :app_id, :string, 3
      optional :dev_id, :string, 4
      optional :dev_addr, :bytes, 5
      optional :nwk_s_key, :bytes, 6
      optional :app_s_key, :bytes, 7
      optional :app_key, :bytes, 8
      optional :f_cnt_up, :uint32, 9
      optional :f_cnt_down, :uint32, 10
      optional :disable_f_cnt_check, :bool, 11
      optional :uses32_bit_f_cnt, :bool, 12
      optional :activation_constraints, :string, 13
      repeated :used_dev_nonces, :bytes, 14
      repeated :used_app_nonces, :bytes, 15
      optional :last_seen, :int64, 21
    end
  end
end

module Lorawan
  DeviceIdentifier = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("lorawan.DeviceIdentifier").msgclass
  Device = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("lorawan.Device").msgclass
end
