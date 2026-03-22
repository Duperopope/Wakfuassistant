/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sp
 */
final class sp_1 {
    private short Yt = 0;
    private long Yu = 0L;
    private int Yv = 0;
    private final yq_1 Yw = new yq_1();
    private boolean Yp = false;
    private boolean Yq = false;
    final /* synthetic */ sn_1 Yx;

    sp_1(sn_1 sn_12) {
        this.Yx = sn_12;
    }

    public void avW() {
        this.Yx.Yo.alH.clear();
        this.Yx.Yo.alH.ensureCapacity(this.Yw.alH.size());
        this.Yx.Yo.alH.addAll(this.Yw.alH);
        this.Yx.Yp = this.Yp;
        this.Yx.Yq = this.Yq;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.Yw.b(byteBuffer, 1);
        return bl;
    }

    private boolean dP(ByteBuffer byteBuffer) {
        this.Yt = byteBuffer.getShort();
        boolean bl = this.Yw.b(byteBuffer, 10006);
        return bl;
    }

    private boolean dQ(ByteBuffer byteBuffer) {
        this.Yt = byteBuffer.getShort();
        this.Yv = byteBuffer.getInt();
        boolean bl = this.Yw.b(byteBuffer, 10008);
        return bl;
    }

    private boolean dR(ByteBuffer byteBuffer) {
        this.Yt = byteBuffer.getShort();
        this.Yv = byteBuffer.getInt();
        boolean bl = this.Yw.b(byteBuffer, 0x990F99);
        if (!bl) {
            return false;
        }
        this.Yp = byteBuffer.get() == 1;
        return true;
    }

    private boolean dS(ByteBuffer byteBuffer) {
        this.Yu = byteBuffer.getLong();
        this.Yv = byteBuffer.getInt();
        boolean bl = this.Yw.b(byteBuffer, 10043008);
        if (!bl) {
            return false;
        }
        this.Yp = byteBuffer.get() == 1;
        return true;
    }

    private boolean dT(ByteBuffer byteBuffer) {
        this.Yu = byteBuffer.getLong();
        this.Yv = byteBuffer.getInt();
        boolean bl = this.Yw.b(byteBuffer, 10047001);
        if (!bl) {
            return false;
        }
        this.Yp = byteBuffer.get() == 1;
        this.Yq = byteBuffer.get() == 1;
        return true;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        this.Yv = byteBuffer.getInt();
        boolean bl = this.Yw.b(byteBuffer, 10048002);
        if (!bl) {
            return false;
        }
        this.Yp = byteBuffer.get() == 1;
        this.Yq = byteBuffer.get() == 1;
        return true;
    }

    private boolean dU(ByteBuffer byteBuffer) {
        boolean bl = this.Yw.b(byteBuffer, 10048003);
        if (!bl) {
            return false;
        }
        this.Yp = byteBuffer.get() == 1;
        this.Yq = byteBuffer.get() == 1;
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10006) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10008) {
            boolean bl = this.dP(byteBuffer);
            return bl;
        }
        if (n < 0x990F99) {
            boolean bl = this.dQ(byteBuffer);
            return bl;
        }
        if (n < 10043008) {
            boolean bl = this.dR(byteBuffer);
            return bl;
        }
        if (n < 10047001) {
            boolean bl = this.dS(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.dT(byteBuffer);
            return bl;
        }
        if (n < 10048003) {
            boolean bl = this.dt(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.dU(byteBuffer);
            return bl;
        }
        return false;
    }
}

