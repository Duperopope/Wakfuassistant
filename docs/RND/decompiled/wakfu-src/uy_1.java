/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uY
 */
public class uy_1
implements gs_0 {
    public long ZC = 0L;
    public int aaQ = 0;
    public short aaa = 0;
    public vk_1 aeF = null;
    public vt_2 aeG = null;
    public vp_2 aeH = null;
    public vb_1 aeI = null;
    public uz_2 aeJ = null;
    public vd_2 aeK = null;
    public vh_2 aeL = null;
    public vj_1 aeM = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        byteBuffer.putLong(this.ZC);
        byteBuffer.putInt(this.aaQ);
        byteBuffer.putShort(this.aaa);
        if (this.aeF != null) {
            byteBuffer.put((byte)1);
            bl = this.aeF.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aeG != null) {
            byteBuffer.put((byte)1);
            bl = this.aeG.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aeH != null) {
            byteBuffer.put((byte)1);
            bl = this.aeH.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aeI != null) {
            byteBuffer.put((byte)1);
            bl = this.aeI.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aeJ != null) {
            byteBuffer.put((byte)1);
            bl = this.aeJ.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aeK != null) {
            byteBuffer.put((byte)1);
            bl = this.aeK.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aeL != null) {
            byteBuffer.put((byte)1);
            bl = this.aeL.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aeM != null) {
            byteBuffer.put((byte)1);
            bl = this.aeM.aF(byteBuffer);
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
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl9 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.aeF = new vk_1();
            bl7 = this.aeF.aG(byteBuffer);
            if (!bl7) {
                return false;
            }
        } else {
            this.aeF = null;
        }
        boolean bl10 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aeG = new vt_2();
            bl6 = this.aeG.aG(byteBuffer);
            if (!bl6) {
                return false;
            }
        } else {
            this.aeG = null;
        }
        boolean bl11 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.aeH = new vp_2();
            bl5 = this.aeH.aG(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.aeH = null;
        }
        boolean bl12 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aeI = new vb_1();
            bl4 = this.aeI.aG(byteBuffer);
            if (!bl4) {
                return false;
            }
        } else {
            this.aeI = null;
        }
        boolean bl13 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aeJ = new uz_2();
            bl3 = this.aeJ.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.aeJ = null;
        }
        boolean bl14 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aeK = new vd_2();
            bl2 = this.aeK.aG(byteBuffer);
            if (!bl2) {
                return false;
            }
        } else {
            this.aeK = null;
        }
        boolean bl15 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.aeL = new vh_2();
            bl = this.aeL.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.aeL = null;
        }
        boolean bl16 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aeM = new vj_1();
            boolean bl17 = this.aeM.aG(byteBuffer);
            if (!bl17) {
                return false;
            }
        } else {
            this.aeM = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.ZC = 0L;
        this.aaQ = 0;
        this.aaa = 0;
        this.aeF = null;
        this.aeG = null;
        this.aeH = null;
        this.aeI = null;
        this.aeJ = null;
        this.aeK = null;
        this.aeL = null;
        this.aeM = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vm_1 vm_12 = new vm_1(this);
            boolean bl = vm_12.b(byteBuffer, n);
            if (bl) {
                vm_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 4;
        n += 2;
        ++n;
        if (this.aeF != null) {
            n += this.aeF.DN();
        }
        ++n;
        if (this.aeG != null) {
            n += this.aeG.DN();
        }
        ++n;
        if (this.aeH != null) {
            n += this.aeH.DN();
        }
        ++n;
        if (this.aeI != null) {
            n += this.aeI.DN();
        }
        ++n;
        if (this.aeJ != null) {
            n += this.aeJ.DN();
        }
        ++n;
        if (this.aeK != null) {
            n += this.aeK.DN();
        }
        ++n;
        if (this.aeL != null) {
            n += this.aeL.DN();
        }
        ++n;
        if (this.aeM != null) {
            n += this.aeM.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cy(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cy(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uniqueId=").append(this.ZC).append('\n');
        stringBuilder.append(string).append("refId=").append(this.aaQ).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.aaa).append('\n');
        stringBuilder.append(string).append("pet=");
        if (this.aeF == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeF.cF(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("xp=");
        if (this.aeG == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeG.cJ(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("shard=");
        if (this.aeH == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeH.cH(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("companionInfo=");
        if (this.aeI == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeI.cA(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("bind=");
        if (this.aeJ == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeJ.cz(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("elements=");
        if (this.aeK == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeK.cB(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("mergedItems=");
        if (this.aeL == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeL.cD(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("mimiSymbic=");
        if (this.aeM == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aeM.cE(stringBuilder, string + "  ");
        }
    }
}

