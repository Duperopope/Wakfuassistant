/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

public class fie
extends fif
implements fig {
    private int eQp;
    private short rPf;
    private long bxr;
    private short srs;
    private boolean srt;
    private int sru;
    @Nullable
    private wg_2 srv;
    @Nullable
    private vr_2 srw;
    @Nullable
    private yd_2 srx;
    @Nullable
    private tt_1 sry;
    @Nullable
    private fgr_0 shu;
    @Nullable
    private fgy_0 srz;
    @Nullable
    private fhz srA;

    public fie(ffV ffV2, long l, short s) {
        this.eQp = ffV2.avr();
        this.rPf = ffV2.bfd();
        this.bxr = l;
        this.srs = s;
        if (ffV2.adO()) {
            this.srv = new wg_2();
            ffV2.ead().a(this.srv);
        }
        if (ffV2.pe()) {
            this.srw = new vr_2();
            ffV2.fVV().a(this.srw);
        }
        if (ffV2.dXg()) {
            this.srx = new yd_2();
            ffV2.eAZ().b(this.srx);
        }
        if (ffV2.adW()) {
            this.sry = new tt_1();
            ffV2.fWw().b(this.sry);
        }
        this.shu = ffV2.fUY();
        this.srz = ffV2.eAX();
        this.srA = ffV2.fWy();
        this.sru = ffV2.fUX();
    }

    public fie() {
    }

    public int acs() {
        return this.eQp;
    }

    public short fQY() {
        return this.rPf;
    }

    public long bkj() {
        return this.bxr;
    }

    public short fZv() {
        return this.srs;
    }

    @Override
    public byte fZw() {
        return 0;
    }

    @Override
    public void al(short s) {
        this.rPf = s;
    }

    public boolean fZx() {
        return this.srt;
    }

    public void nu(boolean bl) {
        this.srt = bl;
    }

    @Nullable
    public wg_2 fZy() {
        return this.srv;
    }

    @Nullable
    public vr_2 fZz() {
        return this.srw;
    }

    @Nullable
    public yd_2 fZA() {
        return this.srx;
    }

    @Nullable
    public tt_1 fZB() {
        return this.sry;
    }

    public fgr_0 fUY() {
        return this.shu;
    }

    public fgy_0 fZC() {
        return this.srz;
    }

    @Nullable
    public fhz fZD() {
        return this.srA;
    }

    public int fZE() {
        return this.sru;
    }

    @Override
    public void e(azg_1 azg_12) {
        ByteBuffer byteBuffer;
        Object object;
        azg_12.vC(this.eQp);
        azg_12.aG(this.rPf);
        azg_12.gK(this.bxr);
        azg_12.aG(this.srs);
        azg_12.dz(this.srt);
        azg_12.aF((byte)(this.srv != null ? 1 : 0));
        if (this.srv != null) {
            object = ByteBuffer.allocate(this.srv.DN());
            this.srv.aF((ByteBuffer)object);
            azg_12.dH(((ByteBuffer)object).array());
        }
        azg_12.aF((byte)(this.srw != null ? 1 : 0));
        if (this.srw != null) {
            object = ByteBuffer.allocate(this.srw.DN());
            this.srw.aF((ByteBuffer)object);
            azg_12.dH(((ByteBuffer)object).array());
        }
        azg_12.aF((byte)(this.srx != null ? 1 : 0));
        if (this.srx != null) {
            object = ByteBuffer.allocate(this.srx.DN());
            this.srx.aF((ByteBuffer)object);
            azg_12.dH(((ByteBuffer)object).array());
        }
        azg_12.aF((byte)(this.sry != null ? 1 : 0));
        if (this.sry != null) {
            object = ByteBuffer.allocate(this.sry.DN());
            this.sry.aF((ByteBuffer)object);
            azg_12.dH(((ByteBuffer)object).array());
        }
        azg_12.aF((byte)(this.shu != null ? 1 : 0));
        if (this.shu != null) {
            object = new ve_1();
            this.shu.a((ve_1)object);
            byteBuffer = ByteBuffer.allocate(((ve_1)object).DN());
            ((ve_1)object).aF(byteBuffer);
            azg_12.dH(byteBuffer.array());
        }
        azg_12.aF((byte)(this.srz != null ? 1 : 0));
        if (this.srz != null) {
            object = new vg_2();
            this.srz.a((vg_2)object);
            byteBuffer = ByteBuffer.allocate(((vg_2)object).DN());
            ((vg_2)object).aF(byteBuffer);
            azg_12.dH(byteBuffer.array());
        }
        azg_12.aF((byte)(this.srA != null ? 1 : 0));
        if (this.srA != null) {
            object = new we_1();
            this.srA.a((we_1)object);
            byteBuffer = ByteBuffer.allocate(((we_1)object).DN());
            ((we_1)object).aF(byteBuffer);
            azg_12.dH(byteBuffer.array());
        }
        azg_12.vC(this.sru);
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        gs_0 gs_02;
        this.eQp = byteBuffer.getInt();
        this.rPf = byteBuffer.getShort();
        this.bxr = byteBuffer.getLong();
        this.srs = byteBuffer.getShort();
        boolean bl = this.srt = byteBuffer.get() != 0;
        if (byteBuffer.get() == 1) {
            this.srv = new wg_2();
            this.srv.aG(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            this.srw = new vr_2();
            this.srw.aG(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            this.srx = new yd_2();
            this.srx.aG(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            this.sry = new tt_1();
            this.sry.aG(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            gs_02 = new ve_1();
            ((ve_1)gs_02).aG(byteBuffer);
            this.shu = fgv_0.c((ve_1)gs_02);
        }
        if (byteBuffer.get() == 1) {
            gs_02 = new vg_2();
            ((vg_2)gs_02).aG(byteBuffer);
            this.srz = fgy_0.b((vg_2)gs_02);
        }
        if (byteBuffer.get() == 1) {
            gs_02 = new we_1();
            ((we_1)gs_02).aG(byteBuffer);
            this.srA = fhz.b((we_1)gs_02);
        }
        this.sru = byteBuffer.getInt();
    }

    public String toString() {
        return "AddItemOperation{m_refId=" + this.eQp + ", m_qty=" + this.rPf + ", m_bind=" + String.valueOf(this.shu) + ", m_bagId=" + this.bxr + ", m_posInBag=" + this.srs + ", m_insideMove=" + this.srt + ", m_multiElementsEffects=" + String.valueOf(this.srz) + ", m_mergedSetInfo=" + String.valueOf(this.srA) + "}";
    }
}

