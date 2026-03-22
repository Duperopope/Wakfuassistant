/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dei
 */
class dei_0
extends afk_1 {
    dei_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addListColorTween";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiu;
    }

    @Override
    public String getDescription() {
        return "Ajoute un colorTween aux ?l?ments d'une liste";
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
        if (!(fhv_12 instanceof fbz_2)) {
            this.a(ddU.ohA, "l'EventDispatcher n'est pas du type Widget");
            return;
        }
        fbz_2 fbz_22 = (fbz_2)fhv_12;
        String string3 = this.xu(2);
        int n2 = this.xp(3);
        int n3 = this.xp(4);
        awx_2 awx_22 = new awx_2(new float[0]);
        awx_2 awx_23 = new awx_2(new float[0]);
        if (n == 13) {
            awx_22.v((float)this.xq(5), (float)this.xq(6), (float)this.xq(7), (float)this.xq(8));
            awx_23.v((float)this.xq(9), (float)this.xq(10), (float)this.xq(11), (float)this.xq(12));
        } else {
            awx_22.op(awx_2.dnF.aTn());
            awx_23.op(awx_2.dnS.aTn());
        }
        ArrayList<fcv_1> arrayList = fbz_22.getRenderables();
        for (fcv_1 fcv_12 : arrayList) {
            fes_2 fes_22;
            fhs_2 fhs_23;
            if (fcv_12 == null || (fhs_23 = fcv_12.getInnerElementMap()) == null || (fes_22 = (fes_2)fhs_23.uH(string3)) == null) continue;
            fys_0 fys_02 = fes_22.getAppearance();
            fys_02.a(new fsa_2(awx_22, awx_23, fys_02, 0, n2, n3, abn.cdr));
        }
    }
}

