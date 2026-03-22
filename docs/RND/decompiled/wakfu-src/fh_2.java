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
 *  com.google.protobuf.Internal$IntList
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from fH
 */
public final class fh_2
extends GeneratedMessageV3.Builder<fh_2>
implements fi_2 {
    private int an;
    private Internal.IntList qK = ff_2.Bl();

    public static final Descriptors.Descriptor Bn() {
        return fl_1.po;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pp.ensureFieldAccessorsInitialized(ff_2.class, fh_2.class);
    }

    fh_2() {
        this.D();
    }

    fh_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ff_2.gb()) {
            // empty if block
        }
    }

    public fh_2 Bo() {
        super.clear();
        this.qK = ff_2.Bk();
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fl_1.po;
    }

    public ff_2 Bj() {
        return ff_2.Bi();
    }

    public ff_2 Bp() {
        ff_2 ff_22 = this.Bq();
        if (!ff_22.isInitialized()) {
            throw fh_2.newUninitializedMessageException((Message)ff_22);
        }
        return ff_22;
    }

    public ff_2 Bq() {
        ff_2 ff_22 = new ff_2(this);
        int n = this.an;
        if ((this.an & 1) != 0) {
            this.qK.makeImmutable();
            this.an &= 0xFFFFFFFE;
        }
        ff_22.qK = this.qK;
        this.onBuilt();
        return ff_22;
    }

    public fh_2 Br() {
        return (fh_2)super.clone();
    }

    public fh_2 bS(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fh_2)super.setField(fieldDescriptor, object);
    }

    public fh_2 aw(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fh_2)super.clearField(fieldDescriptor);
    }

    public fh_2 aw(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fh_2)super.clearOneof(oneofDescriptor);
    }

    public fh_2 aw(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fh_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fh_2 bT(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fh_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fh_2 aw(Message message) {
        if (message instanceof ff_2) {
            return this.c((ff_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fh_2 c(ff_2 ff_22) {
        if (ff_22 == ff_2.Bi()) {
            return this;
        }
        if (!ff_22.qK.isEmpty()) {
            if (this.qK.isEmpty()) {
                this.qK = ff_22.qK;
                this.an &= 0xFFFFFFFE;
            } else {
                this.Bs();
                this.qK.addAll((Collection)ff_22.qK);
            }
            this.onChanged();
        }
        this.bT(ff_2.b(ff_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public fh_2 dq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ff_2 ff_22 = null;
        try {
            ff_22 = (ff_2)ff_2.qM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ff_22 = (ff_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ff_22 != null) {
                this.c(ff_22);
            }
        }
        return this;
    }

    private void Bs() {
        if ((this.an & 1) == 0) {
            this.qK = ff_2.c(this.qK);
            this.an |= 1;
        }
    }

    @Override
    public List<Integer> Bd() {
        return (this.an & 1) != 0 ? Collections.unmodifiableList(this.qK) : this.qK;
    }

    @Override
    public int Be() {
        return this.qK.size();
    }

    @Override
    public int cy(int n) {
        return this.qK.getInt(n);
    }

    public fh_2 e(int n, int n2) {
        this.Bs();
        this.qK.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public fh_2 cz(int n) {
        this.Bs();
        this.qK.addInt(n);
        this.onChanged();
        return this;
    }

    public fh_2 t(Iterable<? extends Integer> iterable) {
        this.Bs();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.qK);
        this.onChanged();
        return this;
    }

    public fh_2 Bt() {
        this.qK = ff_2.Bm();
        this.an &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    public final fh_2 bS(UnknownFieldSet unknownFieldSet) {
        return (fh_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fh_2 bT(UnknownFieldSet unknownFieldSet) {
        return (fh_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bT(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bS(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bT(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aw(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aw(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aw(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bS(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Bo();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Br();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bT(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aw(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Bo();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aw(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Br();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bT(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bS(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bT(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aw(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aw(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aw(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bS(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Br();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Bq();
    }

    public /* synthetic */ Message build() {
        return this.Bp();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aw(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Bo();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Br();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Bq();
    }

    public /* synthetic */ MessageLite build() {
        return this.Bp();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Bo();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Bj();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Bj();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Br();
    }

    public /* synthetic */ Object clone() {
        return this.Br();
    }
}

