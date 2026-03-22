/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJf
 */
public interface ajf_0 {
    public static final String dZT = "AnimMarche-Mnt%d";
    public static final String dZU = "AnimCourse-Mnt%d";
    public static final String dZV = "AnimCourse-Debut-Mnt%d";
    public static final String dZW = "AnimCourse-Fin-Mnt%d";
    public static final String dZX = "AnimRelique-Saut-Mnt%d";
    public static final String dZY = "AnimStatique-Mnt%s";

    public String chl();

    public String chm();

    public String chn();

    public String cho();

    public String chp();

    public String chq();

    public sm_0 chr();

    public static String yG(int n) {
        return String.format(dZY, n);
    }

    public static String yH(int n) {
        return String.format(dZT, n);
    }

    public static String yI(int n) {
        return String.format(dZU, n);
    }
}

