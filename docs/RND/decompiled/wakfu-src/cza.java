/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArraySet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.jetbrains.annotations.NotNull
 */
import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class cza
extends nr_0 {
    private final ArrayList<byte[]> mmT = new ArrayList();
    private final LongSet mmU = new LongArraySet();

    @Override
    public boolean dn(byte[] byArray) {
        short s;
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.get() & 0xFF;
        for (n = 0; n < n2; ++n) {
            s = byteBuffer.getShort();
            byte[] byArray2 = new byte[s];
            byteBuffer.get(byArray2);
            this.mmT.add(byArray2);
        }
        n = byteBuffer.get();
        for (s = 0; s < n; s = (short)((byte)(s + 1))) {
            this.mmU.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int d() {
        return 23689;
    }

    public ArrayList<byte[]> eFU() {
        return this.mmT;
    }

    @NotNull
    public LongSet eFV() {
        return this.mmU;
    }
}

