/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

public class ciA
extends nr_0 {
    @NotNull
    private ezs_0 lUX;

    @Override
    public boolean dn(byte[] byArray) {
        this.lUX = ezs_0.fm(ByteBuffer.wrap(byArray));
        return true;
    }

    @NotNull
    public ezs_0 evs() {
        return this.lUX;
    }

    @Override
    public int d() {
        return 562;
    }
}

