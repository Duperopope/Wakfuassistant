/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from amX
 */
public abstract class amx_1 {
    private static final amy_1 cJu = new amy_1();
    private boolean cJv = true;
    private String cJw;

    public boolean bDA() {
        return this.cJv;
    }

    public void cI(boolean bl) {
        this.cJv = bl;
    }

    public String bDB() {
        return this.cJw;
    }

    public void fk(String string) {
        this.cJw = StringUtils.substring((String)string, (int)1, (int)(string.length() - 1));
    }

    protected List<amz_1[]> bDC() {
        return Lists.newArrayList();
    }

    public byte r(List<amx_1> list) {
        List<amz_1[]> list2 = Optional.ofNullable(this.getClass().getAnnotation(Criterion.class)).map(cJu).orElse(this.bDC());
        if (list == null) {
            return -1;
        }
        for (byte by = 0; by < list2.size(); by = (byte)(by + 1)) {
            amz_1[] amz_1Array = list2.get(by);
            boolean bl = true;
            boolean bl2 = false;
            int n = 0;
            int n2 = amz_1Array.length - 1;
            for (int n3 = 0; n3 < list.size(); n3 = (int)((byte)(n3 + 1))) {
                boolean bl3;
                if (n > n2) {
                    bl2 = true;
                    break;
                }
                amz_1 amz_12 = list.get(n3).bDv();
                if (amz_1Array[n] == amz_1.cJA && amz_12 != amz_1.cJA) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list.size()) {
                        if (amz_12 != amz_1.cJy) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (amz_1Array[n] == amz_1.cJB) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list.size()) {
                        if (amz_12 != amz_1.cJx) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (amz_12 != amz_1Array[n]) {
                    bl2 = true;
                    break;
                }
                n = (byte)(n + 1);
            }
            if (bl2 || bl && list.size() != amz_1Array.length) continue;
            return by;
        }
        throw new amw_2(String.format("La fonction %s n'est pas utilis\u00e9e avec le bon nombre (ou type) d'arguments : %s", this.getClass().getName(), list.stream().map(amx_12 -> amx_12.bDv().name()).toList()));
    }

    public abstract amz_1 bDv();

    public abstract Enum bDq();
}

