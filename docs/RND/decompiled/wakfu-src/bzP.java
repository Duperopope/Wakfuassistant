/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bzP
extends fi_1 {
    final /* synthetic */ bzo_0 jEx;

    bzP(bzo_0 bzo_02, int n) {
        this.jEx = bzo_02;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bzo_0.a(this.jEx).Q(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        int n2 = this.jEx.ciZ;
        this.jEx.ciZ = byteBuffer.getInt();
        this.jEx.jBW = byteBuffer.getInt();
        this.jEx.jBV = byteBuffer.getInt();
        if (this.jEx.jBV == -1) {
            this.jEx.ht(false);
        } else {
            this.jEx.ht(true);
        }
        if (n2 != this.jEx.ciZ) {
            this.jEx.aPg();
        }
        this.jEx.aVQ();
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

