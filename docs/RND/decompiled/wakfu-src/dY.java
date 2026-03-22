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

public final class dY
extends GeneratedMessageV3.Builder<dY>
implements dZ {
    private int an;
    private int mh;
    private int mj;

    public static final Descriptors.Descriptor tR() {
        return dV.md;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dV.me.ensureFieldAccessorsInitialized(dW.class, dY.class);
    }

    dY() {
        this.D();
    }

    dY(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dW.pT()) {
            // empty if block
        }
    }

    public dY tS() {
        super.clear();
        this.mh = 0;
        this.an &= 0xFFFFFFFE;
        this.mj = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dV.md;
    }

    public dW tQ() {
        return dW.tP();
    }

    public dW tT() {
        dW dW2 = this.tU();
        if (!dW2.isInitialized()) {
            throw dY.newUninitializedMessageException((Message)dW2);
        }
        return dW2;
    }

    public dW tU() {
        dW dW2 = new dW(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            dW2.mh = this.mh;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            dW2.mj = this.mj;
            n2 |= 2;
        }
        dW2.an = n2;
        this.onBuilt();
        return dW2;
    }

    public dY tV() {
        return (dY)super.clone();
    }

    public dY bi(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dY)super.setField(fieldDescriptor, object);
    }

    public dY ae(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dY)super.clearField(fieldDescriptor);
    }

    public dY ae(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dY)super.clearOneof(oneofDescriptor);
    }

    public dY ae(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dY)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dY bj(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dY)super.addRepeatedField(fieldDescriptor, object);
    }

    public dY ae(Message message) {
        if (message instanceof dW) {
            return this.c((dW)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dY c(dW dW2) {
        if (dW2 == dW.tP()) {
            return this;
        }
        if (dW2.tI()) {
            this.bf(dW2.tJ());
        }
        if (dW2.tK()) {
            this.bg(dW2.tL());
        }
        this.bj(dW.b(dW2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.tI()) {
            return false;
        }
        return this.tK();
    }

    public dY co(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dW dW2 = null;
        try {
            dW2 = (dW)dW.ml.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dW2 = (dW)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dW2 != null) {
                this.c(dW2);
            }
        }
        return this;
    }

    @Override
    public boolean tI() {
        return (this.an & 1) != 0;
    }

    @Override
    public int tJ() {
        return this.mh;
    }

    public dY bf(int n) {
        this.an |= 1;
        this.mh = n;
        this.onChanged();
        return this;
    }

    public dY tW() {
        this.an &= 0xFFFFFFFE;
        this.mh = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public dY bg(int n) {
        this.an |= 2;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public dY tX() {
        this.an &= 0xFFFFFFFD;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    public final dY bi(UnknownFieldSet unknownFieldSet) {
        return (dY)super.setUnknownFields(unknownFieldSet);
    }

    public final dY bj(UnknownFieldSet unknownFieldSet) {
        return (dY)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bj(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bi(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bj(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ae(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ae(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ae(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bi(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.tS();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.tV();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bj(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.co(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ae(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.tS();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ae(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.tV();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bj(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bi(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bj(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ae(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ae(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ae(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bi(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.co(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.tV();
    }

    public /* synthetic */ Message buildPartial() {
        return this.tU();
    }

    public /* synthetic */ Message build() {
        return this.tT();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ae(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.tS();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.co(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.tV();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.tU();
    }

    public /* synthetic */ MessageLite build() {
        return this.tT();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.tS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.tQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.tQ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.co(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.tV();
    }

    public /* synthetic */ Object clone() {
        return this.tV();
    }
}

