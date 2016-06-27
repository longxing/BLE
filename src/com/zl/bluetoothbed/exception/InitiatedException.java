package com.zl.bluetoothbed.exception;

public class InitiatedException extends BleException {
    public InitiatedException() {
        super(ERROR_CODE_INITIAL, "Initiated Exception Occurred! ");
    }
}
