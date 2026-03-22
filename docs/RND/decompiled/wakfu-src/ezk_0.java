/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ezK
 */
public abstract class ezk_0
implements ezn_0 {
    protected static final Logger puH = Logger.getLogger(ezk_0.class);
    protected final ezw[] puI = new ezw[10];
    protected final boolean[] puJ = new boolean[10];
    protected byte puK;
    protected byte puL;
    private ezi_0<? extends ezn_0> puM;
    private final ezl_0 puN;
    private final ezm_0 puO;
    private final List<ezp_0> puP = new ArrayList<ezp_0>();

    protected ezk_0(ezl_0 ezl_02, ezm_0 ezm_02) {
        this.puN = ezl_02;
        this.puO = ezm_02;
    }

    private boolean fmO() {
        for (ezw ezw2 : this.puI) {
            if (ezw2 != null) continue;
            return true;
        }
        return false;
    }

    public void a(ezi_0<? extends ezn_0> ezi_02) {
        this.puM = ezi_02;
    }

    @Override
    public ezw fmP() {
        return this.Pm(this.puK);
    }

    @Override
    @Nullable
    public ezw Pm(int n) {
        if (n < 0 || n >= this.puI.length) {
            puH.error((Object)("[SYMBIOT] Impossible to get creature parameters for invalid index=" + n));
            return null;
        }
        return this.puI[n];
    }

    @Override
    public byte fmQ() {
        return this.puL;
    }

    @Override
    public byte c(ezw ezw2) {
        if (ezw2 == null) {
            return -1;
        }
        for (byte by = 0; by < 10; by = (byte)(by + 1)) {
            if (this.puI[by] != ezw2) continue;
            return by;
        }
        return -1;
    }

    @Override
    public byte px(long l) {
        for (byte by = 0; by < 10; by = (byte)((byte)(by + 1))) {
            if (this.puI[by] == null || this.puI[by].fmB() != l) continue;
            return by;
        }
        return -1;
    }

    @Override
    public byte fmR() {
        return this.puK;
    }

    @Override
    public void eG(byte by) {
        this.puK = by;
        this.fnd();
    }

    @Override
    public int d(ezw ezw2) {
        if (!this.fmO()) {
            return -1;
        }
        byte by = -1;
        for (byte by2 = 9; by2 >= 0; by2 = (byte)(by2 - 1)) {
            if (this.puI[by2] == null) {
                by = by2;
                continue;
            }
            if (this.puI[by2] != ezw2) continue;
            return -1;
        }
        if (by != -1) {
            this.a(ezw2, by);
        }
        return by;
    }

    @Override
    public void a(ezw ezw2, byte by) {
        if (ezw2 == null) {
            puH.warn((Object)"[SYMBIOT] Impossible to add a creature with null characteristics");
            return;
        }
        puH.info((Object)("[SYMBIOT] Adding summon parameters " + ezw2.fmB() + " on index " + by));
        if (by < 0 || by >= 10) {
            puH.error((Object)("[SYMBIOT] Impossible to add a creature, index " + by + " out of bounds"));
            return;
        }
        if (this.puI[by] == null) {
            this.puI[by] = ezw2;
            this.e(ezw2);
            this.puJ[by] = true;
        }
        if (this.puL == 0) {
            this.eG(by);
        }
        this.puL = (byte)(this.puL + 1);
        if (this.puM != null) {
            this.puM.bm(by);
        }
        this.fnc();
    }

    public void eH(byte by) {
        if (by < 0 || by >= 10) {
            puH.error((Object)("[SYMBIOT] Impossible to delete a creature, index " + by + " out of bounds "));
            return;
        }
        if (this.puI[by] != null) {
            this.puL = (byte)(this.puL - 1);
        }
        this.puI[by] = null;
        this.puJ[by] = false;
        if (this.puL == 0) {
            this.eG((byte)-1);
        } else if (by == this.puK) {
            for (byte by2 = 0; by2 < 10; by2 = (byte)(by2 + 1)) {
                if (this.puI[by2] == null) continue;
                this.eG(by2);
                return;
            }
        }
        this.fnb();
    }

    @Override
    public void eI(byte by) {
        this.eH(by);
        this.eK(by);
    }

    @Override
    public void py(long l) {
        byte by = this.px(l);
        if (by == -1) {
            return;
        }
        this.X(by, true);
    }

    @Override
    public void X(int n, boolean bl) {
        if (n < 0 || n >= 10) {
            puH.error((Object)("[SYMBIOT] Impossible to set creature available : requested index " + n + " is out of bounds"));
            return;
        }
        if (this.puI[n] != null) {
            this.puJ[n] = bl;
        } else {
            puH.error((Object)("[SYMBIOT] Impossible to set creature available with index " + n + " : the creature is null"));
        }
        this.Po(n);
    }

    void a(byte by, ezw ezw2) {
        if (by < 0 || by >= this.puI.length) {
            puH.error((Object)("[SYMBIOT] Impossible to set captured creature : requested index " + by + " is out of bounds "));
            return;
        }
        this.puI[by] = ezw2;
    }

    @Override
    public boolean Pn(int n) {
        if (n < 0 || n >= this.puJ.length) {
            puH.error((Object)("[SYMBIOT] Impossible to request creature availability : requested index " + n + " is out of bounds "));
            return false;
        }
        ezw ezw2 = this.puI[n];
        if (ezw2 == null) {
            return false;
        }
        eyi eyi2 = ezw2.fmC();
        if (eyi2 == null || eqb_0.em(eyi2.aWP())) {
            return false;
        }
        return this.puJ[n] && this.puM.bo((byte)n);
    }

    public boolean dq(short s) {
        for (ezw ezw2 : this.puI) {
            if (ezw2 == null || ezw2.doG() != s) continue;
            return true;
        }
        return false;
    }

    public boolean dr(short s) {
        return true;
    }

    public void dRD() {
        this.puL = 0;
        for (int i = 0; i < 10; ++i) {
            this.puI[i] = null;
            this.puJ[i] = false;
        }
        this.puK = 0;
        this.fna();
    }

    void fmS() {
        for (ezw ezw2 : this.puI) {
            if (ezw2 == null) continue;
            this.e(ezw2);
        }
    }

    private void e(ezw ezw2) {
        ezw2.a(this.puN.cd(ezw2.doG()));
    }

    @Override
    @Nullable
    public final ezw ds(short s) {
        return this.puO.ce(s);
    }

    public void fmT() {
        Arrays.fill(this.puJ, true);
        this.fmZ();
    }

    @Override
    public void fmU() {
        byte by = this.puK;
        byte by2 = this.puL;
        for (byte by3 = 1; by3 <= by2; by3 = (byte)(by3 + 1)) {
            if ((by = (byte)(by + 1)) >= by2) {
                by = (byte)(by - by2);
            }
            if (this.Pn(by)) break;
        }
        this.eJ(by);
    }

    @Override
    public int fmV() {
        int n = 0;
        for (int n2 = 0; n2 < 10; n2 = (int)((byte)(n2 + 1))) {
            if (this.Pm(n2) != null) continue;
            ++n;
        }
        return n;
    }

    @Override
    public ezl_0 fmW() {
        return this.puN;
    }

    @Override
    public ezm_0 fmX() {
        return this.puO;
    }

    void fmY() {
        this.puL = (byte)(this.puL + 1);
    }

    void dmO() {
        this.puM.dmO();
    }

    @Override
    public boolean a(ezp_0 ezp_02) {
        return !this.puP.contains(ezp_02) && this.puP.add(ezp_02);
    }

    @Override
    public boolean b(ezp_0 ezp_02) {
        return this.puP.remove(ezp_02);
    }

    private void eJ(byte by) {
        for (ezp_0 ezp_02 : this.puP) {
            try {
                ezp_02.cp(by);
            }
            catch (Exception exception) {
                puH.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void fmZ() {
        for (ezp_0 ezp_02 : this.puP) {
            try {
                ezp_02.edY();
            }
            catch (Exception exception) {
                puH.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void fna() {
        for (ezp_0 ezp_02 : this.puP) {
            try {
                ezp_02.dRK();
            }
            catch (Exception exception) {
                puH.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void Po(int n) {
        for (ezp_0 ezp_02 : this.puP) {
            try {
                ezp_02.Id(n);
            }
            catch (Exception exception) {
                puH.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void fnb() {
        for (ezp_0 ezp_02 : this.puP) {
            try {
                ezp_02.edW();
            }
            catch (Exception exception) {
                puH.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void eK(byte by) {
        if (this.puM == null) {
            return;
        }
        try {
            this.puM.bn(by);
        }
        catch (Exception exception) {
            puH.error((Object)"Exception raised", (Throwable)exception);
        }
    }

    private void fnc() {
        for (ezp_0 ezp_02 : this.puP) {
            try {
                ezp_02.edV();
            }
            catch (Exception exception) {
                puH.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void fnd() {
        for (ezp_0 ezp_02 : this.puP) {
            try {
                ezp_02.edX();
            }
            catch (Exception exception) {
                puH.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }
}

