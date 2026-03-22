/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eUg
 */
public class eug_1<T extends eNl, E extends qu_0> {
    private static final Logger rrY = Logger.getLogger(eug_1.class);
    final etu_0 rrZ;
    private eue_0 rsa = new eue_0();

    public eug_1(etu_0 etu_02) {
        this.rrZ = etu_02;
    }

    public fqH a(E e2, T t, acd_1 acd_12, boolean bl, int n, int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, ang_2 ang_22) {
        if (t == null) {
            rrY.error((Object)this.rrZ.sq("cast d'un conteneur null"));
            return fqH.sUU;
        }
        if (this.rsa.fKE() && (!this.rrZ.dHf().bhE() || this.rrZ.dHf().bhF() != e2.Sn())) {
            return fqH.sVn;
        }
        int n3 = this.a(e2, bl, n, n2);
        if (n > n3) {
            return fqH.sUX;
        }
        rh_0 rh_02 = this.rrZ.bag();
        if (acd_12 != null && rh_02 != null) {
            Object object;
            int n4 = acd_12.getX();
            int n5 = acd_12.getY();
            short s = acd_12.bdi();
            Object t2 = this.rrZ.dy(acd_12.getX(), acd_12.getY());
            if (!this.a(e2, t, n, n3, bl5, n4, n5)) {
                return fqH.sUX;
            }
            if (!rh_02.aK(n4, n5)) {
                return fqH.sUW;
            }
            if (bl4 && rh_02.R(n4, n5)) {
                return fqH.sUW;
            }
            if (!rh_02.T(n4, n5)) {
                return fqH.sUW;
            }
            if (bl2 ? !this.a(e2, t, n4, n5, s, n, n3, bl5) : !rh_02.j(n4, n5, s)) {
                return fqH.sUV;
            }
            if (ang_22 != null && !ang_22.b(e2, acd_12, t, this.rrZ)) {
                return fqH.sVk;
            }
            List<qu_0> list = this.rrZ.a(acd_12);
            if (ang_22 != null && !list.isEmpty()) {
                boolean bl6 = false;
                int n6 = list.size();
                for (int i = 0; i < n6; ++i) {
                    object = list.get(i);
                    if (!this.rsa.fKF() && object instanceof exP && ((exP)object).cyi()) {
                        bl6 = true;
                        break;
                    }
                    if (!ang_22.b(e2, object, t, this.rrZ)) continue;
                    bl6 = true;
                    break;
                }
                if (!bl6) {
                    return fqH.sVk;
                }
            }
            for (enk_0 enk_02 : t) {
                aoh_1 aoh_12;
                if (enk_02.fAB() == null || enk_02.aZI() == null || rh_02.a(aoh_12 = enk_02.fAB(), acd_12.getX(), acd_12.getY(), acd_12.bdi(), e2.bcC(), e2.bcD(), e2.bcE(), e2.bcB())) continue;
                return fqH.sVm;
            }
            if (bl3 && rh_02.g(n4, n5, s)) {
                return fqH.sVi;
            }
            if (t2 != null) {
                if (t2.a(exe_1.rDv) && t2 != e2) {
                    return fqH.sVk;
                }
                if (e2 instanceof exP && t2 instanceof exP && e2.a(exe_1.rDk)) {
                    exP exP2 = (exP)e2;
                    exP exP3 = (exP)t2;
                    if (exP2.cmL() < exP3.cmL()) {
                        return fqH.sVk;
                    }
                }
                boolean bl7 = false;
                for (Qj qj : t) {
                    if (qj.aZI() == null) {
                        bl7 = true;
                        break;
                    }
                    object = qj.aZI().a((anu_1)t2, (anu_1)e2);
                    switch ((any_1)((Object)((azx_1)object).getFirst())) {
                        case cKR: 
                        case cKV: 
                        case cKS: {
                            bl7 = true;
                        }
                    }
                }
                if (!bl7) {
                    return fqH.sUT;
                }
            }
        } else if (ang_22 != null && !ang_22.b(e2, acd_12, t, this.rrZ)) {
            return fqH.sVk;
        }
        return fqH.sUS;
    }

    int a(E e2, boolean bl, int n, int n2) {
        int n3 = e2.c(exx_2.rGq);
        if (e2 instanceof eza_0 && ((eza_0)e2).buW()) {
            ++n3;
        }
        if (n2 >= 1 && bl) {
            n2 = Math.max(n2 + n3, n);
        }
        if (e2.a(exe_1.rDd) && n2 > 1) {
            n2 = 1;
        }
        return n2;
    }

    protected boolean a(E e2, T t, int n, int n2, short s, int n3, int n4, boolean bl) {
        return eUo.a(e2, this.rrZ, n, n2, s);
    }

    public boolean a(E e2, T t, int n, int n2, boolean bl, int n3, int n4) {
        int n5 = Math.abs(n3 - e2.bcC()) + Math.abs(n4 - e2.bcD());
        if (n5 >= n && n5 <= n2) {
            return true;
        }
        return n5 == 0 && bl;
    }

    public static boolean a(exP exP2, acd_1 acd_12, fqE fqE2, exP exP3, etu_0 etu_02) {
        return eug_1.a(exP2, acd_12, fqE2, exP3, etu_02, false);
    }

    public static boolean a(exP exP2, acd_1 acd_12, fqE fqE2, exP exP3, etu_0 etu_02, boolean bl) {
        Object Spell = fqE2.giP();
        rh_0 rh_02 = etu_02.bag();
        boolean bl2 = ((fqD)Spell).b(fqE2, (Object)exP2, (Object)acd_12, (Object)etu_02.bbh());
        boolean bl3 = ((fqD)Spell).k(fqE2, exP2, acd_12, etu_02.bbh());
        if (!bl3 && !bl2) {
            return true;
        }
        boolean bl4 = bl2;
        if (bl2) {
            if (acd_12.getX() != exP2.aZw().getX() && acd_12.getY() != exP2.aZw().getY()) {
                bl4 = false;
            }
            boolean bl5 = ((fqD)Spell).e(fqE2, exP2, (Object)acd_12, (Object)etu_02.bbh());
            if (bl4 && bl5) {
                sr_0 sr_02 = sr_0.bgd();
                sr_02.a((int)exP2.bcN(), exP2.bcO(), exP2.bvy());
                sr_02.b(rh_02);
                if (exP3 != null) {
                    rh_02.b(exP3);
                }
                boolean bl6 = sr_02.a(exP2.eap(), acd_12, bl);
                rh_02.bdF();
                sr_02.aZp();
                if (!bl6) {
                    bl4 = false;
                }
            }
        }
        if (!bl3 || bl4) {
            return bl4;
        }
        return Math.abs(acd_12.getX() - exP2.aZw().getX()) == Math.abs(acd_12.getY() - exP2.aZw().getY());
    }

    public void a(eue_0 eue_02) {
        this.rsa = eue_02;
    }
}

