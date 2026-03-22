/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.LinkedList;

public final class OD
extends nr_0 {
    private long aZA;
    private boolean aZU;
    private byte[] aZV;
    private final LinkedList<azx_1<Long, byte[]>> aZW = new LinkedList();

    @Override
    public boolean dn(byte[] byArray) {
        try {
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            this.aZA = byteBuffer.getLong();
            this.aZU = byteBuffer.get() == 1;
            int n = byteBuffer.getShort();
            if (n > 0) {
                this.aZV = new byte[n];
                byteBuffer.get(this.aZV);
            }
            n = byteBuffer.getShort();
            for (int i = 0; i < n; ++i) {
                long l = byteBuffer.getLong();
                byte[] byArray2 = new byte[byteBuffer.getShort()];
                byteBuffer.get(byArray2);
                this.aZW.add(new azx_1<Long, byte[]>(l, byArray2));
            }
        }
        catch (RuntimeException runtimeException) {
            dwV.error((Object)"Exception lev\u00e9e \u00e0 la d\u00e9s\u00e9rialisation d'un message de type GroupGlobalDataUpdateMessage");
            return false;
        }
        return true;
    }

    public boolean aXf() {
        return this.aZU;
    }

    public long aXa() {
        return this.aZA;
    }

    @Override
    public int d() {
        return 1065;
    }

    public byte[] aXg() {
        return this.aZV;
    }

    public LinkedList<azx_1<Long, byte[]>> aXh() {
        return this.aZW;
    }
}

