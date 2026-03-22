/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortIntHashMap
 */
import gnu.trove.map.hash.TShortIntHashMap;
import java.nio.ByteBuffer;

public final class cpj
extends nr_0 {
    private final TShortIntHashMap mdN = new TShortIntHashMap();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            this.mdN.put(byteBuffer.getShort(), byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int d() {
        return 12054;
    }

    public TShortIntHashMap exh() {
        return this.mdN;
    }
}

