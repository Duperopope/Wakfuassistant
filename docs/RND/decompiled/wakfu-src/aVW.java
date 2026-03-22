/*
 * Decompiled with CFR 0.152.
 */
public class aVW
extends agb_1 {
    private final int htL;
    private final int htM;
    private final long htN;

    public aVW(col_0 col_02) {
        super(aVW.cbm(), eui_1.rsY.aJr(), 0);
        this.htN = col_02.KU();
        this.htL = col_02.getValue();
        this.htM = col_02.evY();
    }

    @Override
    protected long cbk() {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.htN);
        if (bgt_02 == null) {
            return 0L;
        }
        bgt_02.dpg().dl(this.htL, this.htM);
        return 0L;
    }

    @Override
    protected void caV() {
    }
}

