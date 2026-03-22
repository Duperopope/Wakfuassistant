/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apx
 */
public class apx_2
implements apr_2 {
    private String cNP = null;
    private apn_2 cNp = null;
    private apl_2 cNQ = null;

    public void a(apn_2 apn_22) {
        this.cNp = apn_22;
    }

    public void d(apl_2 apl_22) {
        this.cNQ = apl_22;
    }

    @Override
    public String bFk() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public apm_2 bFw() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        this.cNP = "";
        char c2 = this.cNp.bFf();
        while (c2 != '\uffff' && c2 != '\u0000') {
            block6: {
                block5: {
                    if (c2 != '<') break block5;
                    if (this.cNQ != null) {
                        object = this.cNQ.bEX();
                        if (((String)object).equalsIgnoreCase("script")) {
                            int n = this.cNp.bFc() + 2;
                            String string = this.cNp.bS(n, n + "/script".length());
                            if (string.contains("script") || string.contains("SCRIPT")) {
                                this.cNP = stringBuilder.toString();
                                break;
                            }
                            stringBuilder.append(c2);
                            this.cNp.bFe();
                        }
                        break block6;
                    } else {
                        this.cNP = stringBuilder.toString();
                        break;
                    }
                }
                stringBuilder.append(c2);
                this.cNp.bFe();
            }
            c2 = this.cNp.bFf();
        }
        object = new apd_2();
        ((apd_2)object).fy(this.cNP);
        return object;
    }

    public /* synthetic */ aph_1 bFl() {
        return this.bFw();
    }
}

