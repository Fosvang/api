# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/api.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("github.com/TheThingsNetwork/api/api.proto", :syntax => :proto3) do
    add_message "api.Percentiles" do
      optional :percentile1, :float, 1
      optional :percentile5, :float, 2
      optional :percentile10, :float, 3
      optional :percentile25, :float, 4
      optional :percentile50, :float, 5
      optional :percentile75, :float, 6
      optional :percentile90, :float, 7
      optional :percentile95, :float, 8
      optional :percentile99, :float, 9
    end
    add_message "api.Rates" do
      optional :rate1, :float, 1
      optional :rate5, :float, 2
      optional :rate15, :float, 3
    end
    add_message "api.SystemStats" do
      optional :load, :message, 1, "api.SystemStats.Loadstats"
      optional :cpu, :message, 2, "api.SystemStats.CPUStats"
      optional :memory, :message, 3, "api.SystemStats.MemoryStats"
    end
    add_message "api.SystemStats.Loadstats" do
      optional :load1, :float, 1
      optional :load5, :float, 2
      optional :load15, :float, 3
    end
    add_message "api.SystemStats.CPUStats" do
      optional :user, :float, 1
      optional :system, :float, 2
      optional :idle, :float, 3
      optional :percentage, :float, 4
    end
    add_message "api.SystemStats.MemoryStats" do
      optional :total, :uint64, 1
      optional :available, :uint64, 2
      optional :used, :uint64, 3
    end
    add_message "api.ComponentStats" do
      optional :uptime, :uint64, 1
      optional :cpu, :message, 2, "api.ComponentStats.CPUStats"
      optional :memory, :message, 3, "api.ComponentStats.MemoryStats"
      optional :goroutines, :uint64, 4
      optional :gc_cpu_fraction, :float, 5
    end
    add_message "api.ComponentStats.CPUStats" do
      optional :user, :float, 1
      optional :system, :float, 2
      optional :idle, :float, 3
      optional :percentage, :float, 4
    end
    add_message "api.ComponentStats.MemoryStats" do
      optional :memory, :uint64, 1
      optional :swap, :uint64, 2
      optional :heap, :uint64, 10
      optional :stack, :uint64, 11
    end
  end
end

module Api
  Percentiles = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.Percentiles").msgclass
  Rates = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.Rates").msgclass
  SystemStats = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.SystemStats").msgclass
  SystemStats::Loadstats = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.SystemStats.Loadstats").msgclass
  SystemStats::CPUStats = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.SystemStats.CPUStats").msgclass
  SystemStats::MemoryStats = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.SystemStats.MemoryStats").msgclass
  ComponentStats = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.ComponentStats").msgclass
  ComponentStats::CPUStats = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.ComponentStats.CPUStats").msgclass
  ComponentStats::MemoryStats = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("api.ComponentStats.MemoryStats").msgclass
end
