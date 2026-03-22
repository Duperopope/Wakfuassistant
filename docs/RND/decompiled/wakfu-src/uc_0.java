/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from UC
 */
public class uc_0 {
    private static final String bwi = "dateFormat.yearMonthDayHourMinuteSecond";
    private static final String bwj = "durationFormat.yearMonthDayHourMinuteSecond.short";
    private static final String bwk = "durationFormat.yearMonthDayHourMinuteSecond.veryShort";
    private static final String bwl = "durationFormat.yearMonthDayHourMinuteSecond.veryShortWithLongUnits";

    public static String i(ua_0 ua_02) {
        return My.aUV().c(bwk, 0, 0, ua_02.bjR(), ua_02.bjE(), ua_02.bjF(), ua_02.bjH());
    }

    public static String j(ua_0 ua_02) {
        return My.aUV().c(bwl, 0, 0, ua_02.bjR(), ua_02.bjE(), ua_02.bjF(), ua_02.bjH());
    }

    public static String k(ua_0 ua_02) {
        return My.aUV().c(bwj, 0, 0, ua_02.bjR(), ua_02.bjE(), ua_02.bjF(), ua_02.bjH());
    }

    public static String l(ua_0 ua_02) {
        return My.aUV().c(bwi, 0, 0, ua_02.bjR(), ua_02.bjE(), ua_02.bjF(), ua_02.bjH());
    }
}

