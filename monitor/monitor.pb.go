// Code generated by protoc-gen-gogo.
// source: github.com/TheThingsNetwork/api/monitor/monitor.proto
// DO NOT EDIT!

/*
	Package monitor is a generated protocol buffer package.

	It is generated from these files:
		github.com/TheThingsNetwork/api/monitor/monitor.proto

	It has these top-level messages:
*/
package monitor

import proto "github.com/gogo/protobuf/proto"
import fmt "fmt"
import math "math"
import google_protobuf "github.com/gogo/protobuf/types"
import gateway "github.com/TheThingsNetwork/api/gateway"
import router "github.com/TheThingsNetwork/api/router"
import broker "github.com/TheThingsNetwork/api/broker"
import handler "github.com/TheThingsNetwork/api/handler"
import networkserver "github.com/TheThingsNetwork/api/networkserver"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.GoGoProtoPackageIsVersion2 // please upgrade the proto package

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// Client API for Monitor service

type MonitorClient interface {
	RouterStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_RouterStatusClient, error)
	GatewayStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_GatewayStatusClient, error)
	GatewayUplink(ctx context.Context, opts ...grpc.CallOption) (Monitor_GatewayUplinkClient, error)
	GatewayDownlink(ctx context.Context, opts ...grpc.CallOption) (Monitor_GatewayDownlinkClient, error)
	BrokerStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_BrokerStatusClient, error)
	BrokerUplink(ctx context.Context, opts ...grpc.CallOption) (Monitor_BrokerUplinkClient, error)
	BrokerDownlink(ctx context.Context, opts ...grpc.CallOption) (Monitor_BrokerDownlinkClient, error)
	HandlerStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_HandlerStatusClient, error)
	HandlerUplink(ctx context.Context, opts ...grpc.CallOption) (Monitor_HandlerUplinkClient, error)
	HandlerDownlink(ctx context.Context, opts ...grpc.CallOption) (Monitor_HandlerDownlinkClient, error)
	NetworkServerStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_NetworkServerStatusClient, error)
}

type monitorClient struct {
	cc *grpc.ClientConn
}

func NewMonitorClient(cc *grpc.ClientConn) MonitorClient {
	return &monitorClient{cc}
}

func (c *monitorClient) RouterStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_RouterStatusClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[0], c.cc, "/monitor.Monitor/RouterStatus", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorRouterStatusClient{stream}
	return x, nil
}

type Monitor_RouterStatusClient interface {
	Send(*router.Status) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorRouterStatusClient struct {
	grpc.ClientStream
}

func (x *monitorRouterStatusClient) Send(m *router.Status) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorRouterStatusClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) GatewayStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_GatewayStatusClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[1], c.cc, "/monitor.Monitor/GatewayStatus", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorGatewayStatusClient{stream}
	return x, nil
}

type Monitor_GatewayStatusClient interface {
	Send(*gateway.Status) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorGatewayStatusClient struct {
	grpc.ClientStream
}

func (x *monitorGatewayStatusClient) Send(m *gateway.Status) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorGatewayStatusClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) GatewayUplink(ctx context.Context, opts ...grpc.CallOption) (Monitor_GatewayUplinkClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[2], c.cc, "/monitor.Monitor/GatewayUplink", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorGatewayUplinkClient{stream}
	return x, nil
}

type Monitor_GatewayUplinkClient interface {
	Send(*router.UplinkMessage) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorGatewayUplinkClient struct {
	grpc.ClientStream
}

func (x *monitorGatewayUplinkClient) Send(m *router.UplinkMessage) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorGatewayUplinkClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) GatewayDownlink(ctx context.Context, opts ...grpc.CallOption) (Monitor_GatewayDownlinkClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[3], c.cc, "/monitor.Monitor/GatewayDownlink", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorGatewayDownlinkClient{stream}
	return x, nil
}

type Monitor_GatewayDownlinkClient interface {
	Send(*router.DownlinkMessage) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorGatewayDownlinkClient struct {
	grpc.ClientStream
}

func (x *monitorGatewayDownlinkClient) Send(m *router.DownlinkMessage) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorGatewayDownlinkClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) BrokerStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_BrokerStatusClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[4], c.cc, "/monitor.Monitor/BrokerStatus", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorBrokerStatusClient{stream}
	return x, nil
}

