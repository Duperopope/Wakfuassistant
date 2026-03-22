/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bzA
extends fi_1 {
    final /* synthetic */ bzz jEb;

    bzA(bzz bzz2) {
        this.jEb = bzz2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        ui_1 ui_12 = new ui_1();
        ui_12.aG(byteBuffer);
        int n2 = this.jEb.jDZ;
        this.jEb.jDZ = ui_12.acC;
        this.jEb.a(n2, this.jEb.jDZ, ui_12.acD);
    }
}

