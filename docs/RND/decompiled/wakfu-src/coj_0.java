/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from coJ
 */
public class coj_0
extends nr_0 {
    private TLongArrayList mdk;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        this.mdk = new TLongArrayList(n);
        for (int i = 0; i < n; ++i) {
            this.mdk.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int d() {
        return 13420;
    }

    public TLongArrayList ewz() {
        return this.mdk;
    }
}

