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
 * Renamed from ze
 */
public final class ze_1
extends GeneratedMessageV3.Builder<ze_1>
implements zf_1 {
    private int an;
    private int xX;
    private int xZ;
    private List<yy_2> anp = Collections.emptyList();
    private RepeatedFieldBuilderV3<yy_2, za_1, zb_1> ans;

    public static final Descriptors.Descriptor axm() {
        return yp_2.amB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amC.ensureFieldAccessorsInitialized(zc_1.class, ze_1.class);
    }

    ze_1() {
        this.D();
    }

    ze_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zc_1.aJ()) {
            this.axx();
        }
    }

    public ze_1 axn() {
        super.clear();
        this.xX = 0;
        this.an &= 0xFFFFFFFE;
        this.xZ = 0;
        this.an &= 0xFFFFFFFD;
        if (this.ans == null) {
            this.anp = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
        } else {
            this.ans.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return yp_2.amB;
    }

    public zc_1 axl() {
        return zc_1.axk();
    }

    public zc_1 axo() {
        zc_1 zc_12 = this.axp();
        if (!zc_12.isInitialized()) {
            throw ze_1.newUninitializedMessageException((Message)zc_12);
        }
        return zc_12;
    }

    public zc_1 axp() {
        zc_1 zc_12 = new zc_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            zc_12.xX = this.xX;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            zc_12.xZ = this.xZ;
            n2 |= 2;
        }
        if (this.ans == null) {
            if ((this.an & 4) != 0) {
                this.anp = Collections.unmodifiableList(this.anp);
                this.an &= 0xFFFFFFFB;
            }
            zc_12.anp = this.anp;
        } else {
            zc_12.anp = this.ans.build();
        }
        zc_12.an = n2;
        this.onBuilt();
        return zc_12;
    }

    public ze_1 axq() {
        return (ze_1)super.clone();
    }

    public ze_1 fQ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ze_1)super.setField(fieldDescriptor, object);
    }

    public ze_1 cv(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ze_1)super.clearField(fieldDescriptor);
    }

    public ze_1 cv(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ze_1)super.clearOneof(oneofDescriptor);
    }

    public ze_1 cv(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ze_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ze_1 fR(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ze_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ze_1 cv(Message message) {
        if (message instanceof zc_1) {
            return this.c((zc_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ze_1 c(zc_1 zc_12) {
        if (zc_12 == zc_1.axk()) {
            return this;
        }
        if (zc_12.NK()) {
            this.ki(zc_12.getX());
        }
        if (zc_12.NL()) {
            this.kj(zc_12.getY());
        }
        if (this.ans == null) {
            if (!zc_12.anp.isEmpty()) {
                if (this.anp.isEmpty()) {
                    this.anp = zc_12.anp;
                    this.an &= 0xFFFFFFFB;
                } else {
                    this.axt();
                    this.anp.addAll(zc_12.anp);
                }
                this.onChanged();
            }
        } else if (!zc_12.anp.isEmpty()) {
            if (this.ans.isEmpty()) {
                this.ans.dispose();
                this.ans = null;
                this.anp = zc_12.anp;
                this.an &= 0xFFFFFFFB;
                this.ans = zc_1.oB() ? this.axx() : null;
            } else {
                this.ans.addAllMessages(zc_12.anp);
            }
        }
        this.fR(zc_1.b(zc_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.NK()) {
            return false;
        }
        if (!this.NL()) {
            return false;
        }
        for (int i = 0; i < this.axg(); ++i) {
            if (this.kg(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ze_1 jn(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zc_1 zc_12 = null;
        try {
            zc_12 = (zc_1)zc_1.anr.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zc_12 = (zc_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zc_12 != null) {
                this.c(zc_12);
            }
        }
        return this;
    }

    @Override
    public boolean NK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int getX() {
        return this.xX;
    }

    public ze_1 ki(int n) {
        this.an |= 1;
        this.xX = n;
        this.onChanged();
        return this;
    }

    public ze_1 axr() {
        this.an &= 0xFFFFFFFE;
        this.xX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean NL() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getY() {
        return this.xZ;
    }

    public ze_1 kj(int n) {
        this.an |= 2;
        this.xZ = n;
        this.onChanged();
        return this;
    }

    public ze_1 axs() {
        this.an &= 0xFFFFFFFD;
        this.xZ = 0;
        this.onChanged();
        return this;
    }

    private void axt() {
        if ((this.an & 4) == 0) {
            this.anp = new ArrayList<yy_2>(this.anp);
            this.an |= 4;
        }
    }

    @Override
    public List<yy_2> axe() {
        if (this.ans == null) {
            return Collections.unmodifiableList(this.anp);
        }
        return this.ans.getMessageList();
    }

    @Override
    public int axg() {
        if (this.ans == null) {
            return this.anp.size();
        }
        return this.ans.getCount();
    }

    @Override
    public yy_2 kg(int n) {
        if (this.ans == null) {
            return this.anp.get(n);
        }
        return (yy_2)this.ans.getMessage(n);
    }

    public ze_1 a(int n, yy_2 yy_22) {
        if (this.ans == null) {
            if (yy_22 == null) {
                throw new NullPointerException();
            }
            this.axt();
            this.anp.set(n, yy_22);
            this.onChanged();
        } else {
            this.ans.setMessage(n, (AbstractMessage)yy_22);
        }
        return this;
    }

    public ze_1 a(int n, za_1 za_12) {
        if (this.ans == null) {
            this.axt();
            this.anp.set(n, za_12.awS());
            this.onChanged();
        } else {
            this.ans.setMessage(n, (AbstractMessage)za_12.awS());
        }
        return this;
    }

    public ze_1 d(yy_2 yy_22) {
        if (this.ans == null) {
            if (yy_22 == null) {
                throw new NullPointerException();
            }
            this.axt();
            this.anp.add(yy_22);
            this.onChanged();
        } else {
            this.ans.addMessage((AbstractMessage)yy_22);
        }
        return this;
    }

    public ze_1 b(int n, yy_2 yy_22) {
        if (this.ans == null) {
            if (yy_22 == null) {
                throw new NullPointerException();
            }
            this.axt();
            this.anp.add(n, yy_22);
            this.onChanged();
        } else {
            this.ans.addMessage(n, (AbstractMessage)yy_22);
        }
        return this;
    }

    public ze_1 a(za_1 za_12) {
        if (this.ans == null) {
            this.axt();
            this.anp.add(za_12.awS());
            this.onChanged();
        } else {
            this.ans.addMessage((AbstractMessage)za_12.awS());
        }
        return this;
    }

    public ze_1 b(int n, za_1 za_12) {
        if (this.ans == null) {
            this.axt();
            this.anp.add(n, za_12.awS());
            this.onChanged();
        } else {
            this.ans.addMessage(n, (AbstractMessage)za_12.awS());
        }
        return this;
    }

    public ze_1 aq(Iterable<? extends yy_2> iterable) {
        if (this.ans == null) {
            this.axt();
            AbstractMessageLite.Builder.addAll(iterable, this.anp);
            this.onChanged();
        } else {
            this.ans.addAllMessages(iterable);
        }
        return this;
    }

    public ze_1 axu() {
        if (this.ans == null) {
            this.anp = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.ans.clear();
        }
        return this;
    }

    public ze_1 kk(int n) {
        if (this.ans == null) {
            this.axt();
            this.anp.remove(n);
            this.onChanged();
        } else {
            this.ans.remove(n);
        }
        return this;
    }

    public za_1 kl(int n) {
        return (za_1)this.axx().getBuilder(n);
    }

    @Override
    public zb_1 kh(int n) {
        if (this.ans == null) {
            return this.anp.get(n);
        }
        return (zb_1)this.ans.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zb_1> axf() {
        if (this.ans != null) {
            return this.ans.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.anp);
    }

    public za_1 axv() {
        return (za_1)this.axx().addBuilder((AbstractMessage)yy_2.awO());
    }

    public za_1 km(int n) {
        return (za_1)this.axx().addBuilder(n, (AbstractMessage)yy_2.awO());
    }

    public List<za_1> axw() {
        return this.axx().getBuilderList();
    }

    private RepeatedFieldBuilderV3<yy_2, za_1, zb_1> axx() {
        if (this.ans == null) {
            this.ans = new RepeatedFieldBuilderV3(this.anp, (this.an & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.anp = null;
        }
        return this.ans;
    }

    public final ze_1 fQ(UnknownFieldSet unknownFieldSet) {
        return (ze_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ze_1 fR(UnknownFieldSet unknownFieldSet) {
        return (ze_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fR(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fQ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fR(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cv(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cv(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cv(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fQ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.axn();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.axq();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fR(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cv(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.axn();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cv(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.axq();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fR(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fQ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fR(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cv(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cv(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cv(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fQ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.axq();
    }

    public /* synthetic */ Message buildPartial() {
        return this.axp();
    }

    public /* synthetic */ Message build() {
        return this.axo();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cv(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.axn();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.axq();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.axp();
    }

    public /* synthetic */ MessageLite build() {
        return this.axo();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.axn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.axl();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.axl();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.axq();
    }

    public /* synthetic */ Object clone() {
        return this.axq();
    }
}

