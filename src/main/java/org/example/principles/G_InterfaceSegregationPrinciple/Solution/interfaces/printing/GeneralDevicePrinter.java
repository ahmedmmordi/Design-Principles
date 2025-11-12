package org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.devices.SmartDevice;

import java.util.List;

public interface GeneralDevicePrinter {
    void printAllDeviceNameAndId(List<SmartDevice> devices);
    void printAllMethodsOfADevice(SmartDevice device);
}
