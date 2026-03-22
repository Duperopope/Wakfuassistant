/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciC
extends nr_0 {
    private byte lUJ;
    private String cKf;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lUJ = byteBuffer.get();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.cKf = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 488;
    }

    public byte evi() {
        return this.lUJ;
    }

    public String bDO() {
        return this.cKf;
    }
}

