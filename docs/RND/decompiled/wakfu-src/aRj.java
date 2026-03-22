/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public final class aRj
extends aRY {
    private static final Logger eJg = Logger.getLogger(aRj.class);
    public static final int eJh = 0;
    public static final int eJi = 1;
    public static final int eJj = 2;
    private final int eJk;
    private final String[] eJl;

    public aRj(int n, String ... stringArray) {
        this.eJk = n;
        this.eJl = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eJk) {
            case 0: 
            case 1: {
                return this.eJl.length == 0;
            }
            case 2: {
                return this.eJl.length == 1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.eJk) {
                case 0: {
                    this.cBS();
                    return;
                }
                case 1: {
                    this.cCy();
                    return;
                }
                case 2: {
                    this.start();
                    return;
                }
            }
        }
        catch (Exception exception) {
            eJg.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void start() {
        int n = Integer.parseInt(this.eJl[0]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)347);
        ns_02.nX(n);
        ayf_22.d(ns_02);
    }

    private void cCy() {
        ArrayList arrayList = new ArrayList();
        ewu_1.rCG.G(new ark_0(this, arrayList));
        Collections.sort(arrayList);
        aRj.jF(arrayList.size() + " challenges disponibles : ");
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            aRl aRl2 = (aRl)arrayList.get(i);
            aRj.jF(aRl2.toString());
        }
    }

    private void cBS() {
        aRj.jF("(fightchallenge | fc) (help | h) : show documentation");
        aRj.jF("(fightchallenge | fc) (list | l) : show list of available challenges");
        aRj.jF("(fightchallenge | fc) (start | s) id : launch challenge with specified id");
    }
}

