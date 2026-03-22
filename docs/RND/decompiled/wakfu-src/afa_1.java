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
 * Renamed from aFA
 */
public final class afa_1
implements afz_2 {
    public final int dJb;
    private final int dJc;
    private int dJd;
    private int aPX;
    private final String dJe;
    private final afq_2[] dJf;
    private ArrayList<agj_2> dJg;
    final /* synthetic */ afx_1 dJh;

    afa_1(afx_1 afx_12, int n, int n2, String string, afq_2[] afq_2Array) {
        this.dJh = afx_12;
        this.dJc = n;
        this.dJd = afx_12.dII + n;
        this.aPX = n2;
        this.dJe = string;
        this.dJf = afq_2Array;
        this.dJb = ++afx_12.dIK;
    }

    @Override
    public int d() {
        return this.dJb;
    }

    @Override
    public void bGy() {
        if (this.dJe.contains(".")) {
            String[] stringArray = StringUtils.split((String)this.dJe, (char)'.');
            this.dJh.dIL.pushString(stringArray[0]);
            this.dJh.dIL.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
            if (!this.dJh.dIL.isTable(-1)) {
                afx_1.dIE.error((Object)(stringArray[0] + " n'est pas une librairie connue"));
                this.dJh.dIL.remove(-1);
                switch (this.dJh.dIH.ordinal()) {
                    case 4: {
                        this.dJh.cat();
                        break;
                    }
                    case 2: {
                        this.dJh.cau();
                    }
                }
                return;
            }
            this.dJh.dIL.pushString(stringArray[1]);
            this.dJh.dIL.getTable(-2);
            this.dJh.dIL.remove(-2);
        } else {
            this.dJh.dIL.pushString(this.dJe);
            this.dJh.dIL.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
        }
        if (this.dJh.caD()) {
            int n = this.dJf == null ? 0 : this.dJf.length;
            for (int i = 0; i < n; ++i) {
                this.dJf[i].d(this.dJh.dIL);
            }
            if (this.dJh.dIL.pcall(n, LuaState.LUA_MULTRET.intValue(), 0) != 0) {
                this.dJh.a(this.dJh.dIL, afc_1.dJn);
            }
        } else {
            afx_1.dIE.error((Object)("Fonction inconnue " + this.dJe + " dans le script " + this.dJh.bdX));
        }
        this.dJh.dIL.pop(this.dJh.dIL.getTop());
        switch (this.dJh.dIH.ordinal()) {
            case 4: {
                this.dJh.cat();
                break;
            }
            case 2: {
                this.dJh.cau();
            }
        }
    }

    boolean bHW() {
        if (this.dJh.dII >= this.dJd) {
            this.bGy();
            if (this.aPX == -1) {
                this.dJd += this.dJc;
            } else {
                --this.aPX;
                if (this.aPX > 0) {
                    this.dJd += this.dJc;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}

