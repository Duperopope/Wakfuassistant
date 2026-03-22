/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bBP
 */
class bbp_0
extends fi_1 {
    final /* synthetic */ bbo_1 jGG;

    bbp_0(bbo_1 bbo_12, int n) {
        this.jGG = bbo_12;
        super(n);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.jGG.aDh = byteBuffer.getLong();
        this.jGG.setVisible(this.jGG.aDh == 0L);
        bgy bgy2 = bgg_0.dlO().ju(this.jGG.aDh);
        if (bgy2 == null) {
            return;
        }
        eid_0 eid_02 = bgy2.dpX();
        if (eid_02 == null || eid_02.dsm() != 16) {
            return;
        }
        bkg_2 bkg_22 = (bkg_2)eid_02;
        bkg_22.a(this.jGG);
    }
}

