/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;

/*
 * Renamed from csG
 */
public class csg_0
extends nr_0 {
    private ejv_0 mhx;
    private String mhy;
    private int mhA;
    private final HashMap<kW, Short> mhD = new HashMap();

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
        this.mhy = BH.dc(byArray2);
        for (int i = byteBuffer.getInt(); i != 0; --i) {
            int n2 = byteBuffer.getInt();
            if (n2 == 0) continue;
            byte[] byArray3 = new byte[n2];
            byteBuffer.get(byArray3);
            kW kW2 = kW.bG(byArray3);
            short s = byteBuffer.getShort();
            this.mhD.put(kW2, s);
        }
        this.mhA = byteBuffer.getInt();
        return false;
    }

    @Override
    public int d() {
        return 12190;
    }

    public ejv_0 eBn() {
        return this.mhx;
    }

    public HashMap<kW, Short> eBt() {
        return this.mhD;
    }

    public String eBo() {
        return this.mhy;
    }

    public int eBp() {
        return this.mhA;
    }

    public boolean eBu() {
        return this.mhD.isEmpty();
    }
}

