/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCa
 */
class fca_2
implements alx_2 {
    final /* synthetic */ fbw_2 tXf;

    fca_2(fbw_2 fbw_22) {
        this.tXf = fbw_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (this.tXf.tWT == null) {
            return;
        }
        if (string.equals(this.tXf.tWV)) {
            this.tXf.setClient(null);
            this.tXf.setContent(null);
        }
    }
}

