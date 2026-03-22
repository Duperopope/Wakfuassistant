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
 * Renamed from dK
 */
public final class dk_1
extends GeneratedMessageV3.Builder<dk_1>
implements dl_2 {
    private int an;
    private int lc;

    public static final Descriptors.Descriptor sd() {
        return df_2.jB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jC.ensureFieldAccessorsInitialized(di_2.class, dk_1.class);
    }

    dk_1() {
        this.D();
    }

    dk_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (di_2.cs()) {
            // empty if block
        }
    }

    public dk_1 se() {
        super.clear();
        this.lc = 0;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jB;
    }

    public di_2 sc() {
        return di_2.sb();
    }

    public di_2 sf() {
        di_2 di_22 = this.sg();
        if (!di_22.isInitialized()) {
            throw dk_1.newUninitializedMessageException((Message)di_22);
        }
        return di_22;
    }

    public di_2 sg() {
        di_2 di_22 = new di_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            di_22.lc = this.lc;
            n2 |= 1;
        }
        di_22.an = n2;
        this.onBuilt();
        return di_22;
    }

    public dk_1 sh() {
        return (dk_1)super.clone();
    }

    public dk_1 bc(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dk_1)super.setField(fieldDescriptor, object);
    }

    public dk_1 ab(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dk_1)super.clearField(fieldDescriptor);
    }

    public dk_1 ab(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dk_1)super.clearOneof(oneofDescriptor);
    }

    public dk_1 ab(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dk_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dk_1 bd(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dk_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public dk_1 ab(Message message) {
        if (message instanceof di_2) {
            return this.d((di_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dk_1 d(di_2 di_22) {
        if (di_22 == di_2.sb()) {
            return this;
        }
        if (di_22.rW()) {
            this.aM(di_22.rX());
        }
        this.bd(di_2.c(di_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.rW();
    }

    public dk_1 cf(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        di_2 di_22 = null;
        try {
            di_22 = (di_2)di_2.le.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            di_22 = (di_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (di_22 != null) {
                this.d(di_22);
            }
        }
        return this;
    }

    @Override
    public boolean rW() {
        return (this.an & 1) != 0;
    }

    @Override
    public int rX() {
        return this.lc;
    }

    public dk_1 aM(int n) {
        this.an |= 1;
        this.lc = n;
        this.onChanged();
        return this;
    }

    public dk_1 si() {
        this.an &= 0xFFFFFFFE;
        this.lc = 0;
        this.onChanged();
        return this;
    }

    public final dk_1 bc(UnknownFieldSet unknownFieldSet) {
        return (dk_1)super.setUnknownFields(unknownFieldSet);
    }

    public final dk_1 bd(UnknownFieldSet unknownFieldSet) {
        return (dk_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bd(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bc(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bd(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ab(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ab(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ab(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bc(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.se();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.sh();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bd(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cf(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ab(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.se();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ab(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.sh();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bd(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bc(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bd(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ab(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ab(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ab(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bc(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cf(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.sh();
    }

    public /* synthetic */ Message buildPartial() {
        return this.sg();
    }

    public /* synthetic */ Message build() {
        return this.sf();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ab(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.se();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cf(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.sh();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.sg();
    }

    public /* synthetic */ MessageLite build() {
        return this.sf();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.se();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.sc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.sc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cf(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.sh();
    }

    public /* synthetic */ Object clone() {
        return this.sh();
    }
}

