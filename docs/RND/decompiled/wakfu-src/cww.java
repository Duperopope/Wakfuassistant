/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cww
extends nv_0 {
    private eTw jfO;

    public void l(eTw eTw2) {
        this.jfO = eTw2;
    }

    @Override
    public byte[] aVX() {
        eTC eTC2 = new eTC();
        eTC2.p(this.jfO);
        ByteBuffer byteBuffer = ByteBuffer.allocate(eTC2.zt());
        eTC2.as(byteBuffer);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1078;
    }
}

