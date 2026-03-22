/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csH
extends nr_0 {
    private ejv_0 mhx;
    private String lZZ;
    private String maa;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhx = ejv_0.eU(byteBuffer.get());
        if (this.mhx != ejv_0.qzL) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.lZZ = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray3);
        this.maa = BH.dc(byArray3);
        return true;
    }

    public ejv_0 eBn() {
        return this.mhx;
    }

    public String eBv() {
        return this.lZZ;
    }

    public String eBw() {
        return this.maa;
    }

    @Override
    public int d() {
        return 12029;
    }
}

