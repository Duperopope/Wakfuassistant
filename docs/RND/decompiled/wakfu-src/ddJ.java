/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class ddJ
extends afk_1 {
    ddJ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setText";
    }

    @Override
    public String getDescription() {
        return "Specify the text of an InteractiveBubble or a WakfuBubble";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("text", "Texte a afficher", aff_2.dJx, false), new afe_1("parameters", "Parametres du texte", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        chj_2 chj_22 = dds_0.fcD().NV(this.xp(0));
        String[] stringArray = null;
        if (this.Oc(n)) {
            stringArray = new String[n - 2];
            this.x(stringArray);
        }
        if (chj_22 != null) {
            this.a(chj_22, stringArray);
            return;
        }
        fem_1 fem_12 = dds_0.fcD().NX(this.xp(0));
        if (fem_12 != null) {
            this.a(fem_12, stringArray);
        }
    }

    private void a(fem_1 fem_12, String[] stringArray) {
        if (stringArray != null) {
            fem_12.setText(ddw_0.j(this.xu(1), stringArray));
        } else {
            fem_12.setText(ddw_0.j(this.xu(1), new Object[0]));
        }
    }

    private void a(chj_2 chj_22, String[] stringArray) {
        if (stringArray != null) {
            chj_22.setBubbleText(ddw_0.j(this.xu(1), stringArray));
        } else {
            chj_22.setBubbleText(ddw_0.j(this.xu(1), new Object[0]));
        }
    }

    private void x(String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            String string;
            stringArray[i] = string = this.xw(i + 2);
        }
    }

    private boolean Oc(int n) {
        return n > 2;
    }
}

