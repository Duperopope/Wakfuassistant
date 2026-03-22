/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bxO
extends fi_1 {
    final /* synthetic */ bxn_0 jBS;

    bxO(bxn_0 bxn_02, int n) {
        this.jBS = bxn_02;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bxn_0.a(this.jBS).Q(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.jBS.ciZ = byteBuffer.getInt();
        byte[] byArray = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray);
        String string = BH.dc(byArray);
        bxn_0.a(this.jBS, string != null ? string.intern() : null);
        this.jBS.aPg();
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

