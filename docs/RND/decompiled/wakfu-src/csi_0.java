/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csI
 */
public class csi_0
extends nr_0 {
    private ejv_0 mhx;
    private String lZM;
    private long mac;
    private long mad;

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
        this.mac = byteBuffer.getLong();
        this.mad = byteBuffer.getLong();
        return true;
    }

    public ejv_0 eBn() {
        return this.mhx;
    }

    public String eBq() {
        return this.lZM;
    }

    public long eBx() {
        return this.mac;
    }

    public long eBy() {
        return this.mad;
    }

    @Override
    public int d() {
        return 13598;
    }
}

