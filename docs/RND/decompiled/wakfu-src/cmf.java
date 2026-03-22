/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cmf
extends cmy_0 {
    private mi_0 may;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.may = mi_0.cb(byArray);
    }

    @Override
    public int d() {
        return 13483;
    }

    @Generated
    public mi_0 evD() {
        return this.may;
    }
}

