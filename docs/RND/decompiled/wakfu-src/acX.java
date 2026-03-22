/*
 * Decompiled with CFR 0.152.
 */
class acX
implements asp_2 {
    final /* synthetic */ long cia;
    final /* synthetic */ int cib;
    final /* synthetic */ asj_2 cic;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    acX(acV acV2, long l, int n, asj_2 asj_22) {
        this.cia = l;
        this.cib = n;
        this.cic = asj_22;
    }

    @Override
    public boolean isValid() {
        if (System.currentTimeMillis() - this.cia < (long)this.cib) {
            return false;
        }
        this.cic.b(this);
        return true;
    }
}

