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
 * Renamed from Mm
 */
public final class mm_2
extends GeneratedMessageV3.Builder<mm_2>
implements mn_2 {
    private int an;
    private long aRZ;
    private ByteString aSb = ByteString.EMPTY;

    public static final Descriptors.Descriptor aUxx() {
        return mj_2.aRV;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mj_2.aRW.ensureFieldAccessorsInitialized(mk_2.class, mm_2.class);
    }

    mm_2() {
        this.D();
    }

    mm_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mk_2.aJ()) {
            // empty if block
        }
    }

    public mm_2 aUy() {
        super.clear();
        this.aRZ = 0L;
        this.an &= 0xFFFFFFFE;
        this.aSb = ByteString.EMPTY;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mj_2.aRV;
    }

    public mk_2 aUw() {
        return mk_2.aUv();
    }

    public mk_2 aUz() {
        mk_2 mk_22 = this.aUA();
        if (!mk_22.isInitialized()) {
            throw mm_2.newUninitializedMessageException((Message)mk_22);
        }
        return mk_22;
    }

    public mk_2 aUA() {
        mk_2 mk_22 = new mk_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mk_22.aRZ = this.aRZ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        mk_22.aSb = this.aSb;
        mk_22.an = n2;
        this.onBuilt();
        return mk_22;
    }

    public mm_2 aUB() {
        return (mm_2)super.clone();
    }

    public mm_2 gM(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mm_2)super.setField(fieldDescriptor, object);
    }

    public mm_2 cT(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mm_2)super.clearField(fieldDescriptor);
    }

    public mm_2 cT(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mm_2)super.clearOneof(oneofDescriptor);
    }

    public mm_2 cT(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mm_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mm_2 gN(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mm_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public mm_2 cT(Message message) {
        if (message instanceof mk_2) {
            return this.c((mk_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mm_2 c(mk_2 mk_22) {
        if (mk_22 == mk_2.aUv()) {
            return this;
        }
        if (mk_22.aUo()) {
            this.cP(mk_22.aUp());
        }
        if (mk_22.aUq()) {
            this.eD(mk_22.aUr());
        }
        this.gN(mk_2.b(mk_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aUo()) {
            return false;
        }
        return this.aUq();
    }

    public mm_2 kH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mk_2 mk_22 = null;
        try {
            mk_22 = (mk_2)mk_2.aSd.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mk_22 = (mk_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mk_22 != null) {
                this.c(mk_22);
            }
        }
        return this;
    }

    @Override
    public boolean aUo() {
        return (this.an & 1) != 0;
    }

    @Override
    public long aUp() {
        return this.aRZ;
    }

    public mm_2 cP(long l) {
        this.an |= 1;
        this.aRZ = l;
        this.onChanged();
        return this;
    }

    public mm_2 aUC() {
        this.an &= 0xFFFFFFFE;
        this.aRZ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aUq() {
        return (this.an & 2) != 0;
    }

    @Override
    public ByteString aUr() {
        return this.aSb;
    }

    public mm_2 eD(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.aSb = byteString;
        this.onChanged();
        return this;
    }

    public mm_2 aUD() {
        this.an &= 0xFFFFFFFD;
        this.aSb = mk_2.aUv().aUr();
        this.onChanged();
        return this;
    }

    public final mm_2 gM(UnknownFieldSet unknownFieldSet) {
        return (mm_2)super.setUnknownFields(unknownFieldSet);
    }

    public final mm_2 gN(UnknownFieldSet unknownFieldSet) {
        return (mm_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gN(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gM(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gN(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cT(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cT(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cT(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gM(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aUy();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aUB();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gN(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cT(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aUy();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cT(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aUB();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gN(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gM(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gN(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cT(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cT(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cT(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gM(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aUB();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aUA();
    }

    public /* synthetic */ Message build() {
        return this.aUz();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cT(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aUy();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aUB();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aUA();
    }

    public /* synthetic */ MessageLite build() {
        return this.aUz();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aUy();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aUw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aUw();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aUB();
    }

    public /* synthetic */ Object clone() {
        return this.aUB();
    }
}