type Monitor_BrokerStatusClient interface {
	Send(*broker.Status) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorBrokerStatusClient struct {
	grpc.ClientStream
}

func (x *monitorBrokerStatusClient) Send(m *broker.Status) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorBrokerStatusClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) BrokerUplink(ctx context.Context, opts ...grpc.CallOption) (Monitor_BrokerUplinkClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[5], c.cc, "/monitor.Monitor/BrokerUplink", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorBrokerUplinkClient{stream}
	return x, nil
}

type Monitor_BrokerUplinkClient interface {
	Send(*broker.DeduplicatedUplinkMessage) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorBrokerUplinkClient struct {
	grpc.ClientStream
}

func (x *monitorBrokerUplinkClient) Send(m *broker.DeduplicatedUplinkMessage) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorBrokerUplinkClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) BrokerDownlink(ctx context.Context, opts ...grpc.CallOption) (Monitor_BrokerDownlinkClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[6], c.cc, "/monitor.Monitor/BrokerDownlink", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorBrokerDownlinkClient{stream}
	return x, nil
}

type Monitor_BrokerDownlinkClient interface {
	Send(*broker.DownlinkMessage) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorBrokerDownlinkClient struct {
	grpc.ClientStream
}

func (x *monitorBrokerDownlinkClient) Send(m *broker.DownlinkMessage) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorBrokerDownlinkClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) HandlerStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_HandlerStatusClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[7], c.cc, "/monitor.Monitor/HandlerStatus", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorHandlerStatusClient{stream}
	return x, nil
}

type Monitor_HandlerStatusClient interface {
	Send(*handler.Status) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorHandlerStatusClient struct {
	grpc.ClientStream
}

func (x *monitorHandlerStatusClient) Send(m *handler.Status) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorHandlerStatusClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) HandlerUplink(ctx context.Context, opts ...grpc.CallOption) (Monitor_HandlerUplinkClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[8], c.cc, "/monitor.Monitor/HandlerUplink", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorHandlerUplinkClient{stream}
	return x, nil
}

type Monitor_HandlerUplinkClient interface {
	Send(*broker.DeduplicatedUplinkMessage) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorHandlerUplinkClient struct {
	grpc.ClientStream
}

func (x *monitorHandlerUplinkClient) Send(m *broker.DeduplicatedUplinkMessage) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorHandlerUplinkClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) HandlerDownlink(ctx context.Context, opts ...grpc.CallOption) (Monitor_HandlerDownlinkClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[9], c.cc, "/monitor.Monitor/HandlerDownlink", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorHandlerDownlinkClient{stream}
	return x, nil
}

type Monitor_HandlerDownlinkClient interface {
	Send(*broker.DownlinkMessage) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorHandlerDownlinkClient struct {
	grpc.ClientStream
}

func (x *monitorHandlerDownlinkClient) Send(m *broker.DownlinkMessage) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorHandlerDownlinkClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *monitorClient) NetworkServerStatus(ctx context.Context, opts ...grpc.CallOption) (Monitor_NetworkServerStatusClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_Monitor_serviceDesc.Streams[10], c.cc, "/monitor.Monitor/NetworkServerStatus", opts...)
	if err != nil {
		return nil, err
	}
	x := &monitorNetworkServerStatusClient{stream}
	return x, nil
}

type Monitor_NetworkServerStatusClient interface {
	Send(*networkserver.Status) error
	CloseAndRecv() (*google_protobuf.Empty, error)
	grpc.ClientStream
}

type monitorNetworkServerStatusClient struct {
	grpc.ClientStream
}

func (x *monitorNetworkServerStatusClient) Send(m *networkserver.Status) error {
	return x.ClientStream.SendMsg(m)
}

func (x *monitorNetworkServerStatusClient) CloseAndRecv() (*google_protobuf.Empty, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(google_protobuf.Empty)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// Server API for Monitor service

type MonitorServer interface {
	RouterStatus(Monitor_RouterStatusServer) error
	GatewayStatus(Monitor_GatewayStatusServer) error
	GatewayUplink(Monitor_GatewayUplinkServer) error
	GatewayDownlink(Monitor_GatewayDownlinkServer) error
	BrokerStatus(Monitor_BrokerStatusServer) error
	BrokerUplink(Monitor_BrokerUplinkServer) error
	BrokerDownlink(Monitor_BrokerDownlinkServer) error
	HandlerStatus(Monitor_HandlerStatusServer) error
	HandlerUplink(Monitor_HandlerUplinkServer) error
	HandlerDownlink(Monitor_HandlerDownlinkServer) error
	NetworkServerStatus(Monitor_NetworkServerStatusServer) error
}

func RegisterMonitorServer(s *grpc.Server, srv MonitorServer) {
	s.RegisterService(&_Monitor_serviceDesc, srv)
}

func _Monitor_RouterStatus_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).RouterStatus(&monitorRouterStatusServer{stream})
}

