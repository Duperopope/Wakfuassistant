/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteLongProcedure
 */
import gnu.trove.procedure.TByteLongProcedure;

/*
 * Renamed from fnc
 */
class fnc_0
implements TByteLongProcedure {
    private final wi_2 sHJ;

    fnc_0(wi_2 wi_22) {
        this.sHJ = wi_22;
    }

    public boolean execute(byte by, long l) {
        wk_1 wk_12 = new wk_1();
        wk_12.ahb = by;
        wk_12.adL = GC.cw(l);
        this.sHJ.agW.add(wk_12);
        return true;
    }

    public String toString() {
        return "SetSpending{m_raw=" + String.valueOf(this.sHJ) + "}";
    }
}

