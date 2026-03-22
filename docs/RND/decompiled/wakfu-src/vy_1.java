/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from vy
 */
public class vy_1
implements gs_0 {
    public short afz = 0;
    public String Vk = null;
    public int afA = 0;
    public long afB = 0L;
    public short Xr = 0;
    public byte Tv = 0;
    public vz_1 afC = null;
    public vb_2 afD = null;
    public int afE = 0;
    public long afF = 0L;
    public boolean afG = false;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.afz);
        if (this.Vk != null) {
            byte[] byArray = this.Vk.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.afA);
        byteBuffer.putLong(this.afB);
        byteBuffer.putShort(this.Xr);
        byteBuffer.put(this.Tv);
        if (this.afC != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.afC.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.afD != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.afD.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putInt(this.afE);
        byteBuffer.putLong(this.afF);
        byteBuffer.put(this.afG ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
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
            bl = this.afC.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.afC = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afD = new vb_2();
            boolean bl5 = this.afD.aG(byteBuffer);
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

    @Override
    public void clear() {
        this.afz = 0;
        this.Vk = null;
        this.afA = 0;
        this.afB = 0L;
        this.Xr = 0;
        this.Tv = 0;
        this.afC = null;
        this.afD = null;
        this.afE = 0;
        this.afF = 0L;
        this.afG = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            vd_1 vd_12 = new vd_1(this);
            boolean bl = vd_12.b(byteBuffer, n);
            if (bl) {
                vd_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += 2;
        n += this.Vk != null ? this.Vk.getBytes(Charsets.UTF_8).length : 0;
        n += 4;
        n += 8;
        n += 2;
        ++n;
        ++n;
        if (this.afC != null) {
            n += this.afC.DN();
        }
        ++n;
        if (this.afD != null) {
            n += this.afD.DN();
        }
        n += 4;
        n += 8;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cM(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cM(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("typeid=").append(this.afz).append('\n');
        stringBuilder.append(string).append("name=").append(this.Vk).append('\n');
        stringBuilder.append(string).append("currentHp=").append(this.afA).append('\n');
        stringBuilder.append(string).append("summonId=").append(this.afB).append('\n');
        stringBuilder.append(string).append("level=").append(this.Xr).append('\n');
        stringBuilder.append(string).append("obstacleId=").append(this.Tv).append('\n');
        stringBuilder.append(string).append("DOUBLEINVOC=");
        if (this.afC == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.afC.cN(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("IMAGEINVOC=");
        if (this.afD == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.afD.cO(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("direction=").append(this.afE).append('\n');
        stringBuilder.append(string).append("summonerId=").append(this.afF).append('\n');
        stringBuilder.append(string).append("summonedFromSymbiot=").append(this.afG).append('\n');
    }
}

