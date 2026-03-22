/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctv
extends nr_0 {
    private long mik;
    private int mil;
    private long bhR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mil = byteBuffer.getInt();
        this.mik = byteBuffer.getLong();
        this.bhR = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13341;
    }

    public int eCh() {
        return this.mil;
    }

    public long KU() {
        return this.mik;
    }

    public long Qy() {
        return this.bhR;
    }
}

