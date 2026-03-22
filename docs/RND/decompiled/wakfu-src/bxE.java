/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bxE
extends fi_1 {
    final /* synthetic */ bxD jBD;

    bxE(bxD bxD2, int n) {
        this.jBD = bxD2;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.jBD.jBy = new uw_0(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.getShort());
        this.jBD.jBz = new uw_0(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.getShort());
        this.jBD.jBx = byteBuffer.get() == 0;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

