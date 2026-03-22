/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from awi
 */
public class awi_2 {
    public static final Pattern dko = Pattern.compile("(([^\\-]*)-([^\\-]*)-([^#]*))(#([0-9\\+\\-]+)#([0-9\\+\\-]+))?");
    private final String dkp;
    private final int dkq;
    private final int dkr;
    private final int dks;
    private final int dkt;

    public awi_2(String string, int n, int n2, int n3, int n4) {
        this.dkp = string;
        this.dkq = n;
        this.dkr = n2;
        this.dks = n3;
        this.dkt = n4;
    }

    public String getName() {
        return this.dkp;
    }

    public int bNf() {
        return this.dkq;
    }

    public int bDw() {
        return this.dkr;
    }

    public int getDeltaX() {
        return this.dks;
    }

    public int getDeltaY() {
        return this.dkt;
    }

    public awl_2 bNj() {
        if ((this.dkq & 4) != 0) {
            return awl_2.dkJ;
        }
        if ((this.dkq & 8) != 0) {
            return awl_2.dkK;
        }
        return awl_2.dkI;
    }

    public String bOm() {
        return awi_2.a(this.dkp, this.dkq, this.dkr, 0, 0);
    }

    public String toString() {
        return awi_2.a(this.dkp, this.dkq, this.dkr, this.dks, this.dkt);
    }

    public static String a(String string, int n, int n2, int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        stringBuilder.append('-');
        if ((n & 1) != 0) {
            stringBuilder.append("bold");
        }
        if ((n & 2) != 0) {
            stringBuilder.append("italic");
        }
        if ((n & 4) != 0) {
            stringBuilder.append("bordered");
        }
        if ((n & 8) != 0) {
            stringBuilder.append("shadowed");
        }
        if (n == 0) {
            stringBuilder.append("plain");
        }
        stringBuilder.append('-');
        stringBuilder.append(n2);
        if (n3 != 0 || n4 != 0) {
            stringBuilder.append('#').append(n3);
            stringBuilder.append('#').append(n4);
        }
        return stringBuilder.toString();
    }

    public static awi_2 gv(String string) {
        Matcher matcher = dko.matcher(string);
        if (matcher.matches()) {
            String string2 = matcher.group(2);
            int n = awk_2.gy(matcher.group(3));
            int n2 = Bw.b((Object)matcher.group(4), 10);
            int n3 = Bw.b((Object)matcher.group(6), 0);
            int n4 = Bw.b((Object)matcher.group(7), 0);
            return new awi_2(string2, n, n2, n3, n4);
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        awi_2 awi_22 = (awi_2)object;
        if (this.dks != awi_22.dks) {
            return false;
        }
        if (this.dkt != awi_22.dkt) {
            return false;
        }
        if (this.dkr != awi_22.dkr) {
            return false;
        }
        if (this.dkq != awi_22.dkq) {
            return false;
        }
        return Objects.equals(this.dkp, awi_22.dkp);
    }

    public int hashCode() {
        int n = this.dkp != null ? this.dkp.hashCode() : 0;
        n = 31 * n + this.dkq;
        n = 31 * n + this.dkr;
        n = 31 * n + this.dks;
        n = 31 * n + this.dkt;
        return n;
    }
}

