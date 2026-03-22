/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from der
 */
class der_0
extends afk_1 {
    der_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "characterDisplayerOpen";
    }

    @Override
    public String getDescription() {
        return "Affiche une fenetre d'interface dans laquelle on place un perso";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oid;
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("id", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = ++ddU.ojK;
        String string = ddU.Of(n2);
        fes_2 fes_22 = (fes_2)fyw_0.gqw().az(string, ccj_2.pe("emissaryTutoDialog"));
        String string2 = this.xu(1);
        String string3 = this.xu(0) + ".anm";
        String string4 = string2.substring(2);
        int n3 = Integer.parseInt(string2.substring(0, 1));
        fse_1.gFu().b("filePath", (Object)string3, string);
        fse_1.gFu().b("animName", (Object)string4, string);
        fse_1.gFu().b("direction", n3, string);
        fzw_0 fzw_02 = fzw_0.valueOf(this.xu(2));
        int n4 = this.xp(3);
        int n5 = this.xp(4);
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setAlign(fzw_02);
        frp_12.setXOffset(n4);
        frp_12.setYOffset(n5);
        fes_22.d(frp_12);
        this.xC(n2);
    }
}

