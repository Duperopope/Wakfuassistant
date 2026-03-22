/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public final class eUq {
    static final Logger ruw = Logger.getLogger(eUq.class);
    private final rh_0 rux;

    public eUq(rh_0 rh_02) {
        this.rux = rh_02;
    }

    public byte[] apI() {
        return this.lA(false);
    }

    public byte[] lA(boolean bl) {
        azg_1 azg_12 = new azg_1();
        azg_12.aG(this.rux.bdL());
        azg_12.aG(this.rux.bdM());
        azg_12.vC(this.rux.bgm());
        azg_12.vC(this.rux.bgn());
        azg_12.vC(this.rux.getWidth());
        azg_12.vC(this.rux.getHeight());
        azg_12.aG(this.rux.bdI());
        azg_12.aG(this.rux.bdJ());
        azg_12.aG((short)this.rux.bdx());
        short[] sArray = this.rux.bdw();
        for (int i = 0; i < this.rux.bdx(); ++i) {
            azg_12.aG(sArray[i]);
        }
        azg_12.aF(this.rux.bdB() ? (byte)1 : 0);
        if (this.rux.bdB()) {
            azg_12.dH(this.rux.bdC());
        }
        if (bl) {
            azg_12.aF((byte)1);
            new eUv(this.rux).d(azg_12);
        } else {
            azg_12.aF((byte)0);
        }
        azg_12.aF(this.rux.bdz());
        azg_12.aF(this.rux.bdA());
        byte[] byArray = this.rux.bdE();
        azg_12.aF((byte)byArray.length);
        for (int i = 0; i < byArray.length; ++i) {
            byte by = byArray[i];
            azg_12.aF(by);
            azg_12.vC(this.rux.Q(by));
        }
        return azg_12.bTe();
    }

    public void eL(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.position();
        short s = byteBuffer.getShort();
        this.rux.U(s);
        short s2 = byteBuffer.getShort();
        this.rux.V(s2);
        int n3 = byteBuffer.getInt();
        this.rux.oV(n3);
        int n4 = byteBuffer.getInt();
        this.rux.oW(n4);
        int n5 = byteBuffer.getInt();
        this.rux.setWidth(n5);
        int n6 = byteBuffer.getInt();
        this.rux.setHeight(n6);
        this.rux.X(byteBuffer.getShort());
        this.rux.W(byteBuffer.getShort());
        int n7 = byteBuffer.getShort();
        this.rux.oX(n7);
        assert (byteBuffer.remaining() > n7 * 2);
        short[] sArray = new short[n7];
        for (n = 0; n < n7; n += 1) {
            sArray[n] = byteBuffer.getShort();
        }
        this.rux.j(sArray);
        n = byteBuffer.get() == 1 ? 1 : 0;
        this.rux.be(n != 0);
        byte[] byArray = new byte[n7];
        if (n) {
            byteBuffer.get(byArray);
        }
        this.rux.dt(byArray);
        this.fG(byteBuffer);
        this.rux.S(byteBuffer.get());
        this.rux.T(byteBuffer.get());
        int n8 = byteBuffer.get();
        for (int i = 0; i < n8; ++i) {
            this.rux.a(byteBuffer.get(), byteBuffer.getInt());
        }
    }

    static aci_1 i(rh_0 rh_02) {
        return vz_0.i(rh_02.bgm(), rh_02.bgn(), rh_02.getWidth(), rh_02.getHeight());
    }

    private void fG(ByteBuffer byteBuffer) {
        aci_1 aci_12 = eUq.i(this.rux);
        euu_0 euu_02 = eUq.a(this.rux, byteBuffer);
        for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
            for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                wy_0 wy_02 = euu_02.l((short)j, (short)i);
                if (wy_02 == null) continue;
                this.rux.a(wy_02);
            }
        }
    }

    private static euu_0 a(rh_0 rh_02, ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() != 0;
        if (wa_0.bmu()) {
            assert (!bl);
            return new eUr();
        }
        short s = rh_02.bdL();
        short s2 = rh_02.bdM();
        if (bl) {
            new eUv(rh_02).eU(byteBuffer);
            return new eUs(s, s2);
        }
        return new eut_0(s, s2);
    }
}

