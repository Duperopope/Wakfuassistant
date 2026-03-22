/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apu
 */
public class apu_2
implements apr_2 {
    private apn_2 cNp = null;
    private apl_2 cNy = null;

    void a(apn_2 apn_22) {
        this.cNp = apn_22;
    }

    void c(apl_2 apl_22) {
        this.cNy = apl_22;
    }

    @Override
    public String bFk() {
        return null;
    }

    public aph_1 bFl() {
        char c2;
        apb_2 apb_22 = new apb_2();
        StringBuilder stringBuilder = new StringBuilder();
        while ((c2 = this.cNp.bFf()) != '\uffff') {
            if (c2 == '<') {
                if (this.cNy != null) {
                    String string = this.cNy.bEX();
                    if (string.equalsIgnoreCase(this.cNy.bEX())) {
                        int n = this.cNp.bFc() + 2;
                        String string2 = this.cNp.bS(n, n + ("/" + this.cNy.bEX()).length());
                        if (string2.contains(this.cNy.bEX().toLowerCase()) || string2.contains(this.cNy.bEX().toUpperCase())) {
                            apb_22.c(this.cNy);
                            apb_22.setValue(stringBuilder.toString());
                            return apb_22;
                        }
                        stringBuilder.append(c2);
                        this.cNp.bFe();
                        continue;
                    }
                    this.cNp.bFe();
                    continue;
                }
                apb_22.setValue(stringBuilder.toString());
                return apb_22;
            }
            stringBuilder.append(c2);
            this.cNp.bFe();
        }
        return apb_22;
    }
}

