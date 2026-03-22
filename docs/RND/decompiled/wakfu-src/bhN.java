/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.DatatypeConverter
 */
import jakarta.xml.bind.DatatypeConverter;
import java.io.IOException;

final class bhN
extends eyj_0 {
    private final oc_1 ijp;
    final /* synthetic */ bhJ ijq;

    bhN(bhJ bhJ2, oc_1 oc_12) {
        this.ijq = bhJ2;
        this.ijp = oc_12;
        this.ijp.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.dok().error((Object)"Les achievements ne sont pas serialis\u00e9s par le client");
    }

    @Override
    public void zm() {
        bcd_2 bcd_22 = bcb_1.hDb.daB();
        try {
            bcd_22.dS(this.ijp.Rr ? fum_0.eY(this.ijp.Rq) : this.ijp.Rq);
        }
        catch (IOException iOException) {
            String string = DatatypeConverter.printHexBinary((byte[])this.ijp.Rq);
            bhJ.dol().fatal((Object)("Error unserializing achievements, hex : " + string), (Throwable)iOException);
        }
        bcd_22.a(new bhp_0(bhJ.o(this.ijq), bcd_22));
        bbw_2.hCq.a(this.ijq.Sn(), bcd_22);
        this.ijp.Rq = null;
    }
}