type Monitor_RouterStatusServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*router.Status, error)
	grpc.ServerStream
}

type monitorRouterStatusServer struct {
	grpc.ServerStream
}

func (x *monitorRouterStatusServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorRouterStatusServer) Recv() (*router.Status, error) {
	m := new(router.Status)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_GatewayStatus_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).GatewayStatus(&monitorGatewayStatusServer{stream})
}

type Monitor_GatewayStatusServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*gateway.Status, error)
	grpc.ServerStream
}

type monitorGatewayStatusServer struct {
	grpc.ServerStream
}

func (x *monitorGatewayStatusServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorGatewayStatusServer) Recv() (*gateway.Status, error) {
	m := new(gateway.Status)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_GatewayUplink_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).GatewayUplink(&monitorGatewayUplinkServer{stream})
}

type Monitor_GatewayUplinkServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*router.UplinkMessage, error)
	grpc.ServerStream
}

type monitorGatewayUplinkServer struct {
	grpc.ServerStream
}

func (x *monitorGatewayUplinkServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorGatewayUplinkServer) Recv() (*router.UplinkMessage, error) {
	m := new(router.UplinkMessage)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_GatewayDownlink_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).GatewayDownlink(&monitorGatewayDownlinkServer{stream})
}

type Monitor_GatewayDownlinkServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*router.DownlinkMessage, error)
	grpc.ServerStream
}

type monitorGatewayDownlinkServer struct {
	grpc.ServerStream
}

func (x *monitorGatewayDownlinkServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorGatewayDownlinkServer) Recv() (*router.DownlinkMessage, error) {
	m := new(router.DownlinkMessage)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_BrokerStatus_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).BrokerStatus(&monitorBrokerStatusServer{stream})
}

type Monitor_BrokerStatusServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*broker.Status, error)
	grpc.ServerStream
}

type monitorBrokerStatusServer struct {
	grpc.ServerStream
}

func (x *monitorBrokerStatusServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorBrokerStatusServer) Recv() (*broker.Status, error) {
	m := new(broker.Status)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_BrokerUplink_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).BrokerUplink(&monitorBrokerUplinkServer{stream})
}

type Monitor_BrokerUplinkServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*broker.DeduplicatedUplinkMessage, error)
	grpc.ServerStream
}

type monitorBrokerUplinkServer struct {
	grpc.ServerStream
}

func (x *monitorBrokerUplinkServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorBrokerUplinkServer) Recv() (*broker.DeduplicatedUplinkMessage, error) {
	m := new(broker.DeduplicatedUplinkMessage)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_BrokerDownlink_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).BrokerDownlink(&monitorBrokerDownlinkServer{stream})
}

type Monitor_BrokerDownlinkServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*broker.DownlinkMessage, error)
	grpc.ServerStream
}

type monitorBrokerDownlinkServer struct {
	grpc.ServerStream
}

func (x *monitorBrokerDownlinkServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorBrokerDownlinkServer) Recv() (*broker.DownlinkMessage, error) {
	m := new(broker.DownlinkMessage)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_HandlerStatus_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).HandlerStatus(&monitorHandlerStatusServer{stream})
}

type Monitor_HandlerStatusServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*handler.Status, error)
	grpc.ServerStream
}

type monitorHandlerStatusServer struct {
	grpc.ServerStream
}

func (x *monitorHandlerStatusServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorHandlerStatusServer) Recv() (*handler.Status, error) {
	m := new(handler.Status)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_HandlerUplink_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).HandlerUplink(&monitorHandlerUplinkServer{stream})
}

type Monitor_HandlerUplinkServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*broker.DeduplicatedUplinkMessage, error)
	grpc.ServerStream
}

type monitorHandlerUplinkServer struct {
	grpc.ServerStream
}

