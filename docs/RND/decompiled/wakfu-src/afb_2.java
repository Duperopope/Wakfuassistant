/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFB
 */
final class afb_2
implements afz_2 {
    public final int dJi;
    private final String dJj;
    private final afq_2[] dJk;
    private ArrayList<agj_2> dJg;
    final /* synthetic */ afx_1 dJl;

    afb_2(afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.dJl = afx_12;
        this.dJj = string;
        this.dJk = afq_2Array;
        this.dJi = ++afx_12.dIK;
    }

    @Override
    public int d() {
        return this.dJi;
    }

    @Override
    public void bGy() {
        if (this.dJl.dIL.isClosed()) {
            afx_1.dIE.error((Object)("Tentative d'execution d'une WaitingTask sur un script ferm? id=" + this.dJl.dIG));
            return;
        }
        if (this.dJj.contains(".")) {
            String[] stringArray = StringUtils.split((String)this.dJj, (char)'.');
            this.dJl.dIL.pushString(stringArray[0]);
            this.dJl.dIL.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
            if (!this.dJl.dIL.isTable(-1)) {
                afx_1.dIE.error((Object)(stringArray[0] + " n'est pas une librairie connue"));
                this.dJl.dIL.remove(-1);
                switch (this.dJl.dIH.ordinal()) {
                    case 4: {
                        this.dJl.cat();
                        break;
                    }
                    case 2: {
                        this.dJl.cau();
                    }
                }
                return;
            }
            this.dJl.dIL.pushString(stringArray[1]);
            this.dJl.dIL.getTable(-2);
            this.dJl.dIL.remove(-2);
        } else {
            this.dJl.dIL.pushString(this.dJj);
            this.dJl.dIL.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
        }
        if (this.dJl.caD()) {
            int n = this.dJk == null ? 0 : this.dJk.length;
            for (int i = 0; i < n; ++i) {
                this.dJk[i].d(this.dJl.dIL);
            }
            if (this.dJl.dIL.pcall(n, LuaState.LUA_MULTRET.intValue(), 0) != 0) {
                this.dJl.a(this.dJl.dIL, afc_1.dJn);
            }
        } else {
            afx_1.dIE.error((Object)("Fonction inconnue " + this.dJj + " dans le script " + this.dJl.bdX));
        }
        this.dJl.dIL.pop(this.dJl.dIL.getTop());
        switch (this.dJl.dIH.ordinal()) {
            case 4: {
                this.dJl.cat();
                break;
            }
            case 2: {
                this.dJl.cau();
            }
        }
    }
}

