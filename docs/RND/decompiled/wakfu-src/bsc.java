/*
 * Decompiled with CFR 0.152.
 */
public class bsc
implements aeh_2 {
    public static final String jeL = "name";
    public static final String jeM = "id";
    private long aXv;
    private String p;

    public bsc(long l, String string) {
        this.aXv = l;
        this.p = string;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public long Sn() {
        return this.aXv;
    }

    public void dC(long l) {
        this.aXv = l;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jeL)) {
            return this.p;
        }
        if (string.equals(jeM)) {
            return this.aXv;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return null;
    }
}

