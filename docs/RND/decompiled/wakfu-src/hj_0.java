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
 * Renamed from hJ
 */
public final class hj_0
extends GeneratedMessageV3.Builder<hj_0>
implements hk_0 {
    private int an;
    private List<hd_0> vC = Collections.emptyList();
    private RepeatedFieldBuilderV3<hd_0, hf_0, hg_0> vF;

    public static final Descriptors.Descriptor Kc() {
        return hc_0.vu;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hc_0.vv.ensureFieldAccessorsInitialized(hh_0.class, hj_0.class);
    }

    hj_0() {
        this.D();
    }

    hj_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hh_0.fa()) {
            this.Kl();
        }
    }

    public hj_0 Kd() {
        super.clear();
        if (this.vF == null) {
            this.vC = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.vF.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hc_0.vu;
    }

    public hh_0 Kb() {
        return hh_0.Ka();
    }

    public hh_0 Ke() {
        hh_0 hh_02 = this.Kf();
        if (!hh_02.isInitialized()) {
            throw hj_0.newUninitializedMessageException((Message)hh_02);
        }
        return hh_02;
    }

    public hh_0 Kf() {
        hh_0 hh_02 = new hh_0(this);
        int n = this.an;
        if (this.vF == null) {
            if ((this.an & 1) != 0) {
                this.vC = Collections.unmodifiableList(this.vC);
                this.an &= 0xFFFFFFFE;
            }
            hh_02.vC = this.vC;
        } else {
            hh_02.vC = this.vF.build();
        }
        this.onBuilt();
        return hh_02;
    }

    public hj_0 Kg() {
        return (hj_0)super.clone();
    }

    public hj_0 cI(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hj_0)super.setField(fieldDescriptor, object);
    }

    public hj_0 aR(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hj_0)super.clearField(fieldDescriptor);
    }

    public hj_0 aR(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hj_0)super.clearOneof(oneofDescriptor);
    }

    public hj_0 aR(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hj_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hj_0 cJ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hj_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public hj_0 aR(Message message) {
        if (message instanceof hh_0) {
            return this.c((hh_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hj_0 c(hh_0 hh_02) {
        if (hh_02 == hh_0.Ka()) {
            return this;
        }
        if (this.vF == null) {
            if (!hh_02.vC.isEmpty()) {
                if (this.vC.isEmpty()) {
                    this.vC = hh_02.vC;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.Kh();
                    this.vC.addAll(hh_02.vC);
                }
                this.onChanged();
            }
        } else if (!hh_02.vC.isEmpty()) {
            if (this.vF.isEmpty()) {
                this.vF.dispose();
                this.vF = null;
                this.vC = hh_02.vC;
                this.an &= 0xFFFFFFFE;
                this.vF = hh_0.oV() ? this.Kl() : null;
            } else {
                this.vF.addAllMessages(hh_02.vC);
            }
        }
        this.cJ(hh_0.b(hh_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.JW(); ++i) {
            if (this.dM(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hj_0 eB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hh_0 hh_02 = null;
        try {
            hh_02 = (hh_0)hh_0.vE.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hh_02 = (hh_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hh_02 != null) {
                this.c(hh_02);
            }
        }
        return this;
    }

    private void Kh() {
        if ((this.an & 1) == 0) {
            this.vC = new ArrayList<hd_0>(this.vC);
            this.an |= 1;
        }
    }

    @Override
    public List<hd_0> JU() {
        if (this.vF == null) {
            return Collections.unmodifiableList(this.vC);
        }
        return this.vF.getMessageList();
    }

    @Override
    public int JW() {
        if (this.vF == null) {
            return this.vC.size();
        }
        return this.vF.getCount();
    }

    @Override
    public hd_0 dM(int n) {
        if (this.vF == null) {
            return this.vC.get(n);
        }
        return (hd_0)this.vF.getMessage(n);
    }

    public hj_0 a(int n, hd_0 hd_02) {
        if (this.vF == null) {
            if (hd_02 == null) {
                throw new NullPointerException();
            }
            this.Kh();
            this.vC.set(n, hd_02);
            this.onChanged();
        } else {
            this.vF.setMessage(n, (AbstractMessage)hd_02);
        }
        return this;
    }

    public hj_0 a(int n, hf_0 hf_02) {
        if (this.vF == null) {
            this.Kh();
            this.vC.set(n, hf_02.JP());
            this.onChanged();
        } else {
            this.vF.setMessage(n, (AbstractMessage)hf_02.JP());
        }
        return this;
    }

    public hj_0 d(hd_0 hd_02) {
        if (this.vF == null) {
            if (hd_02 == null) {
                throw new NullPointerException();
            }
            this.Kh();
            this.vC.add(hd_02);
            this.onChanged();
        } else {
            this.vF.addMessage((AbstractMessage)hd_02);
        }
        return this;
    }

    public hj_0 b(int n, hd_0 hd_02) {
        if (this.vF == null) {
            if (hd_02 == null) {
                throw new NullPointerException();
            }
            this.Kh();
            this.vC.add(n, hd_02);
            this.onChanged();
        } else {
            this.vF.addMessage(n, (AbstractMessage)hd_02);
        }
        return this;
    }

    public hj_0 a(hf_0 hf_02) {
        if (this.vF == null) {
            this.Kh();
            this.vC.add(hf_02.JP());
            this.onChanged();
        } else {
            this.vF.addMessage((AbstractMessage)hf_02.JP());
        }
        return this;
    }

    public hj_0 b(int n, hf_0 hf_02) {
        if (this.vF == null) {
            this.Kh();
            this.vC.add(n, hf_02.JP());
            this.onChanged();
        } else {
            this.vF.addMessage(n, (AbstractMessage)hf_02.JP());
        }
        return this;
    }

    public hj_0 B(Iterable<? extends hd_0> iterable) {
        if (this.vF == null) {
            this.Kh();
            AbstractMessageLite.Builder.addAll(iterable, this.vC);
            this.onChanged();
        } else {
            this.vF.addAllMessages(iterable);
        }
        return this;
    }

    public hj_0 Ki() {
        if (this.vF == null) {
            this.vC = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.vF.clear();
        }
        return this;
    }

    public hj_0 dO(int n) {
        if (this.vF == null) {
            this.Kh();
            this.vC.remove(n);
            this.onChanged();
        } else {
            this.vF.remove(n);
        }
        return this;
    }

    public hf_0 dP(int n) {
        return (hf_0)this.Kl().getBuilder(n);
    }

    @Override
    public hg_0 dN(int n) {
        if (this.vF == null) {
            return this.vC.get(n);
        }
        return (hg_0)this.vF.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends hg_0> JV() {
        if (this.vF != null) {
            return this.vF.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.vC);
    }

    public hf_0 Kj() {
        return (hf_0)this.Kl().addBuilder((AbstractMessage)hd_0.JL());
    }

    public hf_0 dQ(int n) {
        return (hf_0)this.Kl().addBuilder(n, (AbstractMessage)hd_0.JL());
    }

    public List<hf_0> Kk() {
        return this.Kl().getBuilderList();
    }

    private RepeatedFieldBuilderV3<hd_0, hf_0, hg_0> Kl() {
        if (this.vF == null) {
            this.vF = new RepeatedFieldBuilderV3(this.vC, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.vC = null;
        }
        return this.vF;
    }

    public final hj_0 cI(UnknownFieldSet unknownFieldSet) {
        return (hj_0)super.setUnknownFields(unknownFieldSet);
    }

    public final hj_0 cJ(UnknownFieldSet unknownFieldSet) {
        return (hj_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cJ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cI(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cJ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aR(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aR(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aR(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cI(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Kd();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Kg();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cJ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aR(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Kd();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aR(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Kg();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cJ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cI(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cJ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aR(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aR(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aR(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cI(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Kg();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Kf();
    }

    public /* synthetic */ Message build() {
        return this.Ke();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aR(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Kd();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Kg();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Kf();
    }

    public /* synthetic */ MessageLite build() {
        return this.Ke();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Kd();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Kb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Kb();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Kg();
    }

    public /* synthetic */ Object clone() {
        return this.Kg();
    }
}

