/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKm
 */
public class bkm_0
extends ffc_0 {
    private static final Logger knf = Logger.getLogger(bkm_0.class);
    private final boolean kng;
    private final fpf knh;

    public bkm_0(long l, RW<ffh_0, vy_2> rW, fgz_0 fgz_02, short s, byte by, boolean bl, fpf fpf2) {
        super(l, rW, fgz_02, s, by);
        this.kng = bl;
        this.knh = fpf2;
    }

    @Override
    public boolean a(ffh_0 ffh_02) {
        bkn_0 bkn_02;
        if (ffh_02 != null && (bkn_02 = (bkn_0)ffh_02).aOY()) {
            return false;
        }
        return super.a(ffh_02);
    }

    @Override
    public void b(fgv fgv2, ffh_0 ffh_02) {
        if (this.kng) {
            for (ffh_0 ffh_03 : this) {
                ((bkn_0)ffh_03).qw(0L);
            }
        }
        bkn_0 bkn_02 = (bkn_0)ffh_02;
        bkn_02.qw(ue_0.bjV().bjg());
        super.b(fgv2, ffh_02);
    }

    public fpf ebf() {
        return this.knh;
    }

    @Override
    public boolean b(wa_2 wa_22) {
        throw new UnsupportedOperationException("Le client ne doit pas s\u00e9rialiser des ProtectorMerchantInventory");
    }

    @Override
    public boolean a(xl_1 xl_12) {
        if (this.sfO != xl_12.adP) {
            knf.warn((Object)("Mauvais uid \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + this.sfO + ", trouv\u00e9=" + xl_12.adP));
        }
        this.beQ();
        boolean bl = true;
        for (xm_1 xm_12 : xl_12.ajz) {
            bkn_0 bkn_02 = (bkn_0)this.bmD.x(xm_12.ajD);
            if (bkn_02 != null) {
                try {
                    if (this.a(bkn_02, xm_12.adx)) {
                        bkn_02.a(foZ.hh(xm_12.Us));
                        bkn_02.HM(xm_12.ajA);
                        bkn_02.fY(xm_12.ajB);
                        bkn_02.qw(xm_12.ajC);
                        continue;
                    }
                    bl = false;
                }
                catch (sa_0 sa_02) {
                    bl = false;
                    knf.error((Object)sa_02);
                }
                catch (Sz sz) {
                    bl = false;
                    knf.error((Object)sz);
                }
                catch (SD sD) {
                    bl = false;
                    knf.error((Object)sD);
                }
                continue;
            }
            knf.error((Object)("D\u00e9s\u00e9rialisation d'un ProtectorMerchantItem null \u00e0 la position " + xm_12.adx));
            bl = false;
        }
        return bl;
    }

    @Nullable
    public bkn_0 HL(int n) {
        for (ffh_0 ffh_02 : this) {
            bkn_0 bkn_02 = (bkn_0)ffh_02;
            if (bkn_02.ebi() != n) continue;
            return bkn_02;
        }
        return null;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((wa_2)object);
    }
}

