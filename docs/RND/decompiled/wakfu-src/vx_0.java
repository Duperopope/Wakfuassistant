/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from VX
 */
public abstract class vx_0<PartitionType extends vx_0> {
    public static final int bLt = 9;
    public static final int bLu = 0;
    public static final int bLv = 1;
    public static final int bLw = 2;
    public static final int bLx = 3;
    public static final int bLy = 4;
    public static final int bLz = 5;
    public static final int bLA = 6;
    public static final int bLB = 7;
    public static final int bLC = 8;
    protected int bap;
    protected int baq;
    protected int brs;
    protected int brt;
    private PartitionType[] bLD;
    private List<PartitionType> bLE;

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public int getWidth() {
        return this.brs;
    }

    public int getHeight() {
        return this.brt;
    }

    public List<PartitionType> blf() {
        return this.bLE;
    }

    public PartitionType[] blg() {
        return this.bLD;
    }

    public void a(@NotNull PartitionType[] PartitionTypeArray) {
        assert (PartitionTypeArray.length == 9);
        this.bLD = PartitionTypeArray;
        this.bLE = Arrays.asList(PartitionTypeArray);
    }

    public PartitionType qc(int n) {
        if (n >= 0 && n <= 8) {
            return this.bLD[n];
        }
        return null;
    }

    public void a(int n, PartitionType PartitionType) {
        if (n >= 0 && n <= 8) {
            this.bLD[n] = PartitionType;
        }
    }

    public boolean aG(int n, int n2) {
        int n3 = this.baq * this.brt;
        if (n2 < n3 || n2 >= n3 + this.brt) {
            return false;
        }
        int n4 = this.bap * this.brs;
        return n >= n4 && n < n4 + this.brs;
    }

    public void h(int n, int n2, int n3, int n4) {
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
        this.brt = n4;
    }
}

