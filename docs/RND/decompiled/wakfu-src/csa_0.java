/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from csA
 */
public class csa_0
extends nr_0 {
    private long huJ;
    private int epc;
    private long azh;
    @Nullable
    private String eCz;
    private long mhv;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.huJ = byteBuffer.getLong();
        this.epc = byteBuffer.getInt();
        this.azh = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        if (n > 0) {
            byte[] byArray2 = new byte[n];
            byteBuffer.get(byArray2);
            this.eCz = BH.dc(byArray2);
            this.mhv = byteBuffer.getLong();
        } else {
            this.eCz = null;
            this.mhv = 0L;
        }
        return true;
    }

    public long eBj() {
        return this.huJ;
    }

    public int AK() {
        return this.epc;
    }

    public long aJp() {
        return this.azh;
    }

    public long eBk() {
        return this.mhv;
    }

    @Nullable
    public String eBl() {
        return this.eCz;
    }

    @Override
    public int d() {
        return 12178;
    }
}

