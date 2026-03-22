/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from aHF
 */
public class ahf_1
implements ahx_1 {
    private final AtomicInteger dSe = new AtomicInteger(0);
    private int crT = 0;
    private final ahc_1 dSf;

    public ahf_1(ahc_1 ahc_12) {
        this.dSf = ahc_12;
    }

    @Override
    public boolean cdI() {
        this.crT = 0;
        return true;
    }

    @Override
    public boolean b(ahz_1 ahz_12) {
        this.crT = 0;
        return true;
    }

    @Override
    public String getDescription() {
        return this.dSf.cdY().getDescription();
    }

    @Override
    public String ccQ() {
        return this.dSf.cdY().ccQ();
    }

    @Override
    public int f(ByteBuffer byteBuffer, int n) {
        if (!this.dSf.isInitialized()) {
            return 0;
        }
        byteBuffer.position(n);
        byte[] byArray = this.dSf.cdZ();
        int n2 = Math.min(byteBuffer.limit() - n, byArray.length - this.crT);
        n2 = Math.max(0, n2 - n2 % this.dSf.cdY().cdL());
        byteBuffer.put(byArray, this.crT, n2);
        this.crT += n2;
        if (this.crT >= byArray.length) {
            return -n2;
        }
        return n2;
    }

    @Override
    public int cdJ() {
        return this.dSf.cdY().cdJ();
    }

    @Override
    public int cdK() {
        return this.dSf.cdY().cdK();
    }

    @Override
    public void eg(boolean bl) {
    }

    @Override
    public void reset() {
        this.crT = 0;
    }

    @Override
    public void close() {
    }

    @Override
    public int ccG() {
        return this.dSf.cdY().ccG();
    }

    @Override
    public long ccJ() {
        throw new UnsupportedOperationException("JOrbisVirtualStream.rawTell");
    }

    @Override
    public long ccK() {
        return this.crT;
    }

    @Override
    public float ccL() {
        throw new UnsupportedOperationException("JOrbisVirtualStream.timeTell");
    }

    @Override
    public int ed(float f2) {
        throw new UnsupportedOperationException("Impossible de seek sur un son non stream\u00e9 \u00e0 la seconds=" + f2);
    }

    @Override
    public int hI(long l) {
        if (l > Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Impossible de pcmSeek sur un son non stream\u00e9 \u00e0 la position offset=" + l);
        }
        this.crT = (int)l;
        return 0;
    }

    @Override
    public int hH(long l) {
        throw new UnsupportedOperationException("Impossible de rawSeek sur un son non stream\u00e9 \u00e0 la position offset=" + l);
    }

    @Override
    public int cdL() {
        return this.dSf.cdY().cdL();
    }

    @Override
    public int aXY() {
        return this.dSf.cdY().aXY();
    }

    @Override
    public void yp(int n) {
    }

    @Override
    public int cdM() {
        return this.dSe.get();
    }

    @Override
    public void cdN() {
        this.dSe.incrementAndGet();
    }

    @Override
    public void cdO() {
        this.dSe.decrementAndGet();
    }
}

