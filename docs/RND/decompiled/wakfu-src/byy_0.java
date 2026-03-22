/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from byy
 */
class byy_0
extends fi_1 {
    final /* synthetic */ byx_0 jCL;

    byy_0(byx_0 byx_02, int n) {
        this.jCL = byx_02;
        super(n);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => client par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.jCL.fa(byteBuffer);
        switch (byx_0.a(this.jCL)) {
            case 0: 
            case 1: {
                this.jCL.bf(true);
                this.jCL.bi(true);
                this.jCL.a(RJ.bmt);
                break;
            }
            case 2: {
                this.jCL.bf(false);
                this.jCL.bi(false);
                bsS bsS2 = bsU.dHk().Ft(this.jCL.ibY);
                rh_0 rh_02 = bsS2.bag();
                if (!this.jCL.t(bsS2)) {
                    if (bsS2 instanceof bsj_0) {
                        ((bsj_0)bsS2).qG(this.jCL.Sn());
                    }
                    return;
                }
                aVi.cWF().a(this.jCL.ibY, (aft_2)new byz_0(this, agb_1.cbm(), 0, 0, rh_02));
                this.jCL.a(RJ.bms);
            }
        }
    }
}

