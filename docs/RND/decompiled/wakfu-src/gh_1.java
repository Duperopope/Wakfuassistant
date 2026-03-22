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
 * Renamed from gh
 */
public final class gh_1
extends GeneratedMessageV3.Builder<gh_1>
implements gi_1 {
    private int an;
    private int mj;
    private List<di_2> jX = Collections.emptyList();
    private RepeatedFieldBuilderV3<di_2, dk_1, dl_2> kb;

    public static final Descriptors.Descriptor Ds() {
        return ge_2.rO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ge_2.rP.ensureFieldAccessorsInitialized(gf_2.class, gh_1.class);
    }

    gh_1() {
        this.D();
    }

    gh_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gf_2.fa()) {
            this.pE();
        }
    }

    public gh_1 Dt() {
        super.clear();
        this.mj = 0;
        this.an &= 0xFFFFFFFE;
        if (this.kb == null) {
            this.jX = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.kb.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ge_2.rO;
    }

    public gf_2 Dr() {
        return gf_2.Dq();
    }

    public gf_2 Du() {
        gf_2 gf_22 = this.Dv();
        if (!gf_22.isInitialized()) {
            throw gh_1.newUninitializedMessageException((Message)gf_22);
        }
        return gf_22;
    }

    public gf_2 Dv() {
        gf_2 gf_22 = new gf_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            gf_22.mj = this.mj;
            n2 |= 1;
        }
        if (this.kb == null) {
            if ((this.an & 2) != 0) {
                this.jX = Collections.unmodifiableList(this.jX);
                this.an &= 0xFFFFFFFD;
            }
            gf_22.jX = this.jX;
        } else {
            gf_22.jX = this.kb.build();
        }
        gf_22.an = n2;
        this.onBuilt();
        return gf_22;
    }

    public gh_1 Dw() {
        return (gh_1)super.clone();
    }

    public gh_1 cc(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gh_1)super.setField(fieldDescriptor, object);
    }

    public gh_1 aB(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gh_1)super.clearField(fieldDescriptor);
    }

    public gh_1 aB(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gh_1)super.clearOneof(oneofDescriptor);
    }

    public gh_1 aB(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gh_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gh_1 cd(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gh_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gh_1 aB(Message message) {
        if (message instanceof gf_2) {
            return this.c((gf_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gh_1 c(gf_2 gf_22) {
        if (gf_22 == gf_2.Dq()) {
            return this;
        }
        if (gf_22.tK()) {
            this.cM(gf_22.tL());
        }
        if (this.kb == null) {
            if (!gf_22.jX.isEmpty()) {
                if (this.jX.isEmpty()) {
                    this.jX = gf_22.jX;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.pA();
                    this.jX.addAll(gf_22.jX);
                }
                this.onChanged();
            }
        } else if (!gf_22.jX.isEmpty()) {
            if (this.kb.isEmpty()) {
                this.kb.dispose();
                this.kb = null;
                this.jX = gf_22.jX;
                this.an &= 0xFFFFFFFD;
                this.kb = gf_2.oV() ? this.pE() : null;
            } else {
                this.kb.addAllMessages(gf_22.jX);
            }
        }
        this.cd(gf_2.b(gf_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.tK()) {
            return false;
        }
        for (int i = 0; i < this.pl(); ++i) {
            if (this.aq(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public gh_1 dF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gf_2 gf_22 = null;
        try {
            gf_22 = (gf_2)gf_2.rU.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gf_22 = (gf_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gf_22 != null) {
                this.c(gf_22);
            }
        }
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public gh_1 cM(int n) {
        this.an |= 1;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public gh_1 Dx() {
        this.an &= 0xFFFFFFFE;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    private void pA() {
        if ((this.an & 2) == 0) {
            this.jX = new ArrayList<di_2>(this.jX);
            this.an |= 2;
        }
    }

    @Override
    public List<di_2> pj() {
        if (this.kb == null) {
            return Collections.unmodifiableList(this.jX);
        }
        return this.kb.getMessageList();
    }

    @Override
    public int pl() {
        if (this.kb == null) {
            return this.jX.size();
        }
        return this.kb.getCount();
    }

    @Override
    public di_2 aq(int n) {
        if (this.kb == null) {
            return this.jX.get(n);
        }
        return (di_2)this.kb.getMessage(n);
    }

    public gh_1 c(int n, di_2 di_22) {
        if (this.kb == null) {
            if (di_22 == null) {
                throw new NullPointerException();
            }
            this.pA();
            this.jX.set(n, di_22);
            this.onChanged();
        } else {
            this.kb.setMessage(n, (AbstractMessage)di_22);
        }
        return this;
    }

    public gh_1 c(int n, dk_1 dk_12) {
        if (this.kb == null) {
            this.pA();
            this.jX.set(n, dk_12.sf());
            this.onChanged();
        } else {
            this.kb.setMessage(n, (AbstractMessage)dk_12.sf());
        }
        return this;
    }

    public gh_1 e(di_2 di_22) {
        if (this.kb == null) {
            if (di_22 == null) {
                throw new NullPointerException();
            }
            this.pA();
            this.jX.add(di_22);
            this.onChanged();
        } else {
            this.kb.addMessage((AbstractMessage)di_22);
        }
        return this;
    }

    public gh_1 d(int n, di_2 di_22) {
        if (this.kb == null) {
            if (di_22 == null) {
                throw new NullPointerException();
            }
            this.pA();
            this.jX.add(n, di_22);
            this.onChanged();
        } else {
            this.kb.addMessage(n, (AbstractMessage)di_22);
        }
        return this;
    }

    public gh_1 b(dk_1 dk_12) {
        if (this.kb == null) {
            this.pA();
            this.jX.add(dk_12.sf());
            this.onChanged();
        } else {
            this.kb.addMessage((AbstractMessage)dk_12.sf());
        }
        return this;
    }

    public gh_1 d(int n, dk_1 dk_12) {
        if (this.kb == null) {
            this.pA();
            this.jX.add(n, dk_12.sf());
            this.onChanged();
        } else {
            this.kb.addMessage(n, (AbstractMessage)dk_12.sf());
        }
        return this;
    }

    public gh_1 v(Iterable<? extends di_2> iterable) {
        if (this.kb == null) {
            this.pA();
            AbstractMessageLite.Builder.addAll(iterable, this.jX);
            this.onChanged();
        } else {
            this.kb.addAllMessages(iterable);
        }
        return this;
    }

    public gh_1 Dy() {
        if (this.kb == null) {
            this.jX = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.kb.clear();
        }
        return this;
    }

    public gh_1 cN(int n) {
        if (this.kb == null) {
            this.pA();
            this.jX.remove(n);
            this.onChanged();
        } else {
            this.kb.remove(n);
        }
        return this;
    }

    public dk_1 at(int n) {
        return (dk_1)this.pE().getBuilder(n);
    }

    @Override
    public dl_2 ar(int n) {
        if (this.kb == null) {
            return this.jX.get(n);
        }
        return (dl_2)this.kb.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends dl_2> pk() {
        if (this.kb != null) {
            return this.kb.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jX);
    }

    public dk_1 pC() {
        return (dk_1)this.pE().addBuilder((AbstractMessage)di_2.sb());
    }

    public dk_1 au(int n) {
        return (dk_1)this.pE().addBuilder(n, (AbstractMessage)di_2.sb());
    }

    public List<dk_1> pD() {
        return this.pE().getBuilderList();
    }

    private RepeatedFieldBuilderV3<di_2, dk_1, dl_2> pE() {
        if (this.kb == null) {
            this.kb = new RepeatedFieldBuilderV3(this.jX, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jX = null;
        }
        return this.kb;
    }

    public final gh_1 cc(UnknownFieldSet unknownFieldSet) {
        return (gh_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gh_1 cd(UnknownFieldSet unknownFieldSet) {
        return (gh_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cd(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cc(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cd(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aB(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aB(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aB(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cc(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Dt();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Dw();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cd(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aB(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Dt();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aB(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Dw();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cd(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cc(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cd(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aB(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aB(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aB(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cc(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Dw();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Dv();
    }

    public /* synthetic */ Message build() {
        return this.Du();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aB(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Dt();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Dw();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Dv();
    }

    public /* synthetic */ MessageLite build() {
        return this.Du();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Dt();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Dr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Dr();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Dw();
    }

    public /* synthetic */ Object clone() {
        return this.Dw();
    }
}

