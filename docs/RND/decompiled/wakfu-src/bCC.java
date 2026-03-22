/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bCC
extends fi_1 {
    final /* synthetic */ bCA jJC;

    bCC(bCA bCA2) {
        this.jJC = bCA2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.jJC.ac(byteBuffer.getShort());
        this.jJC.setVisible(byteBuffer.get() == 1);
        this.jJC.setUsable(byteBuffer.get() == 1);
        this.jJC.bh(byteBuffer.get() == 1);
        this.jJC.bi(byteBuffer.get() == 1);
        this.jJC.bf(byteBuffer.get() == 1);
        this.jJC.aa(byteBuffer.get());
        int n2 = byteBuffer.getInt();
        for (int i = 0; i < n2; ++i) {
            this.jJC.a(fcs_0.gb(byteBuffer.get()));
        }
    }
}

