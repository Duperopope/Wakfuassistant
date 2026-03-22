/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Unmodifiable;

class bOW
implements bot_0 {
    public final String kNU;
    private final bot_0 kNV;
    private final int kNW;
    private final int kNX;
    private int hQx = 1;
    private final List<bpt_1<?, ?>> kNY = new ArrayList();

    bOW(String string, bot_0 bot_02, int n, int n2) {
        this.kNU = string;
        this.kNV = bot_02;
        this.kNW = n;
        this.kNX = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void c(long l, @Unmodifiable List<bpt_1<?, ?>> list) {
        boolean bl = (long)this.hQx * 100L < l;
        this.kNY.addAll(list);
        if (bl) {
            ++this.hQx;
            bOU.b(this, this.kNU, this.hQx, 100);
            return;
        }
        Class<bOU> clazz = bOU.class;
        synchronized (bOU.class) {
            bOU.kNS.put(this.kNU, this.kNY);
            byj_2.a(this.kNV::c, this.kNY, this.kNW, this.kNX);
            // ** MonitorExit[var5_4] (shouldn't be in output)
            return;
        }
    }

    @Override
    public void cXM() {
        this.kNV.cXM();
    }

    @Generated
    public String ehQ() {
        return this.kNU;
    }

    @Generated
    public bot_0 ehR() {
        return this.kNV;
    }

    @Generated
    public int ehS() {
        return this.kNW;
    }

    @Generated
    public int bDw() {
        return this.kNX;
    }

    @Generated
    public int dfz() {
        return this.hQx;
    }

    @Generated
    public List<bpt_1<?, ?>> ehT() {
        return this.kNY;
    }
}

