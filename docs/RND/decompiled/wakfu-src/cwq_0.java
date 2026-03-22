/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from cwq
 */
public class cwq_0
extends nr_0 {
    private final TIntArrayList mkW = new TIntArrayList();
    private final TIntArrayList mkX = new TIntArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length < 2) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort() & 0xFFFF;
        if (byteBuffer.remaining() != n * 8) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            this.mkW.add(byteBuffer.getInt());
            this.mkX.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int d() {
        return 12949;
    }

    public final int eEN() {
        return this.mkW.size();
    }

    public final int Lo(int n) {
        return this.mkW.get(n);
    }

    public final int Lp(int n) {
        return this.mkX.get(n);
    }
}

