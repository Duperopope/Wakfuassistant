/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rJ
 */
final class rj_1 {
    private int QV = 0;
    private int[] Ra = null;
    private int Rl = 0;
    private short Xk = 0;
    private long Xl = 0L;
    private byte VK = 0;
    private boolean Xm = false;
    private byte Re = 0;
    private int Rf = 0;
    final /* synthetic */ rh_1 Xp;

    rj_1(rh_1 rh_12) {
        this.Xp = rh_12;
    }

    public void avW() {
        this.Xp.QV = this.QV;
        this.Xp.Ra = this.Ra;
        this.Xp.Xk = this.Xk;
        this.Xp.Xl = this.Xl;
        this.Xp.VK = this.VK;
        this.Xp.Xm = this.Xm;
        this.Xp.Re = this.Re;
        this.Xp.Rf = this.Rf;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.QV = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rl = byteBuffer.getInt();
        this.Xk = byteBuffer.getShort();
        return true;
    }

    private boolean dI(ByteBuffer byteBuffer) {
        this.QV = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rl = byteBuffer.getInt();
        this.Xk = byteBuffer.getShort();
        this.Xl = byteBuffer.getLong();
        return true;
    }

    private boolean cD(ByteBuffer byteBuffer) {
        this.QV = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Xk = byteBuffer.getShort();
        this.Xl = byteBuffer.getLong();
        return true;
    }

    private boolean dJ(ByteBuffer byteBuffer) {
        this.QV = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Xk = byteBuffer.getShort();
        this.Xl = byteBuffer.getLong();
        this.VK = byteBuffer.get();
        return true;
    }

    private boolean dK(ByteBuffer byteBuffer) {
        this.QV = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Xk = byteBuffer.getShort();
        this.Xl = byteBuffer.getLong();
        this.VK = byteBuffer.get();
        this.Xm = byteBuffer.get() == 1;
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10051001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10054000) {
            boolean bl = this.dI(byteBuffer);
            return bl;
        }
        if (n < 10072000) {
            boolean bl = this.cD(byteBuffer);
            return bl;
        }
        if (n < 10073000) {
            boolean bl = this.dJ(byteBuffer);
            return bl;
        }
        if (n < 10081000) {
            boolean bl = this.dK(byteBuffer);
            return bl;
        }
        return false;
    }
}

