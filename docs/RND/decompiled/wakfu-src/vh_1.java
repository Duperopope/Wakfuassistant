/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vH
 */
public class vh_1
implements gs_0 {
    public vk_2 afV = null;
    public vp_1 afW = null;
    public vn_2 afX = null;
    public vi_1 afY = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        if (this.afV != null) {
            byteBuffer.put((byte)1);
            bl = this.afV.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.afW != null) {
            byteBuffer.put((byte)1);
            bl = this.afW.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.afX != null) {
            byteBuffer.put((byte)1);
            bl = this.afX.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.afY != null) {
            byteBuffer.put((byte)1);
            bl = this.afY.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.afV = new vk_2();
            bl3 = this.afV.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.afV = null;
        }
        boolean bl6 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.afW = new vp_1();
            bl2 = this.afW.aG(byteBuffer);
            if (!bl2) {
                return false;
            }
        } else {
            this.afW = null;
        }
        boolean bl7 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.afX = new vn_2();
            bl = this.afX.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.afX = null;
        }
        boolean bl8 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.afY = new vi_1();
            boolean bl9 = this.afY.aG(byteBuffer);
            if (!bl9) {
                return false;
            }
        } else {
            this.afY = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.afV = null;
        this.afW = null;
        this.afX = null;
        this.afY = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vm_2 vm_22 = new vm_2(this);
            boolean bl = vm_22.b(byteBuffer, n);
            if (bl) {
                vm_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        if (this.afV != null) {
            n += this.afV.DN();
        }
        ++n;
        if (this.afW != null) {
            n += this.afW.DN();
        }
        ++n;
        if (this.afX != null) {
            n += this.afX.DN();
        }
        ++n;
        if (this.afY != null) {
            n += this.afY.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cR(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cR(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("pet=");
        if (this.afV == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.afV.cT(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("xp=");
        if (this.afW == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.afW.cV(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("shard=");
        if (this.afX == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.afX.cU(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("companion=");
        if (this.afY == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.afY.cS(stringBuilder, string + "  ");
        }
    }
}

