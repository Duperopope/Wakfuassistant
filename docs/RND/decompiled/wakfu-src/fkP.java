/*
 * Decompiled with CFR 0.152.
 */
public class fkP
extends fkQ
implements fkU {
    private String sCN = "";

    fkP() {
    }

    @Override
    public String gct() {
        return this.sCN;
    }

    @Override
    public void sP(String string) {
        this.sCN = string;
    }

    @Override
    public void a(wm_1 wm_12) {
        wm_12.ahe = this.sCN;
    }

    @Override
    public void b(wm_1 wm_12) {
        this.sCN = wm_12.ahe;
    }
}

