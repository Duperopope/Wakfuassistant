/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bCD
 */
class bcd_0
extends fi_1 {
    final /* synthetic */ bCA jJD;

    bcd_0(bCA bCA2) {
        this.jJD = bCA2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        vs_2 vs_22 = new vs_2();
        vs_22.aG(byteBuffer);
        this.jJD.dNj().a(vs_22);
    }
}

