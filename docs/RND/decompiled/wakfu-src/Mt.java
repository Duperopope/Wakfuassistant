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
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Mt {
    private static final Logger aSk = Logger.getLogger(Mt.class);
    public static final String aSl = "_cleaned";
    private static final String aSm = "content";
    private static final String aSn = ".";
    protected String awN;
    private boolean aSo = true;
    private final EnumSet<Mv> aSp = EnumSet.noneOf(Mv.class);
    private final EnumMap<Mv, ResourceBundle> aSq = new EnumMap(Mv.class);
    private final EnumMap<Mv, ResourceBundle> aSr = new EnumMap(Mv.class);

    public Set<Mv> aUG() {
        return Collections.unmodifiableSet(this.aSq.keySet());
    }

    public boolean a(Collection<Mv> collection) {
        this.aSp.addAll(collection);
        this.aUI();
        return collection.stream().allMatch(this.aSq::containsKey);
    }

    public boolean a(Mv mv) {
        this.aSp.add(mv);
        this.b(mv);
        return this.aSq.containsKey((Object)mv);
    }

    public void aUH() {
        this.aSp.clear();
        this.aSq.clear();
    }

    public void cL(String string) {
        this.awN = string;
        this.aUI();
    }

    public void aL(boolean bl) {
        this.aSo = bl;
        this.aUI();
    }

    public boolean a(Mv mv, String string) {
        try {
            return this.aSq.get((Object)mv).containsKey(string);
        }
        catch (RuntimeException runtimeException) {
            aSk.warn((Object)("Unable to get value for language " + String.valueOf((Object)mv) + " and key " + string), (Throwable)runtimeException);
            return false;
        }
    }

    protected void aUI() {
        this.aSq.clear();
        for (Mv mv : this.aSp) {
            this.b(mv);
        }
    }

    private void b(Mv mv) {
        ResourceBundle resourceBundle;
        ResourceBundle resourceBundle2 = this.e(mv.aUK(), false);
        if (resourceBundle2 != null) {
            this.aSq.put(mv, resourceBundle2);
        }
        if (this.aSo && (resourceBundle = this.e(mv.aUK(), true)) != null) {
            this.aSr.put(mv, resourceBundle);
        }
    }

    /*
     * Exception decompiling
     */
    @Nullable
    protected ResourceBundle e(String var1_1, boolean var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @NotNull
    public String a(Mv mv, String string, Object ... objectArray) {
        String string2 = this.a(mv, string, false);
        return Bz.a(string2, objectArray);
    }

    @NotNull
    public String b(Mv mv, String string, Object ... objectArray) {
        String string2 = this.a(mv, string, true);
        return Bz.a(string2, objectArray);
    }

    @NotNull
    public String b(Mv mv, @NotNull String string) {
        return this.a(mv, string, false);
    }

    @NotNull
    public String a(Mv mv, @NotNull String string, boolean bl) {
        try {
            return (bl ? this.aSr : this.aSq).get((Object)mv).getString(string);
        }
        catch (RuntimeException runtimeException) {
            aSk.warn((Object)("Unable to get value for key " + string));
            return "!" + string + "!";
        }
    }

    @NotNull
    public String a(Mv mv, int n, int n2) {
        return this.a(mv, Mt.d(n, n2), false);
    }

    @NotNull
    public String b(Mv mv, int n, int n2) {
        return this.a(mv, Mt.d(n, n2), true);
    }

    @NotNull
    public String a(Mv mv, int n, long l, Object ... objectArray) {
        return this.a(mv, Mt.d(n, l), objectArray);
    }

    @NotNull
    public String b(Mv mv, int n, long l, Object ... objectArray) {
        return this.b(mv, Mt.d(n, l), objectArray);
    }

    public boolean a(Mv mv, int n, long l) {
        return this.a(mv, Mt.d(n, l));
    }

    @Nullable
    public Map<Integer, String> a(Mv mv, int n) {
        if (!this.aSq.containsKey((Object)mv)) {
            return null;
        }
        ResourceBundle resourceBundle = this.aSq.get((Object)mv);
        String string = Mt.nC(n);
        Set set = resourceBundle.keySet().stream().filter(string2 -> string2.startsWith(string)).collect(Collectors.toSet());
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        int n2 = string.length();
        for (String string3 : set) {
            int n3 = Integer.parseInt(string3.substring(n2));
            String string4 = resourceBundle.getString(string3);
            hashMap.put(n3, string4);
        }
        return hashMap;
    }

    public void b(BiConsumer<Mv, String> biConsumer) {
        this.aSq.forEach((mv, resourceBundle) -> resourceBundle.keySet().forEach(string -> biConsumer.accept((Mv)((Object)mv), (String)string)));
    }

    public static String nC(int n) {
        return "content." + n;
    }

    public static String d(int n, long l) {
        return "content." + n + aSn + l;
    }

    public String toString() {
        return "SingleLanguageTranslator{m_path='" + this.awN + "', m_languages=" + this.aSq.keySet().stream().map(Mv::aUP).collect(Collectors.joining(";")) + "}";
    }
}

