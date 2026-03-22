/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

public final class nG
extends GeneratedMessageV3.Builder<nG>
implements nI {
    private int an;
    private Object bs = "";
    private long nW;
    private long wf;
    private boolean NQ;
    private Object Oj = "null";
    private Object Ol = "";
    private int oq;
    private int mj;
    private long DJ;
    private int Oq;
    private int Os;
    private int Ou;
    private long Ow;
    private Object Oy = "null";
    private int OA;
    private int OC;
    private int OE;
    private long OG;
    private Object OI = "null";
    private boolean OK;
    private Object OM = "";
    private boolean OO;
    private Object OQ = "";
    private boolean OS;
    private long OU = -1L;
    private long OW = -1L;
    private int OY;
    private long Pa = -1L;
    private MapField<Integer, Integer> Pc;

    public static final Descriptors.Descriptor arR() {
        return nd_0.NZ;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 29: {
                return this.arI();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 29: {
                return this.asy();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nd_0.Oa.ensureFieldAccessorsInitialized(nE.class, nG.class);
    }

    nG() {
        this.D();
    }

    nG(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (nE.aJ()) {
            // empty if block
        }
    }

    public nG arS() {
        super.clear();
        this.bs = "";
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.an &= 0xFFFFFFFD;
        this.wf = 0L;
        this.an &= 0xFFFFFFFB;
        this.NQ = false;
        this.an &= 0xFFFFFFF7;
        this.Oj = "null";
        this.an &= 0xFFFFFFEF;
        this.Ol = "";
        this.an &= 0xFFFFFFDF;
        this.oq = 0;
        this.an &= 0xFFFFFFBF;
        this.mj = 0;
        this.an &= 0xFFFFFF7F;
        this.DJ = 0L;
        this.an &= 0xFFFFFEFF;
        this.Oq = 0;
        this.an &= 0xFFFFFDFF;
        this.Os = 0;
        this.an &= 0xFFFFFBFF;
        this.Ou = 0;
        this.an &= 0xFFFFF7FF;
        this.Ow = 0L;
        this.an &= 0xFFFFEFFF;
        this.Oy = "null";
        this.an &= 0xFFFFDFFF;
        this.OA = 0;
        this.an &= 0xFFFFBFFF;
        this.OC = 0;
        this.an &= 0xFFFF7FFF;
        this.OE = 0;
        this.an &= 0xFFFEFFFF;
        this.OG = 0L;
        this.an &= 0xFFFDFFFF;
        this.OI = "null";
        this.an &= 0xFFFBFFFF;
        this.OK = false;
        this.an &= 0xFFF7FFFF;
        this.OM = "";
        this.an &= 0xFFEFFFFF;
        this.OO = false;
        this.an &= 0xFFDFFFFF;
        this.OQ = "";
        this.an &= 0xFFBFFFFF;
        this.OS = false;
        this.an &= 0xFF7FFFFF;
        this.OU = -1L;
        this.an &= 0xFEFFFFFF;
        this.OW = -1L;
        this.an &= 0xFDFFFFFF;
        this.OY = 0;
        this.an &= 0xFBFFFFFF;
        this.Pa = -1L;
        this.an &= 0xF7FFFFFF;
        this.asy().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nd_0.NZ;
    }

    public nE arQ() {
        return nE.arP();
    }

    public nE arT() {
        nE nE2 = this.arU();
        if (!nE2.isInitialized()) {
            throw nG.newUninitializedMessageException((Message)nE2);
        }
        return nE2;
    }

    public nE arU() {
        nE nE2 = new nE(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        nE2.bs = this.bs;
        if ((n & 2) != 0) {
            nE2.nW = this.nW;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            nE2.wf = this.wf;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            nE2.NQ = this.NQ;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            n2 |= 0x10;
        }
        nE2.Oj = this.Oj;
        if ((n & 0x20) != 0) {
            n2 |= 0x20;
        }
        nE2.Ol = this.Ol;
        if ((n & 0x40) != 0) {
            nE2.oq = this.oq;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            nE2.mj = this.mj;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            nE2.DJ = this.DJ;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            nE2.Oq = this.Oq;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            nE2.Os = this.Os;
            n2 |= 0x400;
        }
        if ((n & 0x800) != 0) {
            nE2.Ou = this.Ou;
            n2 |= 0x800;
        }
        if ((n & 0x1000) != 0) {
            nE2.Ow = this.Ow;
            n2 |= 0x1000;
        }
        if ((n & 0x2000) != 0) {
            n2 |= 0x2000;
        }
        nE2.Oy = this.Oy;
        if ((n & 0x4000) != 0) {
            nE2.OA = this.OA;
            n2 |= 0x4000;
        }
        if ((n & 0x8000) != 0) {
            nE2.OC = this.OC;
            n2 |= 0x8000;
        }
        if ((n & 0x10000) != 0) {
            nE2.OE = this.OE;
            n2 |= 0x10000;
        }
        if ((n & 0x20000) != 0) {
            nE2.OG = this.OG;
            n2 |= 0x20000;
        }
        if ((n & 0x40000) != 0) {
            n2 |= 0x40000;
        }
        nE2.OI = this.OI;
        if ((n & 0x80000) != 0) {
            nE2.OK = this.OK;
            n2 |= 0x80000;
        }
        if ((n & 0x100000) != 0) {
            n2 |= 0x100000;
        }
        nE2.OM = this.OM;
        if ((n & 0x200000) != 0) {
            nE2.OO = this.OO;
            n2 |= 0x200000;
        }
        if ((n & 0x400000) != 0) {
            n2 |= 0x400000;
        }
        nE2.OQ = this.OQ;
        if ((n & 0x800000) != 0) {
            nE2.OS = this.OS;
            n2 |= 0x800000;
        }
        if ((n & 0x1000000) != 0) {
            n2 |= 0x1000000;
        }
        nE2.OU = this.OU;
        if ((n & 0x2000000) != 0) {
            n2 |= 0x2000000;
        }
        nE2.OW = this.OW;
        if ((n & 0x4000000) != 0) {
            nE2.OY = this.OY;
            n2 |= 0x4000000;
        }
        if ((n & 0x8000000) != 0) {
            n2 |= 0x8000000;
        }
        nE2.Pa = this.Pa;
        nE2.Pc = this.arI();
        nE2.Pc.makeImmutable();
        nE2.an = n2;
        this.onBuilt();
        return nE2;
    }

    public nG arV() {
        return (nG)super.clone();
    }

    public nG fq(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nG)super.setField(fieldDescriptor, object);
    }

    public nG ci(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nG)super.clearField(fieldDescriptor);
    }

    public nG ci(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nG)super.clearOneof(oneofDescriptor);
    }

    public nG ci(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nG)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nG fr(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nG)super.addRepeatedField(fieldDescriptor, object);
    }

    public nG ci(Message message) {
        if (message instanceof nE) {
            return this.c((nE)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nG c(nE nE2) {
        if (nE2 == nE.arP()) {
            return this;
        }
        if (nE2.wq()) {
            this.an |= 1;
            this.bs = nE2.bs;
            this.onChanged();
        }
        if (nE2.xk()) {
            this.bF(nE2.xl());
        }
        if (nE2.KT()) {
            this.bG(nE2.KU());
        }
        if (nE2.aqg()) {
            this.W(nE2.aqh());
        }
        if (nE2.aqM()) {
            this.an |= 0x10;
            this.Oj = nE2.Oj;
            this.onChanged();
        }
        if (nE2.aqP()) {
            this.an |= 0x20;
            this.Ol = nE2.Ol;
            this.onChanged();
        }
        if (nE2.xS()) {
            this.jp(nE2.xT());
        }
        if (nE2.tK()) {
            this.jq(nE2.tL());
        }
        if (nE2.XZ()) {
            this.bH(nE2.Ya());
        }
        if (nE2.aqS()) {
            this.jr(nE2.aqT());
        }
        if (nE2.aqU()) {
            this.js(nE2.aqV());
        }
        if (nE2.aqW()) {
            this.jt(nE2.aqX());
        }
        if (nE2.aqY()) {
            this.bI(nE2.aqZ());
        }
        if (nE2.ara()) {
            this.an |= 0x2000;
            this.Oy = nE2.Oy;
            this.onChanged();
        }
        if (nE2.ard()) {
            this.ju(nE2.are());
        }
        if (nE2.arf()) {
            this.jv(nE2.arg());
        }
        if (nE2.arh()) {
            this.jw(nE2.ari());
        }
        if (nE2.arj()) {
            this.bJ(nE2.ark());
        }
        if (nE2.arl()) {
            this.an |= 0x40000;
            this.OI = nE2.OI;
            this.onChanged();
        }
        if (nE2.aro()) {
            this.X(nE2.arp());
        }
        if (nE2.arq()) {
            this.an |= 0x100000;
            this.OM = nE2.OM;
            this.onChanged();
        }
        if (nE2.art()) {
            this.Y(nE2.aru());
        }
        if (nE2.arv()) {
            this.an |= 0x400000;
            this.OQ = nE2.OQ;
            this.onChanged();
        }
        if (nE2.ary()) {
            this.Z(nE2.arz());
        }
        if (nE2.arA()) {
            this.bK(nE2.arB());
        }
        if (nE2.arC()) {
            this.bL(nE2.arD());
        }
        if (nE2.arE()) {
            this.jx(nE2.arF());
        }
        if (nE2.arG()) {
            this.bM(nE2.arH());
        }
        this.asy().mergeFrom(nE2.arI());
        this.fr(nE.b(nE2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.wq()) {
            return false;
        }
        if (!this.xk()) {
            return false;
        }
        return this.KT();
    }

    public nG iA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nE nE2 = null;
        try {
            nE2 = (nE)nE.Pe.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nE2 = (nE)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nE2 != null) {
                this.c(nE2);
            }
        }
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 1) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bs = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nG ab(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public nG arW() {
        this.an &= 0xFFFFFFFE;
        this.bs = nE.arP().getName();
        this.onChanged();
        return this;
    }

    public nG dD(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 2) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public nG bF(long l) {
        this.an |= 2;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public nG arX() {
        this.an &= 0xFFFFFFFD;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean KT() {
        return (this.an & 4) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public nG bG(long l) {
        this.an |= 4;
        this.wf = l;
        this.onChanged();
        return this;
    }

    public nG arY() {
        this.an &= 0xFFFFFFFB;
        this.wf = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqg() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean aqh() {
        return this.NQ;
    }

    public nG W(boolean bl) {
        this.an |= 8;
        this.NQ = bl;
        this.onChanged();
        return this;
    }

    public nG arZ() {
        this.an &= 0xFFFFFFF7;
        this.NQ = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqM() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String aqN() {
        Object object = this.Oj;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.Oj = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aqO() {
        Object object = this.Oj;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Oj = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nG ac(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.Oj = string;
        this.onChanged();
        return this;
    }

    public nG asa() {
        this.an &= 0xFFFFFFEF;
        this.Oj = nE.arP().aqN();
        this.onChanged();
        return this;
    }

    public nG dE(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.Oj = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqP() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public String aqQ() {
        Object object = this.Ol;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.Ol = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aqR() {
        Object object = this.Ol;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Ol = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nG ad(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.Ol = string;
        this.onChanged();
        return this;
    }

    public nG asb() {
        this.an &= 0xFFFFFFDF;
        this.Ol = nE.arP().aqQ();
        this.onChanged();
        return this;
    }

    public nG dF(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.Ol = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public nG jp(int n) {
        this.an |= 0x40;
        this.oq = n;
        this.onChanged();
        return this;
    }

    public nG asc() {
        this.an &= 0xFFFFFFBF;
        this.oq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public nG jq(int n) {
        this.an |= 0x80;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public nG asd() {
        this.an &= 0xFFFFFF7F;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean XZ() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public long Ya() {
        return this.DJ;
    }

    public nG bH(long l) {
        this.an |= 0x100;
        this.DJ = l;
        this.onChanged();
        return this;
    }

    public nG ase() {
        this.an &= 0xFFFFFEFF;
        this.DJ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqS() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int aqT() {
        return this.Oq;
    }

    public nG jr(int n) {
        this.an |= 0x200;
        this.Oq = n;
        this.onChanged();
        return this;
    }

    public nG asf() {
        this.an &= 0xFFFFFDFF;
        this.Oq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqU() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int aqV() {
        return this.Os;
    }

    public nG js(int n) {
        this.an |= 0x400;
        this.Os = n;
        this.onChanged();
        return this;
    }

    public nG asg() {
        this.an &= 0xFFFFFBFF;
        this.Os = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqW() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int aqX() {
        return this.Ou;
    }

    public nG jt(int n) {
        this.an |= 0x800;
        this.Ou = n;
        this.onChanged();
        return this;
    }

    public nG ash() {
        this.an &= 0xFFFFF7FF;
        this.Ou = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqY() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public long aqZ() {
        return this.Ow;
    }

    public nG bI(long l) {
        this.an |= 0x1000;
        this.Ow = l;
        this.onChanged();
        return this;
    }

    public nG asi() {
        this.an &= 0xFFFFEFFF;
        this.Ow = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ara() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public String arb() {
        Object object = this.Oy;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.Oy = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString arc() {
        Object object = this.Oy;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Oy = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nG ae(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x2000;
        this.Oy = string;
        this.onChanged();
        return this;
    }

    public nG asj() {
        this.an &= 0xFFFFDFFF;
        this.Oy = nE.arP().arb();
        this.onChanged();
        return this;
    }

    public nG dG(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x2000;
        this.Oy = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ard() {
        return (this.an & 0x4000) != 0;
    }

    @Override
    public int are() {
        return this.OA;
    }

    public nG ju(int n) {
        this.an |= 0x4000;
        this.OA = n;
        this.onChanged();
        return this;
    }

    public nG ask() {
        this.an &= 0xFFFFBFFF;
        this.OA = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arf() {
        return (this.an & 0x8000) != 0;
    }

    @Override
    public int arg() {
        return this.OC;
    }

    public nG jv(int n) {
        this.an |= 0x8000;
        this.OC = n;
        this.onChanged();
        return this;
    }

    public nG asl() {
        this.an &= 0xFFFF7FFF;
        this.OC = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arh() {
        return (this.an & 0x10000) != 0;
    }

    @Override
    public int ari() {
        return this.OE;
    }

    public nG jw(int n) {
        this.an |= 0x10000;
        this.OE = n;
        this.onChanged();
        return this;
    }

    public nG asm() {
        this.an &= 0xFFFEFFFF;
        this.OE = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arj() {
        return (this.an & 0x20000) != 0;
    }

    @Override
    public long ark() {
        return this.OG;
    }

    public nG bJ(long l) {
        this.an |= 0x20000;
        this.OG = l;
        this.onChanged();
        return this;
    }

    public nG asn() {
        this.an &= 0xFFFDFFFF;
        this.OG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arl() {
        return (this.an & 0x40000) != 0;
    }

    @Override
    public String arm() {
        Object object = this.OI;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.OI = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString arn() {
        Object object = this.OI;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.OI = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nG af(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x40000;
        this.OI = string;
        this.onChanged();
        return this;
    }

    public nG aso() {
        this.an &= 0xFFFBFFFF;
        this.OI = nE.arP().arm();
        this.onChanged();
        return this;
    }

    public nG dH(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x40000;
        this.OI = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aro() {
        return (this.an & 0x80000) != 0;
    }

    @Override
    public boolean arp() {
        return this.OK;
    }

    public nG X(boolean bl) {
        this.an |= 0x80000;
        this.OK = bl;
        this.onChanged();
        return this;
    }

    public nG asp() {
        this.an &= 0xFFF7FFFF;
        this.OK = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arq() {
        return (this.an & 0x100000) != 0;
    }

    @Override
    public String arr() {
        Object object = this.OM;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.OM = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString ars() {
        Object object = this.OM;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.OM = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nG ag(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x100000;
        this.OM = string;
        this.onChanged();
        return this;
    }

    public nG asq() {
        this.an &= 0xFFEFFFFF;
        this.OM = nE.arP().arr();
        this.onChanged();
        return this;
    }

    public nG dI(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x100000;
        this.OM = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean art() {
        return (this.an & 0x200000) != 0;
    }

    @Override
    public boolean aru() {
        return this.OO;
    }

    public nG Y(boolean bl) {
        this.an |= 0x200000;
        this.OO = bl;
        this.onChanged();
        return this;
    }

    public nG asr() {
        this.an &= 0xFFDFFFFF;
        this.OO = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arv() {
        return (this.an & 0x400000) != 0;
    }

    @Override
    public String arw() {
        Object object = this.OQ;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.OQ = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString arx() {
        Object object = this.OQ;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.OQ = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nG ah(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x400000;
        this.OQ = string;
        this.onChanged();
        return this;
    }

    public nG ass() {
        this.an &= 0xFFBFFFFF;
        this.OQ = nE.arP().arw();
        this.onChanged();
        return this;
    }

    public nG dJ(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x400000;
        this.OQ = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ary() {
        return (this.an & 0x800000) != 0;
    }

    @Override
    public boolean arz() {
        return this.OS;
    }

    public nG Z(boolean bl) {
        this.an |= 0x800000;
        this.OS = bl;
        this.onChanged();
        return this;
    }

    public nG ast() {
        this.an &= 0xFF7FFFFF;
        this.OS = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arA() {
        return (this.an & 0x1000000) != 0;
    }

    @Override
    public long arB() {
        return this.OU;
    }

    public nG bK(long l) {
        this.an |= 0x1000000;
        this.OU = l;
        this.onChanged();
        return this;
    }

    public nG asu() {
        this.an &= 0xFEFFFFFF;
        this.OU = -1L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arC() {
        return (this.an & 0x2000000) != 0;
    }

    @Override
    public long arD() {
        return this.OW;
    }

    public nG bL(long l) {
        this.an |= 0x2000000;
        this.OW = l;
        this.onChanged();
        return this;
    }

    public nG asv() {
        this.an &= 0xFDFFFFFF;
        this.OW = -1L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arE() {
        return (this.an & 0x4000000) != 0;
    }

    @Override
    public int arF() {
        return this.OY;
    }

    public nG jx(int n) {
        this.an |= 0x4000000;
        this.OY = n;
        this.onChanged();
        return this;
    }

    public nG asw() {
        this.an &= 0xFBFFFFFF;
        this.OY = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean arG() {
        return (this.an & 0x8000000) != 0;
    }

    @Override
    public long arH() {
        return this.Pa;
    }

    public nG bM(long l) {
        this.an |= 0x8000000;
        this.Pa = l;
        this.onChanged();
        return this;
    }

    public nG asx() {
        this.an &= 0xF7FFFFFF;
        this.Pa = -1L;
        this.onChanged();
        return this;
    }

    private MapField<Integer, Integer> arI() {
        if (this.Pc == null) {
            return MapField.emptyMapField(nH.Pf);
        }
        return this.Pc;
    }

    private MapField<Integer, Integer> asy() {
        this.onChanged();
        if (this.Pc == null) {
            this.Pc = MapField.newMapField(nH.Pf);
        }
        if (!this.Pc.isMutable()) {
            this.Pc = this.Pc.copy();
        }
        return this.Pc;
    }

    @Override
    public int arJ() {
        return this.arI().getMap().size();
    }

    @Override
    public boolean jn(int n) {
        return this.arI().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> arK() {
        return this.arL();
    }

    @Override
    public Map<Integer, Integer> arL() {
        return this.arI().getMap();
    }

    @Override
    public int g(int n, int n2) {
        Map map = this.arI().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int jo(int n) {
        Map map = this.arI().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    public nG asz() {
        this.asy().getMutableMap().clear();
        return this;
    }

    public nG jy(int n) {
        this.asy().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, Integer> asA() {
        return this.asy().getMutableMap();
    }

    public nG h(int n, int n2) {
        this.asy().getMutableMap().put(n, n2);
        return this;
    }

    public nG o(Map<Integer, Integer> map) {
        this.asy().getMutableMap().putAll(map);
        return this;
    }

    public final nG fq(UnknownFieldSet unknownFieldSet) {
        return (nG)super.setUnknownFields(unknownFieldSet);
    }

    public final nG fr(UnknownFieldSet unknownFieldSet) {
        return (nG)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fr(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fq(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fr(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ci(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ci(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ci(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fq(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.arS();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.arV();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fr(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ci(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.arS();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ci(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.arV();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fr(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fq(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fr(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ci(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ci(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ci(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fq(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.arV();
    }

    public /* synthetic */ Message buildPartial() {
        return this.arU();
    }

    public /* synthetic */ Message build() {
        return this.arT();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ci(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.arS();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.arV();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.arU();
    }

    public /* synthetic */ MessageLite build() {
        return this.arT();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.arS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.arQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.arQ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.arV();
    }

    public /* synthetic */ Object clone() {
        return this.arV();
    }
}

