/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Font;
import java.util.Objects;

/*
 * Renamed from avN
 */
@Deprecated
public class avn_2
implements awh_2 {
    private final Font dhW;
    private final boolean dhX;
    private final awl_2 dhY;
    private int dhZ;
    private int dia;

    public avn_2(Font font, boolean bl, awl_2 awl_22) {
        this.dhW = font;
        this.dhX = bl;
        this.dhY = awl_22;
    }

    @Override
    public awh_2 c(int n, float f2, boolean bl) {
        if (!awk_2.dj(bl)) {
            return null;
        }
        Font font = this.dhW.deriveFont(n, f2);
        avn_2 avn_22 = new avn_2(font, this.dhX, this.dhY);
        avn_22.cc(this.dhZ, this.dia);
        return avn_22;
    }

    @Override
    public float bNe() {
        return this.dhW.getSize2D();
    }

    @Override
    public int bNf() {
        int n = 0;
        if (this.dhW.isBold()) {
            n |= 1;
        }
        if (this.dhW.isItalic()) {
            n |= 2;
        }
        return n;
    }

    @Override
    public short bNg() {
        return 0;
    }

    public final Font bNh() {
        return this.dhW;
    }

    public final boolean bNi() {
        return this.dhX;
    }

    public awl_2 bNj() {
        return this.dhY;
    }

    @Override
    public void cc(int n, int n2) {
        this.dhZ = n;
        this.dia = n2;
    }

    public int getDeltaX() {
        return this.dhZ;
    }

    public int getDeltaY() {
        return this.dia;
    }

    @Override
    public boolean bNk() {
        return false;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        avn_2 avn_22 = (avn_2)object;
        if (this.dhZ != avn_22.dhZ) {
            return false;
        }
        if (this.dia != avn_22.dia) {
            return false;
        }
        if (this.dhX != avn_22.dhX) {
            return false;
        }
        if (this.dhY != avn_22.dhY) {
            return false;
        }
        return Objects.equals(this.dhW, avn_22.dhW);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.dhW, this.dhX, this.dhY, this.dhZ, this.dia});
    }
}

