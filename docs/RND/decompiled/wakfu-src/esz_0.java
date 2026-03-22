/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

/*
 * Renamed from eSz
 */
public class esz_0
extends esx_0 {
    public static final esx_0 rkR = new esz_0();

    private esx_0 fIx() {
        return esb_0.rkT;
    }

    private fqP<fqE> b(exP exP2, esy_0 esy_02, short s) {
        return this.fIx().a(exP2, esy_02, s);
    }

    @Override
    public fqP<fqE> a(exP exP2, esy_0 esy_02, short s) {
        fqw_0 fqw_02 = exP2.a(fqt_0.sTd, (byte)0);
        if (fqw_02 == null) {
            return this.b(exP2, esy_02, s);
        }
        fqP<? extends fqE> fqP2 = exP2.fhk();
        short s2 = esy_02.fIn();
        fqP<fqE> fqP3 = new fqP<fqE>(s2, fqP2.beS(), fqP2.beR(), true, false, false);
        Iterator iterator = fqP2.iterator();
        while (iterator.hasNext()) {
            fqE fqE2;
            fqE fqE3 = fqE2 = esy_02.fIt() ? (fqE)((fqE)iterator.next()).bff() : (fqE)iterator.next();
            if (esy_02.fIt()) {
                fqE2.di(aym_2.bSE());
            }
            if (fqE2 == null || fqE2.giP() == null || ((fqD)fqE2.giP()).eeY() && !esy_02.fIu() || !esy_02.fIw() && !Optional.ofNullable(exP2.dnM()).map(frd::gjS).orElse(new ArrayList()).contains(((fqD)fqE2.giP()).d())) continue;
            try {
                ((Sg)fqP3).b(fqE2);
            }
            catch (Exception exception) {
                rkD.error((Object)("Unable to add spellLevel " + String.valueOf(fqE2) + "to double"), (Throwable)exception);
            }
        }
        if (fqP3.aJG()) {
            return this.b(exP2, esy_02, s);
        }
        return fqP3;
    }
}

