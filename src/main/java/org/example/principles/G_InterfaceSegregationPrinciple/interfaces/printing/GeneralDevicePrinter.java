package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.devices.SmartDevice;

import java.util.List;

public interface GeneralDevicePrinter {
    void printAllDeviceNameAndId(List<SmartDevice> devices);
    void printAllMethodsOfADevice(SmartDevice device);
}
