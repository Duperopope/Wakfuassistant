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
 * Renamed from gA
 */
public final class ga_1
extends GeneratedMessageV3.Builder<ga_1>
implements gb_1 {
    private int an;
    private List<gu_1> sq = Collections.emptyList();
    private RepeatedFieldBuilderV3<gu_1, gw_1, gx_1> sw;
    private boolean ss;
    private boolean kt;

    public static final Descriptors.Descriptor Ep() {
        return gt_1.sd;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gt_1.se.ensureFieldAccessorsInitialized(gy_1.class, ga_1.class);
    }

    ga_1() {
        this.D();
    }

    ga_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gy_1.aJ()) {
            this.Ey();
        }
    }

    public ga_1 Eq() {
        super.clear();
        if (this.sw == null) {
            this.sq = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.sw.clear();
        }
        this.ss = false;
        this.an &= 0xFFFFFFFD;
        this.kt = false;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gt_1.sd;
    }

    public gy_1 Eo() {
        return gy_1.En();
    }

    public gy_1 Er() {
        gy_1 gy_12 = this.Es();
        if (!gy_12.isInitialized()) {
            throw ga_1.newUninitializedMessageException((Message)gy_12);
        }
        return gy_12;
    }

    public gy_1 Es() {
        gy_1 gy_12 = new gy_1(this);
        int n = this.an;
        int n2 = 0;
        if (this.sw == null) {
            if ((this.an & 1) != 0) {
                this.sq = Collections.unmodifiableList(this.sq);
                this.an &= 0xFFFFFFFE;
            }
            gy_12.sq = this.sq;
        } else {
            gy_12.sq = this.sw.build();
        }
        if ((n & 2) != 0) {
            gy_12.ss = this.ss;
            n2 |= 1;
        }
        if ((n & 4) != 0) {
            gy_12.kt = this.kt;
            n2 |= 2;
        }
        gy_12.an = n2;
        this.onBuilt();
        return gy_12;
    }

    public ga_1 Et() {
        return (ga_1)super.clone();
    }

    public ga_1 ci(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ga_1)super.setField(fieldDescriptor, object);
    }

    public ga_1 aE(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ga_1)super.clearField(fieldDescriptor);
    }

    public ga_1 aE(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ga_1)super.clearOneof(oneofDescriptor);
    }

    public ga_1 aE(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ga_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ga_1 cj(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ga_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ga_1 aE(Message message) {
        if (message instanceof gy_1) {
            return this.c((gy_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ga_1 c(gy_1 gy_12) {
        if (gy_12 == gy_1.En()) {
            return this;
        }
        if (this.sw == null) {
            if (!gy_12.sq.isEmpty()) {
                if (this.sq.isEmpty()) {
                    this.sq = gy_12.sq;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.Eu();
                    this.sq.addAll(gy_12.sq);
                }
                this.onChanged();
            }
        } else if (!gy_12.sq.isEmpty()) {
            if (this.sw.isEmpty()) {
                this.sw.dispose();
                this.sw = null;
                this.sq = gy_12.sq;
                this.an &= 0xFFFFFFFE;
                this.sw = gy_1.oB() ? this.Ey() : null;
            } else {
                this.sw.addAllMessages(gy_12.sq);
            }
        }
        if (gy_12.Ei()) {
            this.k(gy_12.Ej());
        }
        if (gy_12.qm()) {
            this.l(gy_12.qn());
        }
        this.cj(gy_1.b(gy_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Ei()) {
            return false;
        }
        if (!this.qm()) {
            return false;
        }
        for (int i = 0; i < this.Eh(); ++i) {
            if (this.cT(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ga_1 dO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gy_1 gy_12 = null;
        try {
            gy_12 = (gy_1)gy_1.sv.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gy_12 = (gy_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gy_12 != null) {
                this.c(gy_12);
            }
        }
        return this;
    }

    private void Eu() {
        if ((this.an & 1) == 0) {
            this.sq = new ArrayList<gu_1>(this.sq);
            this.an |= 1;
        }
    }

    @Override
    public List<gu_1> Ef() {
        if (this.sw == null) {
            return Collections.unmodifiableList(this.sq);
        }
        return this.sw.getMessageList();
    }

    @Override
    public int Eh() {
        if (this.sw == null) {
            return this.sq.size();
        }
        return this.sw.getCount();
    }

    @Override
    public gu_1 cT(int n) {
        if (this.sw == null) {
            return this.sq.get(n);
        }
        return (gu_1)this.sw.getMessage(n);
    }

    public ga_1 a(int n, gu_1 gu_12) {
        if (this.sw == null) {
            if (gu_12 == null) {
                throw new NullPointerException();
            }
            this.Eu();
            this.sq.set(n, gu_12);
            this.onChanged();
        } else {
            this.sw.setMessage(n, (AbstractMessage)gu_12);
        }
        return this;
    }

    public ga_1 a(int n, gw_1 gw_12) {
        if (this.sw == null) {
            this.Eu();
            this.sq.set(n, gw_12.DY());
            this.onChanged();
        } else {
            this.sw.setMessage(n, (AbstractMessage)gw_12.DY());
        }
        return this;
    }

    public ga_1 d(gu_1 gu_12) {
        if (this.sw == null) {
            if (gu_12 == null) {
                throw new NullPointerException();
            }
            this.Eu();
            this.sq.add(gu_12);
            this.onChanged();
        } else {
            this.sw.addMessage((AbstractMessage)gu_12);
        }
        return this;
    }

    public ga_1 b(int n, gu_1 gu_12) {
        if (this.sw == null) {
            if (gu_12 == null) {
                throw new NullPointerException();
            }
            this.Eu();
            this.sq.add(n, gu_12);
            this.onChanged();
        } else {
            this.sw.addMessage(n, (AbstractMessage)gu_12);
        }
        return this;
    }

    public ga_1 a(gw_1 gw_12) {
        if (this.sw == null) {
            this.Eu();
            this.sq.add(gw_12.DY());
            this.onChanged();
        } else {
            this.sw.addMessage((AbstractMessage)gw_12.DY());
        }
        return this;
    }

    public ga_1 b(int n, gw_1 gw_12) {
        if (this.sw == null) {
            this.Eu();
            this.sq.add(n, gw_12.DY());
            this.onChanged();
        } else {
            this.sw.addMessage(n, (AbstractMessage)gw_12.DY());
        }
        return this;
    }

    public ga_1 w(Iterable<? extends gu_1> iterable) {
        if (this.sw == null) {
            this.Eu();
            AbstractMessageLite.Builder.addAll(iterable, this.sq);
            this.onChanged();
        } else {
            this.sw.addAllMessages(iterable);
        }
        return this;
    }

    public ga_1 Ev() {
        if (this.sw == null) {
            this.sq = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.sw.clear();
        }
        return this;
    }

    public ga_1 cV(int n) {
        if (this.sw == null) {
            this.Eu();
            this.sq.remove(n);
            this.onChanged();
        } else {
            this.sw.remove(n);
        }
        return this;
    }

    public gw_1 cW(int n) {
        return (gw_1)this.Ey().getBuilder(n);
    }

    @Override
    public gx_1 cU(int n) {
        if (this.sw == null) {
            return this.sq.get(n);
        }
        return (gx_1)this.sw.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends gx_1> Eg() {
        if (this.sw != null) {
            return this.sw.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.sq);
    }

    public gw_1 Ew() {
        return (gw_1)this.Ey().addBuilder((AbstractMessage)gu_1.DU());
    }

    public gw_1 cX(int n) {
        return (gw_1)this.Ey().addBuilder(n, (AbstractMessage)gu_1.DU());
    }

    public List<gw_1> Ex() {
        return this.Ey().getBuilderList();
    }

    private RepeatedFieldBuilderV3<gu_1, gw_1, gx_1> Ey() {
        if (this.sw == null) {
            this.sw = new RepeatedFieldBuilderV3(this.sq, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.sq = null;
        }
        return this.sw;
    }

    @Override
    public boolean Ei() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean Ej() {
        return this.ss;
    }

    public ga_1 k(boolean bl) {
        this.an |= 2;
        this.ss = bl;
        this.onChanged();
        return this;
    }

    public ga_1 Ez() {
        this.an &= 0xFFFFFFFD;
        this.ss = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean qm() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean qn() {
        return this.kt;
    }

    public ga_1 l(boolean bl) {
        this.an |= 4;
        this.kt = bl;
        this.onChanged();
        return this;
    }

    public ga_1 EA() {
        this.an &= 0xFFFFFFFB;
        this.kt = false;
        this.onChanged();
        return this;
    }

    public final ga_1 ci(UnknownFieldSet unknownFieldSet) {
        return (ga_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ga_1 cj(UnknownFieldSet unknownFieldSet) {
        return (ga_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cj(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ci(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cj(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aE(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aE(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aE(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ci(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Eq();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Et();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cj(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aE(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Eq();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aE(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Et();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cj(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ci(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cj(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aE(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aE(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aE(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ci(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Et();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Es();
    }

    public /* synthetic */ Message build() {
        return this.Er();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aE(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Eq();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Et();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Es();
    }

    public /* synthetic */ MessageLite build() {
        return this.Er();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Eq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Eo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Eo();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Et();
    }

    public /* synthetic */ Object clone() {
        return this.Et();
    }
}

