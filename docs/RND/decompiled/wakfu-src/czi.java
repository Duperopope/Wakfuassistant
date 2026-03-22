/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class czi
extends nr_0 {
    private String cpF;
    private long mmY;
    private String mmZ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.cpF = BH.dc(byArray2);
        this.mmY = byteBuffer.getLong();
        byte[] byArray3 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray3);
        this.mmZ = BH.dc(byArray3);
        return false;
    }

    public String getKey() {
        return this.cpF;
    }

    public long eFZ() {
        return this.mmY;
    }

    public String eGa() {
        return this.mmZ;
    }

    @Override
    public int d() {
        return 23259;
    }
}