func (x *monitorHandlerUplinkServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorHandlerUplinkServer) Recv() (*broker.DeduplicatedUplinkMessage, error) {
	m := new(broker.DeduplicatedUplinkMessage)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_HandlerDownlink_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).HandlerDownlink(&monitorHandlerDownlinkServer{stream})
}

type Monitor_HandlerDownlinkServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*broker.DownlinkMessage, error)
	grpc.ServerStream
}

type monitorHandlerDownlinkServer struct {
	grpc.ServerStream
}

func (x *monitorHandlerDownlinkServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorHandlerDownlinkServer) Recv() (*broker.DownlinkMessage, error) {
	m := new(broker.DownlinkMessage)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _Monitor_NetworkServerStatus_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(MonitorServer).NetworkServerStatus(&monitorNetworkServerStatusServer{stream})
}

type Monitor_NetworkServerStatusServer interface {
	SendAndClose(*google_protobuf.Empty) error
	Recv() (*networkserver.Status, error)
	grpc.ServerStream
}

type monitorNetworkServerStatusServer struct {
	grpc.ServerStream
}

func (x *monitorNetworkServerStatusServer) SendAndClose(m *google_protobuf.Empty) error {
	return x.ServerStream.SendMsg(m)
}

func (x *monitorNetworkServerStatusServer) Recv() (*networkserver.Status, error) {
	m := new(networkserver.Status)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

var _Monitor_serviceDesc = grpc.ServiceDesc{
	ServiceName: "monitor.Monitor",
	HandlerType: (*MonitorServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "RouterStatus",
			Handler:       _Monitor_RouterStatus_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "GatewayStatus",
			Handler:       _Monitor_GatewayStatus_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "GatewayUplink",
			Handler:       _Monitor_GatewayUplink_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "GatewayDownlink",
			Handler:       _Monitor_GatewayDownlink_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "BrokerStatus",
			Handler:       _Monitor_BrokerStatus_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "BrokerUplink",
			Handler:       _Monitor_BrokerUplink_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "BrokerDownlink",
			Handler:       _Monitor_BrokerDownlink_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "HandlerStatus",
			Handler:       _Monitor_HandlerStatus_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "HandlerUplink",
			Handler:       _Monitor_HandlerUplink_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "HandlerDownlink",
			Handler:       _Monitor_HandlerDownlink_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "NetworkServerStatus",
			Handler:       _Monitor_NetworkServerStatus_Handler,
			ClientStreams: true,
		},
	},
	Metadata: "github.com/TheThingsNetwork/api/monitor/monitor.proto",
}

func init() {
	proto.RegisterFile("github.com/TheThingsNetwork/api/monitor/monitor.proto", fileDescriptorMonitor)
}

