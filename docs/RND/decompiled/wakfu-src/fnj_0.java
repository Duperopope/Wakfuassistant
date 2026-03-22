/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteIntProcedure
 */
import gnu.trove.procedure.TByteIntProcedure;

/*
 * Renamed from fnj
 */
class fnj_0
implements TByteIntProcedure {
    private final wq_1 sIm;

    fnj_0(wq_1 wq_12) {
        this.sIm = wq_12;
    }

    public boolean execute(byte by, int n) {
        wr_2 wr_22 = new wr_2();
        wr_22.aho = by;
        wr_22.ahp = n;
        this.sIm.ahn.add(wr_22);
        return true;
    }

    public String toString() {
        return "SetOpinion{m_raw=" + String.valueOf(this.sIm) + "}";
    }
}

