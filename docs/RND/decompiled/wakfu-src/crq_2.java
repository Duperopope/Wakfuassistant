/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRQ
 */
class crq_2
implements alx_2 {
    final /* synthetic */ String nDO;
    final /* synthetic */ String nDP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    crq_2(crp_2 crp_22, String string, String string2) {
        this.nDO = string;
        this.nDP = string2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals(this.nDO)) {
            fyw_0.gqw().tl(this.nDP);
            fyw_0.gqw().b(this);
        } else if (string.equals(this.nDP)) {
            fyw_0.gqw().b(this);
        }
    }
}

