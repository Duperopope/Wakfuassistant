/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvL
extends nr_0 {
    private int eiB;
    private acd_1 bio;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bio = anf_2.gn(byteBuffer.getLong());
        this.eiB = byteBuffer.getInt();
        return true;
    }

    public int clS() {
        return this.eiB;
    }

    public acd_1 aZw() {
        return this.bio;
    }

    @Override
    public int d() {
        return 12624;
    }
}

