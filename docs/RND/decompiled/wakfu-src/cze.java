/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cze
extends nr_0 {
    private String cpF;
    private String axs;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.cpF = this.fl(byteBuffer);
        this.axs = this.fl(byteBuffer);
        return false;
    }

    public String getKey() {
        return this.cpF;
    }

    public String getValue() {
        return this.axs;
    }

    private String fl(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        return BH.dc(byArray);
    }

    @Override
    public int d() {
        return 23826;
    }
}

