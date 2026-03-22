/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crE
 */
public class cre_0
extends nr_0 {
    private fas_0 mgs;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgs = fak_0.fT(byteBuffer);
        return true;
    }

    public fas_0 eAi() {
        return this.mgs;
    }

    @Override
    public int d() {
        return 13949;
    }
}

