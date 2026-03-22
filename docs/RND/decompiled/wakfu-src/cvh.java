/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class cvh
extends nr_0 {
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
            this.mjT = byteBuffer.getInt();
        }
        return false;
    }

    public Optional<ftv_0> eDO() {
        return Optional.ofNullable(this.mjS);
    }

    public int eDP() {
        return this.mjT;
    }

    @Override
    public int d() {
        return 12312;
    }
}

