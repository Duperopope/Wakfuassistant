/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from ls
 */
public final class ls_0
extends GeneratedMessageV3.Builder<ls_0>
implements lt_0 {
    private int an;
    private int HZ;
    private long Ib;

    public static final Descriptors.Descriptor agn() {
        return kF.FS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FT.ensureFieldAccessorsInitialized(lq_1.class, ls_0.class);
    }

    ls_0() {
        this.D();
    }

    ls_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lq_1.bg()) {
            // empty if block
        }
    }

    public ls_0 ago() {
        super.clear();
        this.HZ = 0;
        this.an &= 0xFFFFFFFE;
        this.Ib = 0L;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.FS;
    }

    public lq_1 agm() {
        return lq_1.agl();
    }

    public lq_1 agp() {
        lq_1 lq_12 = this.agq();
        if (!lq_12.isInitialized()) {
            throw ls_0.newUninitializedMessageException((Message)lq_12);
        }
        return lq_12;
    }

    public lq_1 agq() {
        lq_1 lq_12 = new lq_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            lq_12.HZ = this.HZ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            lq_12.Ib = this.Ib;
            n2 |= 2;
        }
        lq_12.an = n2;
        this.onBuilt();
        return lq_12;
    }

    public ls_0 agr() {
        return (ls_0)super.clone();
    }

    public ls_0 eu(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ls_0)super.setField(fieldDescriptor, object);
    }

    public ls_0 bK(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ls_0)super.clearField(fieldDescriptor);
    }

    public ls_0 bK(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ls_0)super.clearOneof(oneofDescriptor);
    }

    public ls_0 bK(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ls_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ls_0 ev(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ls_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ls_0 bK(Message message) {
        if (message instanceof lq_1) {
            return this.e((lq_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ls_0 e(lq_1 lq_12) {
        if (lq_12 == lq_1.agl()) {
            return this;
        }
        if (lq_12.age()) {
            this.hj(lq_12.agf());
        }
        if (lq_12.agg()) {
            this.aY(lq_12.agh());
        }
        this.ev(lq_1.d(lq_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.age()) {
            return false;
        }
        return this.agg();
    }

    public ls_0 hg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lq_1 lq_12 = null;
        try {
            lq_12 = (lq_1)lq_1.Id.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lq_12 = (lq_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lq_12 != null) {
                this.e(lq_12);
            }
        }
        return this;
    }

    @Override
    public boolean age() {
        return (this.an & 1) != 0;
    }

    @Override
    public int agf() {
        return this.HZ;
    }

    public ls_0 hj(int n) {
        this.an |= 1;
        this.HZ = n;
        this.onChanged();
        return this;
    }

    public ls_0 ags() {
        this.an &= 0xFFFFFFFE;
        this.HZ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean agg() {
        return (this.an & 2) != 0;
    }

    @Override
    public long agh() {
        return this.Ib;
    }

    public ls_0 aY(long l) {
        this.an |= 2;
        this.Ib = l;
        this.onChanged();
        return this;
    }

    public ls_0 agt() {
        this.an &= 0xFFFFFFFD;
        this.Ib = 0L;
        this.onChanged();
        return this;
    }

    public final ls_0 eu(UnknownFieldSet unknownFieldSet) {
        return (ls_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ls_0 ev(UnknownFieldSet unknownFieldSet) {
        return (ls_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ev(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eu(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ev(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bK(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bK(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bK(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eu(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ago();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.agr();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ev(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bK(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ago();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bK(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.agr();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ev(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eu(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ev(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bK(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bK(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bK(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eu(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.agr();
    }

    public /* synthetic */ Message buildPartial() {
        return this.agq();
    }

    public /* synthetic */ Message build() {
        return this.agp();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bK(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ago();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.agr();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.agq();
    }

    public /* synthetic */ MessageLite build() {
        return this.agp();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ago();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.agm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.agm();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.agr();
    }

    public /* synthetic */ Object clone() {
        return this.agr();
    }
}

