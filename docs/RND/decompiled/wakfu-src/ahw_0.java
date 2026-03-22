/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ahW
 */
class ahw_0
extends afk_1 {
    ahw_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createCameraShakeEffect";
    }

    @Override
    public String getDescription() {
        return "Active un effet de tremblement de la cam?ra";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("startDuration", "Temps pendant lequel la force augmente progressivement (en ms)", aff_2.dJz, true), new afe_1("midDuration", "Dur\u00e9e de l'effet \u00e0 la force max (en ms)", aff_2.dJz, true), new afe_1("endDuration", "Temps pendant lequel la force diminue progressivement (en ms)", aff_2.dJz, true), new afe_1("amplitude", "Amplitude max des mouvements", aff_2.dJz, true), new afe_1("period", "P\u00e9riode du tremblement", aff_2.dJz, true), new afe_1("direction", "Application de l'effet selon l'axe 'X', 'Y', ou 'BOTH' ('XY')", aff_2.dJx, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("effectId", "Id de l'effet", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = 1000;
        int n3 = 2000;
        int n4 = 1000;
        float f2 = 0.5f;
        float f3 = 77.0f;
        String string = "BOTH";
        if (n >= 1) {
            n2 = (int)this.xq(0);
        }
        if (n >= 2) {
            n3 = (int)this.xq(1);
        }
        if (n >= 3) {
            n4 = (int)this.xq(2);
        }
        if (n >= 4) {
            f2 = (float)this.xq(3);
        }
        if (n == 5) {
            f3 = (float)this.xq(4);
        }
        if (n == 6) {
            string = this.xu(5).toUpperCase();
        }
        aba_0 aba_02 = new aba_0();
        aba_02.eg(string);
        aba_02.aF(f3, f2);
        aht_0.a(n2, n3, n4, aba_02, aht_0.brf());
        ast_1.bJG().a(aba_02);
        this.xC(aba_02.d());
    }
}

