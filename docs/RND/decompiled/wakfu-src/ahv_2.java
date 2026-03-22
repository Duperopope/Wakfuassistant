/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aHV
 */
public class ahv_2 {
    protected final StringBuilder dSH = new StringBuilder(100);
    protected boolean dSI;
    protected ahr_2 dSJ = ahr_2.dSB;
    protected final List<String> dSK = new ArrayList<String>();
    static long dSL;
    static long dSM;
    static long ajY;

    public ahv_2 af(Object object) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(object);
        return this;
    }

    public ahv_2 c(CharSequence charSequence) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(charSequence);
        return this;
    }

    public ahv_2 a(CharSequence charSequence, int n, int n2) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(charSequence, n, n2);
        return this;
    }

    public ahv_2 aO(byte by) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(this.hZ(by));
        return this;
    }

    public ahv_2 aN(short s) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(this.hZ(s));
        return this;
    }

    public ahv_2 k(char c2) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(c2);
        return this;
    }

    public ahv_2 yx(int n) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(this.hZ(n));
        return this;
    }

    public ahv_2 hY(long l) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(this.hZ(l));
        return this;
    }

    public ahv_2 ei(float f2) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(this.T(f2));
        return this;
    }

    public ahv_2 S(double d2) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(this.T(d2));
        return this;
    }

    public ahv_2 ei(boolean bl) {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append(bl);
        return this;
    }

    protected void im(String string) {
        this.dSK.add(string);
        this.dSH.append('<').append(string);
        this.dSI = true;
        this.dSJ = ahr_2.dSC;
    }

    protected void in(String string) {
        this.dSK.remove(this.dSK.size() - 1);
        this.dSH.append("</").append(string).append('>');
        this.dSJ = ahr_2.dSB;
    }

    protected void a(String string, ahr_2 ahr_22) {
        this.dSK.add(string);
        this.dSH.append('<').append(string);
        this.dSI = true;
        this.dSJ = ahr_22;
    }

    public ahv_2 ceu() {
        if (this.dSI) {
            this.ceN();
        }
        this.im("b");
        return this;
    }

    public ahv_2 cev() {
        if (this.dSI) {
            this.ceN();
        }
        this.in("b");
        return this;
    }

    public ahv_2 cew() {
        if (this.dSI) {
            this.ceN();
        }
        this.im("c");
        return this;
    }

    public ahv_2 cex() {
        if (this.dSI) {
            this.ceN();
        }
        this.in("c");
        return this;
    }

    public ahv_2 cey() {
        if (this.dSI) {
            this.ceN();
        }
        this.im("i");
        return this;
    }

    public ahv_2 cez() {
        if (this.dSI) {
            this.ceN();
        }
        this.in("i");
        return this;
    }

    public ahv_2 ceA() {
        if (this.dSI) {
            this.ceN();
        }
        this.im("u");
        return this;
    }

    public ahv_2 ceB() {
        if (this.dSI) {
            this.ceN();
        }
        this.in("u");
        return this;
    }

    public ahv_2 ceH() {
        if (this.dSI) {
            this.ceN();
        }
        this.dSH.append('\n');
        return this;
    }

    public ahv_2 ceC() {
        if (this.dSI) {
            this.ceN();
        }
        this.im("text");
        return this;
    }

    public ahv_2 ceD() {
        if (this.dSI) {
            this.ceN();
        }
        this.in("text");
        return this;
    }

    public ahv_2 ceE() {
        if (this.dSI) {
            this.ceN();
        }
        this.a("image", ahr_2.dSD);
        return this;
    }

    public ahv_2 ceF() {
        if (this.dSI) {
            this.ceN();
        }
        this.in("image");
        return this;
    }

    public ahv_2 a(String string, int n, int n2, @Nullable String string2) {
        this.a(string, n, n2, string2, null);
        return this;
    }

    public ahv_2 a(String string, int n, int n2, @Nullable String string2, @Nullable String string3) {
        this.ceE();
        this.M("pixmap", string);
        if (n > 0) {
            this.M("width", String.valueOf(n));
        }
        if (n2 > 0) {
            this.M("height", String.valueOf(n2));
        }
        if (string2 != null) {
            this.M("align", string2);
        }
        if (string3 != null) {
            this.M("popupTranslatorKey", string3);
        }
        this.ceF();
        return this;
    }

    public ahv_2 ceI() {
        this.L("align", "center");
        return this;
    }

    public ahv_2 ceJ() {
        this.L("align", "east");
        return this;
    }

    public ahv_2 ceK() {
        this.L("align", "west");
        return this;
    }

    public ahv_2 e(axb_2 axb_22) {
        return this.ih(axb_22.bQk());
    }

    public ahv_2 ih(String string) {
        this.L("color", string);
        return this;
    }

    public ahv_2 ii(String string) {
        this.L("name", string);
        return this;
    }

    public ahv_2 yu(int n) {
        this.L("size", String.valueOf(n));
        return this;
    }

    public ahv_2 ij(String string) {
        this.L("id", string);
        return this;
    }

    public ahv_2 yv(int n) {
        this.L("width", String.valueOf(n));
        return this;
    }

    public ahv_2 yw(int n) {
        this.L("height", String.valueOf(n));
        return this;
    }

    public ahv_2 ik(String string) {
        this.L("pixmap", string);
        return this;
    }

    public String toString() {
        return this.dSH.toString();
    }

    public int bXe() {
        return this.dSH.length();
    }

    public String ceL() {
        if (!this.dSK.isEmpty()) {
            this.ceM();
        }
        if ((long)this.dSH.length() > dSL) {
            dSL = this.dSH.length();
        }
        ++ajY;
        dSM += (long)this.dSH.length();
        return this.dSH.toString();
    }

    public static boolean io(String string) {
        return string.contains("<text");
    }

    public static boolean ip(String string) {
        return string.contains("color=");
    }

    protected void L(String string, String string2) {
        if (this.dSJ != ahr_2.dSC) {
            this.ceC();
        }
        this.dSH.append(' ').append(string).append("=\"").append(string2).append('\"');
    }

    protected void M(String string, String string2) {
        if (this.dSJ != ahr_2.dSD) {
            this.ceE();
        }
        this.dSH.append(' ').append(string).append("=\"").append(string2).append('\"');
    }

    protected void ceM() {
        if (this.dSI) {
            this.ceN();
        }
        while (!this.dSK.isEmpty()) {
            this.dSH.append("</").append(this.dSK.remove(this.dSK.size() - 1)).append('>');
        }
    }

    protected void ceN() {
        assert (this.dSI);
        this.dSH.append('>');
        this.dSI = false;
    }

    public void clear() {
        this.dSH.delete(0, this.dSH.length());
    }

    public boolean ceO() {
        return this.dSI;
    }

    private String hZ(long l) {
        if (My.aUV() == null) {
            return String.valueOf(l);
        }
        return My.aUV().cQ(l);
    }

    private String T(double d2) {
        if (My.aUV() == null) {
            return String.valueOf(d2);
        }
        return My.aUV().w(d2);
    }
}

