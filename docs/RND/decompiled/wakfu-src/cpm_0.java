/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpM
 */
public class cpm_0
extends nr_0 {
    private int ejc;
    private int eIx;
    private boolean asG;
    private String mei;
    private short bol;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ejc = byteBuffer.getInt();
        this.eIx = byteBuffer.getInt();
        this.asG = byteBuffer.get() != 0;
        this.bol = byteBuffer.getShort();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.mei = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 12011;
    }

    public eKW exD() {
        return eKQ.qEb.QV(this.ejc);
    }

    public eKR dxR() {
        return this.exD().QZ(this.eIx);
    }

    public short bfd() {
        return this.bol;
    }

    public boolean aGv() {
        return this.asG;
    }

    public String exE() {
        return this.mei;
    }
}

