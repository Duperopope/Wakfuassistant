/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fGJ
 */
public abstract class fgj_2
implements Iterable<fgk_2> {
    private static final Logger uuu = Logger.getLogger(fgj_2.class);
    private final ArrayList<fgk_2> uuv = new ArrayList();
    protected int uuw = Integer.MAX_VALUE;
    private int uux = 0;
    protected Pattern uuy;
    protected boolean uuz;
    protected boolean uuA;
    private int uuB = -1;
    private int uuC = 0;
    private int uuD = -1;
    private int uuE = 0;
    private boolean uuF = false;
    private awx_1 uuG;
    private boolean tFH;

    public void gyk() {
        fgm_1 fgm_12 = new fgm_1(this, null, false);
        fgm_12.setText("");
        this.b(fgm_12);
    }

    protected void b(fgk_2 fgk_22) {
        this.uuv.add(fgk_22);
        this.uux += fgk_22.aPs();
    }

    protected void a(int n, fgk_2 fgk_22) {
        this.uuv.add(n, fgk_22);
    }

    public void c(fgk_2 fgk_22) {
        if (this.uuv.remove(fgk_22)) {
            fgk_22.clean();
        }
        this.uux -= fgk_22.aPs();
    }

    @Nullable
    public fgk_2 abt(int n) {
        try {
            return this.uuv.get(n);
        }
        catch (Exception exception) {
            return null;
        }
    }

    protected void gzj() {
        for (fgk_2 fgk_22 : this.uuv) {
            fgk_22.clean();
        }
        this.uuv.clear();
        this.uux = 0;
    }

    public int EE() {
        return this.uux;
    }

    public int getMaxCharacters() {
        return this.uuw;
    }

    public void setMaxCharacters(int n) {
        this.uuw = n;
    }

    public Pattern gzk() {
        return this.uuy;
    }

    @Nullable
    public String getRestrict() {
        if (this.uuy != null) {
            return this.uuy.pattern();
        }
        return null;
    }

    public void setRestrict(String string) {
        if (string == null) {
            this.uuy = null;
            return;
        }
        this.uuy = this.uuz ? Pattern.compile(string, 64) : Pattern.compile(string);
    }

    public void setUnicodeRestrict(boolean bl) {
        if (bl == this.uuz) {
            return;
        }
        this.uuz = bl;
        if (this.uuy != null) {
            this.setRestrict(this.uuy.pattern());
        }
    }

    public boolean isPassword() {
        return this.uuA;
    }

    public void setPassword(boolean bl) {
        this.uuA = bl;
    }

    public boolean isEnableAWTFont() {
        return this.uuF;
    }

    public void setEnableAWTFont(boolean bl) {
        this.uuF = bl;
    }

    public boolean isUnicodeRestrict() {
        return this.uuz;
    }

    public boolean aJG() {
        return this.uuv.isEmpty();
    }

    @Nullable
    public fgk_2 gzl() {
        if (!this.uuv.isEmpty()) {
            return this.uuv.get(0);
        }
        return null;
    }

    @Nullable
    public fgk_2 gzm() {
        if (!this.uuv.isEmpty()) {
            return this.uuv.get(this.uuv.size() - 1);
        }
        return null;
    }

    @Nullable
    public fgk_2 gzn() {
        int n = this.gzo();
        if (n != -1) {
            return this.abt(n);
        }
        return null;
    }

    public int gzo() {
        if (this.gzy()) {
            return this.uuD;
        }
        return this.uuB;
    }

    public int gzp() {
        if (this.gzy()) {
            return this.uuE;
        }
        return this.uuC;
    }

    public boolean c(fgk_2 fgk_22, int n) {
        int n2 = this.uuv.indexOf(fgk_22);
        int n3 = GC.a(n, -1, this.uux);
        if (n3 != n) {
            uuu.debug((Object)"setSelectionStart avec une valeur d'index invalide : ", (Throwable)new Exception());
            n = n3;
        }
        boolean bl = false;
        if (n2 != this.uuB || this.uuC != n) {
            bl = true;
        }
        this.uuB = n2;
        this.uuC = n;
        return bl;
    }

    public boolean gzq() {
        boolean bl = this.uuD != this.uuB || this.uuC != this.uuE;
        this.uuB = this.uuD;
        this.uuC = this.uuE;
        return bl;
    }

    @Nullable
    public fgk_2 gzr() {
        int n = this.gzs();
        if (n != -1) {
            return this.abt(n);
        }
        return null;
    }

    public int gzs() {
        if (this.gzy()) {
            return this.uuB;
        }
        return this.uuD;
    }

    public int gzt() {
        if (this.gzy()) {
            return this.uuC;
        }
        return this.uuE;
    }

    public boolean abu(int n) {
        if (this.uuE != n) {
            this.uuE = n;
            return true;
        }
        return false;
    }

    public boolean abv(int n) {
        if (this.uuC != n) {
            this.uuC = n;
            return true;
        }
        return false;
    }

    public boolean d(fgk_2 fgk_22, int n) {
        int n2 = this.uuv.indexOf(fgk_22);
        int n3 = GC.a(n, -1, this.uux);
        if (n3 != n) {
            uuu.debug((Object)"setSelectionEnd avec une valeur d'index invalide : ", (Throwable)new Exception());
            n = n3;
        }
        boolean bl = n2 != this.uuD || this.uuE != n;
        this.uuD = n2;
        this.uuE = n;
        return bl;
    }

    public boolean gzu() {
        boolean bl = this.uuD != this.uuB || this.uuE != this.uuC;
        this.uuD = this.uuB;
        this.uuE = this.uuC;
        return bl;
    }

    public boolean dUD() {
        return this.uuB != -1 && this.uuD != -1;
    }

    public boolean gzv() {
        return this.uuB == this.uuD && this.uuC == this.uuE;
    }

    @Nullable
    public String gzw() {
        if (!this.dUD() || this.gzv()) {
            return null;
        }
        int n = this.gzo();
        int n2 = this.gzs();
        int n3 = this.gzp();
        int n4 = this.gzt();
        if (n == n2) {
            fgk_2 fgk_22 = this.gzn();
            if (fgk_22 != null && fgk_22.gzE() == ahr_2.dSC) {
                String string = ((fgm_1)fgk_22).dDG();
                return string.substring(n3, n4);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = n; i <= n2; ++i) {
                fgk_2 fgk_23 = this.abt(i);
                if (fgk_23.gzE() != ahr_2.dSC) continue;
                String string = ((fgm_1)fgk_23).dDG();
                if (i == n) {
                    stringBuilder.append(string.substring(n3));
                    continue;
                }
                if (i == n2) {
                    stringBuilder.append(string.substring(0, n4));
                    continue;
                }
                stringBuilder.append(string);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public void a(awx_1 awx_12) {
        this.uuG = awx_12;
    }

    public awx_1 gyc() {
        return this.uuG;
    }

    public boolean isUseHighContrast() {
        return this.tFH;
    }

    public void setUseHighContrast(boolean bl) {
        this.tFH = bl;
    }

    public abstract String gyi();

    public boolean tY(@NotNull String string) {
        return string.equals(this.gyi());
    }

    public abstract void tZ(String var1);

    public abstract void ua(String var1);

    @Override
    @NotNull
    public Iterator<fgk_2> iterator() {
        return this.uuv.iterator();
    }

    public boolean gzx() {
        boolean bl = this.uuD != -1 || this.uuB != -1 || this.uuE != 0 || this.uuC != 0;
        this.uuB = -1;
        this.uuC = 0;
        this.uuD = -1;
        this.uuE = 0;
        return bl;
    }

    private boolean gzy() {
        if (!this.dUD()) {
            return false;
        }
        if (this.uuD < this.uuB) {
            return true;
        }
        return this.uuB == this.uuD && this.uuE < this.uuC;
    }

    public boolean ug(String string) {
        fgk_2 fgk_22;
        boolean bl;
        int n;
        int n2;
        int n3;
        fgk_2 fgk_23;
        block9: {
            int n4;
            int n5;
            block8: {
                if (!(this.dUD() || !string.isEmpty() && Objects.equals(fgm_1.c(string, this.gzk()), string))) {
                    return false;
                }
                fgk_23 = this.gzn();
                n3 = this.gzo();
                n5 = this.gzs();
                n2 = this.gzp();
                n4 = this.gzt();
                n = 0;
                bl = false;
                if (n3 != n5) break block8;
                fgk_22 = this.gzn();
                if (fgk_22 == null) break block9;
                n = n4 - n2;
                if (!fgk_22.ha(n2, n4)) break block9;
                this.c(fgk_22);
                bl = true;
                break block9;
            }
            for (int i = n5; i >= n3; --i) {
                fgk_2 fgk_24 = this.abt(i);
                if (i == n3) {
                    n += fgk_24.aPs() - 1 - n2;
                    if (!fgk_24.abx(n2)) continue;
                    this.c(fgk_24);
                    bl = true;
                    continue;
                }
                if (i == n5) {
                    n += n4 + 1;
                    if (!fgk_24.aby(n4)) continue;
                    this.c(fgk_24);
                    continue;
                }
                n += fgk_24.aPs();
                this.c(fgk_24);
            }
        }
        this.uux -= n;
        if (fgk_23.gzE() == ahr_2.dSC) {
            fgk_22 = (fgm_1)fgk_23;
        } else {
            fgk_22 = new fgm_1(this, null, false);
            bl = true;
        }
        int n6 = ((fgm_1)fgk_22).A(string, n2);
        if (bl) {
            this.a(n3, fgk_22);
        }
        this.uux += n6;
        if (this.uux > this.uuw) {
            int n7 = this.uux - this.uuw;
            ((fgm_1)fgk_22).ha(n2, n2 + n7);
            n6 -= n7;
            this.uux -= n7;
        }
        this.c(fgk_22, n2);
        this.gzu();
        this.abw(n6);
        this.gzq();
        return true;
    }

    public boolean gzz() {
        boolean bl = this.gzv() ? this.gzC() : false;
        boolean bl2 = this.ug("");
        return bl2 || bl;
    }

    public boolean gzA() {
        boolean bl = this.gzv() ? this.gzB() : false;
        boolean bl2 = this.ug("");
        return bl2 || bl;
    }

    public boolean abw(int n) {
        boolean bl = false;
        for (int i = 0; i < n; ++i) {
            bl |= this.gzB();
        }
        return bl;
    }

    public boolean gzB() {
        fgk_2 fgk_22 = this.abt(this.uuD);
        if (fgk_22 == null) {
            return false;
        }
        if (this.uuE + 1 <= fgk_22.aPs()) {
            ++this.uuE;
            return true;
        }
        if (fgk_22 == this.gzm()) {
            return false;
        }
        ++this.uuD;
        this.uuE = 1;
        return true;
    }

    public boolean gzC() {
        fgk_2 fgk_22 = this.abt(this.uuD);
        if (fgk_22 == null) {
            return false;
        }
        if (this.uuE - 1 >= 0) {
            --this.uuE;
            return true;
        }
        if (fgk_22 == this.gzl()) {
            return false;
        }
        fgk_2 fgk_23 = this.abt(this.uuD - 1);
        if (fgk_23 == null) {
            return false;
        }
        --this.uuD;
        this.uuE = fgk_23.aPs() - 1;
        return true;
    }

    public int gzD() {
        return this.uuv.size();
    }

    public int gZ(int n, int n2) {
        String string = this.gyi().substring(n, n2);
        int n3 = 0;
        for (char c2 : string.toCharArray()) {
            n3 += this.gyc().e(c2);
        }
        return n3;
    }

    public void clean() {
        for (fgk_2 fgk_22 : this.uuv) {
            fgk_22.clean();
        }
        this.uuv.clear();
    }
}

