/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cmo
extends cmy_0 {
    private mR maD;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.maD = mR.cd(byArray);
    }

    @Override
    public int d() {
        return 12925;
    }

    @Generated
    public mR evH() {
        return this.maD;
    }
}

