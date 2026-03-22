/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxK
extends nr_0 {
    private long lKU;
    private String mme;
    private String aZI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lKU = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.mme = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray3);
        this.aZI = BH.dc(byArray3);
        return true;
    }

    public String eFd() {
        return this.mme;
    }

    public String aXl() {
        return this.aZI;
    }

    public long esw() {
        return this.lKU;
    }

    @Override
    public int d() {
        return 1136;
    }
}

