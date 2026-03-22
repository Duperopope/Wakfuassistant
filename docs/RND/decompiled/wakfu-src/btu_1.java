/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bTu
 */
public class btu_1
implements aeh_2 {
    protected static final Logger loa = Logger.getLogger(btu_1.class);
    public static final String lob = "name";
    public static final String loc = "radioButtonStyle";
    public static final String lod = "radioButtonSize";
    public static final String loe = "displaySeparator";
    public static final String lof = "isSelected";
    public static final String log = "groups";
    public static final String loh = "hasGroups";
    public static final String loi = "combinedGroupsServers";
    public static final String loj = "categoryIllustrationUrl";
    public static final String lok = "categoryDescription";
    public static final String[] lol = new String[]{"name", "radioButtonStyle", "radioButtonSize", "displaySeparator", "isSelected", "groups", "hasGroups", "combinedGroupsServers"};
    private static final int lom = 300;
    private static final int lon = 44;
    @NotNull
    private final btx_1 loo;
    @NotNull
    private final ezx_0 lop;
    private final TreeMap<Integer, bty_1> loq = new TreeMap();
    private int lor;
    private int los;

    btu_1(btx_1 btx_12, @NotNull ezx_0 ezx_02) {
        this.loo = btx_12;
        this.lop = ezx_02;
    }

    @NotNull
    public btx_1 enB() {
        return this.loo;
    }

    @NotNull
    public ezx_0 enC() {
        return this.lop;
    }

    public Collection<bty_1> enD() {
        return Collections.unmodifiableCollection(this.loq.values());
    }

    Bu<bty_1, bta_2> a(@NotNull ezt_0 ezt_02, @Nullable ezy_0 ezy_02) {
        int n = ezt_02.fng().orElse(ezt_02.d());
        bty_1 bty_12 = this.loq.computeIfAbsent(n, n2 -> new bty_1(this, n, (int)n2));
        bta_2 bta_22 = bty_12.c(ezt_02, ezy_02);
        return new Bu<bty_1, bta_2>(bty_12, bta_22);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case lob -> {
                String var4_4 = this.getName();
                yield var4_4;
            }
            case loc -> {
                String var4_5 = this.enF().lox;
                yield var4_5;
            }
            case lod -> {
                fsm_1 var4_6 = new fsm_1(this.enF().loy, 44);
                yield var4_6;
            }
            case loe -> {
                Boolean var4_7 = this.lor < this.los - 1;
                yield var4_7;
            }
            case lof -> {
                Boolean var4_8 = this.lop == this.loo.enH();
                yield var4_8;
            }
            case log -> {
                List<bty_1> var4_9 = this.loq.values().stream().filter(bty_12 -> !bty_12.enT().isEmpty()).toList();
                yield var4_9;
            }
            case loh -> {
                Boolean var4_10 = this.lop == ezx_0.pvi;
                yield var4_10;
            }
            case loi -> {
                List<bta_2> var4_11 = this.enE();
                yield var4_11;
            }
            case loj -> {
                try {
                    String var5_16 = auc_0.cVq().bS("serverIllustrationPath");
                    String var4_12 = String.format(var5_16, this.lop.name());
                    yield var4_12;
                }
                catch (fu_0 var5_17) {
                    loa.warn((Object)("Error retrieving server server illustration at path : " + var5_17.getMessage()));
                    Object var4_13 = null;
                    yield var4_13;
                }
            }
            case lok -> {
                String var4_14 = aum_0.cWf().c("server.serverType.description" + this.lop.aJr(), new Object[0]);
                yield var4_14;
            }
            default -> {
                String var4_15 = null;
                yield var4_15;
            }
        };
    }

    @NotNull
    private List<bta_2> enE() {
        return this.loq.values().stream().filter(bty_12 -> !bty_12.enT().isEmpty()).flatMap(bty_12 -> bty_12.enS().stream()).toList();
    }

    private String getName() {
        return aum_0.cWf().c("server.category." + this.lop.aJr(), new Object[0]);
    }

    private btv_1 enF() {
        if (this.los == 1) {
            return btv_1.lot;
        }
        if (this.lor == 0) {
            return btv_1.lou;
        }
        if (this.lor == this.los - 1) {
            return btv_1.low;
        }
        return btv_1.lov;
    }

    void dZ(int n, int n2) {
        this.lor = n;
        this.los = n2;
    }

    @Override
    public String[] bxk() {
        return lol;
    }
}

