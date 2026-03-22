/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aqU
 */
public class aqu_2
implements apd_1 {
    private String p;
    private String axs;

    public aqu_2(String string, String string2) {
        this.p = string != null ? string.intern() : null;
        this.axs = string2 != null ? string2.intern() : null;
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public void lK(int n) {
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public void setName(String string) {
        this.p = string != null ? string.intern() : null;
    }

    @Override
    public String bCt() {
        return this.axs;
    }

    @Override
    public boolean bCu() {
        return Boolean.parseBoolean(this.axs);
    }

    @Override
    public byte bCn() {
        return Byte.parseByte(this.axs);
    }

    @Override
    public short bCq() {
        return Short.parseShort(this.axs);
    }

    @Override
    public int bCo() {
        return Integer.parseInt(this.axs);
    }

    @Override
    public long bCp() {
        return Long.parseLong(this.axs);
    }

    @Override
    public float bCs() {
        return Float.parseFloat(this.axs);
    }

    @Override
    public double bCr() {
        return Double.parseDouble(this.axs);
    }

    @Override
    public void fa(String string) {
        this.axs = string != null ? string.intern() : null;
    }

    @Override
    public void cC(boolean bl) {
        this.axs = bl ? "true" : "false";
    }

    @Override
    public void ay(byte by) {
        this.axs = ("" + by).intern();
    }

    @Override
    public void sY(int n) {
        this.axs = ("" + n).intern();
    }

    @Override
    public void gj(long l) {
        this.axs = ("" + l).intern();
    }

    @Override
    public void cL(float f2) {
        this.axs = ("" + f2).intern();
    }

    @Override
    public void B(double d2) {
        this.axs = ("" + d2).intern();
    }

    @Override
    public void a(apd_1 apd_12) {
    }

    @Override
    public void b(apd_1 apd_12) {
    }

    @Override
    public ArrayList<? extends apd_1> getChildren() {
        return null;
    }

    @Override
    public apd_1 fn(String string) {
        return null;
    }

    @Override
    public ArrayList<apd_1> fo(String string) {
        return null;
    }

    @Override
    public ArrayList<apd_1> fp(String string) {
        return null;
    }

    @Override
    public apd_1 fq(String string) {
        return null;
    }

    @Override
    public boolean fr(String string) {
        return false;
    }

    @Override
    public void c(apd_1 apd_12) {
    }

    @Override
    public void d(apd_1 apd_12) {
    }

    @Override
    public <T extends apd_1> ArrayList<T> bEN() {
        return null;
    }

    public String toString() {
        return this.p + "=" + this.axs;
    }
}

