/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from dbL
 */
public class dbl_0
extends dae_0 {
    private ffV iWZ;
    private short bok;
    private short mZm;
    private short lZm;
    private long mZn;
    private long mZo;
    private short bol;
    private short ccg;
    private short cch;
    private bgl_0 mZw;
    private bgl_0 mZx;

    public ffV getItem() {
        return this.iWZ;
    }

    public void setItem(ffV ffV2) {
        this.iWZ = ffV2;
    }

    public short bfE() {
        return this.bok;
    }

    public void cX(short s) {
        this.bok = s;
    }

    public short getSourcePosition() {
        return this.mZm;
    }

    public void setSourcePosition(short s) {
        this.mZm = s;
    }

    public short getDestinationPosition() {
        return this.lZm;
    }

    public void setDestinationPosition(short s) {
        this.lZm = s;
    }

    public long getSourceUniqueId() {
        return this.mZn;
    }

    public void setSourceUniqueId(long l) {
        this.mZn = l;
    }

    public long getDestinationUniqueId() {
        return this.mZo;
    }

    public void setDestinationUniqueId(long l) {
        this.mZo = l;
    }

    public short bfd() {
        return this.bol;
    }

    public void ak(short s) {
        this.bol = s;
    }

    public short bsM() {
        return this.ccg;
    }

    public void cY(short s) {
        this.ccg = s;
    }

    public short bsN() {
        return this.cch;
    }

    public void cZ(short s) {
        this.cch = s;
    }

    public bgl_0 getSourceCharacter() {
        return this.mZw;
    }

    public void setSourceCharacter(bgl_0 bgl_02) {
        this.mZw = bgl_02;
    }

    public bgl_0 getDestinationCharacter() {
        return this.mZx;
    }

    public void setDestinationCharacter(bgl_0 bgl_02) {
        this.mZx = bgl_02;
    }

    public Optional<bgt_0> faW() {
        if (this.mZo > 0L) {
            return Optional.ofNullable((bgt_0)fcI.ab(bbs_2.xl(), this.mZo));
        }
        return Optional.ofNullable(this.mZx).map(bgl_02 -> (bgt_0)bgl_02.dcP());
    }
}

