/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Rectangle;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodRequests;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fDu
 */
public class fdu_1
extends faj_1
implements fgs_2,
InputMethodListener,
InputMethodRequests {
    public static final String TAG = "TextEditor";
    public static final String ueK = "ghostText";
    public static final String ueL = "focus";
    public static final String ueM = "ghostText";
    public static final String ueN = "default";
    protected String ueO;
    protected String ueP;
    protected ffb_2<String, ?> ueQ;
    protected boolean ueR = false;
    protected boolean ueS;
    protected boolean ueT = true;
    protected boolean ueU = false;
    protected axb_2 isS = fgx_1.uto;
    protected axb_2 tFv = null;
    protected fys_0 ueV = null;
    protected fys_0 ueW = null;
    protected fys_0 ueX = null;
    @NotNull
    private final List<fga_2> ueY = new ArrayList<fga_2>();
    private final fga_2 ueZ = (string, string2) -> {
        if (this.ueS && !Objects.equals(string2, this.ueP)) {
            this.oD(false);
        }
        this.guJ();
        if (this.ueR != this.ueS) {
            this.guM();
        }
        if (!this.ueY.isEmpty()) {
            String string3 = this.ueR ? "" : string;
            String string4 = this.ueS ? "" : string2;
            this.ueY.forEach(fga_22 -> fga_22.onTextChanged(string3, string4));
        }
        this.ueR = this.ueS;
    };
    public static final int ufa = 1249389695;
    public static final int ufb = 381878489;
    public static final int ufc = 73055982;
    public static final int ufd = 1216985755;
    public static final int ufe = -336545092;
    public static final int uff = 1602416228;
    public static final int ufg = 1453943993;
    public static final int ufh = -1784789924;
    public static final int ufi = 534924003;
    public static final int ufj = 105252970;
    public static final int ufk = "listFilter".hashCode();

    @Override
    public fzq getAppearance() {
        if (this.uki instanceof fzq) {
            return (fzq)this.uki;
        }
        if (this.uki != null) {
            uxJ.warn((Object)String.format("Unexpected appearance type for %s (Expected : %s, current : %s)", this.getClass(), fzq.class, this.uki.getClass()));
            return null;
        }
        return null;
    }

    @Override
    public boolean guC() {
        return false;
    }

    @Override
    public boolean setAppearanceOnAdd() {
        return false;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fys_0) {
            if (fhv_12 instanceof fyl_0) {
                fys_0 fys_02;
                fyl_0 fyl_02 = (fyl_0)fhv_12;
                switch (fyl_02.getIdentifier()) {
                    case "ghostText": {
                        fys_02 = this.ueW;
                        this.ueW = fyl_02;
                        break;
                    }
                    case "focus": {
                        fys_02 = this.ueX;
                        this.ueX = fyl_02;
                        break;
                    }
                    default: {
                        fys_02 = this.ueV;
                        this.ueV = fyl_02;
                    }
                }
                this.a(fys_02, fyl_02);
            } else if (fhv_12 instanceof fzq) {
                fys_0 fys_03 = this.ueV;
                this.ueV = (fzq)fhv_12;
                this.a(fys_03, this.ueV);
            }
        }
        super.d(fhv_12);
    }

    protected void a(@Nullable fys_0 fys_02, @NotNull fys_0 fys_03) {
        LP lP = new LP(false);
        this.a(false, (fys_0 fys_04) -> {
            if (fys_04 != fys_03) {
                return false;
            }
            boolean bl = this.getAppearance() == fys_02;
            lP.aH(bl);
            return bl;
        });
        if (fys_02 != null && fys_02 != fys_03 && !lP.aTe()) {
            this.m(fys_02);
        }
    }

    @Override
    public void tO(String string) {
        if (string == null) {
            string = "";
        }
        if (this.ugL != null) {
            this.ugL = this.ugL + string;
        } else {
            if (this.ueO == null) {
                this.ueO = "";
            }
            this.ueO = this.ueO + string;
        }
        this.setNeedsToPreProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        return this.a(() -> {
            String string = super.setText(object);
            if (object == null && !this.ueT || this.gxE() && !Objects.equals(string, this.ueP)) {
                this.ueS = false;
            }
            if (this.ueU && object == null && this.gxE() && fhw_2.gAL().gAM() != this) {
                this.ueS = true;
                this.guL();
            }
            this.ueO = null;
            return string;
        });
    }

    @Override
    public void setTextImmediate(String string) {
        this.I(() -> super.setTextImmediate(string));
    }

    @Override
    public int getMaxCharacters() {
        return this.getTextBuilder().gyh().getMaxCharacters();
    }

    @Override
    public void setMaxCharacters(int n) {
        this.getTextBuilder().gyh().setMaxCharacters(n);
    }

    @Override
    public String getRestrict() {
        return this.getTextBuilder().gyh().getRestrict();
    }

    @Override
    public void setRestrict(String string) {
        this.getTextBuilder().gyh().setRestrict(string);
    }

    @Override
    public boolean isUnicodeRestrict() {
        return this.getTextBuilder().gyh().isUnicodeRestrict();
    }

    @Override
    public void setUnicodeRestrict(boolean bl) {
        this.getTextBuilder().gyh().setUnicodeRestrict(bl);
    }

    @Override
    public boolean isPassword() {
        return this.getTextBuilder().gyh().isPassword();
    }

    @Override
    public void setPassword(boolean bl) {
        this.getTextBuilder().gyh().setPassword(bl);
    }

    @Override
    public boolean isAutoHorizontalScrolled() {
        return this.getTextBuilder().gyg();
    }

    @Override
    public void setAutoHorizontalScrolled(boolean bl) {
        this.getTextBuilder().setAutoHorizontalScrolled(bl);
    }

    @Override
    public void setEditable(boolean bl) {
        this.getTextBuilder().setEditable(bl);
    }

    @Override
    public boolean isEditable() {
        return this.getTextBuilder().isEditable();
    }

    @Override
    public String getText() {
        if (this.ueS) {
            return "";
        }
        return super.getText();
    }

    @Override
    public String getGhostText() {
        return this.ueP;
    }

    public void clear() {
        if (this.gxE()) {
            this.guD();
        } else {
            this.setTextImmediate("");
        }
    }

    public void guD() {
        this.oC(true);
    }

    public void oC(boolean bl) {
        if (!this.gxE()) {
            return;
        }
        this.ueS = true;
        if (bl) {
            this.setTextImmediate(this.ueP);
        } else {
            this.guJ();
        }
    }

    @Override
    public void setGhostText(@Nullable Object object) {
        this.ueP = this.bb(object);
        this.guD();
    }

    @Override
    public ffb_2<String, ?> getListFilter() {
        return this.ueQ;
    }

    @Override
    public void setListFilter(ffb_2<String, ?> ffb_22) {
        this.ueQ = ffb_22;
        if (ffb_22 == null) {
            return;
        }
        this.ueQ.bc(this.getTextBuilder().gyb().getText());
    }

    @Override
    public boolean isDisplayGhostTextOnFocusLost() {
        return this.ueT;
    }

    @Override
    public void setDisplayGhostTextOnFocusLost(boolean bl) {
        this.ueT = bl;
    }

    @Override
    public boolean isReplaceNullByGhostText() {
        return this.ueU;
    }

    @Override
    public void setReplaceNullByGhostText(boolean bl) {
        this.ueU = bl;
    }

    @Override
    public boolean LZ(int n) {
        this.guE();
        return super.LZ(n);
    }

    protected void guE() {
        if (this.ueO != null) {
            this.getTextBuilder().ua(this.ueO);
            this.ueO = null;
        }
    }

    @Override
    protected void guF() {
        if (this.isGhostTextVisible() && Objects.equals(this.ugL, this.ueP)) {
            String string = this.getRestrict();
            this.setRestrict(null);
            super.guF();
            this.setRestrict(string);
        } else {
            super.guF();
        }
        if (fhw_2.gAL().gAM() == this) {
            this.guG();
        }
    }

    @Override
    public void eKI() {
        super.eKI();
        this.setFocusable(true);
    }

    @Override
    public void aVH() {
        fes_2 fes_22 = fhw_2.gAL().gAM();
        if (fes_22 == this) {
            this.guH();
        }
        super.aVH();
        this.ueY.clear();
        this.ueQ = null;
        this.isS = null;
        this.tFv = null;
        if (this.ueV != null) {
            this.ueV.gAD();
            this.ueV = null;
        }
        if (this.ueW != null) {
            this.ueW.gAD();
            this.ueW = null;
        }
        if (this.ueX != null) {
            this.ueX.gAD();
            this.ueX = null;
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        fzq fzq2 = fzq.checkOut();
        fzq2.setWidget(this);
        this.d(fzq2);
        this.setTextBuilder(new fgx_1(new fgh_2()));
        this.getTextBuilder().b(this);
        this.getTextBuilder().a(this.ueZ);
        this.getTextBuilder().setEditable(true);
        this.setSelectable(true);
        this.setAutoHorizontalScrolled(true);
        fgc_1 fgc_12 = new fgc_1(this);
        this.ugJ.a(fgc_12);
        this.ugJ.b(fgc_12);
        this.setColor(fgx_1.uto, "text");
        this.setColor(null, "ghostText");
    }

    private void guG() {
        fgj_2 fgj_22 = this.getTextBuilder().gyh();
        if (fgj_22.aJG()) {
            this.getTextBuilder().gyk();
        }
        if (!fgj_22.dUD()) {
            if (this.isSelectOnFocus()) {
                this.dUA();
            } else {
                fgk_2 fgk_22 = fgj_22.gzm();
                this.getTextBuilder().b(fgk_22, fgk_22.aPs());
                this.getTextBuilder().gyl();
            }
        }
    }

    @Override
    protected void a(fle_2 fle_22) {
        super.a(fle_22);
        if (fle_22.gDO() && this.getTextBuilder().isEditable()) {
            this.guG();
            this.guK();
            this.oF(true);
            this.guI();
        } else {
            if (this.ueT) {
                this.guL();
            }
            this.oF(false);
            this.guH();
        }
    }

    private void guH() {
        try {
            fyw_0.gqw().bmB().bAy().getInputContext().setCompositionEnabled(false);
        }
        catch (Exception exception) {
            // empty catch block
        }
        fyw_0.gqw().bmB().bAy().removeInputMethodListener(this);
        if (fyw_0.gqw().bmB().bAy().bAu() == this) {
            fyw_0.gqw().bmB().bAy().a((InputMethodRequests)null);
        }
    }

    private void guI() {
        fyw_0.gqw().bmB().bAy().a(this);
        fyw_0.gqw().bmB().bAy().addInputMethodListener(this);
        try {
            fyw_0.gqw().bmB().bAy().getInputContext().setCompositionEnabled(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    protected boolean a(fli_2 fli_22) {
        if (!(fli_22.gDR() || fli_22.gDS() || fli_22.gDU() || fli_22.gDQ() || Character.isIdentifierIgnorable(fli_22.gDW()) || fli_22.gDW() == '\uffff')) {
            fbj_1.getInstance().setKeyEventConsumed(true);
        }
        return super.a(fli_22);
    }

    @Override
    protected boolean b(fli_2 fli_22) {
        if (super.b(fli_22)) {
            switch (fli_22.bCC()) {
                case 127: {
                    fbj_1.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case 86: {
                    if (!fli_22.gDQ()) break;
                    Optional<String> optional = bh_0.aHy();
                    if (optional.isPresent() && !optional.get().isEmpty()) {
                        this.getTextBuilder().ub(optional.get());
                    }
                    fbj_1.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case 88: {
                    if (!fli_22.gDQ()) break;
                    if (!this.getTextBuilder().gyh().isPassword()) {
                        this.gsp();
                        this.getTextBuilder().ub("");
                    }
                    fbj_1.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case 65: {
                    if (!fli_22.gDQ() || fli_22.gDS()) break;
                    this.dUA();
                    fbj_1.getInstance().setKeyEventConsumed(true);
                    return false;
                }
            }
        }
        if (!(fli_22.gDR() || fli_22.gDS() || fli_22.gDU() || fli_22.gDQ() || Character.isIdentifierIgnorable(fli_22.gDW()) || fli_22.gDW() == '\uffff')) {
            fbj_1.getInstance().setKeyEventConsumed(true);
        }
        return true;
    }

    @Override
    protected boolean c(fli_2 fli_22) {
        if (!super.c(fli_22)) {
            return !fli_22.r('V') && !fli_22.r('X');
        }
        if (this.getTextBuilder().isEditable()) {
            switch (fli_22.gDW()) {
                case '\b': {
                    this.getTextBuilder().gyG();
                    return false;
                }
                case '\u007f': {
                    this.getTextBuilder().gyH();
                    fbj_1.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case '\t': {
                    return false;
                }
                case '\n': {
                    if (!this.gxI()) break;
                }
                default: {
                    this.getTextBuilder().ub(String.valueOf(fli_22.gDW()));
                    return false;
                }
            }
        }
        return true;
    }

    private void guJ() {
        if (this.ueQ == null) {
            return;
        }
        this.ueQ.bc(this.getText());
    }

    public boolean isGhostTextVisible() {
        return this.ueS;
    }

    private void guK() {
        this.oD(true);
    }

    private void oD(boolean bl) {
        if (!this.gxE() || !this.ueS) {
            return;
        }
        if (bl) {
            this.setTextImmediate("");
        }
        this.ueS = false;
    }

    private void guL() {
        this.oE(true);
    }

    private void oE(boolean bl) {
        if (this.gxJ()) {
            return;
        }
        this.oC(bl);
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equalsIgnoreCase("text")) {
            if (this.isS == axb_22) {
                return;
            }
            this.isS = axb_22;
            this.guN();
        } else if (string.equalsIgnoreCase("ghostText")) {
            if (this.tFv == axb_22) {
                return;
            }
            this.tFv = axb_22;
            this.guN();
        }
    }

    public void I(@NotNull Runnable runnable) {
        this.a(() -> {
            runnable.run();
            return true;
        });
    }

    public <T> T a(@NotNull Supplier<T> supplier) {
        boolean bl = this.isGhostTextVisible();
        T t = supplier.get();
        if (bl != this.isGhostTextVisible()) {
            this.guM();
        }
        return t;
    }

    public void guM() {
        this.oF(false);
    }

    public void oF(boolean bl) {
        this.guN();
        this.oG(bl);
    }

    public void guN() {
        fgx_1 fgx_12 = this.getTextBuilder();
        if (this.isGhostTextVisible() && this.tFv != null) {
            fgx_12.C(this.tFv);
        } else {
            fgx_12.C(this.isS);
        }
    }

    public void oG(boolean bl) {
        this.a(bl, (fys_0 fys_02) -> false);
    }

    public void a(boolean bl, @NotNull Function<fys_0, Boolean> function) {
        if (this.isGhostTextVisible() && this.ueW != null) {
            this.setAppearance(this.ueW, function.apply(this.ueW));
        } else if (bl && this.ueX != null) {
            this.setAppearance(this.ueX, function.apply(this.ueX));
        } else if (this.ueV != null) {
            this.setAppearance(this.ueV, function.apply(this.ueV));
        } else {
            uxJ.warn((Object)"Why main appearance are null ? This is not possible in nominal case...");
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fdu_1 fdu_12 = (fdu_1)fhi_22;
        super.a(fdu_12);
        fdu_12.setMaxCharacters(this.getMaxCharacters());
        fdu_12.setPassword(this.gxC());
        fdu_12.setAutoHorizontalScrolled(this.gxA());
        fdu_12.setRestrict(this.getRestrict());
        fdu_12.setUnicodeRestrict(this.gxF());
        if (this.ueO != null) {
            fdu_12.ueO = this.ueO;
        }
        if (this.ueP != null) {
            fdu_12.tX(this.getGhostText());
        }
        fdu_12.setDisplayGhostTextOnFocusLost(this.isDisplayGhostTextOnFocusLost());
        fdu_12.setReplaceNullByGhostText(this.isReplaceNullByGhostText());
        fdu_12.setColor(this.isS, null);
        fdu_12.setColor(this.tFv, "ghostText");
        fdu_12.ueV = this.ueV != null ? (fzq)this.ueV.gAK() : null;
        fdu_12.ueW = this.ueW != null ? (fzq)this.ueW.gAK() : null;
        fdu_12.ueX = this.ueX != null ? (fzq)this.ueX.gAK() : null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1249389695) {
            this.setAutoHorizontalScrolled(Bw.aK(string));
        } else if (n == 73055982 || n == 381878489) {
            this.setMaxCharacters(Bw.m(string));
        } else if (n == 1216985755) {
            this.setPassword(Bw.aK(string));
        } else if (n == -336545092) {
            this.setRestrict(fic_12.a(string, this.nQt));
        } else if (n == 1602416228) {
            this.setEditable(Bw.aK(string));
        } else if (n == -1784789924) {
            this.tX(fic_12.a(string, this.nQt));
        } else if (n == 1453943993) {
            this.setUnicodeRestrict(Bw.aK(string));
        } else if (n == 534924003) {
            this.setDisplayGhostTextOnFocusLost(Bw.aK(string));
        } else if (n == 105252970) {
            this.setReplaceNullByGhostText(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1249389695) {
            this.setAutoHorizontalScrolled(Bw.l(object));
        } else if (n == 73055982 || n == 381878489) {
            this.setMaxCharacters(Bw.m(object));
        } else if (n == 1216985755) {
            this.setPassword(Bw.l(object));
        } else if (n == -336545092) {
            this.setRestrict((String)object);
        } else if (n == 1602416228) {
            this.setEditable(Bw.l(object));
        } else if (n == -1784789924) {
            this.setGhostText(object);
        } else if (n == ufk) {
            this.setListFilter((ffb_2)object);
        } else if (n == 1453943993) {
            this.setUnicodeRestrict(Bw.l(object));
        } else if (n == 534924003) {
            this.setDisplayGhostTextOnFocusLost(Bw.l(object));
        } else if (n == 105252970) {
            this.setReplaceNullByGhostText(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public boolean a(int n, String string, fic_1 fic_12) {
        if (n != 3556653) {
            return super.a(n, string, fic_12);
        }
        this.tO(fic_12.a(string, this.nQt));
        return true;
    }

    @Override
    public boolean g(int n, Object object) {
        if (n != 3556653) {
            return super.g(n, object);
        }
        this.tO(String.valueOf(object));
        return true;
    }

    @Override
    public void inputMethodTextChanged(InputMethodEvent inputMethodEvent) {
        int n = inputMethodEvent.getCommittedCharacterCount();
        AttributedCharacterIterator attributedCharacterIterator = inputMethodEvent.getText();
        if (attributedCharacterIterator == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = attributedCharacterIterator.first();
        while (n-- > 0) {
            stringBuilder.append(c2);
            c2 = attributedCharacterIterator.next();
        }
        if (stringBuilder.length() > 0) {
            this.getTextBuilder().ub(stringBuilder.toString());
            return;
        }
        while (c2 != '\uffff') {
            stringBuilder.append(c2);
            c2 = attributedCharacterIterator.next();
        }
        this.getTextBuilder().ub(stringBuilder.toString());
        for (int i = 0; i < stringBuilder.length(); ++i) {
            this.getTextBuilder().gyJ();
        }
    }

    @Override
    public void caretPositionChanged(InputMethodEvent inputMethodEvent) {
    }

    @Override
    public Rectangle getTextLocation(TextHitInfo textHitInfo) {
        int n = fyw_0.gqw().bmB().bAR().getX();
        int n2 = fyw_0.gqw().bmB().bAR().getY();
        int n3 = fyw_0.gqw().bmB().bAR().getHeight() - this.getScreenY();
        fgj_2 fgj_22 = this.getTextBuilder().gyh();
        int n4 = fgj_22.gZ(0, fgj_22.gzt());
        return new Rectangle(n + this.getScreenX() + n4, n2 + n3, this.getWidth(), -this.getHeight() / 2);
    }

    @Override
    @Nullable
    public TextHitInfo getLocationOffset(int n, int n2) {
        int n3 = this.getTextBuilder().gyh().gzp();
        return TextHitInfo.afterOffset(n3);
    }

    @Override
    public int getInsertPositionOffset() {
        return 0;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator getCommittedText(int n, int n2, AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    public int getCommittedTextLength() {
        return 0;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator cancelLatestCommittedText(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator getSelectedText(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    public boolean a(fga_2 fga_22) {
        if (this.ueY.contains(fga_22)) {
            return false;
        }
        return this.ueY.add(fga_22);
    }

    @Override
    public boolean b(fga_2 fga_22) {
        if (!this.ueY.contains(fga_22)) {
            return false;
        }
        return this.ueY.remove(fga_22);
    }
}

