/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class fpW<TStep extends fpY> {
    private final int sRs;
    protected final short sRt;
    private final short sRu;
    private final short sRv;
    private final fqa_0 sRw;
    protected boolean eqX;
    private final EnumSet<fqi_0> sRx = EnumSet.noneOf(fqi_0.class);
    private final azy_2<TStep> sRy = new azy_2();
    public static final byte sRz = 16;
    public static final byte sRA = 0;
    private boolean eqZ;

    public fpW(int n, short s, short s2, short s3, fqa_0 fqa_02, boolean bl) {
        this.sRs = n;
        this.sRt = s;
        this.sRw = fqa_02;
        this.eqX = bl;
        this.sRu = s2;
        this.sRv = s3;
    }

    public int d() {
        return this.sRs;
    }

    public void a(fqi_0 fqi_02) {
        this.sRx.add(fqi_02);
    }

    public void e(Collection<fqi_0> collection) {
        this.sRx.addAll(collection);
    }

    public void b(fqi_0 fqi_02) {
        this.sRx.remove(fqi_02);
    }

    public void g(Collection<fqi_0> collection) {
        this.sRx.removeAll(collection);
    }

    public boolean c(fqi_0 fqi_02) {
        return this.sRx.contains(fqi_02);
    }

    public Iterator<fqi_0> bek() {
        return this.sRx.iterator();
    }

    public short ghz() {
        return this.sRt;
    }

    public boolean bcS() {
        return this.eqX;
    }

    public void a(TStep TStep) {
        this.sRy.a(((fpY)TStep).ghH(), TStep);
    }

    public final TStep YL(int n) {
        return (TStep)((fpY)this.sRy.vW(n));
    }

    public final int ghA() {
        return this.sRy.bTO();
    }

    public void YM(int n) {
        this.sRy.vS(n);
    }

    public final TStep hn(byte by) {
        if (this.sRy.bTO() == 0) {
            return null;
        }
        return (TStep)((fpY)this.sRy.aL(by));
    }

    public final void t(Consumer<TStep> consumer) {
        this.sRy.forEach(consumer);
    }

    public fqa_0 ghB() {
        return this.sRw;
    }

    public short cux() {
        return this.sRu;
    }

    public short cuy() {
        return this.sRv;
    }

    public short ghC() {
        return (short)(this.sRu - (this.sRv - this.sRu) / 2);
    }

    public short ghD() {
        return (short)(this.sRv + (this.sRv - this.sRu) / 2);
    }

    public void nI(boolean bl) {
        this.eqZ = bl;
    }

    public boolean cuB() {
        return this.eqZ;
    }

    public int ghE() {
        int n = Integer.MAX_VALUE;
        Iterator<TStep> iterator = this.sRy.iterator();
        while (iterator.hasNext()) {
            n = Math.min(n, ((fpY)iterator.next()).ghE());
        }
        return n;
    }
}

