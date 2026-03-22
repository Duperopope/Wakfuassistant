/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHG
 */
public class ahg_1
implements ahz_1 {
    public apq_1 dSg;
    private final String dSh;
    private final apm_1 dSi;
    private final String dSj;

    public ahg_1(apm_1 apm_12, String string, String string2) {
        this.dSh = string2;
        this.dSi = apm_12;
        this.dSj = string;
    }

    @Override
    public void cdQ() {
        apn_1 apn_12 = this.dSi.fA(this.dSj);
        StringBuilder stringBuilder = new StringBuilder();
        int n = apn_12.read();
        while (n != -1 && stringBuilder.length() < 3) {
            stringBuilder.append((char)n);
            n = apn_12.read();
        }
        apn_12.gt(0L);
        this.dSg = stringBuilder.toString().toUpperCase().equals("OGG") ? apn_12 : new ahj_1(apn_12);
        this.reset();
    }

    @Override
    public void reset() {
        this.dSg.gt(0L);
    }

    @Override
    public void close() {
        this.dSg.close();
    }

    @Override
    public boolean cdR() {
        return true;
    }

    @Override
    public void gt(long l) {
        this.dSg.gt(l);
    }

    @Override
    public long bFH() {
        return this.dSg.bFH();
    }

    @Override
    public long bFV() {
        return this.dSg.bFV();
    }

    @Override
    public int read() {
        return this.dSg.read();
    }

    @Override
    public int read(byte[] byArray) {
        return this.dSg.read(byArray);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        return this.dSg.read(byArray, n, n2);
    }

    @Override
    public String getDescription() {
        return this.dSh;
    }

    @Override
    public String ccQ() {
        return fq_0.bJ(this.dSh);
    }
}

