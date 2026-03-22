/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eSy
 */
public class esy_0 {
    public static final short rkE = -1;
    private short aZk;
    private short rkF;
    private short rkG;
    private short rkH;
    private boolean rkI;
    private boolean rkJ;
    private boolean rkK;
    private boolean rkL;
    private boolean rkM;
    private boolean rkN;
    private boolean rkO;
    private final ezb_0 rkP;
    private final esx_0 rkQ;

    public esy_0(@NotNull ezb_0 ezb_02, @NotNull esx_0 esx_02) {
        this.rkP = ezb_02;
        this.rkQ = esx_02;
        this.aZk = 0;
        this.rkF = (short)10;
        this.rkH = (short)-1;
        this.rkG = (short)-1;
        this.rkI = true;
        this.rkJ = false;
        this.rkK = true;
        this.rkL = false;
        this.rkN = false;
        this.rkO = false;
        this.rkM = true;
    }

    public short aWP() {
        return this.aZk;
    }

    public short fIl() {
        return this.rkG != -1 ? this.rkG : this.rkF;
    }

    public short fIm() {
        return this.rkH != -1 ? this.rkH : this.rkF;
    }

    public short fIn() {
        return this.rkF;
    }

    public boolean fIo() {
        return this.rkI;
    }

    public boolean fIp() {
        return this.rkJ;
    }

    public boolean fIq() {
        return this.rkK;
    }

    public ezb_0 fIr() {
        return this.rkP;
    }

    public esx_0 fIs() {
        return this.rkQ;
    }

    public void aT(short s) {
        this.aZk = s;
    }

    public void eq(short s) {
        this.rkF = s;
    }

    public void b(short s, short s2, short s3) {
        this.rkF = s;
        this.rkG = s2;
        this.rkH = s3;
    }

    public void ms(boolean bl) {
        this.rkI = bl;
    }

    public void mt(boolean bl) {
        this.rkJ = bl;
    }

    public void mu(boolean bl) {
        this.rkK = bl;
    }

    public boolean fIt() {
        return this.rkL;
    }

    public void mv(boolean bl) {
        this.rkL = bl;
    }

    public boolean fIu() {
        return this.rkN;
    }

    public void mw(boolean bl) {
        this.rkN = bl;
    }

    public boolean fIv() {
        return this.rkO;
    }

    public void mx(boolean bl) {
        this.rkO = bl;
    }

    public boolean fIw() {
        return this.rkM;
    }

    public void my(boolean bl) {
        this.rkM = bl;
    }
}

