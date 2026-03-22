/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

public class crt
extends nr_0 {
    private final TIntArrayList mgf = new TIntArrayList();
    private final TIntArrayList mgg = new TIntArrayList();
    private final TIntArrayList mgh = new TIntArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            this.mgf.add(byteBuffer.getInt());
            this.mgg.add(byteBuffer.getInt());
            this.mgh.add(byteBuffer.getInt());
        }
        return true;
    }

    public TIntArrayList ezT() {
        return this.mgf;
    }

    public TIntArrayList ezU() {
        return this.mgg;
    }

    public TIntArrayList ezV() {
        return this.mgh;
    }

    @Override
    public int d() {
        return 12036;
    }
}

