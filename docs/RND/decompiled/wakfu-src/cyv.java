/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyv
extends nr_0 {
    private int ehT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ehT = byteBuffer.getInt();
        return true;
    }

    public int clk() {
        return this.ehT;
    }

    @Override
    public int d() {
        return 15434;
    }
}

