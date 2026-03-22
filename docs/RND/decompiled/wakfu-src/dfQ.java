/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfQ
extends afk_1 {
    dfQ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setTrainingParameters";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohU;
    }

    @Override
    public String getDescription() {
        return "Sp\u00e9cifie les param\u00e8tres d'un combat d'entrainement en les fournissant \u00e0 l'action MRU qui correspond";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        cqc_1 cqc_12;
        int n2 = this.xp(0);
        if (n2 == cps_1.niM.avZ()) {
            cqc_12 = (cqc_1)cps_1.niM.eLJ();
        } else if (n2 == cps_1.niN.avZ()) {
            cqc_12 = (cqc_1)cps_1.niN.eLJ();
        } else {
            ddU.ohA.error((Object)"Il n'y a que 2 actions diff\u00e9rentes de combat d'entrainement");
            return;
        }
        cqc_12.fa(this.xx(1));
        cqc_12.KW(this.xp(2));
        cqc_12.jn(this.xx(3));
        cqc_12.dn((byte)this.xp(4));
        afq_2[] afq_2Array = this.cP(5, n);
        int[] nArray = null;
        if (afq_2Array.length > 0) {
            nArray = new int[afq_2Array.length];
            for (int i = 0; i < afq_2Array.length; ++i) {
                if (afq_2Array[i].caK() == aff_2.dJy || afq_2Array[i].caK() == aff_2.dJz) {
                    nArray[i] = ((Double)afq_2Array[i].getValue()).intValue();
                    continue;
                }
                ddU.ohA.error((Object)"Les param\u00e8tres de battleground doivent imp\u00e9rativement \u00eatre de type nombre");
                nArray[i] = 0;
            }
        }
        cqc_12.F(nArray);
    }
}

