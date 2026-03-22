/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from vD
 */
final class vd_1 {
    private short afz = 0;
    private String Vk = null;
    private int afA = 0;
    private long afB = 0L;
    private short Xr = 0;
    private byte Tv = 0;
    private vz_1 afC = null;
    private vb_2 afD = null;
    private int afE = 0;
    private long afF = 0L;
    private boolean afG = false;
    final /* synthetic */ vy_1 afN;

    vd_1(vy_1 vy_12) {
        this.afN = vy_12;
    }

    public void avW() {
        this.afN.afz = this.afz;
        this.afN.Vk = this.Vk;
        this.afN.afA = this.afA;
        this.afN.afB = this.afB;
        this.afN.Xr = this.Xr;
        this.afN.Tv = this.Tv;
        this.afN.afC = this.afC;
        this.afN.afD = this.afD;
        this.afN.afE = this.afE;
        this.afN.afF = this.afF;
        this.afN.afG = this.afG;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.afz = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.afA = byteBuffer.getInt();
        this.afB = byteBuffer.getLong();
        this.Xr = byteBuffer.getShort();
        this.Tv = byteBuffer.get();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.afC = new vz_1();
            bl = this.afC.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
        } else {
            this.afC = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afD = new vb_2();
            boolean bl5 = this.afD.b(byteBuffer, 1);
            if (!bl5) {
                return false;
            }
        } else {
            this.afD = null;
        }
        this.afE = byteBuffer.getInt();
        this.afF = byteBuffer.getLong();
        this.afG = byteBuffer.get() == 1;
        return true;
    }

    private boolean ds(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.afz = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.afA = byteBuffer.getInt();
        this.afB = byteBuffer.getLong();
        this.Xr = byteBuffer.getShort();
        this.Tv = byteBuffer.get();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.afC = new vz_1();
            bl = this.afC.b(byteBuffer, 0x992323);
            if (!bl) {
                return false;
            }
        } else {
            this.afC = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afD = new vb_2();
            boolean bl5 = this.afD.b(byteBuffer, 0x992323);
            if (!bl5) {
                return false;
            }
        } else {
            this.afD = null;
        }
        this.afE = byteBuffer.getInt();
        this.afF = byteBuffer.getLong();
        this.afG = byteBuffer.get() == 1;
        return true;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.afz = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.afA = byteBuffer.getInt();
        this.afB = byteBuffer.getLong();
        this.Xr = byteBuffer.getShort();
        this.Tv = byteBuffer.get();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.afC = new vz_1();
            bl = this.afC.b(byteBuffer, 10048002);
            if (!bl) {
                return false;
            }
        } else {
            this.afC = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afD = new vb_2();
            boolean bl5 = this.afD.b(byteBuffer, 10048002);
            if (!bl5) {
                return false;
            }
        } else {
            this.afD = null;
        }
        this.afE = byteBuffer.getInt();
        this.afF = byteBuffer.getLong();
        this.afG = byteBuffer.get() == 1;
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

