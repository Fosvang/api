// Code generated by MockGen. DO NOT EDIT.
// Source: ./protocol/lorawan/device.pb.go

// Package lorawan is a generated GoMock package.
package lorawan

import (
	types "github.com/gogo/protobuf/types"
	gomock "github.com/golang/mock/gomock"
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
	reflect "reflect"
)

// MockDeviceManagerClient is a mock of DeviceManagerClient interface
type MockDeviceManagerClient struct {
	ctrl     *gomock.Controller
	recorder *MockDeviceManagerClientMockRecorder
}

// MockDeviceManagerClientMockRecorder is the mock recorder for MockDeviceManagerClient
type MockDeviceManagerClientMockRecorder struct {
	mock *MockDeviceManagerClient
}

// NewMockDeviceManagerClient creates a new mock instance
func NewMockDeviceManagerClient(ctrl *gomock.Controller) *MockDeviceManagerClient {
	mock := &MockDeviceManagerClient{ctrl: ctrl}
	mock.recorder = &MockDeviceManagerClientMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use
func (m *MockDeviceManagerClient) EXPECT() *MockDeviceManagerClientMockRecorder {
	return m.recorder
}

// GetDevice mocks base method
func (m *MockDeviceManagerClient) GetDevice(ctx context.Context, in *DeviceIdentifier, opts ...grpc.CallOption) (*Device, error) {
	varargs := []interface{}{ctx, in}
	for _, a := range opts {
		varargs = append(varargs, a)
	}
	ret := m.ctrl.Call(m, "GetDevice", varargs...)
	ret0, _ := ret[0].(*Device)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// GetDevice indicates an expected call of GetDevice
func (mr *MockDeviceManagerClientMockRecorder) GetDevice(ctx, in interface{}, opts ...interface{}) *gomock.Call {
	varargs := append([]interface{}{ctx, in}, opts...)
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "GetDevice", reflect.TypeOf((*MockDeviceManagerClient)(nil).GetDevice), varargs...)
}

// SetDevice mocks base method
func (m *MockDeviceManagerClient) SetDevice(ctx context.Context, in *Device, opts ...grpc.CallOption) (*types.Empty, error) {
	varargs := []interface{}{ctx, in}
	for _, a := range opts {
		varargs = append(varargs, a)
	}
	ret := m.ctrl.Call(m, "SetDevice", varargs...)
	ret0, _ := ret[0].(*types.Empty)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// SetDevice indicates an expected call of SetDevice
func (mr *MockDeviceManagerClientMockRecorder) SetDevice(ctx, in interface{}, opts ...interface{}) *gomock.Call {
	varargs := append([]interface{}{ctx, in}, opts...)
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SetDevice", reflect.TypeOf((*MockDeviceManagerClient)(nil).SetDevice), varargs...)
}

// DeleteDevice mocks base method
func (m *MockDeviceManagerClient) DeleteDevice(ctx context.Context, in *DeviceIdentifier, opts ...grpc.CallOption) (*types.Empty, error) {
	varargs := []interface{}{ctx, in}
	for _, a := range opts {
		varargs = append(varargs, a)
	}
	ret := m.ctrl.Call(m, "DeleteDevice", varargs...)
	ret0, _ := ret[0].(*types.Empty)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// DeleteDevice indicates an expected call of DeleteDevice
func (mr *MockDeviceManagerClientMockRecorder) DeleteDevice(ctx, in interface{}, opts ...interface{}) *gomock.Call {
	varargs := append([]interface{}{ctx, in}, opts...)
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "DeleteDevice", reflect.TypeOf((*MockDeviceManagerClient)(nil).DeleteDevice), varargs...)
}

// MockDeviceManagerServer is a mock of DeviceManagerServer interface
type MockDeviceManagerServer struct {
	ctrl     *gomock.Controller
	recorder *MockDeviceManagerServerMockRecorder
}

// MockDeviceManagerServerMockRecorder is the mock recorder for MockDeviceManagerServer
type MockDeviceManagerServerMockRecorder struct {
	mock *MockDeviceManagerServer
}

// NewMockDeviceManagerServer creates a new mock instance
func NewMockDeviceManagerServer(ctrl *gomock.Controller) *MockDeviceManagerServer {
	mock := &MockDeviceManagerServer{ctrl: ctrl}
	mock.recorder = &MockDeviceManagerServerMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use
func (m *MockDeviceManagerServer) EXPECT() *MockDeviceManagerServerMockRecorder {
	return m.recorder
}

// GetDevice mocks base method
func (m *MockDeviceManagerServer) GetDevice(arg0 context.Context, arg1 *DeviceIdentifier) (*Device, error) {
	ret := m.ctrl.Call(m, "GetDevice", arg0, arg1)
	ret0, _ := ret[0].(*Device)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// GetDevice indicates an expected call of GetDevice
func (mr *MockDeviceManagerServerMockRecorder) GetDevice(arg0, arg1 interface{}) *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "GetDevice", reflect.TypeOf((*MockDeviceManagerServer)(nil).GetDevice), arg0, arg1)
}

// SetDevice mocks base method
func (m *MockDeviceManagerServer) SetDevice(arg0 context.Context, arg1 *Device) (*types.Empty, error) {
	ret := m.ctrl.Call(m, "SetDevice", arg0, arg1)
	ret0, _ := ret[0].(*types.Empty)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// SetDevice indicates an expected call of SetDevice
func (mr *MockDeviceManagerServerMockRecorder) SetDevice(arg0, arg1 interface{}) *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SetDevice", reflect.TypeOf((*MockDeviceManagerServer)(nil).SetDevice), arg0, arg1)
}

// DeleteDevice mocks base method
func (m *MockDeviceManagerServer) DeleteDevice(arg0 context.Context, arg1 *DeviceIdentifier) (*types.Empty, error) {
	ret := m.ctrl.Call(m, "DeleteDevice", arg0, arg1)
	ret0, _ := ret[0].(*types.Empty)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// DeleteDevice indicates an expected call of DeleteDevice
func (mr *MockDeviceManagerServerMockRecorder) DeleteDevice(arg0, arg1 interface{}) *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "DeleteDevice", reflect.TypeOf((*MockDeviceManagerServer)(nil).DeleteDevice), arg0, arg1)
}

// MockrandyDevice is a mock of randyDevice interface
type MockrandyDevice struct {
	ctrl     *gomock.Controller
	recorder *MockrandyDeviceMockRecorder
}

// MockrandyDeviceMockRecorder is the mock recorder for MockrandyDevice
type MockrandyDeviceMockRecorder struct {
	mock *MockrandyDevice
}

// NewMockrandyDevice creates a new mock instance
func NewMockrandyDevice(ctrl *gomock.Controller) *MockrandyDevice {
	mock := &MockrandyDevice{ctrl: ctrl}
	mock.recorder = &MockrandyDeviceMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use
func (m *MockrandyDevice) EXPECT() *MockrandyDeviceMockRecorder {
	return m.recorder
}

// Float32 mocks base method
func (m *MockrandyDevice) Float32() float32 {
	ret := m.ctrl.Call(m, "Float32")
	ret0, _ := ret[0].(float32)
	return ret0
}

// Float32 indicates an expected call of Float32
func (mr *MockrandyDeviceMockRecorder) Float32() *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Float32", reflect.TypeOf((*MockrandyDevice)(nil).Float32))
}

// Float64 mocks base method
func (m *MockrandyDevice) Float64() float64 {
	ret := m.ctrl.Call(m, "Float64")
	ret0, _ := ret[0].(float64)
	return ret0
}

// Float64 indicates an expected call of Float64
func (mr *MockrandyDeviceMockRecorder) Float64() *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Float64", reflect.TypeOf((*MockrandyDevice)(nil).Float64))
}

