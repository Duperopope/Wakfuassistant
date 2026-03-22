/*
 * Decompiled with CFR 0.152.
 */
public class dax
extends dae_0 {
    private String aFD;
    private apq_0 ocn;

    public dax(short s) {
        super(s);
    }

    public dax(short s, String string) {
        super(s);
        this.aFD = string;
    }

    public dax(short s, String string, apq_0 apq_02) {
        super(s);
        this.aFD = string;
        this.ocn = apq_02;
    }

    public String xO() {
        return this.aFD;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public apq_0 eZQ() {
        return this.ocn;
    }

    public void a(apq_0 apq_02) {
        this.ocn = apq_02;
    }
}

