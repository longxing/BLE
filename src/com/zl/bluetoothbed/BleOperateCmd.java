package com.zl.bluetoothbed;

public class BleOperateCmd {
    /***
     * <p>
     * Onbed: 0, Movment: 0, Heart rate: 0.0, Breath rate: 0.0 ,GateO : 13542.000000,GateM: 1.000000
     * <p>
     * Onbed: 0, Movment: 0, Heart rate: 0.0, Breath rate: 0.0 ,GateO : 13542.000000,GateM: 1.000000
     * <p>
     * 放气 00010d 停000109 充气000105 头000110 肩000111 背000112
     * <p>
     * 腰000114 臀000115 大腿000116 小腿000118 全身00010e 打乱000119
     */

    public static final int OPERATE_COMMAND_AIR_BLEED = 0X00010d;
    public static final int OPERATE_COMMAND_STOP = 0X000109;
    public static final int OPERATE_COMMAND_AIR_INFLATION = 0X000105;

    public static final int OPERATE_POSITION_HEAD = 0X000110;
    public static final int OPERATE_POSITION_SHOULDER = 0X000110;
    public static final int OPERATE_POSITION_BACK = 0X000112;
    public static final int OPERATE_POSITION_WAIST = 0X000114;
    public static final int OPERATE_POSITION_TROUSERS = 0X000115;
    public static final int OPERATE_POSITION_THIGH = 0X000116;
    public static final int OPERATE_POSITION_CALF = 0X000118;
    public static final int OPERATE_POSITION_THE_BODY = 0X00010e;
    public static final int OPERATE_POSITION_DISRUPTED = 0X000119;


}
