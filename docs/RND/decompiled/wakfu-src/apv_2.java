/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apv
 */
public class apv_2
implements apr_2 {
    private apn_2 cNp = null;
    private apw_2 cNz = apw_2.cND;
    private apc_2 cNA = null;
    private char cNB = (char)48;
    private String cNC = "";

    public void a(apn_2 apn_22) {
        this.cNp = apn_22;
    }

    public void bFq() {
        this.cNz = apw_2.cND;
        this.cNC = "";
        this.cNB = (char)48;
    }

    @Override
    public String bFk() {
        return null;
    }

    public apl_2 bFr() {
        this.bFq();
        this.cNA = new apc_2();
        this.cNA.bFq();
        do {
            if (this.cNz == apw_2.cND) {
                this.cNB = this.cNp.bFe();
                if (this.cNB != '<') continue;
                this.cNz = apw_2.cNE;
                continue;
            }
            if (this.cNz == apw_2.cNE) {
                this.cNB = this.cNp.bFe();
                this.bFs();
                continue;
            }
            if (this.cNz != apw_2.cNN) continue;
            this.cNA.fw(this.cNC);
            return this.cNA;
        } while (this.cNz != apw_2.cNN);
        this.cNA.fw(this.cNC);
        return this.cNA;
    }

    private void bFs() {
        do {
            if (this.cNz == apw_2.cNE) {
                if (this.cNB == '/') {
                    this.cNA.cJ(true);
                    continue;
                }
                if (!Character.isLetterOrDigit(this.cNB)) continue;
                this.cNz = apw_2.cNG;
                this.cNC = this.cNC + this.cNB;
                continue;
            }
            if (this.cNz != apw_2.cNG) continue;
            if (Character.isLetterOrDigit(this.cNB)) {
                this.cNz = apw_2.cNG;
                this.cNC = this.cNC + this.cNB;
                continue;
            }
            if (this.cNC.length() <= 0) continue;
            if (this.cNB == ' ') {
                this.cNz = apw_2.cNH;
                this.bFt();
                break;
            }
            if (this.cNB == '>') {
                this.cNz = apw_2.cNN;
                break;
            }
            if (this.cNB != '/') continue;
            this.cNA.cJ(true);
        } while ((this.cNB = this.cNp.bFe()) != '\uffff' && this.cNz != apw_2.cNH && this.cNz != apw_2.cNN);
    }

    private void bFt() {
        Object object = "";
        while (this.cNz != apw_2.cNN && (this.cNB = this.cNp.bFf()) != '\uffff') {
            if (this.cNz == apw_2.cNH) {
                this.cNp.bFe();
                if (Character.isLetterOrDigit(this.cNB)) {
                    object = (String)object + this.cNB;
                    this.cNz = apw_2.cNI;
                    continue;
                }
                if (this.cNB == ' ') continue;
                if (this.cNB == '/') {
                    this.cNA.cK(true);
                    continue;
                }
                if (this.cNB != '>') continue;
                this.cNz = apw_2.cNN;
                return;
            }
            if (this.cNz == apw_2.cNI) {
                this.cNp.bFe();
                if (Character.isLetterOrDigit(this.cNB)) {
                    object = (String)object + this.cNB;
                    continue;
                }
                if (this.cNB == ' ') {
                    this.cNz = apw_2.cNJ;
                    continue;
                }
                if (this.cNB == '=') {
                    this.cNz = apw_2.cNK;
                    this.cNA.v((String)object, this.bFu());
                    continue;
                }
                if (this.cNB != '>') continue;
                this.cNz = apw_2.cNN;
                this.cNA.v((String)object, null);
                return;
            }
            if (this.cNz == apw_2.cNM) {
                if (Character.isLetterOrDigit(this.cNB)) {
                    this.cNz = apw_2.cNI;
                    this.bFt();
                    continue;
                }
                if (this.cNB == '>') {
                    this.cNp.bFe();
                    this.cNz = apw_2.cNN;
                    return;
                }
                this.cNp.bFe();
                continue;
            }
            if (this.cNz != apw_2.cNJ) continue;
            if (this.cNB == '=') {
                this.cNp.bFe();
                this.cNz = apw_2.cNK;
                this.cNA.v((String)object, this.bFu());
                continue;
            }
            if (this.cNB == '>') {
                this.cNp.bFe();
                this.cNz = apw_2.cNN;
                this.cNA.v((String)object, null);
                return;
            }
            if (Character.isLetterOrDigit(this.cNB)) {
                this.cNA.v((String)object, null);
                this.cNz = apw_2.cNI;
                this.bFt();
                continue;
            }
            this.cNp.bFe();
        }
    }

    private String bFu() {
        boolean bl = false;
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        while ((this.cNB = this.cNp.bFe()) != '\uffff') {
            if (this.cNz == apw_2.cNK) {
                if (this.cNB == '\'') {
                    bl = true;
                    this.cNz = apw_2.cNL;
                    continue;
                }
                if (this.cNB == '\"') {
                    bl2 = true;
                    this.cNz = apw_2.cNL;
                    continue;
                }
                if (this.cNB == ' ') continue;
                stringBuilder.append(this.cNB);
                this.cNz = apw_2.cNL;
                continue;
            }
            if (this.cNz != apw_2.cNL) continue;
            if (this.cNB == ' ') {
                if (bl || bl2) {
                    stringBuilder.append(this.cNB);
                    continue;
                }
                this.cNz = apw_2.cNM;
                return stringBuilder.toString();
            }
            if (this.cNB == '\'') {
                if (bl) {
                    this.cNz = apw_2.cNM;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.cNB);
                continue;
            }
            if (this.cNB == '\"') {
                if (bl2) {
                    this.cNz = apw_2.cNM;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.cNB);
                continue;
            }
            if (this.cNB == '>') {
                this.cNz = apw_2.cNN;
                return stringBuilder.toString();
            }
            stringBuilder.append(this.cNB);
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ aph_1 bFl() {
        return this.bFr();
    }
}

