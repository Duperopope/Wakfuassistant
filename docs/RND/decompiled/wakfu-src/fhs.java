/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public final class fhs
extends Enum<fhs> {
    public static final /* enum */ fhs sos = new fhs(eIi.qvx, (Map<ffS, Integer>)ImmutableMap.builder().build());
    public static final /* enum */ fhs sot = new fhs(eIi.qvy, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20696).build());
    public static final /* enum */ fhs sou = new fhs(eIi.qvz, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20697).build());
    public static final /* enum */ fhs sov = new fhs(eIi.qvA, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20698).build());
    public static final /* enum */ fhs sow = new fhs(eIi.qvB, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20699).build());
    public static final /* enum */ fhs sox = new fhs(eIi.qvC, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20700).build());
    public static final /* enum */ fhs soy = new fhs(eIi.qvD, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20701).build());
    public static final /* enum */ fhs soz = new fhs(eIi.qvE, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20702).build());
    public static final /* enum */ fhs soA = new fhs(eIi.qvF, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20703).build());
    public static final /* enum */ fhs soB = new fhs(eIi.qvG, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20704).build());
    public static final /* enum */ fhs soC = new fhs(eIi.qvH, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20705).build());
    public static final /* enum */ fhs soD = new fhs(eIi.qvI, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20706).build());
    public static final /* enum */ fhs soE = new fhs(eIi.qvJ, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)20707).build());
    public static final /* enum */ fhs soF = new fhs(eIi.qvK, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)22126).build());
    public static final /* enum */ fhs soG = new fhs(eIi.qvL, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)29391).build());
    public static final /* enum */ fhs soH = new fhs(eIi.qvM, (Map<ffS, Integer>)ImmutableMap.builder().put((Object)ffS.sgS, (Object)32312).build());
    private final eIi soI;
    private final Map<ffS, Integer> soJ;
    private static final /* synthetic */ fhs[] soK;

    public static fhs[] values() {
        return (fhs[])soK.clone();
    }

    public static fhs valueOf(String string) {
        return Enum.valueOf(fhs.class, string);
    }

    private fhs(eIi eIi2, Map<ffS, Integer> map) {
        this.soI = eIi2;
        this.soJ = map;
    }

    public Map<ffS, Integer> fXL() {
        return this.soJ;
    }

    public Map<ffS, Long> fXM() {
        HashMap<ffS, Long> hashMap = new HashMap<ffS, Long>();
        for (Map.Entry<ffS, Integer> entry : this.soJ.entrySet()) {
            hashMap.put(entry.getKey(), (long)entry.getValue());
        }
        return hashMap;
    }

    public short cmL() {
        return this.soI.cmL();
    }

    public static fhs eW(short s) {
        fhs fhs2 = null;
        for (fhs fhs3 : fhs.values()) {
            if (fhs3.soI.cmL() == s) {
                return fhs3;
            }
            int n = s - fhs3.soI.cmL();
            if (fhs2 == null) {
                fhs2 = fhs3;
                continue;
            }
            if (n <= 0 || n >= s - fhs2.soI.cmL()) continue;
            fhs2 = fhs3;
        }
        return fhs2;
    }

    private static /* synthetic */ fhs[] fXN() {
        return new fhs[]{sos, sot, sou, sov, sow, sox, soy, soz, soA, soB, soC, soD, soE, soF, soG, soH};
    }

    static {
        soK = fhs.fXN();
    }
}

