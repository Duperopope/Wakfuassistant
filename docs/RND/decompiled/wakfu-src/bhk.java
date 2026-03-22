/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class bhk
extends eyj_0 {
    private final si_2 iga;
    final /* synthetic */ bgt_0 igb;

    bhk(bgt_0 bgt_02, si_2 si_22) {
        this.igb = bgt_02;
        this.iga = si_22;
        this.iga.DM().a(this);
    }

    @Override
    public void zm() {
        this.igb.dnJ().gjV();
        frf frf2 = fre.gy(ByteBuffer.wrap(this.iga.SY));
        this.igb.dnJ().c(frf2);
    }

    @Override
    public void zl() {
    }
}

