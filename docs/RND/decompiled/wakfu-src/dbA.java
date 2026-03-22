/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dbA
extends dae_0 {
    private static final Logger odG = Logger.getLogger(dbb_0.class);
    private final ciy_1 odH;
    private final ArrayList<fsX> odI;

    public dbA(ciy_1 ciy_12, ArrayList<fsX> arrayList) {
        this.odH = ciy_12;
        this.odI = arrayList;
    }

    public ciy_1 ejH() {
        return this.odH;
    }

    public ArrayList<fsX> faO() {
        return this.odI;
    }

    @Override
    public int d() {
        return 18028;
    }
}

