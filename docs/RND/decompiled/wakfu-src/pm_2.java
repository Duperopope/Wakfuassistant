/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pm
 */
final class pm_2 {
    private boolean Sw = false;
    private boolean Sx = false;
    private short Sy = 0;
    private boolean Sz = false;
    final /* synthetic */ pl_2 SB;

    pm_2(pl_2 pl_22) {
        this.SB = pl_22;
    }

    public void avW() {
        this.SB.Sw = this.Sw;
        this.SB.Sx = this.Sx;
        this.SB.Sy = this.Sy;
        this.SB.Sz = this.Sz;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Sw = byteBuffer.get() == 1;
        return true;
    }

    private boolean de(ByteBuffer byteBuffer) {
        this.Sw = byteBuffer.get() == 1;
        this.Sx = byteBuffer.get() == 1;
        return true;
    }

    private boolean df(ByteBuffer byteBuffer) {
        this.Sw = byteBuffer.get() == 1;
        this.Sx = byteBuffer.get() == 1;
        this.Sy = byteBuffer.getShort();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10027003) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10031000) {
            boolean bl = this.de(byteBuffer);
            return bl;
        }
        if (n < 10047003) {
            boolean bl = this.df(byteBuffer);
            return bl;
        }
        return false;
    }
}

