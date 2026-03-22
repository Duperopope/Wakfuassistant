/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aPZ
 */
public class apz_0
implements Comparable<apz_0> {
    private String p;
    protected String aFD;
    private boolean eBt;
    private long aXv;

    public apz_0(String string, String string2, boolean bl, long l) {
        this.aFD = string;
        this.p = string2;
        this.eBt = bl;
        this.aXv = l;
    }

    public apz_0(long l, String string, String string2) {
        this(string2, string, false, l);
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public boolean cBt() {
        return this.eBt;
    }

    public void eN(boolean bl) {
        this.eBt = bl;
    }

    public long Sn() {
        return this.aXv;
    }

    public void dC(long l) {
        this.aXv = l;
    }

    public String xO() {
        return this.aFD;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public int a(@NotNull apz_0 apz_02) {
        return this.getName().toLowerCase().compareTo(apz_02.getName().toLowerCase());
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((apz_0)object);
    }
}

