/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 */
import gnu.trove.list.TLinkable;

/*
 * Renamed from azp
 */
class azp_2<V>
implements TLinkable<azp_2<V>> {
    final int dvt;
    V dvu;
    private azp_2<V> dvv = null;
    private azp_2<V> dvw = null;

    azp_2(int n, V v) {
        this.dvt = n;
        this.dvu = v;
    }

    public azp_2<V> bTx() {
        return this.dvv;
    }

    public azp_2<V> bTy() {
        return this.dvw;
    }

    public void a(azp_2<V> azp_22) {
        this.dvv = azp_22;
    }

    public void b(azp_2<V> azp_22) {
        this.dvw = azp_22;
    }

    public /* synthetic */ void setPrevious(TLinkable tLinkable) {
        this.b((azp_2)tLinkable);
    }

    public /* synthetic */ void setNext(TLinkable tLinkable) {
        this.a((azp_2)tLinkable);
    }

    public /* synthetic */ TLinkable getPrevious() {
        return this.bTy();
    }

    public /* synthetic */ TLinkable getNext() {
        return this.bTx();
    }
}

