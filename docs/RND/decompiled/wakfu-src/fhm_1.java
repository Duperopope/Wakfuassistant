/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fHM
 */
public class fhm_1
implements fis_1 {
    @NotNull
    private final fey_2 uzi;
    final boolean uzj;
    final boolean uzk;
    private int uzl;
    private int uzm;
    int uzn;
    int uzo;

    private fhm_1(@NotNull fey_2 fey_22, boolean bl, boolean bl2) {
        ftj_2 ftj_22;
        this.uzi = fey_22;
        this.uzj = bl;
        this.uzk = bl2;
        fsm_1 fsm_12 = this.uzi.getSize();
        if (fsm_12 != null) {
            this.uzl = fsm_12.width;
            this.uzm = fsm_12.height;
        }
        if ((ftj_22 = this.uzi.getUserDefinedManager()) instanceof ftk_2) {
            fhn_2 fhn_22 = new fhn_2(this, this.uzi);
            fhn_22.pu(((ftk_2)ftj_22).gGJ());
            fhn_22.pv(((ftk_2)ftj_22).gGK());
            this.uzi.setUserDefinedManager(fhn_22);
        }
    }

    public static void bH(@NotNull fey_2 fey_22) {
        fey_22.setEnableResizeEvents(true);
        fey_22.a(fzq_0.tKh, new fhm_1(fey_22, false, true), true);
    }

    public static void bI(@NotNull fey_2 fey_22) {
        fey_22.setEnableResizeEvents(true);
        fey_22.a(fzq_0.tKh, new fhm_1(fey_22, true, true), true);
    }

    public static void bJ(@NotNull fey_2 fey_22) {
        fey_22.setEnableResizeEvents(true);
        fey_22.a(fzq_0.tKh, new fhm_1(fey_22, true, false), true);
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        int n;
        int n2;
        if (fiq_12.gBy() != fzq_0.tKh) {
            return false;
        }
        if (this.uzl == 0 || this.uzm == 0) {
            this.uzl = this.uzi.getWidth();
            this.uzm = this.uzi.getHeight();
            return false;
        }
        if (this.uzj) {
            n2 = this.uzl - this.uzi.getWidth();
            n = this.uzi.getX() + n2;
            this.uzn += n2;
        } else {
            n = this.uzi.getX();
        }
        if (this.uzk) {
            int n3 = this.uzm - this.uzi.getHeight();
            n2 = this.uzi.getY() + n3;
            this.uzo += n3;
        } else {
            n2 = this.uzi.getY();
        }
        this.uzi.setPosition(n, n2);
        this.uzl = this.uzi.getWidth();
        this.uzm = this.uzi.getHeight();
        return false;
    }
}

