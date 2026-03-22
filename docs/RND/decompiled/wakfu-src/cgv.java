/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cgv
extends ceK<crb, bsi_0> {
    private static final Logger lTI = Logger.getLogger(cgv.class);

    cgv() {
    }

    public boolean a(crb crb2) {
        bsS bsS2 = bsU.dHk().Ft(crb2.bha());
        if (!(bsS2 instanceof bsi_0)) {
            lTI.error((Object)String.format("Un message %s concernant le %s id=%d a \u00e9t\u00e9 adress\u00e9 \u00e0 la %s", crb2.getClass().getSimpleName(), bsS2.getClass().getSimpleName(), bsS2.d(), this.getClass().getSimpleName()));
            return false;
        }
        avr_0 avr_02 = new avr_0(agb_1.cbm(), crb2.eza().aJr(), crb2.avZ(), crb2.bha());
        avr_02.eY(crb2.OO());
        aVi.cWF().a(crb2.bha(), (aft_2)avr_02);
        aVi.cWF().zW(crb2.bha());
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((crb)aam_22);
    }
}

