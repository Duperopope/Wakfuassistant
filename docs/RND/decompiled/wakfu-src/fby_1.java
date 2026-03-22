/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from fBy
 */
class fby_1
implements Iterator<fes_2> {
    private int tTp = -1;
    private faw_2 tTq = null;
    private int tTr = -1;
    final /* synthetic */ fbw_1 tTs;

    fby_1(fbw_1 fbw_12) {
        this.tTs = fbw_12;
        this.gte();
    }

    private void gte() {
        while (this.tTp < this.tTs.tTl.size()) {
            if (this.tTq != null && ++this.tTr < this.tTq.getWidgetChildren().size()) {
                return;
            }
            ++this.tTp;
            if (this.tTp >= this.tTs.tTl.size()) {
                return;
            }
            this.tTq = this.tTs.getContainerFromLayer(this.tTs.tTl.get(this.tTp));
            this.tTr = -1;
        }
    }

    @Override
    public boolean hasNext() {
        return this.tTp < this.tTs.tTl.size();
    }

    public fes_2 gtf() {
        fes_2 fes_22 = this.tTq.getWidgetChildren().get(this.tTr);
        this.gte();
        return fes_22;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.gtf();
    }
}

