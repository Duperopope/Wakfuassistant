/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class cmy
extends Nr {
    private fiY maH;

    protected void fd(ByteBuffer byteBuffer) {
    }

    @Override
    public final boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.maH = fiY.gL(byteBuffer.get());
        if (this.maH.aGv()) {
            this.fd(byteBuffer);
        }
        return false;
    }

    public fiY evK() {
        return this.maH;
    }

    public int evL() {
        return 11000 + this.maH.aJr();
    }
}
