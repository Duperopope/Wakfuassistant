/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from byW
 */
class byw_0
extends fi_1 {
    final /* synthetic */ byv_0 jDq;

    byw_0(byv_0 byv_02) {
        this.jDq = byv_02;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        byv_0.a(this.jDq, byteBuffer.getLong());
        int n2 = byteBuffer.getInt();
        int n3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byv_0.a(this.jDq).Q(n2, n3, s);
        this.jDq.bmT = byteBuffer.get() == 1;
        this.jDq.jDn = byteBuffer.get() == 1;
        tp_2 tp_22 = new tp_2();
        if (tp_22.aG(byteBuffer)) {
            this.jDq.jDm = new bnv_2();
            if (!this.jDq.jDm.a(tp_22)) {
                oT.error((Object)("Impossible de r\u00e9cup\u00e9rer les donn\u00e9es du RawDimensionalBag pour le sac id=" + this.jDq.Sn()));
            }
        } else {
            oT.error((Object)("Impossible de d\u00e9s\u00e9rialiser le RawDimensionalBag pour le sac id=" + this.jDq.Sn()));
        }
        if ((byv_0.b(this.jDq) == 2 || byv_0.c(this.jDq) == 1) && this.jDq.jJl == 0) {
            this.jDq.dOA();
        }
        this.jDq.jJl = byv_0.d(this.jDq);
        this.jDq.dOy();
    }
}

