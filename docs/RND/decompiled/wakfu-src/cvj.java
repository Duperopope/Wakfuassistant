/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class cvj
extends nr_0 {
    private long jEK;
    @Nullable
    private ftv_0 mjS;
    private int mjT;

    @Override
    public boolean dn(byte[] byArray) {
        boolean bl;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.mjS = ftv_0.gB(byteBuffer);
            this.jEK = this.mjS.gmj();
            this.mjT = byteBuffer.getInt();
        } else {
            this.jEK = byteBuffer.getLong();
        }
        return false;
    }

    public long ZC() {
        return this.jEK;
    }

    public Optional<ftv_0> eDO() {
        return Optional.ofNullable(this.mjS);
    }

    public int eDP() {
        return this.mjT;
    }

    @Override
    public int d() {
        return 13888;
    }
}

