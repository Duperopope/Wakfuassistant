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
 * Renamed from Al
 */
public final class al_0
extends GeneratedMessageV3.Builder<al_0>
implements am_0 {
    private int an;
    private long Dj;
    private long wf;

    public static final Descriptors.Descriptor aCr() {
        return zS.apj;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apk.ensureFieldAccessorsInitialized(Aj.class, al_0.class);
    }

    al_0() {
        this.D();
    }

    al_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (Aj.pT()) {
            // empty if block
        }
    }

    public al_0 aCs() {
        super.clear();
        this.Dj = 0L;
        this.an &= 0xFFFFFFFE;
        this.wf = 0L;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apj;
    }

    public Aj aCq() {
        return Aj.aCp();
    }

    public Aj aCt() {
        Aj aj = this.aCu();
        if (!aj.isInitialized()) {
            throw al_0.newUninitializedMessageException((Message)aj);
        }
        return aj;
    }

    public Aj aCu() {
        Aj aj = new Aj(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            aj.Dj = this.Dj;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            aj.wf = this.wf;
            n2 |= 2;
        }
        aj.an = n2;
        this.onBuilt();
        return aj;
    }

    public al_0 aCv() {
        return (al_0)super.clone();
    }

    public al_0 gq(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (al_0)super.setField(fieldDescriptor, object);
    }

    public al_0 cI(Descriptors.FieldDescriptor fieldDescriptor) {
        return (al_0)super.clearField(fieldDescriptor);
    }

    public al_0 cI(Descriptors.OneofDescriptor oneofDescriptor) {
        return (al_0)super.clearOneof(oneofDescriptor);
    }

    public al_0 cI(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (al_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public al_0 gr(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (al_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public al_0 cI(Message message) {
        if (message instanceof Aj) {
            return this.c((Aj)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public al_0 c(Aj aj) {
        if (aj == Aj.aCp()) {
            return this;
        }
        if (aj.Xh()) {
            this.bZ(aj.Xi());
        }
        if (aj.KT()) {
            this.ca(aj.KU());
        }
        this.gr(Aj.b(aj));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.Xh();
    }

    public al_0 ka(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Aj aj = null;
        try {
            aj = (Aj)Aj.aql.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aj = (Aj)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aj != null) {
                this.c(aj);
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

    public al_0 bZ(long l) {
        this.an |= 1;
        this.Dj = l;
        this.onChanged();
        return this;
    }

    public al_0 aCw() {
        this.an &= 0xFFFFFFFE;
        this.Dj = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean KT() {
        return (this.an & 2) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public al_0 ca(long l) {
        this.an |= 2;
        this.wf = l;
        this.onChanged();
        return this;
    }

    public al_0 aCx() {
        this.an &= 0xFFFFFFFD;
        this.wf = 0L;
        this.onChanged();
        return this;
    }

    public final al_0 gq(UnknownFieldSet unknownFieldSet) {
        return (al_0)super.setUnknownFields(unknownFieldSet);
    }

    public final al_0 gr(UnknownFieldSet unknownFieldSet) {
        return (al_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gr(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gq(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gr(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cI(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cI(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cI(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gq(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aCs();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aCv();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gr(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ka(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cI(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aCs();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cI(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aCv();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gr(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gq(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gr(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cI(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cI(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cI(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gq(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ka(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aCv();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aCu();
    }

    public /* synthetic */ Message build() {
        return this.aCt();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cI(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aCs();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ka(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aCv();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aCu();
    }

    public /* synthetic */ MessageLite build() {
        return this.aCt();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aCs();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aCq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aCq();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ka(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aCv();
    }

    public /* synthetic */ Object clone() {
        return this.aCv();
    }
}

