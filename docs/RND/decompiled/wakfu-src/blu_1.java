/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bLU
 */
public class blu_1
extends ezb_0 {
    protected static final Logger kvo = Logger.getLogger(blu_1.class);

    public blu_1() {
    }

    @Override
    public ezb_0 edS() {
        return new blu_1();
    }

    public blu_1(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        super(s, string, n, s2, exP2, n2, fqP2);
    }

    public blu_1 c(short s, String string, int n, short s2, exP exP2, int n2, fqP<fqE> fqP2) {
        return new blu_1(s, string, n, s2, exP2, n2, fqP2);
    }

    public blu_1(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        super(s, rW, rU, bl, bl2, bl3);
    }

    @Override
    public ezb_0 b(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        return new blu_1(s, rW, rU, bl, bl2, bl3);
    }

    @Override
    public void a(exP exP2, exP exP3) {
        super.a(exP2, exP3);
        this.b((bhx_0)exP2, (bgy)exP3);
    }

    public void b(bhx_0 bhx_02, bgy bgy2) {
        blr_1.a(bhx_02, bgy2, this.aWO(), this.doG());
    }

    @Override
    protected void S(exP exP2) {
        super.S(exP2);
        bhx_0 bhx_02 = (bhx_0)exP2;
        bMm bMm2 = bhx_02.doH();
        if (bMm2 == null || this.kxu == null) {
            return;
        }
        for (fqE fqE2 : this.kxu) {
            bmx_0 bmx_02 = ((bmx_0)fqE2).U(bhx_02);
            bMm2.c(bmx_02);
        }
    }

    public void a(exP exP2, yq_1 yq_12) {
        fqP<? extends fqE> fqP2 = exP2.dkB();
        if (fqP2 == null) {
            return;
        }
        for (yr_1 yr_12 : yq_12.alH) {
            bmx_0 bmx_02 = new bmx_0(exP2);
            bmx_02.e(yr_12.alI);
            try {
                ((Sg)fqP2).b(bmx_02);
            }
            catch (sa_0 sa_02) {
                kvo.error((Object)"InventoryCapacityReachedException lors de l'initialisation des sorts d'un double : ", (Throwable)sa_02);
            }
            catch (Sz sz) {
                kvo.error((Object)"ContentAlreadyPresentException lors de l'initialisation des sorts d'un double : ", (Throwable)sz);
            }
        }
    }

    public /* synthetic */ ezb_0 b(short s, String string, int n, short s2, exP exP2, int n2, fqP fqP2) {
        return this.c(s, string, n, s2, exP2, n2, fqP2);
    }
}