var fileDescriptorMonitor = []byte{
	// 442 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xac, 0x94, 0xcd, 0xaa, 0xd3, 0x40,
	0x14, 0xc7, 0x3b, 0x82, 0x16, 0x86, 0x7e, 0x40, 0xa4, 0x0a, 0x55, 0x06, 0x5d, 0xe9, 0x6a, 0x02,
	0x16, 0xa1, 0x74, 0x65, 0x6b, 0xfc, 0x42, 0x2b, 0xc5, 0xd6, 0x8d, 0xbb, 0x49, 0x3b, 0x26, 0xa1,
	0x69, 0x26, 0x4c, 0x26, 0x96, 0xee, 0x7c, 0x04, 0xd7, 0x3e, 0x81, 0xf8, 0x24, 0x2e, 0x5d, 0xba,
	0x6c, 0xe3, 0xf2, 0xbe, 0xc4, 0xa5, 0x99, 0x33, 0xe1, 0xf6, 0x2e, 0xee, 0x04, 0xee, 0x5d, 0x9d,
	0x9c, 0x49, 0xfe, 0xff, 0xcc, 0xef, 0x9c, 0x33, 0x83, 0x9f, 0x07, 0x91, 0x0a, 0x73, 0x9f, 0x2e,
	0xc5, 0xc6, 0x5d, 0x84, 0x7c, 0x11, 0x46, 0x49, 0x90, 0x7d, 0xe4, 0x6a, 0x2b, 0xe4, 0xda, 0x65,
	0x69, 0xe4, 0x6e, 0x44, 0x12, 0x29, 0x21, 0x4d, 0xa4, 0xa9, 0x14, 0x4a, 0x38, 0x4d, 0x48, 0xfb,
	0x0f, 0x02, 0x21, 0x82, 0x98, 0xbb, 0xe5, 0xb2, 0x9f, 0x7f, 0x75, 0xf9, 0x26, 0x55, 0x3b, 0xfd,
	0x55, 0xdf, 0x6a, 0x1e, 0x30, 0xc5, 0xb7, 0x6c, 0x67, 0x22, 0xc8, 0x06, 0x36, 0x99, 0x14, 0xb9,
	0xe2, 0x12, 0x42, 0x5d, 0x91, 0x2f, 0xc5, 0x9a, 0x4b, 0x08, 0x75, 0x37, 0x18, 0xb2, 0x64, 0x15,
	0x73, 0x69, 0x22, 0xc8, 0xc6, 0x36, 0x59, 0xa2, 0x9f, 0x33, 0x2e, 0xbf, 0x71, 0x79, 0x9a, 0x69,
	0x8b, 0x67, 0x67, 0xb7, 0x71, 0x73, 0xaa, 0x6b, 0xe8, 0x0c, 0x71, 0xeb, 0x53, 0x89, 0x32, 0x57,
	0x4c, 0xe5, 0x99, 0xd3, 0xa1, 0x40, 0xa6, 0xf3, 0xfe, 0x3d, 0xaa, 0x8b, 0x4c, 0x4d, 0x91, 0xe9,
	0xab, 0x63, 0x91, 0x9f, 0x22, 0x67, 0x84, 0xdb, 0x6f, 0x74, 0xe9, 0x40, 0xda, 0xa5, 0xa6, 0x94,
	0x56, 0xed, 0x8b, 0x4a, 0xfb, 0x39, 0x8d, 0xa3, 0x64, 0xed, 0xf4, 0xcc, 0x6f, 0x75, 0x3e, 0xe5,
	0x59, 0xc6, 0x02, 0x7e, 0x85, 0x83, 0x87, 0xbb, 0xe0, 0xe0, 0x89, 0x6d, 0x52, 0x7a, 0xdc, 0x37,
	0x1e, 0x66, 0xc5, 0xee, 0x32, 0xc4, 0xad, 0x49, 0xd9, 0x93, 0x8a, 0x1e, 0x5a, 0x64, 0x25, 0x78,
	0x6f, 0x94, 0x00, 0xf0, 0xd8, 0x28, 0x3d, 0xbe, 0xca, 0xd3, 0x38, 0x5a, 0x32, 0xc5, 0x57, 0x75,
	0x61, 0x5e, 0xe2, 0x8e, 0x36, 0xbb, 0xc0, 0x62, 0xec, 0x6a, 0xb3, 0x8c, 0x70, 0xfb, 0xad, 0x9e,
	0x94, 0xaa, 0x1f, 0x66, 0x72, 0xac, 0x34, 0x1f, 0x2a, 0xed, 0x4d, 0xe0, 0x78, 0xb8, 0x0b, 0x6e,
	0xd7, 0xe1, 0x79, 0x8d, 0xef, 0xc2, 0x58, 0xcf, 0xcb, 0xe1, 0x05, 0xaa, 0x1e, 0x3d, 0x1d, 0x69,
	0x1b, 0xdb, 0xe4, 0x27, 0xfa, 0x77, 0x20, 0x8d, 0xfd, 0x81, 0xa0, 0xef, 0x05, 0x41, 0xbf, 0x0a,
	0x82, 0xfe, 0x14, 0x04, 0xfd, 0x2d, 0x08, 0xda, 0x17, 0x04, 0xfd, 0xf8, 0x4f, 0x1a, 0xf8, 0x91,
	0x90, 0x01, 0x55, 0x21, 0x57, 0xe5, 0x61, 0x02, 0x7f, 0xca, 0xd2, 0x88, 0xc2, 0x55, 0x33, 0x69,
	0xc1, 0x79, 0x99, 0x1d, 0xdd, 0x67, 0xe8, 0xcb, 0x93, 0x9a, 0x57, 0xd7, 0xef, 0x5b, 0x0f, 0x2f,
	0xbf, 0xa6, 0xe3, 0xd9, 0x3b, 0x0a, 0x76, 0xfe, 0x9d, 0x72, 0xbb, 0x83, 0xf3, 0x00, 0x00, 0x00,
	0xff, 0xff, 0x0d, 0x1e, 0xb8, 0xac, 0x0b, 0x05, 0x00, 0x00,
}
