/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVW
 */
class cvw_1
implements alx_2 {
    final /* synthetic */ cvu_1 nRj;

    cvw_1(cvu_1 cvu_12) {
        this.nRj = cvu_12;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals(this.nRj.nRf)) {
            this.nRj.nRf = null;
        }
        this.nRj.nRe.remove(string);
    }
}

