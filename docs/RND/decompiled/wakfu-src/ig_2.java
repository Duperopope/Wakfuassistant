/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from iG
 */
public final class ig_2
extends GeneratedMessageV3.Builder<ig_2>
implements ih_1 {
    private int an;
    private List<ii_2> zf = Collections.emptyList();
    private RepeatedFieldBuilderV3<ii_2, ik_2, il_2> zi;

    public static final Descriptors.Descriptor PQ() {
        return ih_2.wJ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wK.ensureFieldAccessorsInitialized(ie_2.class, ig_2.class);
    }

    ig_2() {
        this.D();
    }

    ig_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ie_2.gb()) {
            this.PZ();
        }
    }

    public ig_2 PR() {
        super.clear();
        if (this.zi == null) {
            this.zf = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.zi.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wJ;
    }

    public ie_2 PP() {
        return ie_2.PO();
    }

    public ie_2 PS() {
        ie_2 ie_22 = this.PT();
        if (!ie_22.isInitialized()) {
            throw ig_2.newUninitializedMessageException((Message)ie_22);
        }
        return ie_22;
    }

    public ie_2 PT() {
        ie_2 ie_22 = new ie_2(this);
        int n = this.an;
        if (this.zi == null) {
            if ((this.an & 1) != 0) {
                this.zf = Collections.unmodifiableList(this.zf);
                this.an &= 0xFFFFFFFE;
            }
            ie_22.zf = this.zf;
        } else {
            ie_22.zf = this.zi.build();
        }
        this.onBuilt();
        return ie_22;
    }

    public ig_2 PU() {
        return (ig_2)super.clone();
    }

    public ig_2 de(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ig_2)super.setField(fieldDescriptor, object);
    }

    public ig_2 bc(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ig_2)super.clearField(fieldDescriptor);
    }

    public ig_2 bc(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ig_2)super.clearOneof(oneofDescriptor);
    }

    public ig_2 bc(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ig_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ig_2 df(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ig_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ig_2 bc(Message message) {
        if (message instanceof ie_2) {
            return this.e((ie_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ig_2 e(ie_2 ie_22) {
        if (ie_22 == ie_2.PO()) {
            return this;
        }
        if (this.zi == null) {
            if (!ie_22.zf.isEmpty()) {
                if (this.zf.isEmpty()) {
                    this.zf = ie_22.zf;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.PV();
                    this.zf.addAll(ie_22.zf);
                }
                this.onChanged();
            }
        } else if (!ie_22.zf.isEmpty()) {
            if (this.zi.isEmpty()) {
                this.zi.dispose();
                this.zi = null;
                this.zf = ie_22.zf;
                this.an &= 0xFFFFFFFE;
                this.zi = ie_2.dM() ? this.PZ() : null;
            } else {
                this.zi.addAllMessages(ie_22.zf);
            }
        }
        this.df(ie_2.d(ie_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.PK(); ++i) {
            if (this.eC(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ig_2 fi(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ie_2 ie_22 = null;
        try {
            ie_22 = (ie_2)ie_2.zh.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ie_22 = (ie_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ie_22 != null) {
                this.e(ie_22);
            }
        }
        return this;
    }

    private void PV() {
        if ((this.an & 1) == 0) {
            this.zf = new ArrayList<ii_2>(this.zf);
            this.an |= 1;
        }
    }

    @Override
    public List<ii_2> PI() {
        if (this.zi == null) {
            return Collections.unmodifiableList(this.zf);
        }
        return this.zi.getMessageList();
    }

    @Override
    public int PK() {
        if (this.zi == null) {
            return this.zf.size();
        }
        return this.zi.getCount();
    }

    @Override
    public ii_2 eC(int n) {
        if (this.zi == null) {
            return this.zf.get(n);
        }
        return (ii_2)this.zi.getMessage(n);
    }

    public ig_2 a(int n, ii_2 ii_22) {
        if (this.zi == null) {
            if (ii_22 == null) {
                throw new NullPointerException();
            }
            this.PV();
            this.zf.set(n, ii_22);
            this.onChanged();
        } else {
            this.zi.setMessage(n, (AbstractMessage)ii_22);
        }
        return this;
    }

    public ig_2 a(int n, ik_2 ik_22) {
        if (this.zi == null) {
            this.PV();
            this.zf.set(n, ik_22.Qi());
            this.onChanged();
        } else {
            this.zi.setMessage(n, (AbstractMessage)ik_22.Qi());
        }
        return this;
    }

    public ig_2 e(ii_2 ii_22) {
        if (this.zi == null) {
            if (ii_22 == null) {
                throw new NullPointerException();
            }
            this.PV();
            this.zf.add(ii_22);
            this.onChanged();
        } else {
            this.zi.addMessage((AbstractMessage)ii_22);
        }
        return this;
    }

    public ig_2 b(int n, ii_2 ii_22) {
        if (this.zi == null) {
            if (ii_22 == null) {
                throw new NullPointerException();
            }
            this.PV();
            this.zf.add(n, ii_22);
            this.onChanged();
        } else {
            this.zi.addMessage(n, (AbstractMessage)ii_22);
        }
        return this;
    }

    public ig_2 c(ik_2 ik_22) {
        if (this.zi == null) {
            this.PV();
            this.zf.add(ik_22.Qi());
            this.onChanged();
        } else {
            this.zi.addMessage((AbstractMessage)ik_22.Qi());
        }
        return this;
    }

    public ig_2 b(int n, ik_2 ik_22) {
        if (this.zi == null) {
            this.PV();
            this.zf.add(n, ik_22.Qi());
            this.onChanged();
        } else {
            this.zi.addMessage(n, (AbstractMessage)ik_22.Qi());
        }
        return this;
    }

    public ig_2 F(Iterable<? extends ii_2> iterable) {
        if (this.zi == null) {
            this.PV();
            AbstractMessageLite.Builder.addAll(iterable, this.zf);
            this.onChanged();
        } else {
            this.zi.addAllMessages(iterable);
        }
        return this;
    }

    public ig_2 PW() {
        if (this.zi == null) {
            this.zf = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.zi.clear();
        }
        return this;
    }

    public ig_2 eE(int n) {
        if (this.zi == null) {
            this.PV();
            this.zf.remove(n);
            this.onChanged();
        } else {
            this.zi.remove(n);
        }
        return this;
    }

    public ik_2 eF(int n) {
        return (ik_2)this.PZ().getBuilder(n);
    }

    @Override
    public il_2 eD(int n) {
        if (this.zi == null) {
            return this.zf.get(n);
        }
        return (il_2)this.zi.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends il_2> PJ() {
        if (this.zi != null) {
            return this.zi.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.zf);
    }

    public ik_2 PX() {
        return (ik_2)this.PZ().addBuilder((AbstractMessage)ii_2.Qe());
    }

    public ik_2 eG(int n) {
        return (ik_2)this.PZ().addBuilder(n, (AbstractMessage)ii_2.Qe());
    }

    public List<ik_2> PY() {
        return this.PZ().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ii_2, ik_2, il_2> PZ() {
        if (this.zi == null) {
            this.zi = new RepeatedFieldBuilderV3(this.zf, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.zf = null;
        }
        return this.zi;
    }

    public final ig_2 de(UnknownFieldSet unknownFieldSet) {
        return (ig_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ig_2 df(UnknownFieldSet unknownFieldSet) {
        return (ig_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.df(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.de(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.df(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bc(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bc(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bc(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.de(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.PR();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.PU();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.df(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fi(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bc(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.PR();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bc(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.PU();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.df(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.de(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.df(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bc(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bc(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bc(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.de(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fi(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.PU();
    }

    public /* synthetic */ Message buildPartial() {
        return this.PT();
    }

    public /* synthetic */ Message build() {
        return this.PS();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bc(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.PR();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fi(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.PU();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.PT();
    }

    public /* synthetic */ MessageLite build() {
        return this.PS();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.PR();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.PP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.PP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fi(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.PU();
    }

    public /* synthetic */ Object clone() {
        return this.PU();
    }
}

