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

public final class eH
extends GeneratedMessageV3.Builder<eH>
implements eI {
    private int an;
    private int nt;
    private Object bs = "";
    private int mj;
    private int nx;
    private boolean nz;

    public static final Descriptors.Descriptor wA() {
        return eE.np;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eE.nq.ensureFieldAccessorsInitialized(eF.class, eH.class);
    }

    eH() {
        this.D();
    }

    eH(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (eF.oV()) {
            // empty if block
        }
    }

    public eH wB() {
        super.clear();
        this.nt = 0;
        this.an &= 0xFFFFFFFE;
        this.bs = "";
        this.an &= 0xFFFFFFFD;
        this.mj = 0;
        this.an &= 0xFFFFFFFB;
        this.nx = 0;
        this.an &= 0xFFFFFFF7;
        this.nz = false;
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eE.np;
    }

    public eF wz() {
        return eF.wy();
    }

    public eF wC() {
        eF eF2 = this.wD();
        if (!eF2.isInitialized()) {
            throw eH.newUninitializedMessageException((Message)eF2);
        }
        return eF2;
    }

    public eF wD() {
        eF eF2 = new eF(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            eF2.nt = this.nt;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        eF2.bs = this.bs;
        if ((n & 4) != 0) {
            eF2.mj = this.mj;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            eF2.nx = this.nx;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            eF2.nz = this.nz;
            n2 |= 0x10;
        }
        eF2.an = n2;
        this.onBuilt();
        return eF2;
    }

    public eH wE() {
        return (eH)super.clone();
    }

    public eH by(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eH)super.setField(fieldDescriptor, object);
    }

    public eH am(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eH)super.clearField(fieldDescriptor);
    }

    public eH am(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eH)super.clearOneof(oneofDescriptor);
    }

    public eH am(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eH)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eH bz(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eH)super.addRepeatedField(fieldDescriptor, object);
    }

    public eH am(Message message) {
        if (message instanceof eF) {
            return this.c((eF)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eH c(eF eF2) {
        if (eF2 == eF.wy()) {
            return this;
        }
        if (eF2.wo()) {
            this.bv(eF2.wp());
        }
        if (eF2.wq()) {
            this.an |= 2;
            this.bs = eF2.bs;
            this.onChanged();
        }
        if (eF2.tK()) {
            this.bw(eF2.tL());
        }
        if (eF2.wr()) {
            this.bx(eF2.ws());
        }
        if (eF2.wt()) {
            this.f(eF2.wu());
        }
        this.bz(eF.b(eF2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.wo()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.tK()) {
            return false;
        }
        return this.wr();
    }

    public eH cM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eF eF2 = null;
        try {
            eF2 = (eF)eF.nB.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eF2 = (eF)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eF2 != null) {
                this.c(eF2);
            }
        }
        return this;
    }

    @Override
    public boolean wo() {
        return (this.an & 1) != 0;
    }

    @Override
    public int wp() {
        return this.nt;
    }

    public eH bv(int n) {
        this.an |= 1;
        this.nt = n;
        this.onChanged();
        return this;
    }

    public eH wF() {
        this.an &= 0xFFFFFFFE;
        this.nt = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
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

    public eH w(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public eH wG() {
        this.an &= 0xFFFFFFFD;
        this.bs = eF.wy().getName();
        this.onChanged();
        return this;
    }

    public eH aY(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 4) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public eH bw(int n) {
        this.an |= 4;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public eH wH() {
        this.an &= 0xFFFFFFFB;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wr() {
        return (this.an & 8) != 0;
    }

    @Override
    public int ws() {
        return this.nx;
    }

    public eH bx(int n) {
        this.an |= 8;
        this.nx = n;
        this.onChanged();
        return this;
    }

    public eH wI() {
        this.an &= 0xFFFFFFF7;
        this.nx = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wt() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean wu() {
        return this.nz;
    }

    public eH f(boolean bl) {
        this.an |= 0x10;
        this.nz = bl;
        this.onChanged();
        return this;
    }

    public eH wJ() {
        this.an &= 0xFFFFFFEF;
        this.nz = false;
        this.onChanged();
        return this;
    }

    public final eH by(UnknownFieldSet unknownFieldSet) {
        return (eH)super.setUnknownFields(unknownFieldSet);
    }

    public final eH bz(UnknownFieldSet unknownFieldSet) {
        return (eH)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bz(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.by(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bz(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.am(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.am(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.am(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.by(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.wB();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.wE();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bz(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.am(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.wB();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.am(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.wE();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bz(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.by(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bz(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.am(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.am(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.am(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.by(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.wE();
    }

    public /* synthetic */ Message buildPartial() {
        return this.wD();
    }

    public /* synthetic */ Message build() {
        return this.wC();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.am(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.wB();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.wE();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.wD();
    }

    public /* synthetic */ MessageLite build() {
        return this.wC();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.wB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.wz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.wz();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.wE();
    }

    public /* synthetic */ Object clone() {
        return this.wE();
    }
}

