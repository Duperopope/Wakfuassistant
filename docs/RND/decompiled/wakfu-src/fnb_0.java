/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteLongProcedure
 */
import gnu.trove.procedure.TByteLongProcedure;

/*
 * Renamed from fnb
 */
class fnb_0
implements TByteLongProcedure {
    private final wi_2 sHI;

    fnb_0(wi_2 wi_22) {
        this.sHI = wi_22;
    }

    public boolean execute(byte by, long l) {
        wj_2 wj_22 = new wj_2();
        wj_22.agZ = by;
        wj_22.adL = GC.cw(l);
        this.sHI.agX.add(wj_22);
        return true;
    }

    public String toString() {
        return "SetProfit{m_raw=" + String.valueOf(this.sHI) + "}";
    }
}

