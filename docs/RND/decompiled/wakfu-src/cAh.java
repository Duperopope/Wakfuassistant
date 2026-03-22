/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cAh
extends ceK<cpe, bsj_0> {
    private static final Logger mny = Logger.getLogger(cAh.class);

    public boolean a(cpe cpe2) {
        long l = cpe2.KU();
        if (cpe2.Tx() != (long)((bsj_0)this.jkR).d()) {
            mny.error((Object)("Received a fight message for a different fight. Received fight id : " + cpe2.Tx() + " VS Current fight id : " + ((bsj_0)this.jkR).d()));
            return false;
        }
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(l);
        if (bgy2 == null) {
            mny.error((Object)"Received a build level downscale update for a fighter that is not in the current fight");
            return false;
        }
        if (!(bgy2 instanceof bhJ)) {
            mny.error((Object)("Received a level downscale message for something else than a PlayerCharacter in " + ((bsj_0)this.jkR).d() + "CharacterInfo Type " + bgy2.getClass().getName()));
            return false;
        }
        bhJ bhJ2 = (bhJ)bgy2;
        bhJ2.bx((short)cpe2.tL());
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cpe)aam_22);
    }
}

