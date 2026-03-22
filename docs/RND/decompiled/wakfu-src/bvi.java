/*
 * Decompiled with CFR 0.152.
 */
public class bvi
extends bve {
    private String p;

    public bvi(fab fab2) {
        super(fab2);
        this.p = fab2.getName();
    }

    @Override
    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
        fse_1.gFu().a((aef_2)this, "name");
    }
}

