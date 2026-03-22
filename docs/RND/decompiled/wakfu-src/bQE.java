/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bQE
implements aeh_2 {
    public static final String kWb = "isNewEntry";
    private final bRf kWc;
    private ciy_1 kWd;

    private bQE(bRf bRf2) {
        this.kWc = bRf2.ekz();
    }

    public static bQE a(bRf bRf2) {
        return new bQE(bRf2);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kWb)) {
            return this.kWd.eLe() == ciz_1.ndW;
        }
        return this.kWc.eu(string);
    }

    public String getName() {
        return this.kWc.getName();
    }

    public bRf ejG() {
        return this.kWc;
    }

    public ciy_1 ejH() {
        return this.kWd;
    }

    public void a(ciy_1 ciy_12) {
        this.kWd = ciy_12;
    }
}

