/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectIntProcedure
 */
import gnu.trove.procedure.TObjectIntProcedure;
import java.nio.ByteBuffer;

class bDu
extends fi_1 {
    final /* synthetic */ bDt jKg;

    bDu(bDt bDt2) {
        this.jKg = bDt2;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n2) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.jKg.jKe = fkH.gm(byteBuffer);
        }
        this.jKg.dQL();
        if (bl) {
            bda_1.a(fkL.sCr, this.jKg.jKe.Xt(), (TObjectIntProcedure<ffS>)((TObjectIntProcedure)(ffS2, n) -> {
                this.jKg.d(ffS2.shb, n);
                return true;
            }));
        }
        this.jKg.dQM().aPg();
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

