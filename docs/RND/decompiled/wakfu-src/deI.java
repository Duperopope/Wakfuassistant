/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deI
extends afk_1 {
    deI(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "enableDragNDrop";
    }

    @Override
    public String getDescription() {
        return "Permet de d\u00e9sactiver/r\u00e9activer le dragNDrop sur une List ou un RenderableContainer";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oib;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(this.xu(0));
        if (fhs_22 == null) {
            return;
        }
        fhv_1 fhv_12 = fhs_22.uH(this.xu(1));
        if (fhv_12 != null) {
            if (fhv_12 instanceof fbz_2) {
                ((fbz_2)fhv_12).setEnableDND(this.xx(2));
            } else if (fhv_12 instanceof fcv_1) {
                ((fcv_1)fhv_12).setEnableDND(this.xx(2));
            } else {
                this.a(ddU.ohA, this.xu(0) + "." + this.xu(1) + " n'est pas du bon type !");
            }
        } else {
            this.a(ddU.ohA, this.xu(0) + "." + this.xu(1) + " est introuvable !");
        }
    }
}

