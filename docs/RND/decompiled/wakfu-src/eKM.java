/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class eKM {
    private eKN qDI = eKN.qDO;
    private int qDJ;
    private boolean qDK;

    public static eKM fu(ByteBuffer byteBuffer) {
        eKM eKM2 = new eKM();
        eKN eKN2 = eKN.eV(byteBuffer.get());
        if (eKN2 == null) {
            return null;
        }
        eKM2.qDI = eKN2;
        switch (eKN2.ordinal()) {
            case 3: {
                return null;
            }
            case 0: {
                eKM2.QU(byteBuffer.getInt());
                break;
            }
            case 1: {
                eKM2.lI(byteBuffer.get() == 1);
                break;
            }
            case 2: {
                eKM2.QU(byteBuffer.getInt());
                eKM2.lI(byteBuffer.get() == 1);
            }
        }
        return eKM2;
    }

    public static byte[] a(eKM eKM2) {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(eKN.a(eKM2.fyN()));
        if (eKM2.fyN() == eKN.qDL || eKM2.fyN() == eKN.qDN) {
            azg_12.vC(eKM2.qDJ);
        }
        if (eKM2.fyN() == eKN.qDM || eKM2.fyN() == eKN.qDN) {
            azg_12.dz(eKM2.qDK);
        }
        return azg_12.bTe();
    }

    public boolean rn() {
        return this.qDI == eKN.qDM || this.qDI == eKN.qDN;
    }

    public boolean fyM() {
        return this.qDI == eKN.qDL || this.qDI == eKN.qDN;
    }

    public eKN fyN() {
        return this.qDI;
    }

    public int dwm() {
        return this.qDJ;
    }

    public boolean dUt() {
        return this.qDK;
    }

    public void QU(int n) {
        this.qDJ = n;
        switch (this.qDI.ordinal()) {
            case 1: {
                this.qDI = eKN.qDN;
                return;
            }
            case 3: {
                this.qDI = eKN.qDL;
            }
        }
    }

    public void lI(boolean bl) {
        this.qDK = bl;
        switch (this.qDI.ordinal()) {
            case 0: {
                this.qDI = eKN.qDN;
                return;
            }
            case 3: {
                this.qDI = eKN.qDM;
            }
        }
    }
}

