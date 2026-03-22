/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

public class crW
extends nr_0 {
    private final TLongArrayList mgF = new TLongArrayList();

    public final TLongArrayList eAv() {
        return this.mgF;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        this.mgF.resetQuick();
        this.mgF.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            this.mgF.add(l);
        }
        return true;
    }

    @Override
    public final int d() {
        return 13345;
    }
}

