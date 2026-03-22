/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bxS
extends fi_1 {
    final /* synthetic */ bxR jBY;

    bxS(bxR bxR2, int n) {
        this.jBY = bxR2;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bxR.a(this.jBY).Q(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.jBY.ciZ = byteBuffer.getInt();
        this.jBY.jBW = byteBuffer.getInt();
        this.jBY.jBV = byteBuffer.getInt();
        this.jBY.aPg();
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

