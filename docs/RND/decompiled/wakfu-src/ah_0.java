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
 * Renamed from Ah
 */
public final class ah_0
extends GeneratedMessageV3.Builder<ah_0>
implements ai_0 {
    private int an;
    private long Dj;

    public static final Descriptors.Descriptor aCf() {
        return zS.apt;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apu.ensureFieldAccessorsInitialized(Af.class, ah_0.class);
    }

    ah_0() {
        this.D();
    }

    ah_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (Af.dM()) {
            // empty if block
        }
    }

    public ah_0 aCg() {
        super.clear();
        this.Dj = 0L;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apt;
    }

    public Af aCe() {
        return Af.aCd();
    }

    public Af aCh() {
        Af af = this.aCi();
        if (!af.isInitialized()) {
            throw ah_0.newUninitializedMessageException((Message)af);
        }
        return af;
    }

    public Af aCi() {
        Af af = new Af(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            af.Dj = this.Dj;
            n2 |= 1;
        }
        af.an = n2;
        this.onBuilt();
        return af;
    }

    public ah_0 aCj() {
        return (ah_0)super.clone();
    }

    public ah_0 go(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ah_0)super.setField(fieldDescriptor, object);
    }

    public ah_0 cH(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ah_0)super.clearField(fieldDescriptor);
    }

    public ah_0 cH(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ah_0)super.clearOneof(oneofDescriptor);
    }

    public ah_0 cH(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ah_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ah_0 gp(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ah_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ah_0 cH(Message message) {
        if (message instanceof Af) {
            return this.c((Af)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ah_0 c(Af af) {
        if (af == Af.aCd()) {
            return this;
        }
        if (af.Xh()) {
            this.bY(af.Xi());
        }
        this.gp(Af.b(af));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.Xh();
    }

    public ah_0 jX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Af af = null;
        try {
            af = (Af)Af.aqg.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            af = (Af)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (af != null) {
                this.c(af);
            }
        }
        return this;
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    public ah_0 bY(long l) {
        this.an |= 1;
        this.Dj = l;
        this.onChanged();
        return this;
    }

    public ah_0 aCk() {
        this.an &= 0xFFFFFFFE;
        this.Dj = 0L;
        this.onChanged();
        return this;
    }

    public final ah_0 go(UnknownFieldSet unknownFieldSet) {
        return (ah_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ah_0 gp(UnknownFieldSet unknownFieldSet) {
        return (ah_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gp(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.go(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gp(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cH(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cH(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cH(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.go(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aCg();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aCj();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gp(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cH(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aCg();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cH(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aCj();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gp(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.go(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gp(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cH(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cH(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cH(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.go(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aCj();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aCi();
    }

    public /* synthetic */ Message build() {
        return this.aCh();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cH(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aCg();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aCj();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aCi();
    }

    public /* synthetic */ MessageLite build() {
        return this.aCh();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aCg();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aCe();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aCe();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aCj();
    }

    public /* synthetic */ Object clone() {
        return this.aCj();
    }
}

