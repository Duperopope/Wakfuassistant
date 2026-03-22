/*
 * Decompiled with CFR 0.152.
 */
public class aWj
extends agb_1 {
    private final long huv;
    private final acd_1 huw;
    private final abi_1 hux;

    public aWj(long l, acd_1 acd_12, abi_1 abi_12) {
        super(aWj.cbm(), eui_1.rta.aJr(), 0);
        this.huv = l;
        this.huw = acd_12;
        this.hux = abi_12;
    }

    @Override
    protected long cbk() {
        this.cXj();
        return 0L;
    }

    @Override
    protected void caV() {
    }

    private void cXj() {
        bgy bgy2 = bgg_0.dlO().ju(this.huv);
        if (bgy2 == null) {
            return;
        }
        cco_0.etB().a(bgy2, this.huw, this.hux);
    }
}

