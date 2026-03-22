/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bAM
 */
class bam_1
extends fi_1 {
    final /* synthetic */ bal_0 jFA;

    bam_1(bal_0 bal_02, int n) {
        this.jFA = bal_02;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.jFA.emZ = byteBuffer.getInt();
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

