package com.zl.bluetoothbed.conn;

public abstract class BleRssiCallback extends BleCallback {
    public abstract void onSuccess(int rssi);
}