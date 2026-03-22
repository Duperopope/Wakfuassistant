/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bsn
 */
public class bsn_0
implements RR {
    private final bso_0 jge;

    public bsn_0(bso_0 bso_02) {
        this.jge = bso_02;
    }

    @Override
    public void a(RQ rQ) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (rQ.Sn() == bgt_02.Sn()) {
            this.jge.dFC();
        } else {
            this.jge.dFD();
        }
    }
}

