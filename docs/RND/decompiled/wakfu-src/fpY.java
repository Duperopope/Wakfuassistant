/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.function.Consumer;

public class fpY<TCollect extends eKO> {
    private final byte sRC;
    private final aah_1<TCollect> sRD = new aah_1(0);

    public fpY(byte by) {
        this.sRC = by;
    }

    public final void YO(int n) {
        this.sRD.vS(n);
    }

    public final void b(TCollect TCollect) {
        this.sRD.b(((eKO)TCollect).d(), TCollect);
    }

    public final TCollect YP(int n) {
        return (TCollect)((eKO)this.sRD.vK(n));
    }

    public final TCollect YQ(int n) {
        return (TCollect)((eKO)this.sRD.vU(n));
    }

    public final void u(Consumer<TCollect> consumer) {
        this.sRD.forEach(consumer);
    }

    public int ghE() {
        int n = Integer.MAX_VALUE;
        Iterator<TCollect> iterator = this.sRD.iterator();
        while (iterator.hasNext()) {
            n = Math.min(n, ((eKO)iterator.next()).dwb());
        }
        return n;
    }

    public final int ghG() {
        return this.sRD.bTR();
    }

    public final byte ghH() {
        return this.sRC;
    }
}

