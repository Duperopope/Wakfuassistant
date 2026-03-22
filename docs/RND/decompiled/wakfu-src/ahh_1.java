/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.net.URL;

/*
 * Renamed from aHH
 */
public class ahh_1
implements ahz_1 {
    private final URL dSk;
    private InputStream dSl;

    public ahh_1(URL uRL) {
        this.dSk = uRL;
    }

    @Override
    public void cdQ() {
        InputStream inputStream = this.dSk.openStream();
        StringBuilder stringBuilder = new StringBuilder();
        int n = inputStream.read();
        while (n != -1 && stringBuilder.length() < 3) {
            stringBuilder.append((char)n);
            n = inputStream.read();
        }
        inputStream.close();
        boolean bl = !stringBuilder.toString().toUpperCase().equals("OGG");
        this.dSl = bl ? new ahi_1(this.dSk.openStream()) : this.dSk.openStream();
    }

    @Override
    public void reset() {
        if (this.dSl != null) {
            this.dSl.close();
        }
        this.cdQ();
    }

    @Override
    public void close() {
        if (this.dSl != null) {
            this.dSl.close();
            this.dSl = null;
        }
    }

    @Override
    public boolean cdR() {
        return false;
    }

    @Override
    public void gt(long l) {
    }

    @Override
    public long bFH() {
        return 0L;
    }

    @Override
    public long bFV() {
        return 0L;
    }

    @Override
    public int read() {
        return this.dSl.read();
    }

    @Override
    public int read(byte[] byArray) {
        return this.dSl.read(byArray);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        return this.dSl.read(byArray, n, n2);
    }

    @Override
    public String getDescription() {
        return this.dSk.toString();
    }

    @Override
    public String ccQ() {
        return fq_0.bJ(this.dSk.toString());
    }
}

