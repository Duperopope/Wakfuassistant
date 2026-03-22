/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class bKZ {
    private static final Logger kro = Logger.getLogger(bKZ.class);
    private static final bKZ krp = new bKZ();
    public static final byte krq = 5;
    public static final byte krr = 0;
    public static final byte krs = 1;
    public static final byte krt = 2;
    public static final byte kru = 3;
    public static final byte krv = 4;
    public final TIntObjectHashMap<String> krw = new TIntObjectHashMap(45);

    private bKZ() {
        this.cb((byte)0);
        this.cb((byte)1);
        this.cb((byte)2);
        this.cb((byte)4);
        this.cc((byte)3);
        this.krw.compact();
    }

    private void cb(byte by) {
        String string = this.cd(by);
        for (byte by2 = 0; by2 < 5; by2 = (byte)(by2 + 1)) {
            this.krw.put(GC.a(by, by2, (byte)0, (byte)0), (Object)(string + by2));
        }
    }

    private void cc(byte by) {
        String string = this.cd(by);
        for (byte by2 = 0; by2 < 5; by2 = (byte)((byte)(by2 + 1))) {
            for (byte by3 = 0; by3 < 5; by3 = (byte)(by3 + 1)) {
                this.krw.put(GC.a(by, by2, by3, (byte)0), (Object)(string + by2 + "_" + by3));
            }
        }
    }

    private String cd(byte by) {
        switch (by) {
            case 0: {
                return "AnimMort";
            }
            case 1: {
                return "AnimPousse";
            }
            case 2: {
                return "AnimEtape";
            }
            case 4: {
                return "AnimHit";
            }
            case 3: {
                return "AnimRegression";
            }
        }
        kro.error((Object)("type d'animation inconnue " + by));
        return "";
    }

    public String h(byte by, byte by2) {
        if (by2 >= 5) {
            return this.cd(by) + by2;
        }
        return (String)this.krw.get(GC.a(by, by2, (byte)0, (byte)0));
    }

    public String b(byte by, byte by2, byte by3) {
        if (by2 >= 5 || by3 >= 5) {
            return this.cd(by) + by2 + "_" + by3;
        }
        return (String)this.krw.get(GC.a(by, by2, by3, (byte)0));
    }

    public static bKZ ecp() {
        return krp;
    }
}

