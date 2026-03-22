/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apt
 */
public class apt_2
implements apr_2 {
    private apn_2 cNp = null;
    private boolean cNx = false;

    public void a(apn_2 apn_22) {
        this.cNp = apn_22;
    }

    @Override
    public String bFk() {
        return null;
    }

    public aph_1 bFl() {
        char c2;
        this.cNx = false;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        boolean bl2 = false;
        while ((c2 = this.cNp.bFe()) != '\uffff') {
            stringBuilder.append(c2);
            if (c2 == '<') {
                if (bl || bl2 || this.cNp.bFf() != '!') continue;
                this.cNp.bFe();
                if (this.cNp.bFf() == '-') {
                    while (this.cNp.bFe() == '-') {
                    }
                    continue;
                }
                this.cNx = true;
                continue;
            }
            if (c2 == '\'') {
                bl = !bl;
                continue;
            }
            if (c2 == '\"') {
                bl2 = !bl2;
                continue;
            }
            if (c2 == '>') {
                if (bl || bl2 || !this.cNx && this.cNp.tq(this.cNp.bFc() - 2) != '-') continue;
                break;
            }
            if (c2 != '-' || bl || bl2) continue;
            int n = this.cNp.bFc();
            int n2 = 0;
            int n3 = 5;
            while (this.cNp.tq(n++) != '>' && n2++ < 5) {
            }
            if (n2 >= 5) continue;
        }
        apa_2 apa_22 = new apa_2();
        apa_22.fv(stringBuilder.toString());
        return apa_22;
    }
}

