/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class eHZ {
    private static final Logger qud = Logger.getLogger(eHZ.class);
    private final Map<Integer, ehy_0> que = new LinkedHashMap<Integer, ehy_0>();
    private final List<eHU> quf = new ArrayList<eHU>();

    public void a(int n, ehy_0 ehy_02) {
        this.que.put(n, ehy_02);
        this.p(ehy_02);
    }

    @Nullable
    public <T extends ehy_0> T PI(int n) {
        return (T)this.que.get(n);
    }

    public int aVo() {
        return this.que.size();
    }

    @NotNull
    public ehy_0 fj(int n, int n2) {
        ehy_0 ehy_02 = new ehy_0();
        ehy_02.dz((short)n2);
        this.a(n, ehy_02);
        return ehy_02;
    }

    public void PJ(int n) {
        ehy_0 ehy_02 = this.que.remove(n);
        if (ehy_02 != null) {
            this.o(ehy_02);
        }
    }

    private void o(ehy_0 ehy_02) {
        for (eHU eHU2 : this.quf) {
            try {
                eHU2.i(ehy_02);
            }
            catch (RuntimeException runtimeException) {
                qud.error((Object)("[Builds] Error while running listener when removing aptitude sheet " + String.valueOf(ehy_02)), (Throwable)runtimeException);
            }
        }
    }

    public boolean PK(int n) {
        return this.que.containsKey(n);
    }

    @NotNull
    public @Unmodifiable Map<Integer, ehy_0> uv() {
        return Collections.unmodifiableMap(this.que);
    }

    private void p(ehy_0 ehy_02) {
        for (eHU eHU2 : this.quf) {
            try {
                eHU2.h(ehy_02);
            }
            catch (RuntimeException runtimeException) {
                qud.error((Object)("[Builds] Error while running listener when setting aptitude sheet " + String.valueOf(ehy_02)), (Throwable)runtimeException);
            }
        }
    }

    public void a(eHU eHU2) {
        if (this.quf.contains(eHU2)) {
            return;
        }
        this.quf.add(eHU2);
    }

    public void b(eHU eHU2) {
        this.quf.remove(eHU2);
    }

    public void clear() {
        this.fwg();
        this.djf();
    }

    public void fwf() {
        for (eHU eHU2 : this.quf) {
            eHU2.c(this);
        }
    }

    private void fwg() {
        this.que.clear();
    }

    private void djf() {
        this.quf.clear();
    }

    public String toString() {
        return "AptitudeSheetSet{m_aptitudeSheets=" + String.valueOf(this.que) + "}";
    }
}

