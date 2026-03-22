/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apy
 */
public class apy_2
implements apr_2 {
    private apn_2 cNR = null;
    private apc_2 cNS = null;
    private apz_2 cNT = apz_2.cNU;
    private char cNB;

    public apy_2(apn_2 apn_22) {
        this.a(apn_22);
        this.cNS = new apc_2();
    }

    public void a(apn_2 apn_22) {
        this.cNR = apn_22;
    }

    private void bFx() {
        this.cNT = apz_2.cNU;
        if (this.cNS != null) {
            this.cNS.bFq();
        } else {
            this.cNS = new apc_2();
        }
    }

    public apl_2 bFr() {
        this.bFx();
        int n = this.cNR.bFc();
        this.cNS.tt(n);
        do {
            if (this.cNT == apz_2.cNU) {
                this.cNB = this.cNR.bFe();
                if (this.cNB != '<') continue;
                this.cNT = apz_2.cNV;
                continue;
            }
            if (this.cNT == apz_2.cNV) {
                this.cNB = this.cNR.bFe();
                this.bFs();
                continue;
            }
            if (this.cNT != apz_2.cOe) continue;
            return this.cNS;
        } while (this.cNT != apz_2.cOe);
        int n2 = this.cNR.bFc();
        this.cNS.ts(n2);
        this.cNS.fx(this.cNR.bS(n, n2));
        return this.cNS;
    }

    private void bFs() {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            if (this.cNT == apz_2.cNV) {
                if (this.cNB == '/') {
                    this.cNS.cJ(true);
                    continue;
                }
                if (!Character.isLetterOrDigit(this.cNB)) continue;
                this.cNT = apz_2.cNX;
                stringBuilder.append(this.cNB);
                continue;
            }
            if (this.cNT != apz_2.cNX) continue;
            if (Character.isLetterOrDigit(this.cNB)) {
                this.cNT = apz_2.cNX;
                stringBuilder.append(this.cNB);
                continue;
            }
            if (stringBuilder.length() <= 0) continue;
            if (this.cNB == ' ') {
                this.cNT = apz_2.cNY;
                this.fu(null);
            } else if (this.cNB == '>') {
                this.cNT = apz_2.cOe;
            } else if (this.cNB == '/') {
                this.cNS.cK(true);
            }
            this.cNS.fw(stringBuilder.toString());
        } while ((this.cNB = this.cNR.bFe()) != '\uffff' && this.cNT != apz_2.cNY && this.cNT != apz_2.cOe);
    }

    private void fu(String string) {
        StringBuffer stringBuffer = null;
        stringBuffer = string != null ? new StringBuffer(string) : new StringBuffer("");
        while (this.cNT != apz_2.cOe && (this.cNB = this.cNR.bFe()) != '\uffff') {
            if (this.cNT == apz_2.cNY) {
                if (Character.isLetterOrDigit(this.cNB)) {
                    stringBuffer.append(this.cNB);
                    this.cNT = apz_2.cNZ;
                    continue;
                }
                if (this.cNB == ' ') continue;
                if (this.cNB == '/') {
                    this.cNS.cK(true);
                    continue;
                }
                if (this.cNB != '>') continue;
                this.cNT = apz_2.cOe;
                return;
            }
            if (this.cNT == apz_2.cNZ) {
                if (Character.isLetterOrDigit(this.cNB)) {
                    stringBuffer.append(this.cNB);
                    continue;
                }
                if (this.cNB == ' ') {
                    this.cNT = apz_2.cOa;
                    continue;
                }
                if (this.cNB == '=') {
                    this.cNT = apz_2.cOb;
                    this.u(stringBuffer.toString(), this.bFu());
                    continue;
                }
                if (this.cNB != '>') continue;
                this.cNT = apz_2.cOe;
                this.u(stringBuffer.toString(), null);
                return;
            }
            if (this.cNT == apz_2.cOd) {
                if (Character.isLetterOrDigit(this.cNB)) {
                    this.a(apz_2.cNZ);
                    this.fu("" + this.cNB);
                    continue;
                }
                if (this.cNB != '>') continue;
                this.cNT = apz_2.cOe;
                return;
            }
            if (this.cNT != apz_2.cOa) continue;
            if (this.cNB == '=') {
                this.cNT = apz_2.cOb;
                this.u(stringBuffer.toString(), this.bFu());
                continue;
            }
            if (this.cNB == '>') {
                this.cNT = apz_2.cOe;
                this.u(stringBuffer.toString(), null);
                return;
            }
            if (!Character.isLetterOrDigit(this.cNB)) continue;
            this.u(stringBuffer.toString(), null);
            this.a(apz_2.cNZ);
            this.fu("" + this.cNB);
        }
    }

    private String bFu() {
        boolean bl = false;
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        while ((this.cNB = this.cNR.bFe()) != '\uffff') {
            if (this.cNT == apz_2.cOb) {
                if (this.cNB == '\'') {
                    bl = true;
                    this.cNT = apz_2.cOc;
                    continue;
                }
                if (this.cNB == '\"') {
                    bl2 = true;
                    this.cNT = apz_2.cOc;
                    continue;
                }
                if (this.cNB == ' ') continue;
                stringBuilder.append(this.cNB);
                this.cNT = apz_2.cOc;
                continue;
            }
            if (this.cNT != apz_2.cOc) continue;
            if (this.cNB == ' ') {
                if (bl || bl2) {
                    stringBuilder.append(this.cNB);
                    continue;
                }
                this.cNT = apz_2.cOd;
                return stringBuilder.toString();
            }
            if (this.cNB == '\'') {
                if (bl) {
                    this.cNT = apz_2.cOd;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.cNB);
                continue;
            }
            if (this.cNB == '\"') {
                if (bl2) {
                    this.cNT = apz_2.cOd;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.cNB);
                continue;
            }
            if (this.cNB == '>') {
                this.a(apz_2.cOe);
                return stringBuilder.toString();
            }
            stringBuilder.append(this.cNB);
        }
        return stringBuilder.toString();
    }

    private void u(String string, String string2) {
        this.cNS.a(new apg_2(string, string2));
    }

    private void a(apz_2 apz_22) {
        this.cNT = apz_22;
    }

    @Override
    public String bFk() {
        return null;
    }

    public /* synthetic */ aph_1 bFl() {
        return this.bFr();
    }
}