// Int63 mocks base method
func (m *MockrandyDevice) Int63() int64 {
	ret := m.ctrl.Call(m, "Int63")
	ret0, _ := ret[0].(int64)
	return ret0
}

// Int63 indicates an expected call of Int63
func (mr *MockrandyDeviceMockRecorder) Int63() *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Int63", reflect.TypeOf((*MockrandyDevice)(nil).Int63))
}

// Int31 mocks base method
func (m *MockrandyDevice) Int31() int32 {
	ret := m.ctrl.Call(m, "Int31")
	ret0, _ := ret[0].(int32)
	return ret0
}

// Int31 indicates an expected call of Int31
func (mr *MockrandyDeviceMockRecorder) Int31() *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Int31", reflect.TypeOf((*MockrandyDevice)(nil).Int31))
}

// Uint32 mocks base method
func (m *MockrandyDevice) Uint32() uint32 {
	ret := m.ctrl.Call(m, "Uint32")
	ret0, _ := ret[0].(uint32)
	return ret0
}

// Uint32 indicates an expected call of Uint32
func (mr *MockrandyDeviceMockRecorder) Uint32() *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Uint32", reflect.TypeOf((*MockrandyDevice)(nil).Uint32))
}

// Intn mocks base method
func (m *MockrandyDevice) Intn(n int) int {
	ret := m.ctrl.Call(m, "Intn", n)
	ret0, _ := ret[0].(int)
	return ret0
}

// Intn indicates an expected call of Intn
func (mr *MockrandyDeviceMockRecorder) Intn(n interface{}) *gomock.Call {
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Intn", reflect.TypeOf((*MockrandyDevice)(nil).Intn), n)
}
