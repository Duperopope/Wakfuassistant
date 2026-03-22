/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUq
 */
class cuq_1
implements alx_2 {
    final /* synthetic */ cup_1 nLW;

    cuq_1(cup_1 cup_12) {
        this.nLW = cup_12;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("exchangeDialog")) {
            this.nLW.eRO();
            fyw_0.gqw().b(this.nLW.ikv);
        }
    }
}

