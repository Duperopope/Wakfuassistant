/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bAu
 */
class bau_0
extends fi_1 {
    final /* synthetic */ bat_0 jFa;

    bau_0(bat_0 bat_02) {
        this.jFa = bat_02;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("On ne serialize pas ces infos dans le client");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        yo_2 yo_22 = new yo_2();
        yo_22.aG(byteBuffer);
        this.jFa.aDL = yo_22.TL;
    }
}

