/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public sealed class Mv
extends Enum<Mv>
permits Mw {
    public static final /* enum */ Mv aVk = new Mv(0, Locale.of("fr", "FR"), "Fran\u00e7ais", true, true, true, true);
    public static final /* enum */ Mv aVl = new Mv(1, Locale.of("en", "US"), "Anglais", true, true, true, true);
    public static final /* enum */ Mv aVm = new Mv(2, Locale.of("es"), "Espagnol", true, true, true, true);
    public static final /* enum */ Mv aVn = new Mv(3, Locale.of("pt", "BR"), "Portugais", true, true, true, true);
    public static final /* enum */ Mv aVo = new Mv(8, Locale.of("de"), "Allemand", true, false, true, true);
    public static final /* enum */ Mv aVp = new Mv(9, Locale.of("it"), "Italien", true, false, true, false);
    public static final /* enum */ Mv aVq = new Mv(10, Locale.of("nl"), "Neerlandais", true, false, true, false);
    public static final /* enum */ Mv aVr = new Mw(11, Locale.of("ja", "JP"), "Japonais", false, false, false, false);
    public static final /* enum */ Mv aVs = new Mv(12, Locale.of("ja"), "Japonais", false, false, false, false);
    public static final /* enum */ Mv aVt = new Mv(13, Locale.of("ru"), "Russe", true, false, true, false);
    public static final /* enum */ Mv aVu = new Mv(14, Locale.of("ko"), "Coreen", false, false, false, false);
    public static final /* enum */ Mv aVv = new Mv(15, Locale.of("ms"), "Malay", true, false, true, false);
    public static final /* enum */ Mv aVw = new Mv(16, Locale.of("tl"), "Tagalog", true, false, true, false);
    public static final byte aVx = -1;
    public static final Mv aVy;
    public static final List<Mv> aVz;
    public static final List<Mv> aVA;
    public static final int aVB;
    private static final Logger aVC;
    public static final String aVD = ";";
    private final byte aVE;
    private final Locale aVF;
    private final String aVG;
    private final boolean aVH;
    private final boolean aVI;
    private final boolean aVJ;
    private final boolean aVK;
    private static final Map<String, Mv> aVL;
    private static final /* synthetic */ Mv[] aVM;

    public static Mv[] values() {
        return (Mv[])aVM.clone();
    }

    public static Mv valueOf(String string) {
        return Enum.valueOf(Mv.class, string);
    }

    Mv(byte by, Locale locale, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.aVE = by;
        this.aVF = locale;
        this.aVG = string2;
        this.aVH = bl;
        this.aVI = bl2;
        this.aVJ = bl3;
        this.aVK = bl4;
    }

    public Locale aUJ() {
        return this.aVF;
    }

    public String aUK() {
        return this.aVF.getLanguage().toLowerCase();
    }

    public Optional<String> aUL() {
        if (this.aVF.getCountry().isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(this.aVF.getCountry().toLowerCase());
    }

    @NotNull
    public static Mv cM(String string) {
        return Mv.f(string, false);
    }

    public static Mv f(String string, boolean bl) {
        if (string == null) {
            return bl ? null : aVy;
        }
        Mv mv = aVL.get(string.toLowerCase());
        if (mv != null || bl) {
            return mv;
        }
        aVC.warn((Object)("unknown language code: " + string));
        return aVy;
    }

    public static Mv y(byte by) {
        return Mv.z(by).orElse(aVy);
    }

    public static Optional<Mv> z(byte by) {
        for (Mv mv : Mv.values()) {
            if (mv.aVE != by) continue;
            return Optional.of(mv);
        }
        return Optional.empty();
    }

    public static boolean a(Mv[] mvArray, Mv mv) {
        if (mvArray == null || mv == null) {
            return false;
        }
        for (Mv mv2 : mvArray) {
            if (mv2 != mv) continue;
            return true;
        }
        return false;
    }

    public static byte aJ(Iterable<Mv> iterable) {
        if (iterable == null) {
            return 0;
        }
        int n = 0;
        for (Mv mv : iterable) {
            n |= 1 << mv.aVE;
        }
        return (byte)n;
    }

    public static List<Mv> A(byte by) {
        ArrayList<Mv> arrayList = new ArrayList<Mv>();
        for (Mv mv : Mv.values()) {
            if ((by & 1 << mv.aVE) <= 0) continue;
            arrayList.add(mv);
        }
        return arrayList;
    }

    public byte aJr() {
        return this.aVE;
    }

    public String getName() {
        return this.aVG;
    }

    public boolean aUM() {
        return this.aVH;
    }

    public boolean aUN() {
        return this.aVI;
    }

    public boolean aUO() {
        return this.aVJ;
    }

    public String aUP() {
        return this.aUK();
    }

    public String aUQ() {
        return this.aUL().map(string -> this.aUK() + "-" + string).orElseGet(this::aUK);
    }

    public String aUR() {
        return this.aUK();
    }

    public String aUS() {
        if (this.aVK) {
            return this.aUQ();
        }
        return aVy.aUQ();
    }

    private static /* synthetic */ Mv[] aUT() {
        return new Mv[]{aVk, aVl, aVm, aVn, aVo, aVp, aVq, aVr, aVs, aVt, aVu, aVv, aVw};
    }

    static {
        aVM = Mv.aUT();
        aVy = aVl;
        aVz = List.of(aVk, aVl, aVm, aVn);
        aVA = Arrays.stream(Mv.values()).filter(mv -> mv.aVI).collect(Collectors.toUnmodifiableList());
        aVB = aVA.size();
        aVC = Logger.getLogger(Mv.class);
        aVL = new HashMap<String, Mv>();
        for (Mv mv2 : Mv.values()) {
            aVL.put(mv2.aUP(), mv2);
        }
    }
}

