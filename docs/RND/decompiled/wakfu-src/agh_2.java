/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGh
 */
public final class agh_2
extends afk_1 {
    private static final Logger dKE = Logger.getLogger(agh_2.class);
    public static final String dKF = "executeScript";
    private static final afe_1[] dKG = new afe_1[]{new afe_1("ScriptName", null, aff_2.dJy, false), new afe_1("Params", null, aff_2.dJB, false)};
    private static final afe_1[] dKH = new afe_1[]{new afe_1("executionTime", null, aff_2.dJw, false)};
    private static final String dKI = "execution_Time";

    public agh_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return dKF;
    }

    @Override
    public afe_1[] bBg() {
        return dKG;
    }

    @Override
    public afe_1[] bBh() {
        return dKH;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        if (n2 == 0 || n2 == -1) {
            this.xC(0);
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        afq_2[] afq_2Array = this.xv(1);
        if (afq_2Array.length % 2 != 0) {
            this.a(dKE, "La liste des parametres du script n'est pas paire, il faut (nom, valeur) pour chaque parametre");
            this.hA(0L);
            return;
        }
        for (int i = 0; i < afq_2Array.length; i += 2) {
            hashMap.put((String)afq_2Array[i].getValue(), afq_2Array[i + 1].getValue());
        }
        hashMap.put("fightId", this.cai().bha());
        afr_1[] afr_1Array = this.cai().bya();
        try {
            afq_2[] afq_2Array2 = new afq_2[1];
            afx_1 afx_12 = afs_1.can().a(n2, afr_1Array, hashMap, agh_2.a(afq_2Array2), false);
            if (afx_12 == null) {
                this.a(dKE, n2 + " inconnu ");
                this.hA(0L);
                return;
            }
            afq_2 afq_22 = afq_2Array2[0] != null ? afq_2Array2[0] : afx_12.hY(dKI);
            if (afq_22 == null || afq_22.caK() != aff_2.dJz) {
                this.hA(0L);
                return;
            }
            this.hA(((Double)afq_22.getValue()).longValue());
        }
        catch (AssertionError assertionError) {
            dKE.error((Object)"ERREUR CRITIQUE DANS UN SCRIPT", (Throwable)((Object)assertionError));
        }
    }

    private static afd_1 a(afq_2[] afq_2Array) {
        return new agi_2(afq_2Array);
    }
}

