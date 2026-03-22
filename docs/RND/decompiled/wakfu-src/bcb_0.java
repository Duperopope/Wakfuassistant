/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bCB
 */
class bcb_0
extends fi_1 {
    final /* synthetic */ bCA jJB;

    bcb_0(bCA bCA2) {
        this.jJB = bCA2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Les \u00e9l\u00e9ments interactifs client ne peuvent pas \u00eatre s\u00e9rialis\u00e9s");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        oT.trace((Object)("D\u00e9codage des donn\u00e9es sp\u00e9cifiques (len=" + byteBuffer.remaining() + ")"));
        if (byteBuffer.remaining() < 1) {
            oT.error((Object)"Impossible de d\u00e9s\u00e9rialiser un \u00e9l\u00e9ment interactif vide");
            return;
        }
        if (byteBuffer.remaining() < 23) {
            oT.error((Object)("Taille de donn\u00e9es restantes dans le buffer invalide : " + byteBuffer.remaining()));
            return;
        }
        bCA.a(this.jJB, (long)byteBuffer.getShort());
        bCA.a(this.jJB).setX(byteBuffer.getInt());
        bCA.b(this.jJB).setY(byteBuffer.getInt());
        bCA.c(this.jJB).aM(byteBuffer.getShort());
        bCA.a(this.jJB, byteBuffer.getShort());
        this.jJB.setVisible(byteBuffer.get() != 0);
        bCA.a(this.jJB, byteBuffer.get() != 0);
        this.jJB.a(abi_1.wG(byteBuffer.get()));
        bCA.b(this.jJB, byteBuffer.getShort());
        short s = byteBuffer.getShort();
        for (int i = s - 1; i >= 0; --i) {
            acd_1 acd_12 = new acd_1();
            acd_12.setX(byteBuffer.getInt());
            acd_12.setY(byteBuffer.getInt());
            acd_12.aM(byteBuffer.getShort());
            bCA.d(this.jJB).add(acd_12);
        }
        byte[] byArray = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray);
        bCA.a(this.jJB, BH.dc(byArray));
        this.jJB.f(fcs_0.fX(byteBuffer));
        byteBuffer.getInt();
        if (byteBuffer.remaining() == 2) {
            bCA.b(this.jJB, byteBuffer.get() == 1);
            bCA.c(this.jJB, byteBuffer.get() == 1);
        }
        this.jJB.dNq();
        this.jJB.dQw();
        if (byteBuffer.remaining() > 0) {
            oT.error((Object)("Il reste des donn\u00e9es non trait\u00e9es dans le buffer : " + byteBuffer.remaining()));
        }
    }
}

