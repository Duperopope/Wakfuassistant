/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csE
 */
public class cse_0
extends nr_0 {
    private ejv_0 mhx;
    private String lZM;
    private kW mhz;
    private int mhA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhx = ejv_0.eU(byteBuffer.get());
        if (this.mhx != ejv_0.qzL) {
            return true;
        }
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.lZM = BH.dc(byArray2);
        int n2 = byteBuffer.getInt();
        byte[] byArray3 = new byte[n2];
        byteBuffer.get(byArray3);
        this.mhz = kW.bG(byArray3);
        this.mhA = byteBuffer.getInt();
        return true;
    }

    public ejv_0 eBn() {
        return this.mhx;
    }

    public String eBq() {
        return this.lZM;
    }

    public kW aaA() {
        return this.mhz;
    }

    public int eBp() {
        return this.mhA;
    }

    @Override
    public int d() {
        return 13962;
    }
}

