/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.Collection;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

public class aUZ
extends aUV {
    private static final bsT hsm = new bsT();
    private static final int hsn = 250;
    private static final int hso = 250;
    private final String hsp = "execution_Time";
    private static final int hsq = -2;
    private final byte hsr;
    private final boolean hss;
    private int hst;

    public aUZ(int n, int n2, int n3, byte by, int n4, boolean bl) {
        super(n, n2, n3, n4);
        this.hsr = by;
        this.hss = bl;
    }

    @Override
    public long cbk() {
        bgy bgy2 = this.iD(this.Qy());
        if (bgy2 == null) {
            return 0L;
        }
        boolean bl = this.dJS.isEmpty();
        return bl ? 0L : (long)(switch (this.hsr) {
            case 0 -> this.A(bgy2);
            case 1 -> this.z(bgy2);
            case 2 -> this.t(bgy2);
            case 3 -> this.s(bgy2);
            default -> 0;
        });
    }

    private int s(bgy bgy2) {
        String string;
        if (bgy2 == null) {
            return 0;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (!bdj_22.dZ(string = "AnimFuite")) {
            string = bdj_22.ddu();
        }
        bdj_22.dT(string);
        int n = bdj_22.dY(string);
        int n2 = n == Integer.MAX_VALUE ? 0 : n;
        this.v(bgy2);
        return n2;
    }

    private int t(bgy bgy2) {
        if (bgy2 == null) {
            return 0;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (this.cWD()) {
            if (bgy2 instanceof bhJ) {
                if (this.cja() == null || this.cja().dGo().fKW()) {
                    this.w(bgy2);
                }
            } else {
                this.u(bgy2);
            }
            if (!bgy2.a(exe_1.rDn)) {
                bdj_22.as((byte)2);
            }
        }
        if (this.hst > 0) {
            int n = Math.min(this.hst, 30000);
            this.cja().dGy().a(this);
            abb_2.bUA().a(this, n, -2, 1L);
            return n;
        }
        int n = bdj_22.dY("AnimMort");
        int n2 = n > 0 ? n : 250;
        int n3 = Math.min(n2, 30000);
        this.cja().dGy().a(this);
        abb_2.bUA().a(this, n3, -2, 1L);
        return Math.min(n3, 250);
    }

    private void u(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        boolean bl = this.y(bgy2);
        if (!bl) {
            this.x(bgy2);
        }
    }

    private boolean cWD() {
        return this.hss;
    }

    private void v(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.dV(bdj_22.ddu());
        bdj_22.dcW();
    }

    private void w(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        int n = this.bha();
        aUZ.c(bgy2, n);
    }

    public static void c(bgy bgy2, int n) {
        if (bgy2 == null) {
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.dT("AnimKO-SortieHS");
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(bgy2.dlC());
        if (freeParticleSystem == null) {
            dJP.warn((Object)("le system de particule " + bgy2.dlC() + "n'exsite pas"));
            return;
        }
        freeParticleSystem.a(bdj_22);
        freeParticleSystem.pu(n);
        agZ.bzy().b(freeParticleSystem);
    }

    private void x(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(15000);
        cAY.eHc().nQ(15384L);
        if (freeParticleSystem == null) {
            dJP.warn((Object)"le system de particule 15000n'exsite pas");
            return;
        }
        freeParticleSystem.a(bgy2.ddI());
        freeParticleSystem.pu(this.bha());
        agZ.bzy().b(freeParticleSystem);
    }

    private boolean y(bgy bgy2) {
        if (bgy2 == null) {
            return false;
        }
        int n = bgy2.dlg();
        if (n == -1) {
            bgy2.ddI().dT("AnimMort");
            return true;
        }
        afx_1 afx_12 = afs_1.can().xD(n);
        if (afx_12 == null) {
            afx_12 = afs_1.can().a(n, (afr_1[])null, true);
        }
        if (afx_12 == null) {
            dJP.warn((Object)("Impossible charger le script de mort d'id " + n));
            return false;
        }
        LuaState luaState = afx_12.caC();
        try {
            luaState.pushObjectValue((Object)bgy2.Sn());
            luaState.setGlobal("killedId");
            luaState.pushObjectValue((Object)bgy2.bqo());
            luaState.setGlobal("fightId");
        }
        catch (LuaException luaException) {
            dJP.error((Object)"Exception levee", (Throwable)luaException);
        }
        luaState.resume(0);
        afq_2 afq_22 = afx_12.hY("execution_Time");
        if (afq_22 != null && afq_22.caK() == aff_2.dJz) {
            this.hst = ((Double)afq_22.getValue()).intValue();
        }
        return true;
    }

    private int z(bgy bgy2) {
        if (bgy2 == null) {
            return 0;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        int n = 0;
        if (this.hss) {
            if (bdj_22.dZ("AnimKO-SortieOK")) {
                n = bdj_22.dY("AnimKO-SortieOK");
                bdj_22.dT("AnimKO-SortieOK");
            } else {
                bdj_22.dT("AnimStatique");
            }
            bdj_22.dV(this.a(bdj_22, "AnimStatique02", "AnimStatique"));
        }
        bdj_22.as((byte)0);
        bdj_22.bd(bgy2.bcP());
        bdj_22.i(bgy2.bcB());
        return n;
    }

    private int A(bgy bgy2) {
        Collection collection;
        if (bgy2 == null) {
            return 0;
        }
        boolean bl = this.hss;
        int n = aUZ.a(bgy2, bl);
        long l = bgy2 instanceof bhx_0 ? ((bhx_0)bgy2).aXa() : -1L;
        bqm_0.jbp.b(new brd_1(bgy2.Sn(), bgy2.aWP(), l));
        bsS bsS2 = this.cja();
        if (bsS2 instanceof bsj_0 && (collection = ((bsj_0)bsS2).fo(bgy2.bcP())).size() == 1) {
            bqm_0.jbp.b(new brr_0(l));
        }
        return n;
    }

    public static int a(bgy bgy2, boolean bl) {
        if (bgy2 == null) {
            return 0;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        int n = 0;
        if (bl && !bgy2.a(exe_1.rDn) && !bgy2.a(exe_1.rDt)) {
            if (bdj_22.dZ("AnimKO-Debut")) {
                bdj_22.dT("AnimKO-Debut");
                n = bdj_22.dY("AnimKO-Debut");
            }
            bdj_22.dV("AnimKO-Boucle");
            bdj_22.as((byte)1);
        }
        bdj_22.ddf();
        bdj_22.ddk();
        bdj_22.ddh();
        bdj_22.ddl();
        return n;
    }

    @Override
    protected void caV() {
        if (this.hsr != 2) {
            this.I(this.iD(this.Qy()));
        }
        super.caV();
    }

    private void B(bgy bgy2) {
        switch (this.hsr) {
            case 0: {
                this.C(bgy2);
                break;
            }
            case 2: {
                this.D(bgy2);
                break;
            }
            case 1: {
                this.E(bgy2);
            }
        }
    }

    private void C(bgy bgy2) {
        if (!this.cWs()) {
            return;
        }
        if (bgy2 == null) {
            return;
        }
        if (bgy2.a(exe_1.rDt)) {
            return;
        }
        if (bgy2.a((pt_0)exx_2.rGs) && bgy2.c((pt_0)exx_2.rGs) > 0) {
            String string = aum_0.cWf().c("fight.ko", new ahv_2().ceu().c(bgy2.aZk()).cev().ceL());
            hsm.ap(string);
        }
    }

    private void D(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        if (!this.cWs()) {
            return;
        }
        if (bgy2.a(exe_1.rDn)) {
            return;
        }
        if (this.cja() != null && !this.cja().dGo().fKW()) {
            return;
        }
        if (bgy2.bvY()) {
            hsm.ap(aum_0.cWf().c("fight.endForMe", new Object[0]));
        } else {
            if (bgy2.aWP() == 4378) {
                return;
            }
            String string = bgy2.a(exe_1.rEh) ? aum_0.cWf().c("fight.die.for.copies", new ahv_2().ceu().c(bgy2.djY().getName()).cev().ceL()) : aum_0.cWf().c("fight.die", new ahv_2().ceu().c(bgy2.getName()).cev().ceL());
            hsm.ap(string);
        }
    }

    private void E(bgy bgy2) {
        if (!this.cWs()) {
            return;
        }
        if (bgy2 == null) {
            return;
        }
        String string = aum_0.cWf().c("fight.raise", new ahv_2().ceu().c(bgy2.aZk()).cev().ceL());
        hsm.ap(string);
    }

    private void F(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        if (bgy2.dkZ() != null) {
            this.G(bgy2);
        } else {
            this.H(bgy2);
        }
    }

    private void G(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        bsj_0 bsj_02 = bgy2.dkZ();
        switch (this.hsr) {
            case 0: {
                bsj_02.aD(bgy2);
                break;
            }
            case 1: {
                bsj_02.bm(bgy2);
                break;
            }
            case 3: {
                bgy2.lp(true);
            }
            case 2: {
                if (!bgy2.baI()) {
                    bsj_02.aD(bgy2);
                }
                if (!bgy2.baI()) break;
                bsj_02.aE(bgy2);
            }
        }
    }

    private void H(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        switch (this.hsr) {
            case 0: {
                bgy2.baG();
                bgy2.lm(true);
                break;
            }
            case 1: {
                bgy2.baJ();
                bgy2.lm(false);
                bgy2.gf(false);
                break;
            }
            case 2: {
                bgy2.baL();
                bgy2.gf(true);
                break;
            }
            case 3: {
                bgy2.lp(true);
                bgy2.baL();
            }
        }
    }

    private String a(bdj_2 bdj_22, String string, String string2) {
        if (bdj_22.dZ(string)) {
            return string;
        }
        return string2;
    }

    private void I(bgy bgy2) {
        this.B(bgy2);
        this.F(bgy2);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (!(aam_22 instanceof aba_2)) {
            return true;
        }
        aba_2 aba_22 = (aba_2)aam_22;
        if (aba_22.bUy() == -1) {
            return super.b(aba_22);
        }
        if (aba_22.bUy() == -2) {
            this.cja().dGy().b(this);
            bgy bgy2 = this.iD(this.Qy());
            if (bgy2 == null) {
                return false;
            }
            this.v(bgy2);
            this.I(bgy2);
            return false;
        }
        return false;
    }
}

