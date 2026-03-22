/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wK
 */
public class wk_2
implements gs_0 {
    public int aif = 0;
    public wv_1 aig = null;
    public wl_1 aih = null;
    public wm_2 aii = null;
    public wx_1 aij = null;
    public wt_1 aik = null;
    public xh_1 ail = null;
    public xc_2 aim = null;
    public xd_1 ain = null;
    public xj_1 aio = null;
    public xb_2 aip = null;
    public wr_1 aiq = null;
    public wz_1 air = null;
    public wo_1 ais = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        byteBuffer.putInt(this.aif);
        if (this.aig != null) {
            byteBuffer.put((byte)1);
            bl = this.aig.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aih != null) {
            byteBuffer.put((byte)1);
            bl = this.aih.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aii != null) {
            byteBuffer.put((byte)1);
            bl = this.aii.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aij != null) {
            byteBuffer.put((byte)1);
            bl = this.aij.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aik != null) {
            byteBuffer.put((byte)1);
            bl = this.aik.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.ail != null) {
            byteBuffer.put((byte)1);
            bl = this.ail.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aim != null) {
            byteBuffer.put((byte)1);
            bl = this.aim.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.ain != null) {
            byteBuffer.put((byte)1);
            bl = this.ain.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aio != null) {
            byteBuffer.put((byte)1);
            bl = this.aio.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aip != null) {
            byteBuffer.put((byte)1);
            bl = this.aip.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.aiq != null) {
            byteBuffer.put((byte)1);
            bl = this.aiq.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.air != null) {
            byteBuffer.put((byte)1);
            bl = this.air.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.ais != null) {
            byteBuffer.put((byte)1);
            bl = this.ais.aF(byteBuffer);
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
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.aif = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.aig = new wv_1();
            bl12 = this.aig.aG(byteBuffer);
            if (!bl12) {
                return false;
            }
        } else {
            this.aig = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.aih = new wl_1();
            bl11 = this.aih.aG(byteBuffer);
            if (!bl11) {
                return false;
            }
        } else {
            this.aih = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.aii = new wm_2();
            bl10 = this.aii.aG(byteBuffer);
            if (!bl10) {
                return false;
            }
        } else {
            this.aii = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.aij = new wx_1();
            bl9 = this.aij.aG(byteBuffer);
            if (!bl9) {
                return false;
            }
        } else {
            this.aij = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.aik = new wt_1();
            bl8 = this.aik.aG(byteBuffer);
            if (!bl8) {
                return false;
            }
        } else {
            this.aik = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.ail = new xh_1();
            bl7 = this.ail.aG(byteBuffer);
            if (!bl7) {
                return false;
            }
        } else {
            this.ail = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.aim = new xc_2();
            bl6 = this.aim.aG(byteBuffer);
            if (!bl6) {
                return false;
            }
        } else {
            this.aim = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.ain = new xd_1();
            bl5 = this.ain.aG(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.ain = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.aio = new xj_1();
            bl4 = this.aio.aG(byteBuffer);
            if (!bl4) {
                return false;
            }
        } else {
            this.aio = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.aip = new xb_2();
            bl3 = this.aip.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.aip = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.aiq = new wr_1();
            bl2 = this.aiq.aG(byteBuffer);
            if (!bl2) {
                return false;
            }
        } else {
            this.aiq = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.air = new wz_1();
            bl = this.air.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.air = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ais = new wo_1();
            boolean bl27 = this.ais.aG(byteBuffer);
            if (!bl27) {
                return false;
            }
        } else {
            this.ais = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.aif = 0;
        this.aig = null;
        this.aih = null;
        this.aii = null;
        this.aij = null;
        this.aik = null;
        this.ail = null;
        this.aim = null;
        this.ain = null;
        this.aio = null;
        this.aip = null;
        this.aiq = null;
        this.air = null;
        this.ais = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            ww_2 ww_22 = new ww_2(this);
            boolean bl = ww_22.b(byteBuffer, n);
            if (bl) {
                ww_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        ++n;
        if (this.aig != null) {
            n += this.aig.DN();
        }
        ++n;
        if (this.aih != null) {
            n += this.aih.DN();
        }
        ++n;
        if (this.aii != null) {
            n += this.aii.DN();
        }
        ++n;
        if (this.aij != null) {
            n += this.aij.DN();
        }
        ++n;
        if (this.aik != null) {
            n += this.aik.DN();
        }
        ++n;
        if (this.ail != null) {
            n += this.ail.DN();
        }
        ++n;
        if (this.aim != null) {
            n += this.aim.DN();
        }
        ++n;
        if (this.ain != null) {
            n += this.ain.DN();
        }
        ++n;
        if (this.aio != null) {
            n += this.aio.DN();
        }
        ++n;
        if (this.aip != null) {
            n += this.aip.DN();
        }
        ++n;
        if (this.aiq != null) {
            n += this.aiq.DN();
        }
        ++n;
        if (this.air != null) {
            n += this.air.DN();
        }
        ++n;
        if (this.ais != null) {
            n += this.ais.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dy(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dy(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("protectorId=").append(this.aif).append('\n');
        stringBuilder.append(string).append("nationality=");
        if (this.aig == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aig.dH(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("appearance=");
        if (this.aih == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aih.dz(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("challenges=");
        if (this.aii == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aii.dA(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("referenceMerchantInventories=");
        if (this.aij == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aij.dI(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("nationMerchantInventories=");
        if (this.aik == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aik.dG(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("wallet=");
        if (this.ail == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.ail.dP(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("stake=");
        if (this.aim == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aim.dM(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("taxes=");
        if (this.ain == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.ain.dN(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("weatherModifiers=");
        if (this.aio == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aio.dR(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("satisfaction=");
        if (this.aip == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aip.dL(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("monsterTargets=");
        if (this.aiq == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aiq.dE(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("resourceTargets=");
        if (this.air == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.air.dJ(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("ecosystem=");
        if (this.ais == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.ais.dB(stringBuilder, string + "  ");
        }
    }
}

