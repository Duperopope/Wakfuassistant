/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bAe
 */
class bae_2
extends fi_1 {
    final /* synthetic */ bad_2 jEL;

    bae_2(bad_2 bad_22) {
        this.jEL = bad_22;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas passer par ici");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.jEL.jEK = byteBuffer.getLong();
    }
}

