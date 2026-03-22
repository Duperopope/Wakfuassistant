/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cmj
extends cmy_0 {
    private mi_0 maA;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.maA = mi_0.cb(byArray);
    }

    @Override
    public int d() {
        return 13587;
    }

    @Generated
    public mi_0 evF() {
        return this.maA;
    }
}

