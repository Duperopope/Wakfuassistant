/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aAv
 */
public class aav_2
implements Comparable {
    public static final aav_2 dwB = new aav_2(0, 0);
    public int dwC;
    public int dwD;

    public aav_2() {
    }

    public aav_2(int n, int n2) {
        this.dwC = n;
        this.dwD = n2;
    }

    public float bTY() {
        int n = this.dwC + this.dwD;
        if (n == 0) {
            return 0.0f;
        }
        return (float)this.dwD / (float)n;
    }

    public int compareTo(@NotNull Object object) {
        if (object == this) {
            return 0;
        }
        if (!(object instanceof aav_2)) {
            return 1;
        }
        aav_2 aav_22 = (aav_2)object;
        float f2 = this.bTY();
        float f3 = aav_22.bTY();
        return Float.compare(f2, f3);
    }

    public boolean bTZ() {
        return false;
    }

    public int bUa() {
        return -1;
    }

    public int bUb() {
        return -1;
    }
}

