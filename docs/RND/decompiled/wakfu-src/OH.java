/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

public class OH
extends nr_0 {
    private long aZA;
    private final TLongArrayList baa = new TLongArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZA = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            this.baa.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int d() {
        return 1175;
    }

    public long aXa() {
        return this.aZA;
    }

    public TLongArrayList aXn() {
        return this.baa;
    }
}

