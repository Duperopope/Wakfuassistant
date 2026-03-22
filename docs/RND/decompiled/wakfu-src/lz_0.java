/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from lZ
 */
public final class lz_0
extends GeneratedMessageV3.Builder<lz_0>
implements ma_0 {
    private int an;
    private Object Jw = "";
    private long nW;
    private Object bs = "";
    private Object JA = "";
    private int nt;
    private int JD;
    private int JF;
    private boolean JH;
    private ll_0 JJ;
    private SingleFieldBuilderV3<ll_0, ln_0, lo_0> JM;

    public static final Descriptors.Descriptor ajE() {
        return ls_1.Jo;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ls_1.Jp.ensureFieldAccessorsInitialized(lx_0.class, lz_0.class);
    }

    lz_0() {
        this.D();
    }

    lz_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lx_0.oV()) {
            this.ajT();
        }
    }

    public lz_0 ajF() {
        super.clear();
        this.Jw = "";
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.an &= 0xFFFFFFFD;
        this.bs = "";
        this.an &= 0xFFFFFFFB;
        this.JA = "";
        this.an &= 0xFFFFFFF7;
        this.nt = 0;
        this.an &= 0xFFFFFFEF;
        this.JD = 0;
        this.an &= 0xFFFFFFDF;
        this.JF = 0;
        this.an &= 0xFFFFFFBF;
        this.JH = false;
        this.an &= 0xFFFFFF7F;
        if (this.JM == null) {
            this.JJ = null;
        } else {
            this.JM.clear();
        }
        this.an &= 0xFFFFFEFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ls_1.Jo;
    }

    public lx_0 ajD() {
        return lx_0.ajC();
    }

    public lx_0 ajG() {
        lx_0 lx_02 = this.ajH();
        if (!lx_02.isInitialized()) {
            throw lz_0.newUninitializedMessageException((Message)lx_02);
        }
        return lx_02;
    }

    public lx_0 ajH() {
        lx_0 lx_02 = new lx_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        lx_02.Jw = this.Jw;
        if ((n & 2) != 0) {
            lx_02.nW = this.nW;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        lx_02.bs = this.bs;
        if ((n & 8) != 0) {
            n2 |= 8;
        }
        lx_02.JA = this.JA;
        if ((n & 0x10) != 0) {
            lx_02.nt = this.nt;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            lx_02.JD = this.JD;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            lx_02.JF = this.JF;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            lx_02.JH = this.JH;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            lx_02.JJ = this.JM == null ? this.JJ : (ll_0)this.JM.build();
            n2 |= 0x100;
        }
        lx_02.an = n2;
        this.onBuilt();
        return lx_02;
    }

    public lz_0 ajI() {
        return (lz_0)super.clone();
    }

    public lz_0 eK(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lz_0)super.setField(fieldDescriptor, object);
    }

    public lz_0 bS(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lz_0)super.clearField(fieldDescriptor);
    }

    public lz_0 bS(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lz_0)super.clearOneof(oneofDescriptor);
    }

    public lz_0 bS(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lz_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lz_0 eL(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lz_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public lz_0 bS(Message message) {
        if (message instanceof lx_0) {
            return this.d((lx_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lz_0 d(lx_0 lx_02) {
        if (lx_02 == lx_0.ajC()) {
            return this;
        }
        if (lx_02.ajl()) {
            this.an |= 1;
            this.Jw = lx_02.Jw;
            this.onChanged();
        }
        if (lx_02.xk()) {
            this.bc(lx_02.xl());
        }
        if (lx_02.wq()) {
            this.an |= 4;
            this.bs = lx_02.bs;
            this.onChanged();
        }
        if (lx_02.AL()) {
            this.an |= 8;
            this.JA = lx_02.JA;
            this.onChanged();
        }
        if (lx_02.wo()) {
            this.hQ(lx_02.wp());
        }
        if (lx_02.ajq()) {
            this.hR(lx_02.ajr());
        }
        if (lx_02.ajs()) {
            this.hS(lx_02.ajt());
        }
        if (lx_02.aju()) {
            this.R(lx_02.ajv());
        }
        if (lx_02.ajw()) {
            this.e(lx_02.ajx());
        }
        this.eL(lx_0.c(lx_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.ajl()) {
            return false;
        }
        return !this.ajw() || this.ajx().isInitialized();
    }

    public lz_0 hE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lx_0 lx_02 = null;
        try {
            lx_02 = (lx_0)lx_0.JL.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lx_02 = (lx_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lx_02 != null) {
                this.d(lx_02);
            }
        }
        return this;
    }

    @Override
    public boolean ajl() {
        return (this.an & 1) != 0;
    }

    @Override
    public String ajm() {
        Object object = this.Jw;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.Jw = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString ajn() {
        Object object = this.Jw;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Jw = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public lz_0 R(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.Jw = string;
        this.onChanged();
        return this;
    }

    public lz_0 ajJ() {
        this.an &= 0xFFFFFFFE;
        this.Jw = lx_0.ajC().ajm();
        this.onChanged();
        return this;
    }

    public lz_0 dd(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.Jw = byteString;
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

    public lz_0 bc(long l) {
        this.an |= 2;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public lz_0 ajK() {
        this.an &= 0xFFFFFFFD;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 4) != 0;
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

    public lz_0 S(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public lz_0 ajL() {
        this.an &= 0xFFFFFFFB;
        this.bs = lx_0.ajC().getName();
        this.onChanged();
        return this;
    }

    public lz_0 de(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean AL() {
        return (this.an & 8) != 0;
    }

    @Override
    public String ajo() {
        Object object = this.JA;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.JA = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString ajp() {
        Object object = this.JA;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.JA = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public lz_0 T(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.JA = string;
        this.onChanged();
        return this;
    }

    public lz_0 ajM() {
        this.an &= 0xFFFFFFF7;
        this.JA = lx_0.ajC().ajo();
        this.onChanged();
        return this;
    }

    public lz_0 df(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.JA = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wo() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int wp() {
        return this.nt;
    }

    public lz_0 hQ(int n) {
        this.an |= 0x10;
        this.nt = n;
        this.onChanged();
        return this;
    }

    public lz_0 ajN() {
        this.an &= 0xFFFFFFEF;
        this.nt = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ajq() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int ajr() {
        return this.JD;
    }

    public lz_0 hR(int n) {
        this.an |= 0x20;
        this.JD = n;
        this.onChanged();
        return this;
    }

    public lz_0 ajO() {
        this.an &= 0xFFFFFFDF;
        this.JD = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ajs() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int ajt() {
        return this.JF;
    }

    public lz_0 hS(int n) {
        this.an |= 0x40;
        this.JF = n;
        this.onChanged();
        return this;
    }

    public lz_0 ajP() {
        this.an &= 0xFFFFFFBF;
        this.JF = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aju() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public boolean ajv() {
        return this.JH;
    }

    public lz_0 R(boolean bl) {
        this.an |= 0x80;
        this.JH = bl;
        this.onChanged();
        return this;
    }

    public lz_0 ajQ() {
        this.an &= 0xFFFFFF7F;
        this.JH = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ajw() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public ll_0 ajx() {
        if (this.JM == null) {
            return this.JJ == null ? ll_0.afT() : this.JJ;
        }
        return (ll_0)this.JM.getMessage();
    }

    public lz_0 d(ll_0 ll_02) {
        if (this.JM == null) {
            if (ll_02 == null) {
                throw new NullPointerException();
            }
            this.JJ = ll_02;
            this.onChanged();
        } else {
            this.JM.setMessage((AbstractMessage)ll_02);
        }
        this.an |= 0x100;
        return this;
    }

    public lz_0 a(ln_0 ln_02) {
        if (this.JM == null) {
            this.JJ = ln_02.afY();
            this.onChanged();
        } else {
            this.JM.setMessage((AbstractMessage)ln_02.afY());
        }
        this.an |= 0x100;
        return this;
    }

    public lz_0 e(ll_0 ll_02) {
        if (this.JM == null) {
            this.JJ = (this.an & 0x100) != 0 && this.JJ != null && this.JJ != ll_0.afT() ? ll_0.a(this.JJ).c(ll_02).afZ() : ll_02;
            this.onChanged();
        } else {
            this.JM.mergeFrom((AbstractMessage)ll_02);
        }
        this.an |= 0x100;
        return this;
    }

    public lz_0 ajR() {
        if (this.JM == null) {
            this.JJ = null;
            this.onChanged();
        } else {
            this.JM.clear();
        }
        this.an &= 0xFFFFFEFF;
        return this;
    }

    public ln_0 ajS() {
        this.an |= 0x100;
        this.onChanged();
        return (ln_0)this.ajT().getBuilder();
    }

    @Override
    public lo_0 ajy() {
        if (this.JM != null) {
            return (lo_0)this.JM.getMessageOrBuilder();
        }
        return this.JJ == null ? ll_0.afT() : this.JJ;
    }

    private SingleFieldBuilderV3<ll_0, ln_0, lo_0> ajT() {
        if (this.JM == null) {
            this.JM = new SingleFieldBuilderV3((AbstractMessage)this.ajx(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.JJ = null;
        }
        return this.JM;
    }

    public final lz_0 eK(UnknownFieldSet unknownFieldSet) {
        return (lz_0)super.setUnknownFields(unknownFieldSet);
    }

    public final lz_0 eL(UnknownFieldSet unknownFieldSet) {
        return (lz_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eL(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eK(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eL(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bS(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bS(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bS(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eK(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ajF();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ajI();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eL(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bS(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ajF();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bS(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ajI();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eL(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eK(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eL(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bS(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bS(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bS(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eK(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ajI();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ajH();
    }

    public /* synthetic */ Message build() {
        return this.ajG();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bS(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ajF();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ajI();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ajH();
    }

    public /* synthetic */ MessageLite build() {
        return this.ajG();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ajF();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ajD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ajD();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ajI();
    }

    public /* synthetic */ Object clone() {
        return this.ajI();
    }
}

