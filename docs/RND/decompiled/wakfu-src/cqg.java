/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;

public final class cqg
extends cqf {
    private final TLongHashSet mew = new TLongHashSet();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            this.mew.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int d() {
        return 12381;
    }

    public TLongHashSet exT() {
        return this.mew;
    }
}

