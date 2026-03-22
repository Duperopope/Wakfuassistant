/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPq
 */
public class cpq_2
implements fiz_2 {
    static final byte nhC = 4;
    private String nhD;
    private String nhE;
    private String bKP;

    public cpq_2(String string, String string2, String string3) {
        this.nhD = string;
        this.nhE = string2;
        this.bKP = string3;
    }

    public String eLm() {
        return this.nhD;
    }

    public void pU(String string) {
        this.nhD = string;
    }

    public String eLn() {
        return this.nhE;
    }

    public void pV(String string) {
        this.nhE = string;
    }

    public String getText() {
        return this.bKP;
    }

    public void setText(String string) {
        this.bKP = string;
    }

    @Override
    public byte aFW() {
        return 4;
    }
}

