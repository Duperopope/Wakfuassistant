/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEY
 */
public abstract class fey_1<T, U>
extends ffb_2<T, U> {
    protected fay_1 uoq;

    @Override
    protected void gvz() {
        if (this.uoq == null || this.uoq.getUnfilteredContent() == null) {
            return;
        }
        this.uoq.setContent(this.uoq.getUnfilteredContent(), true);
    }

    public void a(fay_1 fay_12) {
        this.uoq = fay_12;
    }
}

