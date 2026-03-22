/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class cpw
extends nr_0 {
    private long igQ;
    private boolean mdU;
    @Nullable
    private pi_1 mdV;

    @Override
    public boolean dn(byte[] byArray) {
        boolean bl;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.igQ = byteBuffer.getLong();
        this.mdU = byteBuffer.get() == 1;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.mdV = new pi_1();
            this.mdV.b(byteBuffer, exH.pdw);
        }
        return true;
    }

    @Override
    public int d() {
        return 12452;
    }

    @Generated
    public long doL() {
        return this.igQ;
    }

    @Generated
    public boolean exo() {
        return this.mdU;
    }

    @Nullable
    @Generated
    public pi_1 exp() {
        return this.mdV;
    }
}

