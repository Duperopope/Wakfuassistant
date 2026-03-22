/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from app
 */
public class app_2
implements apn_2 {
    private int cNm = 0;
    private CharSequence cNn = null;

    public app_2(CharSequence charSequence) {
        this.cNn = charSequence;
    }

    @Override
    public int bFc() {
        return this.cNm;
    }

    @Override
    public char bFe() {
        if (this.cNm < this.cNn.length()) {
            return this.cNn.charAt(this.cNm++);
        }
        return '\uffff';
    }

    @Override
    public char bFf() {
        if (this.cNm < this.cNn.length()) {
            return this.cNn.charAt(this.cNm);
        }
        return '\u0000';
    }

    @Override
    public String bS(int n, int n2) {
        if (n >= 0 && n <= this.cNn.length() && n2 >= 1 && n2 <= this.cNn.length() && n < n2) {
            return this.cNn.subSequence(n, n2).toString();
        }
        return null;
    }

    @Override
    public boolean bFd() {
        return this.cNm < this.cNn.length();
    }

    @Override
    public void to(int n) {
        this.cNm = n;
    }

    @Override
    public apo_2 bFg() {
        return null;
    }

    @Override
    public int aVo() {
        return this.cNn.length();
    }

    @Override
    public boolean tp(int n) {
        if (this.cNm + n >= 0 && this.cNm + n < this.cNn.length()) {
            this.cNm += n;
            return true;
        }
        return false;
    }

    @Override
    public char tq(int n) {
        return this.cNn.charAt(n);
    }
}

