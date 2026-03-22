/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csD
 */
public class csd_0
extends nr_0 {
    private ejv_0 mhx;
    private String lZM;
    private String mhy;
    private kW mhz;
    private short bok;
    private int mhB;
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
        this.mhy = BH.dc(byArray3);
        int n3 = byteBuffer.getInt();
        byte[] byArray4 = new byte[n3];
        byteBuffer.get(byArray4);
        this.mhz = kW.bG(byArray4);
        this.bok = byteBuffer.getShort();
        this.mhB = byteBuffer.getInt();
        this.mhA = byteBuffer.getInt();
        return true;
    }

    public ejv_0 eBn() {
        return this.mhx;
    }

    public String eBq() {
        return this.lZM;
    }

    public String eBo() {
        return this.mhy;
    }

    public kW aaA() {
        return this.mhz;
    }

    public short bfE() {
        return this.bok;
    }

    public int eBr() {
        return this.mhB;
    }

    public int eBp() {
        return this.mhA;
    }

    @Override
    public int d() {
        return 12806;
    }
}

