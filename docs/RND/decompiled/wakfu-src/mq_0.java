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
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from mq
 */
public final class mq_0
extends GeneratedMessageV3.Builder<mq_0>
implements mr_0 {
    private int an;
    private long nW;
    private Object bs = "";
    private int KH;
    private int KJ = -1;

    public static final Descriptors.Descriptor alw() {
        return mb_0.JT;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb_0.JU.ensureFieldAccessorsInitialized(mo_0.class, mq_0.class);
    }

    mq_0() {
        this.D();
    }

    mq_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mo_0.cs()) {
            // empty if block
        }
    }

    public mq_0 alx() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        this.bs = "";
        this.an &= 0xFFFFFFFD;
        this.KH = 0;
        this.an &= 0xFFFFFFFB;
        this.KJ = -1;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mb_0.JT;
    }

    public mo_0 alv() {
        return mo_0.alu();
    }

    public mo_0 aly() {
        mo_0 mo_02 = this.alz();
        if (!mo_02.isInitialized()) {
            throw mq_0.newUninitializedMessageException((Message)mo_02);
        }
        return mo_02;
    }

    public mo_0 alz() {
        mo_0 mo_02 = new mo_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mo_02.nW = this.nW;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        mo_02.bs = this.bs;
        if ((n & 4) != 0) {
            mo_02.KH = this.KH;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            n2 |= 8;
        }
        mo_02.KJ = this.KJ;
        mo_02.an = n2;
        this.onBuilt();
        return mo_02;
    }

    public mq_0 alA() {
        return (mq_0)super.clone();
    }

    public mq_0 eS(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mq_0)super.setField(fieldDescriptor, object);
    }

    public mq_0 bW(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mq_0)super.clearField(fieldDescriptor);
    }

    public mq_0 bW(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mq_0)super.clearOneof(oneofDescriptor);
    }

    public mq_0 bW(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mq_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mq_0 eT(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mq_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public mq_0 bW(Message message) {
        if (message instanceof mo_0) {
            return this.e((mo_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mq_0 e(mo_0 mo_02) {
        if (mo_02 == mo_0.alu()) {
            return this;
        }
        if (mo_02.xk()) {
            this.bh(mo_02.xl());
        }
        if (mo_02.wq()) {
            this.an |= 2;
            this.bs = mo_02.bs;
            this.onChanged();
        }
        if (mo_02.Xw()) {
            this.ie(mo_02.alp());
        }
        if (mo_02.Xy()) {
            this.if(mo_02.alq());
        }
        this.eT(mo_0.d(mo_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.xk()) {
            return false;
        }
        return this.wq();
    }

    public mq_0 hQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mo_0 mo_02 = null;
        try {
            mo_02 = (mo_0)mo_0.KL.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mo_02 = (mo_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mo_02 != null) {
                this.e(mo_02);
            }
        }
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public mq_0 bh(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public mq_0 alB() {
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
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

    public mq_0 U(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public mq_0 alC() {
        this.an &= 0xFFFFFFFD;
        this.bs = mo_0.alu().getName();
        this.onChanged();
        return this;
    }

    public mq_0 dk(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xw() {
        return (this.an & 4) != 0;
    }

    @Override
    public int alp() {
        return this.KH;
    }

    public mq_0 ie(int n) {
        this.an |= 4;
        this.KH = n;
        this.onChanged();
        return this;
    }

    public mq_0 alD() {
        this.an &= 0xFFFFFFFB;
        this.KH = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xy() {
        return (this.an & 8) != 0;
    }

    @Override
    public int alq() {
        return this.KJ;
    }

    public mq_0 if(int n) {
        this.an |= 8;
        this.KJ = n;
        this.onChanged();
        return this;
    }

    public mq_0 alE() {
        this.an &= 0xFFFFFFF7;
        this.KJ = -1;
        this.onChanged();
        return this;
    }

    public final mq_0 eS(UnknownFieldSet unknownFieldSet) {
        return (mq_0)super.setUnknownFields(unknownFieldSet);
    }

    public final mq_0 eT(UnknownFieldSet unknownFieldSet) {
        return (mq_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eT(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eS(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eT(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bW(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bW(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bW(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eS(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.alx();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.alA();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eT(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bW(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.alx();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bW(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.alA();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eT(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eS(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eT(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bW(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bW(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bW(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eS(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.alA();
    }

    public /* synthetic */ Message buildPartial() {
        return this.alz();
    }

    public /* synthetic */ Message build() {
        return this.aly();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bW(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.alx();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.alA();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.alz();
    }

    public /* synthetic */ MessageLite build() {
        return this.aly();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.alx();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.alv();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.alv();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.alA();
    }

    public /* synthetic */ Object clone() {
        return this.alA();
    }
}

