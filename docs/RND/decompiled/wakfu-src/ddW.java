/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class ddW
extends afk_1 {
    ddW(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addColorTween";
    }

    @Override
    public String getDescription() {
        return "Ajoute un tween de changement de couleur de modulation sur le Widget pass? en param?tre.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiw;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            this.a(ddU.ohA, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.xu(1);
        fhv_1 fhv_12 = fhs_22.uH(string2);
        if (fhv_12 == null) {
            this.a(ddU.ohA, "EventDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        if (!(fhv_12 instanceof fes_2)) {
            this.a(ddU.ohA, "l'EventDispatcher n'est pas du type Widget");
            return;
        }
        int n2 = this.xp(2);
        int n3 = this.xp(3);
        awx_2 awx_22 = new awx_2(new float[0]);
        awx_2 awx_23 = new awx_2(new float[0]);
        if (n == 12) {
            awx_22.v((float)this.xq(4), (float)this.xq(5), (float)this.xq(6), (float)this.xq(7));
            awx_23.v((float)this.xq(8), (float)this.xq(9), (float)this.xq(10), (float)this.xq(11));
        } else {
            awx_22.op(awx_2.dnF.aTn());
            awx_23.op(awx_2.dnS.aTn());
        }
        fys_0 fys_02 = ((fes_2)fhv_12).getAppearance();
        fys_02.a(new fsa_2(awx_22, awx_23, fys_02, 0, n2, n3, abn.cdr));
    }
}

