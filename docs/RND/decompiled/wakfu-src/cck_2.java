/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.Set;

/*
 * Renamed from cCK
 */
public abstract class cck_2
implements abz_1 {
    protected abstract Set<String> dve();

    protected abstract String dvf();

    @Override
    public final boolean a(KeyEvent keyEvent) {
        if (!this.dRR()) {
            return false;
        }
        return this.k(keyEvent);
    }

    protected boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean b(KeyEvent keyEvent) {
        if (!this.dRR()) {
            return false;
        }
        return this.j(keyEvent);
    }

    protected boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean c(KeyEvent keyEvent) {
        if (!this.dRR()) {
            return false;
        }
        return this.l(keyEvent);
    }

    protected boolean l(KeyEvent keyEvent) {
        return false;
    }

    protected boolean dRR() {
        String string = ccg_2.eJI().gBt();
        if (string == null || !this.dve().contains(string)) {
            return false;
        }
        fes_2 fes_22 = fhw_2.gAL().gAM();
        if (fes_22 == null) {
            return true;
        }
        fey_2 fey_22 = fes_22.getParentOfType(fey_2.class);
        if (fey_22 == null) {
            return true;
        }
        return this.dvf().equals(fey_22.getId());
    }
}

