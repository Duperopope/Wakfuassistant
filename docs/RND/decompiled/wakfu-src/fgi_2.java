/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGI
 */
public class fgi_2
extends fgj_2 {
    public fgi_2() {
        this.gyk();
    }

    public fgm_1 gzi() {
        return (fgm_1)this.abt(0);
    }

    @Override
    public String gyi() {
        return this.gzi().gzF();
    }

    @Override
    public void tZ(String string) {
        this.gzx();
        this.gzi().setText(string);
    }

    @Override
    public void ua(String string) {
        this.gzi().setText(this.gzi().getText() + string);
    }
}

