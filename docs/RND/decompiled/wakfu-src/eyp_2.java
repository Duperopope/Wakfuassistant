/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from eYP
 */
public abstract class eyp_2
implements ezy_1 {
    private static final Logger rLu = Logger.getLogger(eyp_2.class);
    protected final ezu_1 rLv;

    protected eyp_2(ezu_1 ezu_12) {
        this.rLv = ezu_12;
    }

    protected void aa(double d2) {
        this.rLv.fPX().aa(d2);
    }

    protected void TI(int n) {
        this.rLv.fPX().TK(n);
    }

    @Override
    public void g(ezv_1 ezv_12) {
        eyr_2 eyr_22 = ezq.prB.Pe(ezv_12.tJ());
        if (eyr_22 == null) {
            rLu.error((Object)("There will be a NPE on bonusActivated for bonus " + String.valueOf(ezv_12)));
        }
        switch (eyr_22.dJB().fQt()) {
            case rLH: {
                this.TI(ezl.ppq.fmu());
                return;
            }
            case rLK: {
                this.a((eze_1)eyr_22.dJB());
                return;
            }
            case rLN: {
                this.a((ezd_1)eyr_22.dJB());
                return;
            }
            case rLO: {
                this.a((ezc_1)eyr_22.dJB());
                return;
            }
            case rLP: {
                this.a((eyx_1)eyr_22.dJB());
                return;
            }
            case rLI: {
                this.aa(ezl.ppq.fmv());
                return;
            }
            case rLL: {
                this.a((ezb_1)eyr_22.dJB());
                return;
            }
            case rLM: {
                this.a((eza_1)eyr_22.dJB());
                return;
            }
            case rLG: 
            case rLJ: {
                break;
            }
            default: {
                rLu.warn((Object)("Unhandled bonus type " + String.valueOf((Object)eyr_22.dJB().fQt())));
            }
        }
    }

    @Override
    public void FJ(int n) {
    }

    @Override
    public void FK(int n) {
    }

    private void a(eza_1 eza_12) {
        this.rLv.fPX().ab(eza_12.fQw());
    }

    private void a(ezb_1 ezb_12) {
        eyy_2 eyy_22 = new eyy_2(this.rLv);
        eyy_22.Tq(ezb_12.fQx());
    }

    protected void a(eze_1 eze_12) {
    }

    protected void a(ezd_1 ezd_12) {
    }

    protected void a(ezc_1 ezc_12) {
    }

    protected void a(eyx_1 eyx_12) {
        eyy_2 eyy_22 = new eyy_2(this.rLv);
        eyy_22.Tr(eyx_12.dSU());
    }

    protected void b(eyx_1 eyx_12) {
        eyy_2 eyy_22 = new eyy_2(this.rLv);
        eyy_22.Tr(-eyx_12.dSU());
    }

    @Override
    public void f(ezv_1 ezv_12) {
        eyr_2 eyr_22 = ezq.prB.Pe(ezv_12.tJ());
        switch (eyr_22.dJB().fQt()) {
            case rLH: {
                this.TI(ezl.ppq.fmt());
                return;
            }
            case rLI: {
                this.aa(1.0);
                return;
            }
            case rLL: {
                this.fQo();
                return;
            }
            case rLM: {
                this.fQn();
                return;
            }
            case rLP: {
                this.b((eyx_1)eyr_22.dJB());
                return;
            }
            case rLK: 
            case rLN: 
            case rLO: 
            case rLG: 
            case rLJ: {
                break;
            }
            default: {
                rLu.warn((Object)("Unhandled bonus type " + String.valueOf((Object)eyr_22.dJB().fQt())));
            }
        }
    }

    private void fQn() {
        this.rLv.fPX().ab(1.0);
    }

    private void fQo() {
        eyy_2 eyy_22 = new eyy_2(this.rLv);
        eyy_22.Tq(ezs_1.fQE());
    }

    @Override
    public void e(ezv_1 ezv_12) {
        if (ezv_12.fPL()) {
            this.g(ezv_12);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eyp_2)) {
            return false;
        }
        eyp_2 eyp_22 = (eyp_2)object;
        return this.rLv.equals(eyp_22.rLv);
    }

    public int hashCode() {
        return Objects.hash(this.rLv);
    }
}

