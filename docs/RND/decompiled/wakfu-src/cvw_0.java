/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from cvw
 */
public class cvw_0
extends nr_0 {
    private int asJ;
    private TIntArrayList mkf;
    private long mkg;
    private aag_1 mkh;

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        int n2 = byteBuffer.get();
        this.mkf = new TIntArrayList(n2);
        for (n = 0; n < n2; n = (int)((byte)(n + 1))) {
            this.mkf.add(byteBuffer.getInt());
        }
        if (byteBuffer.get() == 1) {
            this.mkg = byteBuffer.getInt();
        }
        if ((n = byteBuffer.getInt()) != 0) {
            this.mkh = new aag_1(n);
            for (int i = 0; i < n; ++i) {
                this.mkh.l(byteBuffer.get(), byteBuffer.getLong());
            }
        }
        return true;
    }

    @Override
    public int d() {
        return 13197;
    }

    public int aGD() {
        return this.asJ;
    }

    public TIntArrayList eDY() {
        return this.mkf;
    }

    public long bVs() {
        return this.mkg;
    }

    public aag_1 eDZ() {
        return this.mkh;
    }
}

