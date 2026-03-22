/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vq
 */
final class vq_1 {
    private final yd_2 afn = new yd_2();
    final /* synthetic */ vp_2 afo;

    vq_1(vp_2 vp_22) {
        this.afo = vp_22;
    }

    public void avW() {
        this.afo.afm.alb.clear();
        this.afo.afm.alb.ensureCapacity(this.afn.alb.size());
        this.afo.afm.alb.addAll(this.afn.alb);
        this.afo.afm.alc.clear();
        this.afo.afm.alc.ensureCapacity(this.afn.alc.size());
        this.afo.afm.alc.addAll(this.afn.alc);
        this.afo.afm.ald = this.afn.ald;
        this.afo.afm.ale = this.afn.ale;
        this.afo.afm.alf = this.afn.alf;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        boolean bl = this.afn.b(byteBuffer, 10023);
        return bl;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        boolean bl = this.afn.b(byteBuffer, 10055001);
        return bl;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        boolean bl = this.afn.b(byteBuffer, 10064001);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10023) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.cV(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.cW(byteBuffer);
            return bl;
        }
        return false;
    }
}

