/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sz
 */
final class sz_1 {
    private long YH = 0L;
    private final tb_1 YP = new tb_1();
    private int YL = 0;
    final /* synthetic */ sx_1 YQ;

    sz_1(sx_1 sx_12) {
        this.YQ = sx_12;
    }

    public void avW() {
        this.YQ.YL = this.YL;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.YH = byteBuffer.getLong();
        boolean bl = this.YP.b(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        this.YL = byteBuffer.getInt();
        return true;
    }

    private boolean dV(ByteBuffer byteBuffer) {
        boolean bl = this.YP.b(byteBuffer, 10030001);
        if (!bl) {
            return false;
        }
        this.YL = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10030001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.dV(byteBuffer);
            return bl;
        }
        return false;
    }
}

