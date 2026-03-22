/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRR
 */
class crr_2
implements alx_2 {
    final /* synthetic */ crp_2 nDQ;

    crr_2(crp_2 crp_22) {
        this.nDQ = crp_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!string.startsWith(this.nDQ.eoV())) {
            return;
        }
        if (string.equals(this.nDQ.nDM)) {
            this.nDQ.nDM = null;
        }
        short s = Short.parseShort(string.replaceAll(this.nDQ.eoV(), ""));
        this.nDQ.cO(s);
    }
}

