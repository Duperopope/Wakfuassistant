/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from deO
 */
class deo_0
extends afk_1 {
    deo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPropertyValueInt";
    }

    @Override
    public String getDescription() {
        return "Fourni la valeur enti?re d'une propri?t? sp?cifi?e";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oir;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("propertyValue", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        fsf_1 fsf_12;
        fhs_2 fhs_22;
        String string = this.xu(0);
        String string2 = this.xu(1);
        String string3 = this.xu(2);
        boolean bl = false;
        if (n > 3) {
            bl = this.xx(3);
        }
        if ((fhs_22 = fyw_0.gqw().gqC().uR(string)) == null) {
            this.a(ddU.ohA, "ElementMap inconnue " + string);
            return;
        }
        fsf_1 fsf_13 = fsf_12 = bl ? fse_1.gFu().aX(string2, string) : fse_1.gFu().getProperty(string2);
        if (fsf_12 == null) {
            this.a(ddU.ohA, "Propri?t?e inconnue " + string2);
            return;
        }
        int n2 = fsf_12.wb(string3) == null ? fsf_12.bGI() : fsf_12.wd(string3);
        this.xC(n2);
    }
}

