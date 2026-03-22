/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pN
 */
final class pn_1 {
    private int Tq = 0;
    private boolean Tr = false;
    private boolean Ts = false;
    private boolean Tt = false;
    private boolean Tu = false;
    private byte Tv = (byte)-1;
    private po_1 Tw = null;
    final /* synthetic */ pl_1 Tz;

    pn_1(pl_1 pl_12) {
        this.Tz = pl_12;
    }

    public void avW() {
        this.Tz.Tq = this.Tq;
        this.Tz.Tr = this.Tr;
        this.Tz.Ts = this.Ts;
        this.Tz.Tt = this.Tt;
        this.Tz.Tu = this.Tu;
        this.Tz.Tv = this.Tv;
        this.Tz.Tw = this.Tw;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        this.Tq = byteBuffer.getInt();
        this.Tr = byteBuffer.get() == 1;
        this.Ts = byteBuffer.get() == 1;
        this.Tt = byteBuffer.get() == 1;
        this.Tu = byteBuffer.get() == 1;
        this.Tv = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Tw = new po_1();
            boolean bl3 = this.Tw.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.Tw = null;
        }
        return true;
    }

    private boolean ds(ByteBuffer byteBuffer) {
        boolean bl;
        this.Tq = byteBuffer.getInt();
        this.Tr = byteBuffer.get() == 1;
        this.Ts = byteBuffer.get() == 1;
        this.Tt = byteBuffer.get() == 1;
        this.Tu = byteBuffer.get() == 1;
        this.Tv = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Tw = new po_1();
            boolean bl3 = this.Tw.b(byteBuffer, 0x992323);
            if (!bl3) {
                return false;
            }
        } else {
            this.Tw = null;
        }
        return true;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        boolean bl;
        this.Tq = byteBuffer.getInt();
        this.Tr = byteBuffer.get() == 1;
        this.Ts = byteBuffer.get() == 1;
        this.Tt = byteBuffer.get() == 1;
        this.Tu = byteBuffer.get() == 1;
        this.Tv = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Tw = new po_1();
            boolean bl3 = this.Tw.b(byteBuffer, 10048002);
            if (!bl3) {
                return false;
            }
        } else {
            this.Tw = null;
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.ds(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.dt(byteBuffer);
            return bl;
        }
        return false;
    }
}

