/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Sh
 */
public abstract class sh_0<Item extends RT>
implements Sp {
    protected static final Logger bnJ = Logger.getLogger(sh_0.class);

    @Override
    public final void b(Sl sl) {
        switch (sl.bfB()) {
            case bnZ: 
            case boa: {
                Sn sn = (Sn)sl;
                this.a(sn.bfD(), sn);
                return;
            }
            case bob: 
            case boc: {
                Sn sn = (Sn)sl;
                this.q(sn.bfD());
                return;
            }
            case bod: {
                Sn sn = (Sn)sl;
                this.e(sn.bfD(), sn.bfd());
                return;
            }
        }
        throw new UnsupportedOperationException("Event " + String.valueOf((Object)sl.bfB()) + " non pris en compte par ce visiteur");
    }

    protected void a(Item Item, Sn sn) {
    }

    protected void q(Item Item) {
    }

    protected void e(Item Item, short s) {
    }
}

