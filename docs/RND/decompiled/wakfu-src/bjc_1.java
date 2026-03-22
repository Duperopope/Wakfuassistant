/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from bjc
 */
public class bjc_1 {
    public static final float imZ = 0.003921569f;
    private final axb_2 ina;

    public bjc_1(float f2, float f3, float f4) {
        this.ina = new awx_2(f2, f3, f4, 1.0f);
    }

    public bjc_1(int n) {
        this.ina = new awx_2(n);
    }

    public float aIU() {
        return this.ina.aIU();
    }

    public float aIV() {
        return this.ina.aIV();
    }

    public float aIW() {
        return this.ina.aIW();
    }

    public axb_2 getColor() {
        return this.ina;
    }

    public float[] dqY() {
        return new float[]{this.ev(this.aIU()), this.ev(this.aIV()), this.ev(this.aIW()), 1.0f};
    }

    private float ev(float f2) {
        return Math.max(f2, 0.003921569f) * 1.25f;
    }

    public static void a(bjc_1 bjc_12, ZC zC, arx_1 arx_12, boolean bl) {
        bjc_1.a(bjc_12, zC, arx_12.bHJ(), bl);
    }

    private static void a(bjc_1 bjc_12, ZC zC, int n, boolean bl) {
        float[] fArray = bjc_12 != null ? bjc_12.dqY() : null;
        zC.a(n, fArray, bl);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return Objects.equals(this.ina, ((bjc_1)object).ina);
    }

    public int hashCode() {
        return this.ina.hashCode();
    }

    public String toString() {
        return "CharacterColor{m_color=" + String.valueOf(this.ina) + "}";
    }
}

