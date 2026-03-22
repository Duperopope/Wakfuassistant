/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bxc
 */
class bxc_0
extends fi_1 {
    final /* synthetic */ bxb_0 jAQ;

    bxc_0(bxb_0 bxb_02) {
        this.jAQ = bxb_02;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.getInt();
        int n3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        bxb_0.a(this.jAQ).Q(n2, n3, s);
        this.jAQ.a(abi_1.wG(byteBuffer.get()));
        this.jAQ.ePP = byteBuffer.getLong();
        this.jAQ.jAN = byteBuffer.get() == 1;
        this.jAQ.eZ(byteBuffer);
    }
}

