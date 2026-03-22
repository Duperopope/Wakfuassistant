/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWP
 */
final class bwp_1
extends bxo_2 {
    private static final Logger luR = Logger.getLogger(bwp_1.class);
    private static final String luS = "\u0110";
    public static final String luT = "fontNarrow18BoldBordered";
    public static final float luU = 0.5f;
    private static final String luV = "displayFlyingValue";
    private static final String luW = "Affiche un visuel correspondant a l'effet (valeur au dessus de la cible, gfx de l'etat correspondant...)";
    private static final afe_1[] luX = new afe_1[]{new afe_1("R", null, aff_2.dJz, false), new afe_1("G", null, aff_2.dJz, false), new afe_1("B", null, aff_2.dJz, false), new afe_1("font", null, aff_2.dJx, false), new afe_1("suffix", null, aff_2.dJx, false), new afe_1("negatesValue", null, aff_2.dJA, true), new afe_1("size", null, aff_2.dJz, true), new afe_1("isHpLoss", null, aff_2.dJA, true), new afe_1("caster", null, aff_2.dJA, true), new afe_1("value", null, aff_2.dJz, true)};
    private static final int luY = 1000;
    private static final int luZ = 3500;
    private static final int lva = 5000;
    private static final int lvb = 750;
    private static final int lvc = 150;
    private static final int lvd = 20;
    private static final int lve = 16;

    bwp_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return luV;
    }

    @Override
    public afe_1[] bBg() {
        return luX;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    private bws_1 JD(int n) {
        bws_1 bws_12 = new bws_1();
        float f2 = (float)this.xq(0);
        float f3 = (float)this.xq(1);
        float f4 = (float)this.xq(2);
        bws_12.p(new awx_2(f2, f3, f4));
        bws_12.nJ(this.xu(3));
        bws_12.nK(this.xu(4));
        if (n > 5) {
            bws_12.iG(this.xx(5));
        }
        bws_12.ua(n > 6 ? Math.max(1, this.xp(6)) : 20);
        if (n > 7) {
            bws_12.iH(this.xx(7));
        }
        if (n > 8) {
            bws_12.iI(this.xx(8));
        }
        bws_12.setValue(n > 9 ? this.xp(9) : this.lwK.cWC());
        return bws_12;
    }

    private bwr_1 eoy() {
        short s;
        bmq_0 bmq_02;
        Object object;
        bwr_1 bwr_12 = new bwr_1();
        bwr_12.o(awx_2.dnF);
        ero_0 ero_02 = this.lwK.cXu();
        if (ero_02 instanceof eor_0) {
            object = (eor_0)ero_02;
            bmq_02 = (bmq_0)fqX.gjM().Zr(((eor_0)object).ecx());
            s = ((eor_0)object).fCw();
        } else {
            bmq_02 = null;
            s = 0;
        }
        switch (this.lwK.cXt()) {
            case 4: {
                bwr_12.nI(aum_0.cWf().c("exec.absorb", new Object[0]));
                bwr_12.o(awx_2.dnO);
                bwr_12.iE(true);
                bwr_12.iD(true);
                break;
            }
            case 1: {
                bwr_12.nI(aum_0.cWf().c("exec.failed", new Object[0]));
                bwr_12.o(awx_2.dnJ);
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 2: {
                bwr_12.nI(aum_0.cWf().c("exec.immune", new Object[0]));
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 13: {
                bwr_12.nI(aum_0.cWf().c("exec.seduction.immunity", new Object[0]));
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 6: {
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 3: {
                bwr_12.nI(aum_0.cWf().c("exec.resist", new Object[0]));
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 11: {
                bwr_12.nI(aum_0.cWf().c("exec.seduction.resist", new Object[0]));
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 12: {
                bwr_12.nI(aum_0.cWf().c("exec.level.too.high", new Object[0]));
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 0: {
                bwr_12.nI(aum_0.cWf().c("exec.success", new Object[0]));
                bwr_12.iE(false);
                bwr_12.iD(true);
                break;
            }
            case 14: {
                bwr_12.nI(aum_0.cWf().c("exec.seduction.success", new Object[0]));
                bwr_12.iE(true);
                bwr_12.iD(false);
                break;
            }
            case 5: {
                bwr_12.iD(false);
                if (bmq_02 == null || !bmq_02.eeE()) break;
                qu_0 qu_02 = ero_02.bbd();
                if (!(qu_02 instanceof exP)) {
                    return bwr_12;
                }
                object = (exP)qu_02;
                if (((exP)object).i(exe_1.rEi) && ero_02.bbd() == ero_02.bbc()) {
                    bwr_12.iF(false);
                    break;
                }
                boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liQ);
                bwr_12.iF(true);
                bwr_12.setImagePath(bmq_02.byf());
                bwr_12.nI(bwp_1.a(bmq_02, s));
                bwr_12.o(bwp_1.a(bmq_02));
                bwr_12.iE(bl);
                break;
            }
            case 10: {
                if (ero_02 != null && ero_02.bbW() != null && aue_0.cVJ().cVK() != null && aue_0.cVJ().cVK().dkZ() != null && aue_0.cVJ().cVK().dkZ().dGQ() != null) {
                    int n = ero_02.bbW().biN() - aue_0.cVJ().cVK().dkZ().dGQ().bhJ();
                    bwr_12.nI(aum_0.cWf().c("exec.regen", n));
                    bwr_12.o(new awx_2(0.6f, 0.0f, 0.0f));
                    bwr_12.iE(true);
                    bwr_12.iD(false);
                    break;
                }
                bwr_12.iE(false);
                bwr_12.iD(false);
                break;
            }
            case 7: {
                int n;
                object = bsU.dHk().Ft(this.lwK.bha());
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (object == null || bgt_02 == null || this.lwK.bha() != bgt_02.bqo() || !(this.lwK instanceof aWv)) break;
                bgy bgy2 = object.kq(this.lwK.Qy());
                bgy bgy3 = object.kq(this.lwK.Qw());
                if (bgy2 == null) break;
                abi_1 abi_12 = bgy3 != null && bgy2.Sn() != bgy3.Sn() ? bgy2.aZw().y(bgy3.aZw()) : bgy2.bcB();
                int n2 = abi_12.wp();
                switch (n2) {
                    case 1: {
                        n = aid_0.dVn[0];
                        break;
                    }
                    case 3: {
                        n = aid_0.dVn[1];
                        break;
                    }
                    case 5: {
                        n = aid_0.dVn[2];
                        break;
                    }
                    case 7: {
                        n = aid_0.dVn[3];
                        break;
                    }
                    default: {
                        return bwr_12;
                    }
                }
                FreeParticleSystem freeParticleSystem = agY.bzw().sk(n);
                freeParticleSystem.a(bgy2.ddI());
                freeParticleSystem.pu(bgy2.bqo());
                agZ.bzy().b(freeParticleSystem);
            }
        }
        return bwr_12;
    }

    @Override
    public void ss(int n) {
        boolean bl;
        Object object;
        Object object2;
        if (((bsg_1)aie_0.cfn().bmH()).a(aff.cpM)) {
            return;
        }
        Object object3 = this.lwK.cXu().bbh();
        if (object3 instanceof enu_0) {
            object2 = (enu_0)object3;
            if (!aJP.cig().yO(object2.bha())) {
                return;
            }
        }
        if (((Optional)(object3 = this.c((bws_1)(object2 = this.JD(n))))).isEmpty()) {
            return;
        }
        anz_1 anz_12 = (anz_1)((Optional)object3).get();
        if (anz_12 instanceof bgy) {
            object = (bgy)anz_12;
            bgy bgy2 = bgg_0.dlO().ju(((exP)object).Sn());
            if (bgy2 == null) {
                return;
            }
        }
        if (((bwr_1)(object = this.eoy())).eoA()) {
            bwp_1.a(anz_12, ((bws_1)object2).eoG(), bwp_1.a((bws_1)object2), ((bws_1)object2).eoJ(), ((bws_1)object2).getValue(), this.b((bws_1)object2));
        }
        boolean bl2 = ((bwr_1)object).eoE() && ((bwr_1)object).eoF() != null;
        boolean bl3 = bl = ((bwr_1)object).eoB() && !((bwr_1)object).eoC().isEmpty();
        if (bl2 && bl) {
            bwp_1.a(anz_12, ((bwr_1)object).eoF(), ((bwr_1)object).eoC(), ((bwr_1)object).eoD(), bwp_1.eoz());
        } else if (bl2) {
            bwp_1.a(anz_12, ((bwr_1)object).eoF());
        } else if (bl) {
            bwp_1.a(anz_12, ((bwr_1)object).eoD(), bwp_1.eoz(), false, 0, ((bwr_1)object).eoC());
        }
    }

    private static awh_2 a(bws_1 bws_12) {
        String string = bws_12.bNu();
        return string == null || string.isEmpty() ? bwp_1.eoz() : awk_2.f(string, 0, bws_12.bDw());
    }

    private static void a(anz_1 anz_12, String string, String string2, axb_2 axb_22, awh_2 awh_22) {
        xk_0 xk_02 = new xk_0();
        XI xI = new XI(string, awh_22, string2, (xm_0)xk_02, 16, 16);
        xI.setDuration(3500);
        xI.bG(0.5f);
        xI.setGap(10);
        xI.a(anz_12);
        xI.setTextColor(axb_22);
        int n = xd_0.bnv().b(anz_12, 6);
        xI.qC(n * 750);
        xd_0.bnv().a(xI);
    }

    private static void a(anz_1 anz_12, String string) {
        if (anz_12 instanceof bdj_2 && bjv_2.aM(((bdj_2)anz_12).dcP())) {
            return;
        }
        xo_0 xo_02 = new xo_0(string, 16, 16, (xu_0)new xs_0(), 3500);
        xo_02.a(anz_12);
        int n = xd_0.bnv().b(anz_12, 4);
        xo_02.qC(n * 750);
        xd_0.bnv().a(xo_02);
    }

    private static void a(anz_1 anz_12, axb_2 axb_22, awh_2 awh_22, boolean bl, int n, String string) {
        int n2;
        xf_0 xf_02;
        bxl_2 bxl_22 = new bxl_2(anz_12);
        int n3 = xd_0.bnv().b(bxl_22, 3);
        acc_1 acc_12 = switch (n3) {
            case 0 -> new acc_1(0, 0);
            case 1 -> new acc_1(GC.q(-20, -10), GC.q(-20, -10));
            case 2 -> new acc_1(GC.q(10, 20), GC.q(-20, -10));
            default -> new acc_1(GC.q(-20, 20), GC.q(-20, -1));
        };
        float f2 = XG.qE(n) * 0.5f;
        if (bl) {
            xf_02 = new xz_0(0, 20, acc_12.bWx(), 100 + acc_12.bWy(), f2, 150);
            n2 = 1000;
        } else {
            xf_02 = new xw_0(acc_12.bWx(), 50 + acc_12.bWy(), f2);
            n2 = 3500;
        }
        xv_0 xv_02 = new xv_0(awh_22, string, xf_02, n2);
        xv_02.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), 1.0f);
        xv_02.a(bxl_22);
        xv_02.qC(n3 * 150);
        xd_0.bnv().a(xv_02);
    }

    @NotNull
    private String b(bws_1 bws_12) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bws_12.eoI() ? "-" : "+").append(aum_0.cWf().cQ(bws_12.getValue())).append(bws_12.eoH());
        if (bws_12.eoJ() && bdm_2.a(this.lwK)) {
            stringBuilder.append(' ').append(luS);
        }
        return stringBuilder.toString();
    }

    private Optional<anz_1> c(bws_1 bws_12) {
        long l = bws_12.eoK() ? this.lwK.Qw() : this.lwK.Qy();
        bbp_2 bbp_22 = bbq_2.dao().jb(l);
        if (bbp_22 == null) {
            ero_0 ero_02 = this.lwK.cXu();
            return Optional.ofNullable(bws_12.eoK() ? ero_02.bbc() : ero_02.bbd());
        }
        return bbp_22.isVisible() ? Optional.of(bbp_22) : Optional.empty();
    }

    private static axb_2 a(bmq_0 bmq_02) {
        ett_1 ett_12 = switch (bmq_02.eet()) {
            case fqY.sXg -> ett_1.omf;
            case fqY.sXe -> ett_1.omh;
            default -> ett_1.omg;
        };
        return fhm_2.uwB.a(ett_12);
    }

    private static awh_2 eoz() {
        return fyw_0.gqw().gqB().uG(luT).getFont();
    }

    @NotNull
    private static String a(bmq_0 bmq_02, short s) {
        StringBuilder stringBuilder = new StringBuilder(bmq_02.getName());
        stringBuilder.append(" (").append(aum_0.cWf().c("levelParam", Math.min(bmq_02.gjG(), s))).append(')');
        return stringBuilder.toString();
    }

    @Override
    public String getDescription() {
        return luW;
    }
}

