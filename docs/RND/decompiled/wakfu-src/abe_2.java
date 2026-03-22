/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.TLinkable;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aBe
 */
class abe_2
implements TLinkable<abe_2>,
Comparable {
    protected abe_2 dxU;
    protected abe_2 dxV;
    protected int dxz = 0;
    protected long dxy;
    protected long dxW;
    protected long dxX;
    protected long dxY;
    protected int dxZ = 0;
    private boolean dya = false;
    protected aao_2 dyb;

    public void wE(int n) {
        this.dxz = n;
    }

    public int bUy() {
        return this.dxz;
    }

    public abe_2 bUF() {
        return this.dxU;
    }

    public void b(abe_2 abe_22) {
        this.dxU = abe_22;
    }

    public abe_2 bUG() {
        return this.dxV;
    }

    public void c(abe_2 abe_22) {
        this.dxV = abe_22;
    }

    public long bUx() {
        return this.dxy;
    }

    void hi(long l) {
        this.dxy = l;
    }

    public long bUH() {
        return this.dxY;
    }

    public void hl(long l) {
        this.dxY = l;
    }

    public void hm(long l) {
        this.dxW = l;
    }

    public long bUI() {
        return this.dxW;
    }

    public long bUJ() {
        return this.dxX;
    }

    public boolean bUK() {
        return this.dxY == -1L || (long)this.dxZ <= this.dxY;
    }

    public aao_2 bUL() {
        return this.dyb;
    }

    public void c(aao_2 aao_22) {
        this.dyb = aao_22;
    }

    void hn(long l) {
        ++this.dxZ;
        this.dxX = l + this.dxW;
    }

    public boolean bUM() {
        return this.dya;
    }

    public void bUN() {
        this.dya = true;
    }

    public int compareTo(@NotNull Object object) {
        abe_2 abe_22 = (abe_2)object;
        if (abe_22 == null) {
            throw new UnsupportedOperationException("Comparaison d'un listener avec null.");
        }
        if (this.dxX < abe_22.dxX) {
            return -1;
        }
        if (this.dxX > abe_22.dxX) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return this.dyb.getClass().getName() + ", nextTime : " + this.dxX;
    }

    public /* synthetic */ void setPrevious(TLinkable tLinkable) {
        this.c((abe_2)tLinkable);
    }

    public /* synthetic */ void setNext(TLinkable tLinkable) {
        this.b((abe_2)tLinkable);
    }

    public /* synthetic */ TLinkable getPrevious() {
        return this.bUG();
    }

    public /* synthetic */ TLinkable getNext() {
        return this.bUF();
    }
}

