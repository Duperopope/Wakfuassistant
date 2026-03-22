/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csw
 */
public class csw_0
extends nr_0 {
    private fha_0 mhm;
    private long duS;
    private fgy_0 mhn;
    private fhi_0 jRV;
    private boolean mho;

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        Object object;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhm = fha_0.values()[byteBuffer.getInt()];
        this.duS = byteBuffer.getLong();
        this.mho = byteBuffer.get() == 0;
        int n2 = byteBuffer.getInt();
        if (n2 > 0) {
            byte[] byArray2 = new byte[n2];
            byteBuffer.get(byArray2);
            object = new vg_2();
            ((vg_2)object).aG(ByteBuffer.wrap(byArray2));
            this.mhn = fgy_0.b((vg_2)object);
        }
        if ((n = byteBuffer.getInt()) > 0) {
            object = new byte[n];
            byteBuffer.get((byte[])object);
            this.jRV = fhk_0.eQ((byte[])object);
        }
        return true;
    }

    public fgy_0 eAX() {
        return this.mhn;
    }

    public long bSZ() {
        return this.duS;
    }

    public boolean eAY() {
        return this.mho;
    }

    public fhi_0 eAZ() {
        return this.jRV;
    }

    public fha_0 eBa() {
        return this.mhm;
    }

    @Override
    public int d() {
        return 13000;
    }
}

