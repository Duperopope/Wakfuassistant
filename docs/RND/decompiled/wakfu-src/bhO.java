/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;

final class bhO
extends eyj_0 {
    private final ol_2 ijr;
    final /* synthetic */ bhJ ijs;

    bhO(bhJ bhJ2, ol_2 ol_22) {
        this.ijs = bhJ2;
        this.ijr = ol_22;
        this.ijr.DM().a(this);
    }

    @Override
    public void zl() {
        this.ijr.RG = this.ijs.iiI.fwI();
    }

    @Override
    public void zm() {
        dR dR2;
        for (eyk_0 eyk_02 : bhJ.m(this.ijs)) {
            eyk_02.j(this.ijs);
        }
        try {
            dR2 = dR.ad(this.ijr.RG);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bhJ.aGi().error((Object)("Error when unserializing appearance for character id=" + this.ijs.Sn()), (Throwable)invalidProtocolBufferException);
            return;
        }
        this.ijs.aQ((byte)dR2.sY());
        this.ijs.v(dR2.sC(), true);
        this.ijs.w(dR2.sE(), true);
        this.ijs.x(dR2.sG(), true);
        this.ijs.a(arx_1.cTB, dR2.sI(), true);
        this.ijs.a(arx_1.cTC, dR2.sK(), true);
        this.ijs.a(arx_1.cTD, dR2.sM(), true);
        this.ijs.a(arx_1.cTE, dR2.sO(), true);
        this.ijs.a(arx_1.cTF, dR2.sQ(), true);
        this.ijs.a(arx_1.cTG, dR2.sS(), true);
        this.ijs.dkp();
        this.ijs.c((byte)dR2.sU(), false);
        this.ijs.d((byte)dR2.sW(), false);
        this.ijs.dkq();
    }
}

