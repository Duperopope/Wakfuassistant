/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bzt
 */
class bzt_0
extends fi_1 {
    final /* synthetic */ bzs_0 jDS;

    bzt_0(bzs_0 bzs_02, int n) {
        this.jDS = bzs_02;
        super(n);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => client par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bzs_0.a(this.jDS, byteBuffer.getShort());
        boolean bl = byteBuffer.get() == 1;
        this.jDS.setVisible(bl);
        this.jDS.bi(bl);
    }
}

