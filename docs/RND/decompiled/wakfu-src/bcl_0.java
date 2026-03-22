/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bCl
 */
class bcl_0
extends fi_1 {
    final /* synthetic */ bck_0 jHk;

    bcl_0(bck_0 bck_02, int n) {
        this.jHk = bck_02;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.jHk.bmT = byteBuffer.get() == 1;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

