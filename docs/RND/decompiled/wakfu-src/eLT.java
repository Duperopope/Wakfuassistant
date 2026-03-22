/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class eLT<EC extends Qk<enk_0>>
implements eLO {
    private static final Logger qLU = Logger.getLogger(eLT.class);
    protected final EC qLV;
    protected final int qLW;
    protected final short qLX;
    protected final boolean qLY;
    protected final ArrayList<String> qLZ;
    protected final ArrayList<String> qMa;
    protected final eLN qMb;
    protected final int qMc;
    protected boolean qMd;
    protected boolean qMe;
    private boolean qMf;

    public eLT(EC EC, int n, short s) {
        this.qLV = EC;
        this.qLW = n;
        this.qLX = s;
        this.qLY = true;
        this.qMa = null;
        this.qLZ = null;
        this.qMb = eLN.qJo;
        this.qMc = 0;
        this.qMd = false;
        this.qMe = false;
    }

    public eLT(EC EC, int n, short s, boolean bl, ArrayList<String> arrayList, ArrayList<String> arrayList2, eLN eLN2, int n2) {
        this.qLV = EC;
        this.qLW = n;
        this.qLX = s;
        this.qLY = bl;
        this.qLZ = arrayList;
        this.qMa = arrayList2;
        this.qMb = eLN2;
        this.qMc = n2;
        this.qMd = false;
        this.qMe = false;
    }

    @Override
    public ArrayList<String> fzQ() {
        ArrayList<String> arrayList = new ArrayList<String>();
        short s = this.qLX;
        eLN eLN2 = this.qMb;
        int n = this.qMc;
        int n2 = this.qLW;
        this.Z(arrayList);
        if (this.qLY) {
            Object object = this.qLV;
            if (object != null) {
                boolean bl = true;
                boolean bl2 = true;
                emo_0 emo_02 = new emo_0();
                int n3 = -1;
                Object object2 = this.h(object).iterator();
                while (object2.hasNext()) {
                    eLS eLS2;
                    int n4;
                    enk_0 enk_02 = object2.next();
                    if (enk_02 == null) {
                        qLU.error((Object)"Effet null", (Throwable)new Exception());
                        continue;
                    }
                    float f2 = enk_02.eb(s);
                    if (f2 < 0.0f || s > enk_02.fAw() || s < enk_02.fAv() || enk_02.df(1L) && eLN2 == eLN.qJo || !enk_02.df(1L) && eLN2 == eLN.qJp) continue;
                    ahv_2 ahv_22 = eLL.qJd.ceG();
                    int n5 = enk_02.avZ();
                    Optional<Integer> optional = eLL.qJe.Av(n5);
                    if (optional.isPresent()) {
                        ahv_22.c("[").af(optional.get()).c("]");
                    }
                    if (enk_02.df(1L) && bl2) {
                        bl2 = false;
                        if (eLN2 == eLN.qJn) {
                            arrayList.add(eLL.qJd.ceG().ceu().c(eLL.imR.c(eLL.gMK, new Object[0])).cev().ceL());
                        }
                    }
                    if ((n4 = this.a(enk_02, ahv_22, eLS2 = eLL.Rw(n5))) == -1) continue;
                    bl = false;
                    String string = this.k(ahv_22.ceL(), enk_02);
                    if ((string = eLT.so(string)).isEmpty()) continue;
                    String[] stringArray = string.split("\n");
                    if (emo_02.Ry(enk_02.avZ())) {
                        if (n3 == -1) {
                            n3 = arrayList.size();
                        }
                        emo_02.a(enk_02, stringArray[0], s);
                        continue;
                    }
                    Collections.addAll(arrayList, stringArray);
                }
                if (n3 != -1) {
                    arrayList.addAll(n3, emo_02.b(eLL.imR));
                }
                if (bl) {
                    return arrayList;
                }
                if (eLL.imR.e(n, n2) && !((String)(object2 = eLL.imR.a(n, (long)n2, new Object[0]))).isEmpty()) {
                    arrayList.add((String)object2);
                }
            }
        } else if (eLL.imR.e(n, n2)) {
            arrayList.add(eLL.imR.a(n, (long)n2, new Object[0]));
        }
        if (!(this.qLZ == null && this.qMa == null || arrayList.isEmpty() || eLN2 != eLN.qJn)) {
            arrayList.add(eLL.qJd.ceG().ceu().c(eLL.imR.c(eLL.gQc, new Object[0])).cev().ceL());
            if (this.qLZ != null) {
                arrayList.addAll(this.qLZ);
            }
            if (this.qMa != null) {
                for (String string : this.qMa) {
                    arrayList.add(eLL.qJe.a(eLL.qJd.ceG(), string).ceL());
                }
            }
        }
        this.aa(arrayList);
        return arrayList;
    }

    private <EC extends Qk<enk_0>> List<enk_0> h(EC EC) {
        ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
        ArrayList<enk_0> arrayList2 = new ArrayList<enk_0>();
        for (enk_0 enk_02 : EC) {
            if (enk_02.df(1L)) {
                arrayList2.add(enk_02);
                continue;
            }
            arrayList.add(enk_02);
        }
        if (this.qMb == eLN.qJo) {
            return arrayList;
        }
        if (this.qMb == eLN.qJp) {
            return arrayList2;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    protected int a(enk_0 enk_02, ahv_2 ahv_22, eLS eLS2) {
        return eLS2.a(ahv_22, enk_02, this);
    }

    public static String so(String string) {
        ahv_2 ahv_22 = eLL.qJd.ceG();
        int n = 0;
        Matcher matcher = eLL.qIM.matcher(string);
        try {
            while (matcher.find()) {
                int n2 = 0;
                String string2 = matcher.group(1);
                if (matcher.groupCount() == 4 && string2 != null) {
                    n2 = Bw.m(Character.valueOf(string2.charAt(0)));
                }
                Number number = NumberFormat.getInstance(eLL.imR.aUXX().aUJ()).parse(matcher.group(2));
                float f2 = number.floatValue();
                String string3 = matcher.group(4);
                Matcher matcher2 = eLL.qIL.matcher(string3);
                while (matcher2.find()) {
                    char c2 = matcher2.group(1).charAt(0);
                    float f3 = Float.parseFloat(matcher2.group(2));
                    switch (c2) {
                        case '+': {
                            f2 += f3;
                            break;
                        }
                        case '-': {
                            f2 -= f3;
                            break;
                        }
                        case '*': {
                            f2 *= f3;
                            break;
                        }
                        case '/': {
                            f2 /= f3;
                        }
                    }
                }
                ahv_22.a(string, n, matcher.start());
                if (n2 == 0) {
                    ahv_22.yx(GC.A(f2));
                } else if (n2 > 0) {
                    ahv_22.ei(GC.a(f2, n2));
                }
                n = matcher.end();
            }
        }
        catch (Exception exception) {
            return "Error";
        }
        ahv_22.a(string, n, string.length());
        return ahv_22.toString();
    }

    @Override
    public void Z(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public void aa(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public String k(@NotNull String string, @NotNull enk_0 enk_02) {
        return string;
    }

    @Override
    public int d() {
        return this.qLW;
    }

    public EC fzR() {
        return this.qLV;
    }

    @Override
    public short cmL() {
        return this.qLX;
    }

    @Override
    public boolean cvG() {
        return this.qLY;
    }

    @Override
    public boolean q(enk_0 enk_02) {
        return (enk_02.cxB() || eLL.qJe.cZz()) && enk_02.fAv() <= this.qLX && enk_02.fAw() >= this.qLX;
    }

    @Override
    public ArrayList<String> fzT() {
        return this.qLZ;
    }

    @Override
    public ArrayList<String> fzU() {
        return this.qMa;
    }

    @Override
    public eLN fzV() {
        return this.qMb;
    }

    @Override
    public int fzW() {
        return this.qMc;
    }

    @Override
    public void lK(boolean bl) {
        this.qMd = bl;
    }

    @Override
    public boolean fzS() {
        return this.qMd;
    }

    @Override
    public boolean fzX() {
        return this.qMe;
    }

    @Override
    public void lL(boolean bl) {
        this.qMe = bl;
    }

    @Override
    public boolean fzY() {
        return this.qMf;
    }

    @Override
    public void lM(boolean bl) {
        this.qMf = bl;
    }
}

