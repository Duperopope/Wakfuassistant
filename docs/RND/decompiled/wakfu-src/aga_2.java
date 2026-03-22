/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from aGa
 */
public class aga_2
extends agb_1
implements afd_1 {
    public static final int dKf = -1;
    public static final int dKg = -1;
    private int dKh = -1;
    private afr_1[] dIJ;
    private Map<String, Object> dKi;
    private int dKj = -1;
    protected boolean dKk = true;
    private final azw_2<String, afq_2> dKl = new azw_2(1);
    private static final String dKm = "execution_Time";
    protected afx_1 cEq;
    private final boolean dKn;

    public aga_2(int n, int n2, int n3) {
        super(n, n2, n3);
        this.dKn = false;
    }

    public aga_2() {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.dKn = false;
    }

    public void f(afr_1 ... afr_1Array) {
        if (this.dIJ == null) {
            this.dIJ = afr_1Array;
            return;
        }
        int n = this.dIJ.length;
        afr_1[] afr_1Array2 = new afr_1[n + afr_1Array.length];
        System.arraycopy(this.dIJ, 0, afr_1Array2, 0, n);
        System.arraycopy(afr_1Array, 0, afr_1Array2, n, afr_1Array.length);
        this.dIJ = afr_1Array2;
    }

    public int cbj() {
        return this.dKh;
    }

    public void xV(int n) {
        this.dKh = n;
    }

    public void t(Map<String, Object> map) {
        this.dKi = map;
    }

    @Override
    public long cbk() {
        if (this.dKn) {
            dJP.error((Object)("Interruption d'une boucle infinie dans une action de script actionId=" + this.avZ() + " scriptId=" + this.cbj()));
            return 0L;
        }
        if (this.dKh != 0 && this.dKh != -1) {
            try {
                this.cEq = afs_1.can().a(this.dKh, this.dIJ, this.dKi, (afd_1)this, false);
                if (this.cEq != null) {
                    afq_2 afq_22 = this.dKl.O(dKm);
                    if (afq_22 != null && afq_22.caK() == aff_2.dJz) {
                        this.dKk = false;
                        return ((Double)afq_22.getValue()).longValue();
                    }
                    this.dKj = this.cEq.caw();
                    this.dKk = true;
                    return -1L;
                }
            }
            catch (AssertionError assertionError) {
                dJP.error((Object)"ERREUR CRITIQUE DANS UN SCRIPT", (Throwable)((Object)assertionError));
            }
        }
        this.dKj = -1;
        this.caT();
        return -1L;
    }

    @Override
    public void a(afx_1 afx_12) {
        if (this.dKj != afx_12.caw() && this.dKj != -1) {
            dJP.error((Object)("on tente de finir une action de script(" + this.dKj + ") demand\u00e9 par la fin d'un autre script(" + afx_12.caw() + ")"));
        }
        afx_12.e(this);
        afq_2 afq_22 = this.dKl.O(dKm);
        if (afq_22 != null && afq_22.caK() == aff_2.dJz) {
            this.dKk = false;
            return;
        }
        this.dKj = -1;
        if (this.dKk) {
            this.caT();
            this.dKk = false;
        }
        this.cEq = null;
    }

    @Override
    public void a(afx_1 afx_12, afc_1 afc_12, String string) {
        assert (this.dKj == afx_12.caw() || this.dKj == -1);
        afx_12.e(this);
        this.dKj = -1;
        this.caT();
    }

    @Override
    public void b(afx_1 afx_12) {
        this.dKl.f(dKm, afx_12.hY(dKm));
    }

    public int cbl() {
        return this.dKj;
    }

    @Override
    protected void caV() {
    }
}

