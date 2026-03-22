/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctO
 */
public class cto_0
extends nr_0 {
    private String aFD;
    private fkL lfY;
    private int miG;

    public String xO() {
        return this.aFD;
    }

    public fkL emF() {
        return this.lfY;
    }

    public int eCD() {
        return this.miG;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lfY = fkL.ue(byteBuffer.getLong());
        this.miG = byteBuffer.getInt();
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.aFD = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 15121;
    }
}

