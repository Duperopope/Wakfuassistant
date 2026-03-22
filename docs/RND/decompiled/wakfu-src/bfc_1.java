/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bFc
 */
public abstract class bfc_1
extends fgl_0 {
    private acd_1 jSS;

    protected bfc_1(int n) {
        super(n);
    }

    public abstract void v(String ... var1);

    public abstract boolean aQ(ffV var1);

    public boolean aR(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_0 bgt_03 = (bgt_0)fcI.ag(bgt_02.Xi(), ffV2.LV());
        if (bgt_03 == null) {
            return false;
        }
        if (bgt_03.dmc() && !this.dTk()) {
            return false;
        }
        return this.bfe == null || this.bfe.b(bgt_03, ffV2, null, null);
    }

    protected void jU(long l) {
        clb_0 clb_02 = new clb_0(l, this);
        aue_0.cVJ().etu().d(clb_02);
    }

    public final void U(acd_1 acd_12) {
        this.jSS = acd_12;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.fXp()) {
            if (this.jSS == null) {
                byteBuffer.put((byte)0);
            } else {
                byteBuffer.put((byte)1);
                byteBuffer.putInt(this.jSS.getX());
                byteBuffer.putInt(this.jSS.getY());
                byteBuffer.putShort(this.jSS.bdi());
            }
        }
        return true;
    }

    @Override
    public int DN() {
        if (this.fXp()) {
            if (this.jSS == null) {
                return 1;
            }
            return 11;
        }
        return 0;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Pas de d\u00e9s\u00e9rialization dans le Client");
    }

    public String dTj() {
        return null;
    }

    protected boolean dTk() {
        return true;
    }

    public boolean bDA() {
        return true;
    }
}

