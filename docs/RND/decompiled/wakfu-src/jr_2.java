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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from jR
 */
public final class jr_2
extends GeneratedMessageV3.Builder<jr_2>
implements js_2 {
    private int an;
    private long AH;
    private long Dj;
    private int Dl;
    private long Dn;
    private long jT;
    private boolean Dq;
    private ByteString Ds = ByteString.EMPTY;
    private ByteString Du = ByteString.EMPTY;
    private int oq;
    private int Dx;
    private Object bs = "";
    private long DA;
    private ByteString DC = ByteString.EMPTY;
    private ByteString DE = ByteString.EMPTY;

    public static final Descriptors.Descriptor XF() {
        return jk_2.CU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CV.ensureFieldAccessorsInitialized(jp_2.class, jr_2.class);
    }

    jr_2() {
        this.D();
    }

    jr_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jp_2.cs()) {
            // empty if block
        }
    }

    public jr_2 XG() {
        super.clear();
        this.AH = 0L;
        this.an &= 0xFFFFFFFE;
        this.Dj = 0L;
        this.an &= 0xFFFFFFFD;
        this.Dl = 0;
        this.an &= 0xFFFFFFFB;
        this.Dn = 0L;
        this.an &= 0xFFFFFFF7;
        this.jT = 0L;
        this.an &= 0xFFFFFFEF;
        this.Dq = false;
        this.an &= 0xFFFFFFDF;
        this.Ds = ByteString.EMPTY;
        this.an &= 0xFFFFFFBF;
        this.Du = ByteString.EMPTY;
        this.an &= 0xFFFFFF7F;
        this.oq = 0;
        this.an &= 0xFFFFFEFF;
        this.Dx = 0;
        this.an &= 0xFFFFFDFF;
        this.bs = "";
        this.an &= 0xFFFFFBFF;
        this.DA = 0L;
        this.an &= 0xFFFFF7FF;
        this.DC = ByteString.EMPTY;
        this.an &= 0xFFFFEFFF;
        this.DE = ByteString.EMPTY;
        this.an &= 0xFFFFDFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jk_2.CU;
    }

    public jp_2 XE() {
        return jp_2.XD();
    }

    public jp_2 XH() {
        jp_2 jp_22 = this.XI();
        if (!jp_22.isInitialized()) {
            throw jr_2.newUninitializedMessageException((Message)jp_22);
        }
        return jp_22;
    }

    public jp_2 XI() {
        jp_2 jp_22 = new jp_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jp_22.AH = this.AH;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            jp_22.Dj = this.Dj;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            jp_22.Dl = this.Dl;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            jp_22.Dn = this.Dn;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            jp_22.jT = this.jT;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            jp_22.Dq = this.Dq;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            n2 |= 0x40;
        }
        jp_22.Ds = this.Ds;
        if ((n & 0x80) != 0) {
            n2 |= 0x80;
        }
        jp_22.Du = this.Du;
        if ((n & 0x100) != 0) {
            jp_22.oq = this.oq;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            jp_22.Dx = this.Dx;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            n2 |= 0x400;
        }
        jp_22.bs = this.bs;
        if ((n & 0x800) != 0) {
            jp_22.DA = this.DA;
            n2 |= 0x800;
        }
        if ((n & 0x1000) != 0) {
            n2 |= 0x1000;
        }
        jp_22.DC = this.DC;
        if ((n & 0x2000) != 0) {
            n2 |= 0x2000;
        }
        jp_22.DE = this.DE;
        jp_22.an = n2;
        this.onBuilt();
        return jp_22;
    }

    public jr_2 XJ() {
        return (jr_2)super.clone();
    }

    public jr_2 dI(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jr_2)super.setField(fieldDescriptor, object);
    }

    public jr_2 br(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jr_2)super.clearField(fieldDescriptor);
    }

    public jr_2 br(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jr_2)super.clearOneof(oneofDescriptor);
    }

    public jr_2 br(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jr_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jr_2 dJ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jr_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public jr_2 br(Message message) {
        if (message instanceof jp_2) {
            return this.c((jp_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jr_2 c(jp_2 jp_22) {
        if (jp_22 == jp_2.XD()) {
            return this;
        }
        if (jp_22.oN()) {
            this.aF(jp_22.Sn());
        }
        if (jp_22.Xh()) {
            this.aG(jp_22.Xi());
        }
        if (jp_22.Xj()) {
            this.fL(jp_22.Xk());
        }
        if (jp_22.Xl()) {
            this.aH(jp_22.Xm());
        }
        if (jp_22.pe()) {
            this.aI(jp_22.pf());
        }
        if (jp_22.Xn()) {
            this.O(jp_22.Xo());
        }
        if (jp_22.Xp()) {
            this.cp(jp_22.Xq());
        }
        if (jp_22.sX()) {
            this.cq(jp_22.Xr());
        }
        if (jp_22.xS()) {
            this.fM(jp_22.xT());
        }
        if (jp_22.Xs()) {
            this.fN(jp_22.Xt());
        }
        if (jp_22.wq()) {
            this.an |= 0x400;
            this.bs = jp_22.bs;
            this.onChanged();
        }
        if (jp_22.Xu()) {
            this.aJ(jp_22.Xv());
        }
        if (jp_22.Xw()) {
            this.cs(jp_22.Xx());
        }
        if (jp_22.Xy()) {
            this.ct(jp_22.Xz());
        }
        this.dJ(jp_2.b(jp_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.Xh()) {
            return false;
        }
        if (!this.Xj()) {
            return false;
        }
        if (!this.Xl()) {
            return false;
        }
        if (!this.pe()) {
            return false;
        }
        if (!this.Xn()) {
            return false;
        }
        if (!this.Xp()) {
            return false;
        }
        if (!this.sX()) {
            return false;
        }
        if (!this.xS()) {
            return false;
        }
        if (!this.Xs()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.Xu()) {
            return false;
        }
        if (!this.Xw()) {
            return false;
        }
        return this.Xy();
    }

    public jr_2 gb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jp_2 jp_22 = null;
        try {
            jp_22 = (jp_2)jp_2.DG.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jp_22 = (jp_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jp_22 != null) {
                this.c(jp_22);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    public jr_2 aF(long l) {
        this.an |= 1;
        this.AH = l;
        this.onChanged();
        return this;
    }

    public jr_2 XK() {
        this.an &= 0xFFFFFFFE;
        this.AH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xh() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    public jr_2 aG(long l) {
        this.an |= 2;
        this.Dj = l;
        this.onChanged();
        return this;
    }

    public jr_2 XL() {
        this.an &= 0xFFFFFFFD;
        this.Dj = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xj() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Xk() {
        return this.Dl;
    }

    public jr_2 fL(int n) {
        this.an |= 4;
        this.Dl = n;
        this.onChanged();
        return this;
    }

    public jr_2 XM() {
        this.an &= 0xFFFFFFFB;
        this.Dl = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xl() {
        return (this.an & 8) != 0;
    }

    @Override
    public long Xm() {
        return this.Dn;
    }

    public jr_2 aH(long l) {
        this.an |= 8;
        this.Dn = l;
        this.onChanged();
        return this;
    }

    public jr_2 XN() {
        this.an &= 0xFFFFFFF7;
        this.Dn = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
    }

    public jr_2 aI(long l) {
        this.an |= 0x10;
        this.jT = l;
        this.onChanged();
        return this;
    }

    public jr_2 XO() {
        this.an &= 0xFFFFFFEF;
        this.jT = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xn() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean Xo() {
        return this.Dq;
    }

    public jr_2 O(boolean bl) {
        this.an |= 0x20;
        this.Dq = bl;
        this.onChanged();
        return this;
    }

    public jr_2 XP() {
        this.an &= 0xFFFFFFDF;
        this.Dq = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xp() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public ByteString Xq() {
        return this.Ds;
    }

    public jr_2 cp(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x40;
        this.Ds = byteString;
        this.onChanged();
        return this;
    }

    public jr_2 XQ() {
        this.an &= 0xFFFFFFBF;
        this.Ds = jp_2.XD().Xq();
        this.onChanged();
        return this;
    }

    @Override
    public boolean sX() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public ByteString Xr() {
        return this.Du;
    }

    public jr_2 cq(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x80;
        this.Du = byteString;
        this.onChanged();
        return this;
    }

    public jr_2 XR() {
        this.an &= 0xFFFFFF7F;
        this.Du = jp_2.XD().Xr();
        this.onChanged();
        return this;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public jr_2 fM(int n) {
        this.an |= 0x100;
        this.oq = n;
        this.onChanged();
        return this;
    }

    public jr_2 XS() {
        this.an &= 0xFFFFFEFF;
        this.oq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xs() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int Xt() {
        return this.Dx;
    }

    public jr_2 fN(int n) {
        this.an |= 0x200;
        this.Dx = n;
        this.onChanged();
        return this;
    }

    public jr_2 XT() {
        this.an &= 0xFFFFFDFF;
        this.Dx = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 0x400) != 0;
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

    public jr_2 I(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x400;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public jr_2 XU() {
        this.an &= 0xFFFFFBFF;
        this.bs = jp_2.XD().getName();
        this.onChanged();
        return this;
    }

    public jr_2 cr(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x400;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xu() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public long Xv() {
        return this.DA;
    }

    public jr_2 aJ(long l) {
        this.an |= 0x800;
        this.DA = l;
        this.onChanged();
        return this;
    }

    public jr_2 XV() {
        this.an &= 0xFFFFF7FF;
        this.DA = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xw() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public ByteString Xx() {
        return this.DC;
    }

    public jr_2 cs(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x1000;
        this.DC = byteString;
        this.onChanged();
        return this;
    }

    public jr_2 XW() {
        this.an &= 0xFFFFEFFF;
        this.DC = jp_2.XD().Xx();
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xy() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public ByteString Xz() {
        return this.DE;
    }

    public jr_2 ct(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x2000;
        this.DE = byteString;
        this.onChanged();
        return this;
    }

    public jr_2 XX() {
        this.an &= 0xFFFFDFFF;
        this.DE = jp_2.XD().Xz();
        this.onChanged();
        return this;
    }

    public final jr_2 dI(UnknownFieldSet unknownFieldSet) {
        return (jr_2)super.setUnknownFields(unknownFieldSet);
    }

    public final jr_2 dJ(UnknownFieldSet unknownFieldSet) {
        return (jr_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dJ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dI(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dJ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.br(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.br(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.br(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dI(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.XG();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.XJ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dJ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.br(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.XG();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.br(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.XJ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dJ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dI(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dJ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.br(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.br(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.br(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dI(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.XJ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.XI();
    }

    public /* synthetic */ Message build() {
        return this.XH();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.br(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.XG();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.XJ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.XI();
    }

    public /* synthetic */ MessageLite build() {
        return this.XH();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.XG();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.XE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.XE();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.XJ();
    }

    public /* synthetic */ Object clone() {
        return this.XJ();
    }
}

