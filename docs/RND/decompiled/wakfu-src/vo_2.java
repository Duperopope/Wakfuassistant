/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vO
 */
final class vo_2 {
    private final yd_2 agh = new yd_2();
    final /* synthetic */ vn_2 agi;

    vo_2(vn_2 vn_22) {
        this.agi = vn_22;
    }

    public void avW() {
        this.agi.agg.alb.clear();
        this.agi.agg.alb.ensureCapacity(this.agh.alb.size());
        this.agi.agg.alb.addAll(this.agh.alb);
        this.agi.agg.alc.clear();
        this.agi.agg.alc.ensureCapacity(this.agh.alc.size());
        this.agi.agg.alc.addAll(this.agh.alc);
        this.agi.agg.ald = this.agh.ald;
        this.agi.agg.ale = this.agh.ale;
        this.agi.agg.alf = this.agh.alf;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean ea(ByteBuffer byteBuffer) {
        boolean bl = this.agh.b(byteBuffer, 10024001);
        return bl;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        boolean bl = this.agh.b(byteBuffer, 10055001);
        return bl;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        boolean bl = this.agh.b(byteBuffer, 10064001);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10024001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.ea(byteBuffer);
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

