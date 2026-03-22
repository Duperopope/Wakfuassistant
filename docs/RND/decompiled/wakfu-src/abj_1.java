/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

/*
 * Renamed from aBj
 */
class abj_1
extends abi_2 {
    private final long dyu;

    abj_1(Runnable runnable, long l) {
        super(runnable);
        this.dyu = l;
    }

    @Override
    public long hp(long l) {
        long l2 = Calendar.getInstance().getTimeZone().getOffset(l);
        long l3 = (l + l2) / this.dyu;
        this.dys = (1L + l3) * this.dyu - l2;
        return this.dys;
    }

    public String toString() {
        return "ScheduledProcessOnFixedEvent{m_timeEventModulo=" + this.dyu + "}";
    }
}

